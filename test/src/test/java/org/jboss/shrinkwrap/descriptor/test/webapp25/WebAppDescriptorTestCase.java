package org.jboss.shrinkwrap.descriptor.test.webapp25;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertSchemaLocation;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor;
import org.junit.Assert;
import org.junit.Test;

public class WebAppDescriptorTestCase {

    private final Logger log = Logger.getLogger(WebAppDescriptorTestCase.class.getName());

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
    public void shouldCreateDefaultName() throws Exception {
        Assert.assertEquals("web.xml", create().getDescriptorName());
    }

    @Test
    public void shouldBeAbleToSetName() throws Exception {
        Assert.assertEquals("test.xml", Descriptors.create(WebAppDescriptor.class, "test.xml").getDescriptorName());
    }

    /**
     * Ensures that the root element has xsi:schemaLocation w/ correct value SHRINKDESC-36
     */
    @Test
    public void verifySchemaLocation() {
        final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd";

        assertSchemaLocation(create().exportAsString(), "http://www.w3.org/2001/XMLSchema-instance",
            expectedSchemaLocation);
    }

    @Test
    public void shouldBeAbleToDetermineDefaultFilterName() throws Exception {
        String name = "PrettyFilter";
        String clazz = "com.ocpsoft.pretty." + name;
        String mapping = "/*";

        String desc = create().createFilter().filterClass(clazz).filterName(name).up().createFilterMapping()
            .filterName(name).urlPattern(mapping).up().exportAsString();

        log.fine(desc);

        assertPresenceUsingXPath(desc, "/web-app/filter/filter-name", name);
        assertPresenceUsingXPath(desc, "/web-app/filter/filter-class", clazz);
        assertPresenceUsingXPath(desc, "/web-app/filter-mapping/filter-name", name);
        assertPresenceUsingXPath(desc, "/web-app/filter-mapping/url-pattern", mapping);
    }

    @Test
    public void shouldBeAbleToSetWelcomeFiles() throws Exception {
        String desc = create().createWelcomeFileList().welcomeFile("WelcomeFile1").welcomeFile("WelcomeFile2").up()
            .exportAsString();

        log.fine(desc);

        assertPresenceUsingXPath(desc, "/web-app/welcome-file-list/welcome-file[1]", "WelcomeFile1");
        assertPresenceUsingXPath(desc, "/web-app/welcome-file-list/welcome-file[2]", "WelcomeFile2");
    }

    @Test
    public void shouldBeAbleToGetFilterIcons() throws Exception {
        WebAppDescriptor web = create().createFilter().createIcon().smallIcon("small1").largeIcon("large1").up()
            .createIcon().smallIcon("small2").largeIcon("large2").up().up();

        List<IconType<FilterType<WebAppDescriptor>>> list = web.getAllFilter().get(0).getAllIcon();
        assertTrue(list.size() == 2);
        for (IconType<?> icon : list) {
            assertTrue(icon.getSmallIcon().startsWith("small"));
            assertTrue(icon.getLargeIcon().startsWith("large"));
        }

    }

    @Test
    public void shouldBeAbleToDetermineDefaultServletName() throws Exception {
        String name = "FacesServlet";
        String clazz = "javax.faces.webapp." + name;
        String mapping = "/*";

        String desc = create().createServlet().servletClass(clazz).servletName(name).up().createServletMapping()
            .servletName(name).urlPattern(mapping).up().exportAsString();

        log.fine(desc);

        assertPresenceUsingXPath(desc, "/web-app/servlet/servlet-name", name);
        assertPresenceUsingXPath(desc, "/web-app/servlet/servlet-class", clazz);
        assertPresenceUsingXPath(desc, "/web-app/servlet-mapping/servlet-name", name);
        assertPresenceUsingXPath(desc, "/web-app/servlet-mapping/url-pattern", mapping);
    }

    @Test
    public void shouldBeAbleToSetRootAttributes() throws Exception {
        String version = "2.5";

        String desc = create().version(version).metadataComplete(true).exportAsString();

        log.fine(desc);

        assertPresenceUsingXPath(desc, "/web-app/@version", version);
        assertPresenceUsingXPath(desc, "/web-app/@metadata-complete", "true");
    }

    /**
     * SHRINKDESC-37
     */
    @Test
    public void shouldBeAbleToOverrideVersionInWebAppDescriptor() throws Exception {
        // Make a descriptor
        final WebAppDescriptor web = Descriptors.importAs(WebAppDescriptor.class).fromString(source);

        web.version("3.0");
        Assert.assertEquals("3.0", web.getVersionAsString());

        // Get as Node structure
        final InputStream stream = new ByteArrayInputStream(web.exportAsString().getBytes());
        final WebAppDescriptor fromWebXml = Descriptors.importAs(WebAppDescriptor.class).fromStream(stream);
        final Node root = ((NodeDescriptor) fromWebXml).getRootNode();

        // Preconditions
        Assert.assertEquals("3.0", web.getVersionAsString());
        Assert.assertTrue(root.getAttribute("xsi:schemaLocation").contains("web-app_2_5.xsd"));

        // Change the version
        web.version("2.5");

        // Check that everything was updated
        Assert.assertEquals("2.5", web.getVersionAsString());

        // Log just for fun
        // log.info("web.xml after update: " + web.exportAsString());
    }

    // -------------------------------------------------------------------------------------||
    // Helper Methods ----------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private WebAppDescriptor create() {
        return Descriptors.create(WebAppDescriptor.class);
    }
}
