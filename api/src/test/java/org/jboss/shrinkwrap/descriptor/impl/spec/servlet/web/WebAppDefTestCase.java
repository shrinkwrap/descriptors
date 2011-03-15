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
package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FacesProjectStage;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FacesStateSavingMethod;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.HttpMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TransportGuaranteeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebAppDescriptor;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Dan Allen
 */
public class WebAppDefTestCase
{
   private final Logger log = Logger.getLogger(WebAppDefTestCase.class.getName());

   
   @Test
   @Ignore
   // broken, import / export order, not 100% match on stored xml.
   public void testValidDef() throws Exception
   {
      final String webApp = Descriptors.create(WebAppDescriptor.class)
               .moduleName("test")
               .description("A description of my webapp")
               .displayName("Sample")
               .distributable()
               .contextParam("com.sun.faces.validateXml", true)
               .facesProjectStage(FacesProjectStage.DEVELOPMENT)
               .facesStateSavingMethod(FacesStateSavingMethod.CLIENT)
               .listener("org.jboss.seam.servlet.SeamListener")
               .filter("PrettyFilter", "com.ocpsoft.pretty.PrettyFilter", new String[]
               { "/*" })
               .initParam("confReloadCheckInterval", 60)
               .facesServlet()
               .servlet("Download Servlet", "com.acme.webapp.DownloadServlet", new String[]
               { "/file/*" })
               .welcomeFile("/index.jsf")
               .sessionTimeout(60)
               .sessionTrackingModes(TrackingModeType.URL)
               .errorPage(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "/500.jsp")
               .errorPage(IOException.class, "/outputError.jsp")
               .loginConfig(AuthMethodType.BASIC, "Cool App")
               .formLoginConfig("/login.jsp", "/invalidLogin.jsp")
               .securityConstraint()
               .webResourceCollection("All Access")
               .urlPatterns("/public/*")
               .httpMethods(HttpMethodType.DELETE, HttpMethodType.PUT, HttpMethodType.HEAD, HttpMethodType.OPTIONS,
                        HttpMethodType.TRACE, HttpMethodType.GET, HttpMethodType.POST)
               .userDataConstraint(TransportGuaranteeType.NONE).securityConstraint("Restricted GET To Employees")
               .webResourceCollection("Restricted Access - Get Only", "/restricted/employee/*", HttpMethodType.GET)
               .authConstraint("Employee").userDataConstraint(TransportGuaranteeType.NONE)
               .securityConstraint("Restrict access to Facelets templates (XHTML files)")
               .webResourceCollection("Facelets templates").urlPatterns("*.xhtml")
               .httpMethods(true, HttpMethodType.HEAD)
               .authConstraint().userDataConstraint(TransportGuaranteeType.NONE)
               .securityRole("Employee", "Employees of the company").absoluteOrdering("one", "two", "three")
               .exportAsString();

      log.info(webApp);

      String expected = getResourceContents("/test-web.xml");

      Assert.assertEquals(expected, webApp);
   }
   
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
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      assertXPath(create().exportAsString(),"/web-app/@xsi:schemaLocation",expectedSchemaLocation+"dsd");
   }

   @Test
   public void shouldBeAbleToDetermineDefaultFilterName() throws Exception
   {
      String name = "PrettyFilter";
      String clazz = "com.ocpsoft.pretty." + name;
      String mapping = "/*";

      String desc = create()
                     .filter(clazz, mapping)
                     .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/filter/filter-name", name);
      assertXPath(desc, "/web-app/filter/filter-class", clazz);
      assertXPath(desc, "/web-app/filter-mapping/filter-name", name);
      assertXPath(desc, "/web-app/filter-mapping/url-pattern", mapping);
   }

   @Test
   public void shouldBeAbleToDetermineDefaultServletName() throws Exception
   {
      String name = "FacesServlet";
      String clazz = "javax.faces.webapp." + name;
      String mapping = "/*";

      String desc = create()
                     .servlet(clazz, mapping)
                     .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/servlet/servlet-name", name);
      assertXPath(desc, "/web-app/servlet/servlet-class", clazz);
      assertXPath(desc, "/web-app/servlet-mapping/servlet-name", name);
      assertXPath(desc, "/web-app/servlet-mapping/url-pattern", mapping);
   }

   @Test
   public void shouldBeAbleToSetRootAttributes() throws Exception
   {
      String version = "2.5";

      String desc = create()
                        .version(version).metadataComplete(true)
                        .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/@version", version);
      assertXPath(desc, "/web-app/@metadata-complete", "true");
   }

   @Test
   public void shouldBeAbleToCreateSessionCookieConfig() throws Exception
   {
      String name = "SESSIONID";
      String domain = "example.com";
      String path = "/";
      int timeout = 3600;
      int maxAge = 3600;

      String desc = create()
                     .sessionTimeout(timeout)
                     .sessionCookieConfig()
                     .name(name)
                     .domain(domain).path(path).maxAge(maxAge)
                     .sessionTrackingModes(TrackingModeType.COOKIE)
                     .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/session-config/session-timeout", timeout);
      assertXPath(desc, "/web-app/session-config/cookie-config/name", name);
      assertXPath(desc, "/web-app/session-config/cookie-config/domain", domain);
      assertXPath(desc, "/web-app/session-config/cookie-config/path", path);
      assertXPath(desc, "/web-app/session-config/cookie-config/max-age", maxAge);
      assertXPath(desc, "/web-app/session-config/tracking-mode", TrackingModeType.COOKIE);
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

   private WebAppDescriptor create()
   {
      return Descriptors.create(WebAppDescriptor.class);
   }

}
