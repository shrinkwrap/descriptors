package org.jboss.shrinkwrap.descriptor.metadata.mojo;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParserConfiguration;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class is able to test the metadata-parser-plugin as maven plugin using the maven-plugin-testing-harness plugin.
 * This test plugin cannot be used for an integration test.
 */
public class MetadataParserMojoTest extends AbstractMojoTestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void shutdown() throws Exception {
        super.tearDown();
    }

    /**
     * Tests the configuration value mapping from pom.xml to the internal objects.
     *
     * @throws Exception
     */
    @Test
    public void testConfiguration() throws Exception {
        final String pathToTestPom = getBasedir() + "/src/test/resources/mojo-test-harness-pom.xml";
        final File pom = new File(pathToTestPom);
        Assert.assertNotNull(pom);
        Assert.assertTrue(pom.exists());

        final MetadataParserMojo myMojo = (MetadataParserMojo) lookupMojo("parse", pom);
        Assert.assertNotNull(myMojo);
        Assert.assertTrue(myMojo.descriptors.size() == 1);
        final MetadataParserConfiguration metadataConf = (MetadataParserConfiguration) myMojo.descriptors.get(0);

        Assert.assertTrue(myMojo.verbose);
        Assert.assertTrue(myMojo.path.getPathToApi().indexOf("/mojo-test/test-api/src/main/java") > 0);
        Assert.assertTrue(myMojo.path.getPathToImpl().indexOf("/mojo-test/test-impl/src/main/java") > 0);
        Assert.assertTrue(myMojo.path.getPathToTest().indexOf("/mojo-test/test-test/src/main/java") > 0);
        Assert.assertTrue(metadataConf.getPathToXsd().indexOf("/src/main/resources/xsd/connector_1_0.dtd") > 0);
        Assert.assertEquals(metadataConf.getNameSpace(), "j2ee");
        Assert.assertEquals(metadataConf.getPackageApi(), "org.jboss.shrinkwrap.descriptor.testapi.mojo");
        Assert.assertEquals(metadataConf.getPackageImpl(), "org.jboss.shrinkwrap.descriptor.testimpl.mojo");
        Assert.assertEquals(metadataConf.getDescriptorName(), "MojoTestDescriptor");
        Assert.assertEquals(metadataConf.getElementName(), "mojo");
        Assert.assertEquals(metadataConf.getElementType(), "j2ee:mojo");
        Assert.assertEquals(metadataConf.getNamespaces().getProperty("xmlns"), "http://java.sun.com/xml/ns/j2ee");
        Assert.assertEquals(metadataConf.getNamespaces().getProperty("xmlns:xsi"),
            "http://www.w3.org/2001/XMLSchema-instance");
        Assert.assertEquals(metadataConf.getNamespaces().getProperty("xsi:schemaLocation"),
            "http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd");
    }
}
