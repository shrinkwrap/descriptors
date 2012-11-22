package org.jboss.shrinkwrap.descriptor.metadata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

public class MetadataParserTest {

	@Test
	public void testParseWithNullArguments() throws Exception {
		final MetadataParser parser = new MetadataParser();
		boolean isRuntimeExceptionThrown = false;
		try {
			parser.parse(null, null, null, false);
		}
		catch(IllegalArgumentException ex) {
			isRuntimeExceptionThrown = true;
		}
		
		Assert.assertTrue(isRuntimeExceptionThrown);
	}
	
	@Test
	public void testParseWithPathNull() throws Exception {
		final MetadataParser parser = new MetadataParser();
		boolean isRuntimeExceptionThrown = false;
		try {
			parser.parse(null, new ArrayList<Object>(), null, false);
		}
		catch(IllegalArgumentException ex) {
			isRuntimeExceptionThrown = true;
		}
		
		Assert.assertTrue(isRuntimeExceptionThrown);
	}
	
	@Test
	public void testParseWithDescriptorsNull() throws Exception {
		final MetadataParser parser = new MetadataParser();
		boolean isRuntimeExceptionThrown = false;
		try {
			parser.parse(new MetadataParserPath(), null, null, false);
		}
		catch(IllegalArgumentException ex) {
			isRuntimeExceptionThrown = true;
		}
		
		Assert.assertTrue(isRuntimeExceptionThrown);
	}
	
	/**
	 * Tests parsing and generating of the metada XML file. 
	 * The test uses a copy of the beans.xsd as test descriptor (testcases.xsd).
	 * @throws Exception
	 */
	@Test
    public void testParseAndMetadataGeneration() throws Exception {	
		final URL url = this.getClass().getResource("/xsd/testcases.xsd");
		
		final MetadataParserPath path = new MetadataParserPath();
		path.setPathToApi(null);
		path.setPathToImpl(null);
		path.setPathToTest(null);
		path.setPathToServices(null);
	
		final Properties prop = new Properties();
		prop.setProperty("xmlns", "http://java.sun.com/xml/ns/javaee");
		prop.setProperty("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		prop.setProperty("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/beans_1_0.xsd");
		
		final MetadataParserConfiguration conf = new MetadataParserConfiguration();
		conf.setDescriptorName("BeansDescriptor");
		conf.setElementName("beans");
		conf.setElementType("javaee:beans");
		conf.setGenerateClasses(false);
		conf.setNameSpace("javaee");
		conf.setNamespaces(prop);
		conf.setPackageApi("org.jboss.shrinkwrap.descriptor.api.beans10");
		conf.setPackageImpl("org.jboss.shrinkwrap.descriptor.impl.beans10");
		conf.setPathToXsd(url.getFile());
		conf.setVerbose(false);
		
		final List<Object> confList = new ArrayList<Object>();
		confList.add(conf);
		
//		final MetadataJavaDoc javadoc1 = new MetadataJavaDoc();
//		javadoc1.setTag("@author");
//		javadoc1.setValue("&lt;a href=&quot;mailto:ralf.battenfeld@bluewin.ch&quot;&gt;Ralf Battenfeld&lt;/a&gt;");
//		
//		final MetadataJavaDoc javadoc2 = new MetadataJavaDoc();
//		javadoc2.setTag("@author");
//		javadoc2.setValue("&lt;a href=&quot;mailto:alr@jboss.org&quot;&gt;Andrew Lee Rubinger&lt;/a&gt;");
//		
//		final List<Object> javadocList = new ArrayList<Object>();
//		javadocList.add(javadoc1);
//		javadocList.add(javadoc2);
		
		final MetadataParser parser = new MetadataParser();
		parser.parse(path, confList, null, true);
		
		final String pathToMetadata = parser.getPathToMetadataFile();
		Assert.assertNotNull(pathToMetadata);
		
		final URL urlMetadata = this.getClass().getResource("/xsd/tempMetadata3117577610235292908.xml");
     
		// replace the individual schema location per installation folder with an generic one
		final String metadataXmlGenerated = getResourceContents(pathToMetadata)
			.replaceAll("schema=\"([a-zA-Z0-9/-])*testcases.xsd\"", "schema=\"testcases.xsd\"")
			.replaceAll("schemaName=\"([a-zA-Z0-9/-])*testcases.xsd\"", "schemaName=\"testcases.xsd\"");
		
		final String metadataXmlOriginal = getResourceContents(urlMetadata.getFile())
			.replaceAll("schema=\"([a-zA-Z0-9/-])*testcases.xsd\"", "schema=\"testcases.xsd\"")
			.replaceAll("schemaName=\"([a-zA-Z0-9/-])*testcases.xsd\"", "schemaName=\"testcases.xsd\"");	
		
		XmlAssert.assertIdentical(metadataXmlOriginal, metadataXmlGenerated);     
    }
	

	//------------------------------------------------------------------------------------------||
	//--- Private Methods ----------------------------------------------------------------------||
	//------------------------------------------------------------------------------------------||

	private String getResourceContents(String resource) throws Exception {
		assert resource != null && resource.length() > 0 : "Resource must be specified";
		final BufferedReader reader = new BufferedReader(new FileReader(
				resource));
		final StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			builder.append(line);
			builder.append("\n");
		}
		return builder.toString();
	}
	
}
