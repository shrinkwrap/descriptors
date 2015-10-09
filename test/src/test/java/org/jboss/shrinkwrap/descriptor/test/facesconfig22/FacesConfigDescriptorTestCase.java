package org.jboss.shrinkwrap.descriptor.test.facesconfig22;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertSchemaLocation;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigVersionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.WebFacesConfigDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

/**
 * @author kenfinnigan
 */
public class FacesConfigDescriptorTestCase {

    private final String source = "" +
         "<faces-config " +
         "      xmlns=\"http://java.sun.com/xml/ns/javaee\" " +
         "      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
         "      version=\"2.0\" " +
         "      xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-facesconfig_2_0.xsd\">\n" +
         "    <name>SeamBooking</name>\n" +
         "    <navigation-rule>\n" +
         "        <from-view-id>*</from-view-id>\n" +
         "        <navigation-case>\n" +
         "            <from-action>#{identity.logout}</from-action>\n" +
         "            <if>#{true}</if>\n" +
         "            <to-view-id>/home.xhtml</to-view-id>\n" +
         "            <redirect/>\n" +
         "        </navigation-case>\n" +
         "        <navigation-case>\n" +
         "            <from-action>#{bookingAgent.cancel}</from-action>\n" +
         "            <if>#{true}</if>\n" +
         "            <to-view-id>/search.xhtml</to-view-id>\n" +
         "            <redirect/>\n" +
         "        </navigation-case>\n" +
         "    </navigation-rule>\n" +
         "    <application>\n" +
         "        <resource-bundle>\n" +
         "            <base-name>messages</base-name>\n" +
         "            <var>messages</var>\n" +
         "        </resource-bundle>\n" +
         "    </application>\n" +
         "</faces-config>";

    @Test
    public void shouldCreateDefaultName() throws Exception {
        Assert.assertEquals("faces-config.xml", create().getDescriptorName());
    }

    @Test
    public void verifySchemaLocation() {
        final String expectedSchemaLocation = "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd";

        assertSchemaLocation(create().exportAsString(), "http://www.w3.org/2001/XMLSchema-instance",
            expectedSchemaLocation);
    }

    @Test
    public void shouldBeAbleToOverrideVersionInWebFacesConfigDescriptor() throws Exception {
        // Make a descriptor
        final WebFacesConfigDescriptor facesConfig = Descriptors.importAs(WebFacesConfigDescriptor.class).fromString(source);

        facesConfig.version("2.2");
        Assert.assertEquals("2.2", facesConfig.getVersionAsString());

        // Get as Node structure
        final InputStream stream = new ByteArrayInputStream(facesConfig.exportAsString().getBytes());
        final WebFacesConfigDescriptor fromFacesConfigXml = Descriptors.importAs(WebFacesConfigDescriptor.class).fromStream(
            stream);
        final Node root = ((NodeDescriptor) fromFacesConfigXml).getRootNode();

        // Preconditions
        Assert.assertEquals("2.2", facesConfig.getVersionAsString());
        Assert.assertTrue(root.getAttribute("xsi:schemaLocation").contains("web-facesconfig_2_2.xsd"));

        // Change the version
        facesConfig.version("2.1");

        // Check that everything was updated
        Assert.assertEquals("2.1", facesConfig.getVersionAsString());
    }

    @Test
    public void testGeneratedFacesConfigXml() throws Exception {
        final WebFacesConfigDescriptor facesConfig = create()
            .addDefaultNamespaces()
            .version(FacesConfigVersionType._2_2)
            .name("SeamBooking")
            .getOrCreateNavigationRule()
                .fromViewId("*")
                .getOrCreateNavigationCase()
                    .fromAction("#{identity.logout}")
                    ._if("#{true}")
                    .toViewId("/home.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .createNavigationCase()
                    .fromAction("#{bookingAgent.cancel}")
                    ._if("#{true}")
                    .toViewId("/search.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/home.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{identity.login}")
                    ._if("#{identity.loggedIn}")
                    .toViewId("/search.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .createNavigationCase()
                    .fromAction("#{identity.login}")
                    .fromOutcome("failed")
                    .toViewId("/home.xhtml")
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/search.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{bookingAgent.selectHotel(_hotel)}")
                    ._if("#{bookingAgent.hotelSelection != null}")
                    .toViewId("/hotel.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/hotel.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{bookingAgent.bookHotel}")
                    ._if("#{bookingAgent.booking != null}")
                    .toViewId("/book.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/book.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{bookingAgent.validate}")
                    ._if("#{bookingAgent.bookingValid}")
                    .toViewId("/confirm.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/confirm.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{bookingAgent.confirm}")
                    ._if("#{true}")
                    .toViewId("/search.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/register.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{registrar.register}")
                    ._if("#{registrar.registered}")
                    .toViewId("/home.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .createNavigationRule()
                .fromViewId("/password.xhtml")
                .getOrCreateNavigationCase()
                    .fromAction("#{passwordManager.changePassword}")
                    ._if("#{passwordManager.changed}")
                    .toViewId("/account.xhtml")
                    .getOrCreateRedirect()
                        .up()
                    .up()
                .up()
            .getOrCreateApplication()
                .getOrCreateResourceBundle()
                    .baseName("messages")
                    .var("messages")
                .up()
            .up();

        String facesConfigXmlGenerated = facesConfig.exportAsString();
        String facesConfigXmlOriginal = getResourceContents("src/test/resources/test-orig-facesconfig22.xml");

        XmlAssert.assertIdentical(facesConfigXmlOriginal, facesConfigXmlGenerated);
    }

    // -------------------------------------------------------------------------------------||
    // Internal Helper ---------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private String getResourceContents(String resource) throws Exception {
        assert resource != null && resource.length() > 0 : "Resource must be specified";
        final BufferedReader reader = new BufferedReader(new FileReader(resource));
        final StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append("\n");
        }
        return builder.toString();
    }

    private WebFacesConfigDescriptor create() {
        return Descriptors.create(WebFacesConfigDescriptor.class);
    }

}
