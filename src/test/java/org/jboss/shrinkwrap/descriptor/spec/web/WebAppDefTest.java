package org.jboss.shrinkwrap.descriptor.spec.web;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;

public class WebAppDefTest
{
   @Test
   public void testValidDef() throws Exception
   {
      WebApp webApp = new WebAppDef()
      .description("A description of my webapp")
      .displayName("Sample")
      .distributable()
      .contextParam("javax.faces.PROJECT_STAGE", "Development")
      .listener("org.jboss.seam.servlet.SeamListener")
      .filter("UrlRewriteFilter", "org.tuckey.web.filters.urlrewrite.UrlRewriteFilter", "/*").initParam("one", "two")
      .servlet("Faces Servlet", "javax.faces.webapp.FacesServlet", "*.jsf")
      .welcomeFile("/index.jsf")
      .sessionTimeout(60)
      .errorPage(500, "/500.jsp")
      .errorPage(IOException.class, "/outputError.jsp")
      .formLoginConfig("/login.jsp", "/invalidLogin.jsp")
      .securityConstraint()
            .webResourceCollection("All Access", "/public/*", "DELETE", "PUT", "HEAD", "OPTIONS", "TRACE", "GET", "POST")
            .userDataConstraint("NONE")
      .securityConstraint("Restricted GET To Employees")
            .webResourceCollection("Restricted Access - Get Only", "/restricted/employee/*", "GET")
            .authConstraint("Employee")
            .userDataConstraint("NONE")
      .securityConstraint("excluded")
             .webResourceCollection("No Access").urlPatterns("/protected/*", "/templates/*")
             .authConstraint()
             .userDataConstraint("NONE")
      .securityRole("Employee", "Employees of the company")
      .descriptor();
      
      JAXBContext context;
      Marshaller m;
      
      context = JAXBContext.newInstance(WebApp.class);
      m = context.createMarshaller();
      m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, webApp.getSchemaLocation());
      
      ByteArrayOutputStream actual = new ByteArrayOutputStream();
      m.marshal(webApp, actual);
      
      ByteArrayOutputStream expected = getResourceContents("/test-web.xml");
      System.out.println(actual.toString());
      Assert.assertEquals(expected.toString(), actual.toString());
   }
   
   private ByteArrayOutputStream getResourceContents(String resource) throws Exception
   {
      InputStream in = getClass().getResourceAsStream(resource);
      
      int bufferSize = 4096;
      final ByteArrayOutputStream out = new ByteArrayOutputStream(bufferSize * 2);
      final byte[] buffer = new byte[bufferSize];
      int read = 0;
      try {
         while (((read = in.read(buffer)) != -1)) {
            out.write(buffer, 0, read);
         }
      }
      finally {
         in.close();
      }

      return out;
   }
}
