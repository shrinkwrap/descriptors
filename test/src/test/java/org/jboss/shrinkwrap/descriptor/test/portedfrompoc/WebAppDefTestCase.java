/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.test.portedfrompoc;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertSchemaLocation;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.MutableWebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppTypeMutable;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Dan Allen
 */
public class WebAppDefTestCase
{
   private final Logger log = Logger.getLogger(WebAppDefTestCase.class.getName());

   private final String source = ""
         + "<web-app "
         + "      xmlns=\"http://java.sun.com/xml/ns/javaee\" "
         + "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
         + "      version=\"3.0\" "
         + "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">\n"
         + "    <filter>\n" + "        <filter-name>UrlRewriteFilter</filter-name>\n"
         + "        <filter-class>org.tuckey.web.filters.urlrewrite.UrlRewriteFilter</filter-class>\n"
         + "    </filter>\n" + "    <filter-mapping>\n" + "        <url-pattern>/*</url-pattern>\n"
         + "        <filter-name>UrlRewriteFilter</filter-name>\n" + "    </filter-mapping>\n" + "</web-app>";

   //TODO Put this back in place if we add in dependencies to bring in the requested static stuff like
   // HttpMethodType.* etc
//   @Test
//   @Ignore
//   // broken, import / export order, not 100% match on stored xml.
//   public void testValidDef() throws Exception
//   {
//      final String webApp = Descriptors.create(WebAppDescriptor.class).moduleName("test").description(
//            "A description of my webapp").displayName("Sample").distributable().contextParam(
//            "com.sun.faces.validateXml", true).facesProjectStage(FacesProjectStage.DEVELOPMENT).facesStateSavingMethod(
//            FacesStateSavingMethod.CLIENT).listener("org.jboss.seam.servlet.SeamListener").filter("PrettyFilter",
//            "com.ocpsoft.pretty.PrettyFilter", new String[]
//            {"/*"}).initParam("confReloadCheckInterval", 60).facesServlet().servlet("Download Servlet",
//            "com.acme.webapp.DownloadServlet", new String[]
//            {"/file/*"}).welcomeFile("/index.jsf").sessionTimeout(60).sessionTrackingModes(TrackingModeType.URL)
//            .errorPage(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "/500.jsp").errorPage(IOException.class,
//                  "/outputError.jsp").loginConfig(AuthMethodType.BASIC, "Cool App").formLoginConfig("/login.jsp",
//                  "/invalidLogin.jsp").securityConstraint().webResourceCollection("All Access")
//            .urlPatterns("/public/*").httpMethods(HttpMethodType.DELETE, HttpMethodType.PUT, HttpMethodType.HEAD,
//                  HttpMethodType.OPTIONS, HttpMethodType.TRACE, HttpMethodType.GET, HttpMethodType.POST)
//            .userDataConstraint(TransportGuaranteeType.NONE).securityConstraint("Restricted GET To Employees")
//            .webResourceCollection("Restricted Access - Get Only", "/restricted/employee/*", HttpMethodType.GET)
//            .authConstraint("Employee").userDataConstraint(TransportGuaranteeType.NONE).securityConstraint(
//                  "Restrict access to Facelets templates (XHTML files)").webResourceCollection("Facelets templates")
//            .urlPatterns("*.xhtml").httpMethods(true, HttpMethodType.HEAD).authConstraint().userDataConstraint(
//                  TransportGuaranteeType.NONE).securityRole("Employee", "Employees of the company").absoluteOrdering(
//                  "one", "two", "three").exportAsString();
//
//      log.info(webApp);
//
//      String expected = getResourceContents("/test-web.xml");
//
//      Assert.assertEquals(expected, webApp);
//   }

   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("web.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(WebAppDescriptor.class, "test.xml").getDescriptorName());
   }

   /**
    * Ensures that the root element has xsi:schemaLocation w/ correct value
    * SHRINKDESC-36
    */
   @Test
   public void verifySchemaLocation()
   {
      final MutableWebAppDescriptor desc = create();
      final String descString = desc.exportAsString();
      log.info(descString);
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      assertSchemaLocation(descString, "http://www.w3.org/2001/XMLSchema-instance", expectedSchemaLocation);
   }

