package org.jboss.shrinkwrap.descriptors.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;


public class WebApp30DescriptorNamespaceTestCase
{

   private final Logger log = Logger.getLogger(WebApp30DescriptorNamespaceTestCase.class.getName());
   
   @Test
   public void testAddDefaultNamespaces() throws Exception
   {
      final String app = create()
            .addDefaultNamespaces()
            .exportAsString();
      
      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
      final String expectedXmlNamespace = "http://www.w3.org/2001/XMLSchema-instance";
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      
      assertXPath(app,"/web-app/@xmlns", expectedJavaEENamespace);
      assertXPath(app,"/web-app/@xmlns:xsi", expectedXmlNamespace);
      assertXPath(app,"/web-app/@xsi:schemaLocation", expectedSchemaLocation);
      
      log.fine(app);      
   }
   
   @Test
   public void testReturnAllNamespaces() throws Exception
   {
      final List<String> nsList = create()
            .addDefaultNamespaces()
            .getNamespaces();
      
      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
      final String expectedXmlNamespace = "http://www.w3.org/2001/XMLSchema-instance";
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      
      assertTrue(nsList.size() == 3);
      assertTrue(nsList.contains("xmlns=" + expectedJavaEENamespace));
      assertTrue(nsList.contains("xmlns:xsi=" + expectedXmlNamespace));
      assertTrue(nsList.contains("xsi:schemaLocation=" + expectedSchemaLocation));
   }
   
   
   @Test
   public void testRemoveAllNamespaces() throws Exception
   {
      final String app = create()
            .version("3.0")
            .addDefaultNamespaces()
            .removeAllNamespaces()
            .exportAsString();
      
      assertTrue(app.indexOf("xmlns") == -1); 
      assertTrue(app.indexOf("xmlns:xsi") == -1); 
      assertTrue(app.indexOf("xmlns:xsi") == -1);   
      assertXPath(app,"/web-app/@version", "3.0");
   }
   
   @Test
   public void testAddNamespace() throws Exception
   {
      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
      final String expectedXmlNamespace = "http://www.w3.org/2001/XMLSchema-instance";
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      
      // check javaee namespace only
      final String app1 = create()
            .addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee")
            .exportAsString();      
      assertXPath(app1,"/web-app/@xmlns", expectedJavaEENamespace);
      
      // check xml namespace only
      final String app2 = create()
            .addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .exportAsString();
      assertXPath(app2,"/web-app/@xmlns:xsi", expectedXmlNamespace);
      
      // check schema location only
      final String app3 = create()
            .addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd")
            .exportAsString();
      assertXPath(app3,"/web-app/@xsi:schemaLocation", expectedSchemaLocation);
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private WebApp30Descriptor create()
   {
      return Descriptors.create(WebApp30Descriptor.class);
   }
}
