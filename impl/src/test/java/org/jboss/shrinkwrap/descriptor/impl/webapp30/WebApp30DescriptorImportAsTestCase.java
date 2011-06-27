package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.junit.Test;


public class WebApp30DescriptorImportAsTestCase
{

   private final Logger log = Logger.getLogger(WebApp30DescriptorImportAsTestCase.class.getName());

   private final String source = "" +
      "<web-app " +
      "      xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
      "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
      "      version=\"3.0\" " +
      "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">\n" + 
      "    <filter>\n" + 
      "        <filter-name>UrlRewriteFilter</filter-name>\n" + 
      "        <filter-class>org.tuckey.web.filters.urlrewrite.UrlRewriteFilter</filter-class>\n" + 
      "    </filter>\n" + 
      "    <filter-mapping>\n" + 
      "        <url-pattern>/*</url-pattern>\n" + 
      "        <filter-name>UrlRewriteFilter</filter-name>\n" + 
      "    </filter-mapping>\n" + 
      "</web-app>"; 
   
   @Test
   public void shouldBeAbleToImport() throws Exception
   {
      // Make a descriptor
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(
            source);
      
      assertEquals(web.filter().getFilterName(), "UrlRewriteFilter");
      assertEquals(web.filter().getFilterClass(), "org.tuckey.web.filters.urlrewrite.UrlRewriteFilter");
      assertEquals(web.filterMapping().getFilterName(), "UrlRewriteFilter");
      assertEquals(web.filterMapping().getUrlPattern(), "/*");      
   }
   
  
   
   @Test
   public void testImportGeneratedWebXml() throws Exception
   {
      String web_source_generated = getResourceContents("src/test/resources/test-web-generated-1.xml");
      
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(
            web_source_generated);
      
      assertEquals(web.getModuleName(), "module-name0");
      assertTrue(web.jspConfig().getTaglibList().size() == 2);
      
      assertEquals(web.jspConfig().getTaglibList().get(0).getTaglibUri(), "taglib-uri0");
      assertEquals(web.jspConfig().getTaglibList().get(0).getTaglibLocation(), "taglib-location0");
      assertEquals(web.jspConfig().getTaglibList().get(1).getTaglibUri(), "taglib-uri1");
      assertEquals(web.jspConfig().getTaglibList().get(1).getTaglibLocation(), "taglib-location1");      
      assertTrue(web.jspConfig().getJspPropertyGroupList().get(0).getDescriptionList().size() == 2); 
      
      // check first group
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getDescriptionList().get(0), "description0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getDescriptionList().get(1), "description1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getDisplayNameList().get(0), "display-name0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getDisplayNameList().get(1), "display-name1");      
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIconList().get(0).getSmallIcon(), "small-icon0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIconList().get(0).getLargeIcon(), "large-icon0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIconList().get(1).getSmallIcon(), "small-icon1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIconList().get(1).getLargeIcon(), "large-icon1");      
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getUrlPatternList().get(0), "url-pattern0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getUrlPatternList().get(1), "url-pattern1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isElIgnored(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getPageEncoding(), "page-encoding0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isScriptingInvalid(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isIsXml(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIncludePreludeList().get(0), "include-prelude0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIncludePreludeList().get(1), "include-prelude1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIncludeCodaList().get(0), "include-coda0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getIncludeCodaList().get(1), "include-coda1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isTrimDirectiveWhitespaces(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getDefaultContentType(), "default-content-type0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).getBuffer(), "buffer0");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(0).isErrorOnUndeclaredNamespace(), false);
      
      // check second group
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getDescriptionList().get(0), "description2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getDescriptionList().get(1), "description3");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getDisplayNameList().get(0), "display-name2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getDisplayNameList().get(1), "display-name3");      
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIconList().get(0).getSmallIcon(), "small-icon2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIconList().get(0).getLargeIcon(), "large-icon2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIconList().get(1).getSmallIcon(), "small-icon3");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIconList().get(1).getLargeIcon(), "large-icon3");      
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getUrlPatternList().get(0), "url-pattern2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getUrlPatternList().get(1), "url-pattern3");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isElIgnored(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getPageEncoding(), "page-encoding1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isScriptingInvalid(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isIsXml(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIncludePreludeList().get(0), "include-prelude2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIncludePreludeList().get(1), "include-prelude3");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIncludeCodaList().get(0), "include-coda2");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getIncludeCodaList().get(1), "include-coda3");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isTrimDirectiveWhitespaces(), false);
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getDefaultContentType(), "default-content-type1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).getBuffer(), "buffer1");
      assertEquals(web.jspConfig().getJspPropertyGroupList().get(1).isErrorOnUndeclaredNamespace(), false);
      
      assertEquals(web.absoluteOrdering().getNameList().get(0), "name0");
      assertEquals(web.absoluteOrdering().getNameList().get(1), "name1");
      assertEquals(web.absoluteOrdering().getNameList().get(2), "name2");
      assertEquals(web.absoluteOrdering().getNameList().get(3), "name3");      
      assertEquals(web.securityRole().getDescriptionList().get(0), "description4");
      assertEquals(web.securityRole().getDescriptionList().get(1), "description5");
      assertEquals(web.securityRole().getRoleName(), "role-name0");
      
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