   @Test
   public void shouldBeAbleToDetermineDefaultFilterName() throws Exception
   {
      String name = "PrettyFilter";
      String clazz = "com.ocpsoft.pretty." + name;
      String mapping = "/*";

      final String desc = create().getRoot().getOrCreateFilter().filterClass(clazz).filterName(name).up().getOrCreateFilterMapping()
            .filterName(name).urlPattern(mapping).up().up().exportAsString();

      log.fine(desc);

      assertPresenceUsingXPath(desc, "/web-app/filter/filter-name", name);
      assertPresenceUsingXPath(desc, "/web-app/filter/filter-class", clazz);
      assertPresenceUsingXPath(desc, "/web-app/filter-mapping/filter-name", name);
      assertPresenceUsingXPath(desc, "/web-app/filter-mapping/url-pattern", mapping);
   }

   @Test
   public void shouldBeAbleToDetermineDefaultServletName() throws Exception
   {
      String name = "FacesServlet";
      String clazz = "javax.faces.webapp." + name;
      String mapping = "/*";

      final String desc = create().getRoot().getOrCreateServlet().servletClass(clazz).servletName(name).up()
            .getOrCreateServletMapping().servletName(name).urlPattern(mapping).up().up().exportAsString();

      log.fine(desc);

      assertPresenceUsingXPath(desc, "/web-app/servlet/servlet-name", name);
      assertPresenceUsingXPath(desc, "/web-app/servlet/servlet-class", clazz);
      assertPresenceUsingXPath(desc, "/web-app/servlet-mapping/servlet-name", name);
      assertPresenceUsingXPath(desc, "/web-app/servlet-mapping/url-pattern", mapping);
   }

   @Test
   public void shouldBeAbleToDetermineReadServletClass() throws Exception
   {
      String name = "FacesServlet";
      String clazz = "javax.faces.webapp." + name;

      ServletType<WebAppTypeMutable> servlet = create().getRoot().getOrCreateServlet().servletClass(clazz).servletName(name);

      assertEquals(clazz, servlet.getServletClass());
   }

   @Test
   public void shouldBeAbleToQueryServlets() throws Exception
   {
      final String name = "FacesServlet";
      final String clazz = "javax.faces.webapp." + name;
      final String mapping = "/*";

      final MutableWebAppDescriptor webXml = create().getRoot().getOrCreateServlet().servletClass(clazz).servletName(name).up()
            .getOrCreateServletMapping().servletName(name).urlPattern(mapping).up().up();

      final List<ServletType<WebAppTypeMutable>> servlets = webXml.getRoot().getAllServlet();
      final List<ServletMappingType<WebAppTypeMutable>> mappings = webXml.getRoot().getAllServletMapping();
      assertEquals(1, servlets.size());
      assertEquals(name, servlets.get(0).getServletName());
      assertEquals(mapping, mappings.get(0).getAllUrlPattern().get(0));
   }

