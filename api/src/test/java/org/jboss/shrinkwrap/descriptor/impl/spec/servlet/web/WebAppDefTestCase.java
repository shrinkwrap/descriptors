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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

import javax.faces.application.StateManager;
import javax.servlet.http.HttpServletResponse;

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.AuthMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.HttpMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TransportGuaranteeType;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dan Allen
 */
public class WebAppDefTestCase
{
   private final Logger log = Logger.getLogger(WebAppDefTestCase.class.getName());

   @Test
   public void testValidDef() throws Exception
   {
      final String webApp = new WebAppDescriptorImpl()
            .moduleName("test")
            .description("A description of my webapp")
            .displayName("Sample")
            .distributable()
            .contextParam("com.sun.faces.validateXml", true)
            .facesDevelopmentMode()
            .facesStateSavingMethod(StateManager.STATE_SAVING_METHOD_CLIENT)
            .listener("org.jboss.seam.servlet.SeamListener")
            .filter("UrlRewriteFilter", "org.tuckey.web.filters.urlrewrite.UrlRewriteFilter", new String[]
            {"/*"})
            .initParam("confReloadCheckInterval", 60)
            .facesServlet()
            .servlet("Download Servlet", "com.acme.webapp.DownloadServlet", new String[]
            {"/file/*"})
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
            .webResourceCollection("Facelets templates").urlPatterns("*.xhtml").httpMethods(true, HttpMethodType.HEAD)
            .authConstraint().userDataConstraint(TransportGuaranteeType.NONE)
            .securityRole("Employee", "Employees of the company").absoluteOrdering("one", "two", "three")
            .exportAsString();

      log.fine(webApp);

      String expected = getResourceContents("/test-web.xml");

      Assert.assertEquals(expected, webApp);
   }

   @Test
   public void testDefaultFilterName() throws Exception
   {
      String webApp = new WebAppDescriptorImpl().filter("org.tuckey.web.filters.urlrewrite.UrlRewriteFilter", "/*")
            .exportAsString();

      log.fine(webApp);

      String expected = getResourceContents("/test-filter-web.xml");

      Assert.assertEquals(expected, webApp);
   }

   @Test
   public void testDefaultServletName() throws Exception
   {
      final String webApp = new WebAppDescriptorImpl().servlet("javax.faces.webapp.FacesServlet", "*.jsf")
            .exportAsString();

      log.fine(webApp);

      String expected = getResourceContents("/test-servlet-web.xml");

      Assert.assertEquals(expected, webApp);
   }

   @Test
   public void testRootAttributes() throws Exception
   {
      final String webApp = new WebAppDescriptorImpl().version("2.5").metadataComplete().exportAsString();

      log.fine(webApp);

      String expected = getResourceContents("/test-attributes-web.xml");

      Assert.assertEquals(expected, webApp);
   }

   @Test
   public void testSessionCookieConfig() throws Exception
   {
      final String webApp = new WebAppDescriptorImpl().sessionTimeout(3600).sessionCookieConfig().name("SESSIONID")
            .domain("example.com").path("/").maxAge(3600).sessionTrackingModes(TrackingModeType.COOKIE)
            .exportAsString();

      log.fine(webApp);

      String expected = getResourceContents("/test-session-config-web.xml");

      Assert.assertEquals(expected, webApp);
   }

   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resource)));
      final StringBuffer builder = new StringBuffer();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }
}
