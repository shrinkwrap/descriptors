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
			parser.parse(null, null, false);
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
			parser.parse(null, new ArrayList<Object>(), false);
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
			parser.parse(new MetadataParserPath(), null, false);
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
		
		final MetadataParser parser = new MetadataParser();
		parser.parse(path, confList, true);
		
		final String pathToMetadata = parser.getPathToMetadataFile();
		Assert.assertNotNull(pathToMetadata);
		
		final URL urlMetadata = this.getClass().getResource("/xsd/tempMetadata3117577610235292908.xml");
     
		final String metadataXmlGenerated = getResourceContents(pathToMetadata);
		final String metadataXmlOriginal = getResourceContents(urlMetadata.getFile());
		
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
