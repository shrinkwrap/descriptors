package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLImporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.junit.Test;


public class WebAppDescriptorImplTestCase
{

   private final Logger log = Logger.getLogger(WebAppDescriptorImplTestCase.class.getName());

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
   public void shouldHandleMultiplicities() throws Exception
   {
      final String webApp = create()
         .servlet()
            .setDescription("Description1")
            .setDescription("Description2").up()
         .exportAsString();
      
      assertXPath(webApp, "/web-app/servlet/description[1]", "Description1");
      assertXPath(webApp, "/web-app/servlet/description[2]", "Description2");
      
      WebApp30Descriptor webAppDescr = create()
      .servlet()
         .setDescription("Description1")
         .setDescription("Description2").up();
      
      webAppDescr.servlet().getDescriptionList();
   }
   
   @Test
   public void testImportGeneratedWebXml() throws Exception
   {
      String web_source_generated = getResourceContents("src/test/resources/test-web-generated-1.xml");
      
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(
            web_source_generated);
      
      assertEquals(web.getModuleName(), "module-name0");
      assertTrue(web.jspConfig().getTaglibList().size() == 2);
      
      assertEquals(((TaglibType)web.jspConfig().getTaglibList().get(0)).getTaglibUri(), "taglib-uri0");
      assertEquals(((TaglibType)web.jspConfig().getTaglibList().get(0)).getTaglibLocation(), "taglib-location0");
      assertEquals(((TaglibType)web.jspConfig().getTaglibList().get(1)).getTaglibUri(), "taglib-uri1");
      assertEquals(((TaglibType)web.jspConfig().getTaglibList().get(1)).getTaglibLocation(), "taglib-location1");      
      assertTrue(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDescriptionList().size() == 2); 
      
      // check first group
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDescriptionList().get(0), "description0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDescriptionList().get(1), "description1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDisplayNameList().get(0), "display-name0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDisplayNameList().get(1), "display-name1");      
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIconList().get(0)).getSmallIcon(), "small-icon0");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIconList().get(0)).getLargeIcon(), "large-icon0");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIconList().get(1)).getSmallIcon(), "small-icon1");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIconList().get(1)).getLargeIcon(), "large-icon1");      
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getUrlPatternList().get(0), "url-pattern0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getUrlPatternList().get(1), "url-pattern1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isElIgnored(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getPageEncoding(), "page-encoding0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isScriptingInvalid(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isIsXml(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIncludePreludeList().get(0), "include-prelude0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIncludePreludeList().get(1), "include-prelude1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIncludeCodaList().get(0), "include-coda0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getIncludeCodaList().get(1), "include-coda1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isTrimDirectiveWhitespaces(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getDefaultContentType(), "default-content-type0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).getBuffer(), "buffer0");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(0)).isErrorOnUndeclaredNamespace(), false);
      
      // check second group
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getDescriptionList().get(0), "description2");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getDescriptionList().get(1), "description3");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getDisplayNameList().get(0), "display-name2");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getDisplayNameList().get(1), "display-name3");      
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIconList().get(0)).getSmallIcon(), "small-icon2");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIconList().get(0)).getLargeIcon(), "large-icon2");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIconList().get(1)).getSmallIcon(), "small-icon3");
      assertEquals(((IconType)((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIconList().get(1)).getLargeIcon(), "large-icon3");      
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getUrlPatternList().get(0), "url-pattern2");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getUrlPatternList().get(1), "url-pattern3");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isElIgnored(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getPageEncoding(), "page-encoding1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isScriptingInvalid(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isIsXml(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIncludePreludeList().get(0), "include-prelude2");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIncludePreludeList().get(1), "include-prelude3");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIncludeCodaList().get(0), "include-coda2");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getIncludeCodaList().get(1), "include-coda3");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isDeferredSyntaxAllowedAsLiteral(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isTrimDirectiveWhitespaces(), false);
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getDefaultContentType(), "default-content-type1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).getBuffer(), "buffer1");
      assertEquals(((JspPropertyGroupType)web.jspConfig().getJspPropertyGroupList().get(1)).isErrorOnUndeclaredNamespace(), false);
      
      assertEquals(web.absoluteOrdering().getNameList().get(0), "name0");
      assertEquals(web.absoluteOrdering().getNameList().get(1), "name1");
      assertEquals(web.absoluteOrdering().getNameList().get(2), "name2");
      assertEquals(web.absoluteOrdering().getNameList().get(3), "name3");      
      assertEquals(web.securityRole().getDescriptionList().get(0), "description4");
      assertEquals(web.securityRole().getDescriptionList().get(1), "description5");
      assertEquals(web.securityRole().getRoleName(), "role-name0");
      
   }
   
   
   @Test
   public void shouldBeAbleToSetVersion() throws Exception 
   {
	   String desc = create().setVersion("3.0")
	       .exportAsString();

	   log.fine(desc);
   }
   
   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("web.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(WebApp30Descriptor.class, "test.xml").getDescriptorName());
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
                     .filter().setFilterClass(clazz).setFilterName(name).up()
                     .filterMapping().setFilterName(name).setUrlPattern(mapping).up()
                     .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/filter/filter-name", name);
      assertXPath(desc, "/web-app/filter/filter-class", clazz);
      assertXPath(desc, "/web-app/filter-mapping/filter-name", name);
      assertXPath(desc, "/web-app/filter-mapping/url-pattern", mapping);
   }
   
   
   @Test
   public void shouldBeAbleToSetWelcomeFiles() throws Exception
   {
      String desc = create()
      				.welcomeFileList()
      					.setWelcomeFile("WelcomeFile1")
      					.setWelcomeFile("WelcomeFile2").up()
                    .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/welcome-file-list/welcome-file[1]", "WelcomeFile1");
      assertXPath(desc, "/web-app/welcome-file-list/welcome-file[2]", "WelcomeFile2");
   }
   
   
   @Test
   public void shouldBeAbleToGetFilterIcons() throws Exception
   {
      WebApp30Descriptor web = create()
                    .filter()
                       .icon().setSmallIcon("small1").setLargeIcon("large1").up()
                       .icon().setSmallIcon("small2").setLargeIcon("large2").up()
                    .up();

     List<IconType> list = web.filter().getIconList();
     assertTrue(list.size() == 2);
     for (IconType icon: list) 
     {
        assertTrue(icon.getSmallIcon().startsWith("small"));
        assertTrue(icon.getLargeIcon().startsWith("large"));
     }
     
   }
   

   @Test
   public void shouldBeAbleToDetermineDefaultServletName() throws Exception
   {
      String name = "FacesServlet";
      String clazz = "javax.faces.webapp." + name;
      String mapping = "/*";

      String desc = create()
                     .servlet().setServletClass(clazz).setServletName(name).up()
                     .servletMapping().setServletName(name).setUrlPattern(mapping).up()
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
                        .setVersion(version).setMetadataComplete(true)
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
                     .sessionConfig().setSessionTimeout(timeout)
                        .cookieConfig().setName(name).setDomain(domain).setPath(path).setMaxAge(maxAge).up()
                        .setTrackingMode(TrackingModeType._COOKIE.name()).up()
                     .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/session-config/session-timeout", timeout);
      assertXPath(desc, "/web-app/session-config/cookie-config/name", name);
      assertXPath(desc, "/web-app/session-config/cookie-config/domain", domain);
      assertXPath(desc, "/web-app/session-config/cookie-config/path", path);
      assertXPath(desc, "/web-app/session-config/cookie-config/max-age", maxAge);
      assertXPath(desc, "/web-app/session-config/tracking-mode", TrackingModeType._COOKIE.name());
   }
   
   /**
    * SHRINKDESC-37
    */
   @Test
   public void shouldBeAbleToOverrideVersionInWebAppDescriptor() throws Exception
   {
      // Make a descriptor
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(
            source);
     
      web.setVersion("3.0");
      Assert.assertEquals("3.0", web.getVersion());
      
      // Get as Node structure
      final InputStream stream = new ByteArrayInputStream(web.exportAsString().getBytes());
      final XMLImporter<WebApp30Descriptor> importer = new XMLImporter<WebApp30Descriptor>(WebApp30Descriptor.class, "web.xml");
      final Node root = importer.importRootNode(stream);
      
      // Preconditions
      Assert.assertEquals("3.0", web.getVersion());
      Assert.assertTrue(root.attribute("xsi:schemaLocation").contains("web-app_3_0.xsd"));
      
      // Change the version
      web.setVersion("2.5");
      
      // Get as Node structure
      final InputStream afterUpdateStream = new ByteArrayInputStream(web.exportAsString().getBytes());
      final Node rootAfterUpdate = importer.importRootNode(afterUpdateStream);
      
      // Check that everything was updated
      Assert.assertEquals("2.5", web.getVersion());
//      Assert.assertTrue(rootAfterUpdate.attribute("xsi:schemaLocation").contains("web-app_2_5.xsd"));
      
      // Log just for fun
      log.info("web.xml after update: " + web.exportAsString());
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
   
   private WebApp30Descriptor<WebApp30DescriptorImpl> create()
   {
      return Descriptors.create(WebApp30Descriptor.class);
   }
}
