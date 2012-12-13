package org.jboss.shrinkwrap.descriptor.test.webapp30;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.junit.Test;

public class WebAppDescriptorAttributeGroupTestCase {

    @SuppressWarnings("unused")
    private final Logger log = Logger.getLogger(WebAppDescriptorAttributeGroupTestCase.class.getName());

    /*
     * to test:
     * 
     * web-common-attributes (used in web-appType, web-fragmentType)
     */

    @Test
    public void testDescription() throws Exception {
        final WebAppDescriptor webApp = create().createServlet().description("Description1")
            .description("Description2").up();

        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/description[1]", "Description1");
        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/servlet/description[2]", "Description2");

        assertTrue(webApp.getAllServlet().get(0).getAllDescription().size() == 2);
        webApp.getAllServlet().get(0).removeAllDescription();
        assertTrue(webApp.getAllServlet().get(0).getAllDescription().size() == 0);
    }

    @Test
    public void testDisplayName() throws Exception {
        final WebAppDescriptor webApp = create().createFilter().displayName("displayName1").displayName("displayName2")
            .up();

        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/display-name[1]", "displayName1");
        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/display-name[2]", "displayName2");

        assertTrue(webApp.getAllFilter().get(0).getAllDisplayName().size() == 2);
        webApp.getAllFilter().get(0).removeAllDisplayName();
        assertTrue(webApp.getAllFilter().get(0).getAllDisplayName().size() == 0);
    }

    @Test
    public void testIcon() throws Exception {
        final WebAppDescriptor webApp = create().createFilter().createIcon().largeIcon("largeIcon1").up().createIcon()
            .smallIcon("smallIcon2").up().up();

        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/icon[1]/large-icon", "largeIcon1");
        assertPresenceUsingXPath(webApp.exportAsString(), "/web-app/filter/icon[2]/small-icon", "smallIcon2");

        assertTrue(webApp.getAllFilter().get(0).getAllIcon().size() == 2);

        webApp.getAllFilter().get(0).getAllIcon().get(0).removeLargeIcon();
        assertTrue(webApp.exportAsString().indexOf("<large-icon>") == -1);

        webApp.getAllFilter().get(0).getAllIcon().get(1).removeSmallIcon();
        assertTrue(webApp.exportAsString().indexOf("<small-icon>") == -1);

        webApp.getAllFilter().get(0).removeAllIcon();
        assertTrue(webApp.createFilter().getAllIcon().size() == 0);
    }

    // -------------------------------------------------------------------------------------||
    // Helper Methods ----------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private WebAppDescriptor create() {
        return Descriptors.create(WebAppDescriptor.class);
    }
}
