package org.jboss.shrinkwrap.descriptor.metadata.mojo;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataParserConfiguration;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * This class is able to test the metadata-parser-plugin as maven plugin.
 */
public class MetadataParserMojoTestCase extends AbstractMojoTestCase {

	@BeforeClass
    protected void init() throws Exception {
        super.setUp();
    }

	@AfterClass
    protected void shutdown() throws Exception {
        super.tearDown();
    }

	/**
	 * Tests the configuration value mapping from pom.xml to the internal objects.
	 * @throws Exception
	 */
	@Test
    public void testConfiguration() throws Exception {
        final File pom = getTestFile("src/test/resources/mojo-test-harness-pom.xml");
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
        Assert.assertEquals(metadataConf.getNamespaces().getProperty("xmlns:xsi"), "http://www.w3.org/2001/XMLSchema-instance");
        Assert.assertEquals(metadataConf.getNamespaces().getProperty("xsi:schemaLocation"), "http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd");
    }
    
	/**
	 * Tests the generation of interface and implementation classes. 
	 * @throws Exception
	 */
	@Test
    public void testExecute() throws Exception {
        final File pom = getTestFile("src/test/resources/mojo-test-beans-pom.xml");
        Assert.assertNotNull(pom);
        Assert.assertTrue(pom.exists());

        final MetadataParserMojo myMojo = (MetadataParserMojo) lookupMojo("parse", pom);
        Assert.assertNotNull(myMojo);
        myMojo.execute();
        
        assertFile("target/mojo-test/test-api/src/main/java/org/jboss/shrinkwrap/descriptor/api/beans10/Beans.java");
        assertFile("target/mojo-test/test-api/src/main/java/org/jboss/shrinkwrap/descriptor/api/beans10/BeansDescriptor.java");
        assertFile("target/mojo-test/test-api/src/main/java/org/jboss/shrinkwrap/descriptor/api/beans10/Decorators.java");
        assertFile("target/mojo-test/test-api/src/main/java/org/jboss/shrinkwrap/descriptor/api/beans10/Interceptors.java");
        assertFile("target/mojo-test/test-api/src/main/java/org/jboss/shrinkwrap/descriptor/api/beans10/package-info.java");
        
        assertFile("target/mojo-test/test-impl/src/main/java/org/jboss/shrinkwrap/descriptor/impl/beans10/BeansImpl.java");
        assertFile("target/mojo-test/test-impl/src/main/java/org/jboss/shrinkwrap/descriptor/impl/beans10/BeansDescriptorImpl.java");
        assertFile("target/mojo-test/test-impl/src/main/java/org/jboss/shrinkwrap/descriptor/impl/beans10/DecoratorsImpl.java");
        assertFile("target/mojo-test/test-impl/src/main/java/org/jboss/shrinkwrap/descriptor/impl/beans10/InterceptorsImpl.java");
        assertFile("target/mojo-test/test-impl/src/main/java/org/jboss/shrinkwrap/descriptor/impl/beans10/package-info.java");        
    }
	
	private void assertFile(final String file)
	{
        final File generatedFile = new File(file);        
        Assert.assertTrue(generatedFile.exists());
        Assert.assertTrue(generatedFile.isFile());
	}
}
