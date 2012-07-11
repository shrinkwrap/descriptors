package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.MutableWebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;


public class WebAppDescriptorComplexTypeTestCase
{

   private final Logger log = Logger.getLogger(WebAppDescriptorComplexTypeTestCase.class.getName());

   /*
    * to test:
    * 
    * maxOccurs=1
    *    filterType, 
    *    listenerType, 
    *    session-configType
    *    
    * maxOccurs=unbounded
    *    web-resource-collection,
    *    locale-encoding-mapping-list 
    * 
    */
   
   @Test
   public void testWebResourceCollection() throws Exception
   {
      final MutableWebAppDescriptor webApp = create()
            .createSecurityConstraint()
               .createWebResourceCollection()
                  .webResourceName("resource1")
                  .description("descr1", "descr2", "descr3")
                  .httpMethod("method1")
                  .httpMethod("method2")
               .up()
               .createWebResourceCollection()
                  .webResourceName("resource2")
                  .description("descr4", "descr5", "descr6")
                  .httpMethod("method3")
                  .httpMethod("method4")
               .up()
            .up();
      
      String descr = webApp.exportAsString();
      
      log.fine(descr);
         
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getWebResourceName(), "resource1");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getWebResourceName(), "resource2");
      
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getAllHttpMethod().get(0), "method1");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getAllHttpMethod().get(1), "method2");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getAllHttpMethod().get(0), "method3");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getAllHttpMethod().get(1), "method4");
      
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getAllDescription().get(0), "descr1");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getAllDescription().get(1), "descr2");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(0).getAllDescription().get(2), "descr3");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getAllDescription().get(0), "descr4");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getAllDescription().get(1), "descr5");
      assertEquals(webApp.getAllSecurityConstraint().get(0).getAllWebResourceCollection().get(1).getAllDescription().get(2), "descr6");
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/web-resource-name", "resource1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/web-resource-name", "resource2");
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/http-method[1]", "method1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/http-method[2]", "method2");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/http-method[1]", "method3");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/http-method[2]", "method4");
      
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[1]", "descr1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[2]", "descr2");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[3]", "descr3");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[1]", "descr4");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[2]", "descr5");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[3]", "descr6");
   }
   
   @Test
   public void testLocaleEncodingMappingList() throws Exception
   {
      final MutableWebAppDescriptor webApp = create().createLocaleEncodingMappingList()
            .createLocaleEncodingMapping().locale("locale1").encoding("encoding1").up()
            .createLocaleEncodingMapping().locale("locale2").encoding("encoding2").up().up();
      
      assertEquals(webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(0).getLocale(), "locale1");
      assertEquals(webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(1).getLocale(), "locale2");
      assertEquals(webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(0).getEncoding(), "encoding1");
      assertEquals(webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(1).getEncoding(), "encoding2");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[1]/locale", "locale1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[2]/locale", "locale2");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[1]/encoding", "encoding1");
      assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[2]/encoding", "encoding2");
      
      webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(0).removeLocale();
      webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(1).removeLocale();
      assertTrue(webApp.exportAsString().indexOf("<locale>") == -1);
      
      webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(0).removeEncoding();
      webApp.getAllLocaleEncodingMappingList().get(0).getAllLocaleEncodingMapping().get(1).removeEncoding();
      assertTrue(webApp.exportAsString().indexOf("<encoding>") == -1);
      
      webApp.getAllLocaleEncodingMappingList().get(0).removeAllLocaleEncodingMapping();
      assertTrue(webApp.exportAsString().indexOf("<locale-encoding-mapping>") == -1);
      
      webApp.removeAllLocaleEncodingMappingList();
      assertTrue(webApp.exportAsString().indexOf("<locale-encoding-mapping-list>") == -1);
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private MutableWebAppDescriptor create()
   {
      return Descriptors.create(MutableWebAppDescriptor.class);
   }
}
