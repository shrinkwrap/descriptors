package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertDefaultNamespace;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertNamespaceURIDefined;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertSchemaLocation;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.MutableWebAppDescriptor;
import org.junit.Ignore;
import org.junit.Test;


public class WebAppDescriptorNamespaceTestCase
{

   @Test
   public void shouldAddDefaultNamespaces() throws Exception
   {
      final String app = create()
//            .addDefaultNamespaces()
            .exportAsString();
      
      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";

      assertDefaultNamespace(app, expectedJavaEENamespace);
      assertSchemaLocation(app, "http://www.w3.org/2001/XMLSchema-instance", expectedSchemaLocation);
      
   }
   
//   @Test
//   public void testReturnAllNamespaces() throws Exception
//   {
//      final List<String> nsList = create()
////            .addDefaultNamespaces()
//            .getNamespaces();
//      
//      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
//      final String expectedXmlNamespace = "http://www.w3.org/2001/XMLSchema-instance";
//      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
//      
//      assertTrue(nsList.size() == 3);
//      assertTrue(nsList.contains("xmlns=" + expectedJavaEENamespace));
//      assertTrue(nsList.contains("xmlns:xsi=" + expectedXmlNamespace));
//      assertTrue(nsList.contains("xsi:schemaLocation=" + expectedSchemaLocation));
//   }
   
   
   @Test
   @Ignore
   public void testRemoveAllNamespaces() throws Exception
   {
      final String app = create()
            .version("3.0")
//            .addDefaultNamespaces()
//            .removeAllNamespaces()
            .exportAsString();
      
      assertTrue(app.indexOf("xmlns") == -1); 
      assertTrue(app.indexOf("xmlns:xsi") == -1); 
      assertTrue(app.indexOf("xmlns:xsi") == -1);   
      assertPresenceUsingXPath(app,"/web-app/@version", "3.0");
   }
   
   @Test
   public void shouldAddNamespace() throws Exception
   {
      final String expectedJavaEENamespace= "http://java.sun.com/xml/ns/javaee";
      final String expectedXmlNamespace = "http://www.w3.org/2001/XMLSchema-instance";
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd";
      
      // check javaee namespace only
      final String app1 = create()
//            .addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee")
            .exportAsString();      
      assertDefaultNamespace(app1, expectedJavaEENamespace);
      
      // check xml namespace only
      final String app2 = create()
//            .addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .exportAsString();
      assertNamespaceURIDefined(app2, "xsi", expectedXmlNamespace);
      
      // check schema location only
      final String app3 = create()
//            .addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
//            .addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd")
            .exportAsString();
      assertSchemaLocation(app3, "http://www.w3.org/2001/XMLSchema-instance", expectedSchemaLocation);
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private MutableWebAppDescriptor create()
   {
      return Descriptors.create(MutableWebAppDescriptor.class);
   }
}