   //TODO Maybe open a JIRA to extend the WebAppDescriptor for some Faces-specific
   // convenience stuff?
//   @Test
//   public void defaultFacesSuffixesAndViewMappingsValues() throws Exception
//   {
//      WebAppDescriptor web = create();
//
//      List<String> faceletsDefaultSuffixes = web.getFaceletsDefaultSuffixes();
//      assertEquals(1, faceletsDefaultSuffixes.size());
//      assertTrue(faceletsDefaultSuffixes.contains(".xhtml"));
//
//      List<String> facesDefaultSuffixes = web.getFacesDefaultSuffixes();
//      assertEquals(2, facesDefaultSuffixes.size());
//      assertTrue(facesDefaultSuffixes.contains(".xhtml"));
//      assertTrue(facesDefaultSuffixes.contains(".jsp"));
//
//      List<String> faceletsViewMappings = web.getFaceletsViewMappings();
//      assertTrue(faceletsViewMappings.isEmpty());
//
//   }
//
//   @Test
//   public void shouldBeAbleToMutateFacesSuffixesAndMappings() throws Exception
//   {
//      WebAppDescriptor web = create();
//
//      web.faceletsDefaultSuffixes(".foo", ".bar", ".xhtml");
//      web.faceletsDefaultSuffixes(".foo", ".bar", ".xhtml");
//      web.facesDefaultSuffixes(".baz", ".cat", ".view.xml");
//      web.faceletsViewMappings("*.jspx", "/custom/facelet.face", "/facelets/*");
//
//      List<String> faceletsDefaultSuffixes = web.getFaceletsDefaultSuffixes();
//      assertEquals(3, faceletsDefaultSuffixes.size());
//      assertTrue(faceletsDefaultSuffixes.contains(".foo"));
//      assertTrue(faceletsDefaultSuffixes.contains(".bar"));
//      assertTrue(faceletsDefaultSuffixes.contains(".xhtml"));
//
//      List<String> facesDefaultSuffixes = web.getFacesDefaultSuffixes();
//      assertEquals(3, facesDefaultSuffixes.size());
//      assertTrue(facesDefaultSuffixes.contains(".baz"));
//      assertTrue(facesDefaultSuffixes.contains(".cat"));
//      assertTrue(facesDefaultSuffixes.contains(".view.xml"));
//
//      List<String> faceletsViewMappings = web.getFaceletsViewMappings();
//      assertEquals(3, faceletsViewMappings.size());
//      assertTrue(faceletsViewMappings.contains("*.jspx"));
//      assertTrue(faceletsViewMappings.contains("/custom/facelet.face"));
//      assertTrue(faceletsViewMappings.contains("/facelets/*"));
//   }
//
//   @Test
//   public void shouldBeAbleToQueryServletMappings() throws Exception
//   {
//      String name = "FacesServlet";
//      String clazz = "javax.faces.webapp." + name;
//      String mapping = "/*";
//
//      WebAppDescriptor webXml = create();
//
//      assertFalse(webXml.hasFacesServlet());
//
//      webXml.servlet(clazz, mapping);
//
//      List<ServletMappingDef> mappings = webXml.getServletMappings();
//      assertEquals(1, mappings.size());
//      assertEquals(name, mappings.get(0).getName());
//      assertEquals(mapping, mappings.get(0).getUrlPatterns().get(0));
//   }

   @Test
   public void shouldBeAbleToSetRootAttributes() throws Exception
   {
      String version = "2.5";

      String desc = create().getRoot().version(version).metadataComplete(true).up().exportAsString();

      log.fine(desc);

      assertPresenceUsingXPath(desc, "/web-app/@version", version);
      assertPresenceUsingXPath(desc, "/web-app/@metadata-complete", "true");
   }

   //TODO Put this test back in place by putting in a "test" scope 
   // dependency for TrackingModeType, then update to new API
//   @Test
//   public void shouldBeAbleToCreateSessionCookieConfig() throws Exception
//   {
//      String name = "SESSIONID";
//      String domain = "example.com";
//      String path = "/";
//      int timeout = 3600;
//      int maxAge = 3600;
//
//      String desc = create().sessionTimeout(timeout).sessionCookieConfig().name(name).domain(domain).path(path).maxAge(
//            maxAge).sessionTrackingModes(TrackingModeType.COOKIE).exportAsString();
//
//      log.fine(desc);
//
//      assertXPath(desc, "/web-app/session-config/session-timeout", timeout);
//      assertXPath(desc, "/web-app/session-config/cookie-config/name", name);
//      assertXPath(desc, "/web-app/session-config/cookie-config/domain", domain);
//      assertXPath(desc, "/web-app/session-config/cookie-config/path", path);
//      assertXPath(desc, "/web-app/session-config/cookie-config/max-age", maxAge);
//      assertXPath(desc, "/web-app/session-config/tracking-mode", TrackingModeType.COOKIE);
//   }

   @Test
   public void shouldHaveSecurityConstraintDisplayName() throws Exception
   {
      final String securityConstraintDisplayName = "Default security constraint";

      final String webAppDescriptor = Descriptors.create(MutableWebAppDescriptor.class).getRoot().getOrCreateSecurityConstraint()
            .displayName(securityConstraintDisplayName).up().up().exportAsString().trim();

      assertPresenceUsingXPath(webAppDescriptor, "/web-app/security-constraint/display-name", securityConstraintDisplayName);
   }

   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resource)));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }

   private MutableWebAppDescriptor create()
   {
      return Descriptors.create(MutableWebAppDescriptor.class);
   }

}
