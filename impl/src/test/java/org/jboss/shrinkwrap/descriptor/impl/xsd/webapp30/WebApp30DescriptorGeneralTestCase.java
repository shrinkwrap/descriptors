package org.jboss.shrinkwrap.descriptor.impl.xsd.webapp30;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
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
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebApp30Descriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomImporter;
import org.junit.Test;

public class WebApp30DescriptorGeneralTestCase
{

   private final Logger log = Logger.getLogger(WebApp30DescriptorGeneralTestCase.class.getName());

   private final String source = ""
         + "<web-app "
         + "      xmlns=\"http://java.sun.com/xml/ns/javaee\" "
         + "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "
         + "      version=\"3.0\" "
         + "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\">\n"
         + "    <filter>\n" + "        <filter-name>UrlRewriteFilter</filter-name>\n"
         + "        <filter-class>org.tuckey.web.filters.urlrewrite.UrlRewriteFilter</filter-class>\n"
         + "    </filter>\n" + "    <filter-mapping>\n" + "        <url-pattern>/*</url-pattern>\n"
         + "        <filter-name>UrlRewriteFilter</filter-name>\n" + "    </filter-mapping>\n" + "</web-app>";

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
      assertXPath(create().exportAsString(), "/web-app/@xsi:schemaLocation", expectedSchemaLocation + "dsd");
   }

   @Test
   public void shouldBeAbleToDetermineDefaultFilterName() throws Exception
   {
      String name = "PrettyFilter";
      String clazz = "com.ocpsoft.pretty." + name;
      String mapping = "/*";

      String desc = create().filter().setFilterClass(clazz).setFilterName(name).up().filterMapping()
            .setFilterName(name).setUrlPattern(mapping).up().exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/filter/filter-name", name);
      assertXPath(desc, "/web-app/filter/filter-class", clazz);
      assertXPath(desc, "/web-app/filter-mapping/filter-name", name);
      assertXPath(desc, "/web-app/filter-mapping/url-pattern", mapping);
   }

   @Test
   public void shouldBeAbleToSetWelcomeFiles() throws Exception
   {
      String desc = create().welcomeFileList().setWelcomeFile("WelcomeFile1").setWelcomeFile("WelcomeFile2").up()
            .exportAsString();

      log.fine(desc);

      assertXPath(desc, "/web-app/welcome-file-list/welcome-file[1]", "WelcomeFile1");
      assertXPath(desc, "/web-app/welcome-file-list/welcome-file[2]", "WelcomeFile2");
   }

   @Test
   public void shouldBeAbleToGetFilterIcons() throws Exception
   {
      WebApp30Descriptor web = create().filter().icon().setSmallIcon("small1").setLargeIcon("large1").up().icon()
            .setSmallIcon("small2").setLargeIcon("large2").up().up();

      List<IconType<FilterType<WebApp30Descriptor>>> list = web.getFilterList().get(0).getIconList();
      assertTrue(list.size() == 2);
      for (IconType icon : list)
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

      String desc = create().servlet().setServletClass(clazz).setServletName(name).up().servletMapping()
            .setServletName(name).setUrlPattern(mapping).up().exportAsString();

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

      String desc = create().setVersion(version).setMetadataComplete(true).exportAsString();

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

      String desc = create().sessionConfig().setSessionTimeout(timeout).cookieConfig().setName(name).setDomain(domain)
            .setPath(path).setMaxAge(maxAge).up().setTrackingMode(TrackingModeType._COOKIE.name()).up()
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
      final WebApp30Descriptor web = Descriptors.importAs(WebApp30Descriptor.class).from(source);

      web.setVersion("3.0");
      Assert.assertEquals("3.0", web.getVersionAsString());

      // Get as Node structure
      final InputStream stream = new ByteArrayInputStream(web.exportAsString().getBytes());
      final XmlDomImporter<WebApp30Descriptor> importer = new XmlDomImporter<WebApp30Descriptor>(
            WebApp30Descriptor.class, "web.xml");
      final Node root = importer.importRootNode(stream);

      // Preconditions
      Assert.assertEquals("3.0", web.getVersionAsString());
      Assert.assertTrue(root.attribute("xsi:schemaLocation").contains("web-app_3_0.xsd"));

      // Change the version
      web.setVersion("2.5");

      // Check that everything was updated
      Assert.assertEquals("2.5", web.getVersionAsString());

      // Log just for fun
      // log.info("web.xml after update: " + web.exportAsString());
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
