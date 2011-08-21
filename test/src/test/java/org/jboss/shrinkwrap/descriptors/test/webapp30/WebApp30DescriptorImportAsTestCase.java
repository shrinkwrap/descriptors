package org.jboss.shrinkwrap.descriptors.test.webapp30;

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

   @SuppressWarnings("unused")
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
      
      assertEquals(web.getFilterList().get(0).getFilterName(), "UrlRewriteFilter");
      assertEquals(web.getFilterList().get(0).getFilterClass(), "org.tuckey.web.filters.urlrewrite.UrlRewriteFilter");
      assertEquals(web.getFilterMappingList().get(0).getFilterName(), "UrlRewriteFilter");
      assertEquals(web.getFilterMappingList().get(0).getUrlPattern(), "/*");      
   }
   
   @Test
   public void testImportGeneratedTutorialWebXml() throws Exception
   {
      String web_source_generated = getResourceContents("src/test/resources/test-orig-webapp30.xml");
      
      final WebApp30Descriptor webapp = Descriptors.importAs(WebApp30Descriptor.class).from(
            web_source_generated);
      
      assertTrue(webapp.getDisplayNameList().size() == 1);
      assertEquals(webapp.getDisplayNameList().get(0).trim(), "Java EE 6 Pet Catalog");
      
      assertTrue(webapp.getContextParamList().size() == 4);
      assertEquals(webapp.getContextParamList().get(0).getParamName().trim(), "javax.faces.STATE_SAVING_METHOD");
      assertEquals(webapp.getContextParamList().get(0).getParamValue().trim(), "client");
      
      assertEquals(webapp.getContextParamList().get(1).getParamName().trim(), "javax.faces.PROJECT_STAGE");
      assertEquals(webapp.getContextParamList().get(1).getParamValue().trim(), "Production");
      
      assertEquals(webapp.getContextParamList().get(2).getParamName().trim(), "com.sun.faces.resourceUpdateCheckPeriod");
      assertEquals(webapp.getContextParamList().get(2).getParamValue().trim(), "-1");
      
      assertEquals(webapp.getContextParamList().get(3).getParamName().trim(), "com.sun.faces.validateXml");
      assertEquals(webapp.getContextParamList().get(3).getParamValue().trim(), "true");
      
      assertEquals(webapp.getServletMappingList().get(0).getServletName().trim(), "Faces Servlet");
      assertEquals(webapp.getServletMappingList().get(0).getUrlPatternList().get(0).trim(), "/catalog/*");
      
      assertEquals(webapp.getWelcomeFileListList().get(0).getWelcomeFileList().get(0).trim(), "index.html");
      
//      System.out.println(webapp.exportAsString());
   }
   
   @Test
   public void testImportGeneratedWebXml() throws Exception
   {
      String web_source_generated = getResourceContents("src/test/resources/test-gen-webapp30.xml");
      
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(
            web_source_generated);
      
      assertEquals(web.getModuleNameList().get(0), "module-name0");
      assertTrue(web.getJspConfigList().get(0).getTaglibList().size() == 2);
      
      assertEquals(web.getJspConfigList().get(0).getTaglibList().get(0).getTaglibUri(), "taglib-uri0");
      assertEquals(web.getJspConfigList().get(0).getTaglibList().get(0).getTaglibLocation(), "taglib-location0");
      assertEquals(web.getJspConfigList().get(0).getTaglibList().get(1).getTaglibUri(), "taglib-uri1");
      assertEquals(web.getJspConfigList().get(0).getTaglibList().get(1).getTaglibLocation(), "taglib-location1");      
      assertTrue(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDescriptionList().size() == 2); 
      
      // check first group
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDescriptionList().get(0), "description0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDescriptionList().get(1), "description1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDisplayNameList().get(0), "display-name0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDisplayNameList().get(1), "display-name1");      
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIconList().get(0).getSmallIcon(), "small-icon0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIconList().get(0).getLargeIcon(), "large-icon0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIconList().get(1).getSmallIcon(), "small-icon1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIconList().get(1).getLargeIcon(), "large-icon1");      
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getUrlPatternList().get(0), "url-pattern0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getUrlPatternList().get(1), "url-pattern1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isElIgnored(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getPageEncoding(), "page-encoding0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isScriptingInvalid(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isIsXml(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIncludePreludeList().get(0), "include-prelude0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIncludePreludeList().get(1), "include-prelude1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIncludeCodaList().get(0), "include-coda0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getIncludeCodaList().get(1), "include-coda1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isTrimDirectiveWhitespaces(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getDefaultContentType(), "default-content-type0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).getBuffer(), "buffer0");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(0).isErrorOnUndeclaredNamespace(), false);
      
      // check second group
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getDescriptionList().get(0), "description2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getDescriptionList().get(1), "description3");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getDisplayNameList().get(0), "display-name2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getDisplayNameList().get(1), "display-name3");      
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIconList().get(0).getSmallIcon(), "small-icon2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIconList().get(0).getLargeIcon(), "large-icon2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIconList().get(1).getSmallIcon(), "small-icon3");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIconList().get(1).getLargeIcon(), "large-icon3");      
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getUrlPatternList().get(0), "url-pattern2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getUrlPatternList().get(1), "url-pattern3");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isElIgnored(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getPageEncoding(), "page-encoding1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isScriptingInvalid(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isIsXml(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIncludePreludeList().get(0), "include-prelude2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIncludePreludeList().get(1), "include-prelude3");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIncludeCodaList().get(0), "include-coda2");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getIncludeCodaList().get(1), "include-coda3");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isTrimDirectiveWhitespaces(), false);
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getDefaultContentType(), "default-content-type1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).getBuffer(), "buffer1");
      assertEquals(web.getJspConfigList().get(0).getJspPropertyGroupList().get(1).isErrorOnUndeclaredNamespace(), false);
      
      assertEquals(web.getAbsoluteOrderingList().get(0).getNameList().get(0), "name0");
      assertEquals(web.getAbsoluteOrderingList().get(0).getNameList().get(1), "name1");
      assertEquals(web.getAbsoluteOrderingList().get(0).getNameList().get(2), "name2");
      assertEquals(web.getAbsoluteOrderingList().get(0).getNameList().get(3), "name3");      
      assertEquals(web.getSecurityRoleList().get(0).getDescriptionList().get(0), "description4");
      assertEquals(web.getSecurityRoleList().get(0).getDescriptionList().get(1), "description5");
      assertEquals(web.getSecurityRoleList().get(0).getRoleName(), "role-name0");
      
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
}
