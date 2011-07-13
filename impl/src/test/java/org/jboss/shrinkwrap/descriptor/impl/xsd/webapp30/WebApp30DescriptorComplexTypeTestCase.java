package org.jboss.shrinkwrap.descriptor.impl.xsd.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;

public class WebApp30DescriptorComplexTypeTestCase
{

   private final Logger log = Logger.getLogger(WebApp30DescriptorComplexTypeTestCase.class.getName());

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
      final WebApp30Descriptor webApp = create().securityConstraint().webResourceCollection().setWebResourceName(
            "resource1").setDescriptionList("descr1", "descr2", "descr3").setHttpMethod("method1").setHttpMethod(
            "method2").up().webResourceCollection().setWebResourceName("resource2").setDescriptionList("descr4",
            "descr5", "descr6").setHttpMethod("method3").setHttpMethod("method4").up().up();

      String descr = webApp.exportAsString();

      log.fine(descr);

      assertEquals(
            webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getWebResourceName(),
            "resource1");
      assertEquals(
            webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getWebResourceName(),
            "resource2");

      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getHttpMethodList()
            .get(0), "method1");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getHttpMethodList()
            .get(1), "method2");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getHttpMethodList()
            .get(0), "method3");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getHttpMethodList()
            .get(1), "method4");

      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getDescriptionList()
            .get(0), "descr1");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getDescriptionList()
            .get(1), "descr2");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(0).getDescriptionList()
            .get(2), "descr3");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getDescriptionList()
            .get(0), "descr4");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getDescriptionList()
            .get(1), "descr5");
      assertEquals(webApp.getSecurityConstraintList().get(0).getWebResourceCollectionList().get(1).getDescriptionList()
            .get(2), "descr6");

      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/web-resource-name",
            "resource1");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/web-resource-name",
            "resource2");

      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/http-method[1]",
            "method1");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/http-method[2]",
            "method2");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/http-method[1]",
            "method3");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/http-method[2]",
            "method4");

      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[1]",
            "descr1");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[2]",
            "descr2");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[1]/description[3]",
            "descr3");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[1]",
            "descr4");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[2]",
            "descr5");
      assertXPath(webApp.exportAsString(), "/web-app/security-constraint/web-resource-collection[2]/description[3]",
            "descr6");
   }

   @Test
   public void testLocaleEncodingMappingList() throws Exception
   {
      final WebApp30Descriptor webApp = create().localeEncodingMappingList().localeEncodingMapping().setLocale(
            "locale1").setEncoding("encoding1").up().localeEncodingMapping().setLocale("locale2").setEncoding(
            "encoding2").up().up();

      assertEquals(webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(0).getLocale(),
            "locale1");
      assertEquals(webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(1).getLocale(),
            "locale2");
      assertEquals(
            webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(0).getEncoding(),
            "encoding1");
      assertEquals(
            webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(1).getEncoding(),
            "encoding2");
      assertXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[1]/locale",
            "locale1");
      assertXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[2]/locale",
            "locale2");
      assertXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[1]/encoding",
            "encoding1");
      assertXPath(webApp.exportAsString(), "/web-app/locale-encoding-mapping-list/locale-encoding-mapping[2]/encoding",
            "encoding2");

      webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(0).removeLocale();
      webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(1).removeLocale();
      assertTrue(webApp.exportAsString().indexOf("<locale>") == -1);

      webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(0).removeEncoding();
      webApp.getLocaleEncodingMappingListList().get(0).getLocaleEncodingMappingList().get(1).removeEncoding();
      assertTrue(webApp.exportAsString().indexOf("<encoding>") == -1);

      webApp.getLocaleEncodingMappingListList().get(0).removeAllLocaleEncodingMapping();
      assertTrue(webApp.exportAsString().indexOf("<locale-encoding-mapping>") == -1);

      webApp.removeAllLocaleEncodingMappingList();
      assertTrue(webApp.exportAsString().indexOf("<locale-encoding-mapping-list>") == -1);
   }

   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }

   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private WebApp30Descriptor create()
   {
      return Descriptors.create(WebApp30Descriptor.class);
   }
}
