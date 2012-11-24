package org.jboss.shrinkwrap.descriptor.schemavalidator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.apache.xerces.parsers.XMLGrammarPreparser;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.XNIException;
import org.jboss.shrinkwrap.descriptor.schemavalidator.XmlValidator.SchemaType;
import org.junit.Test;

public class XmlValidatorTestCase {

	final XmlValidator defaultValidator = new XmlValidator(SchemaType.XSD); 
	
	public XmlValidatorTestCase() {
		try {
			defaultValidator.loadGrammar("application_6.xsd");
		} catch (XNIException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void testXmlValidatorSchemaTypeXSD() {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);
		Assert.assertTrue(validator.getSchemaType() == SchemaType.XSD);
	}
	
	@Test
	public void testXmlValidatorSchemaTypeDTD() {		
		final XmlValidator validator = new XmlValidator(SchemaType.DTD);
		Assert.assertTrue(validator.getSchemaType() == SchemaType.DTD);
	}
	
	@Test(expected = RuntimeException.class)
	public void testXmlValidatorSchemaWithNoConfig() {
		new XmlValidator(null, null);
	}
	
	@Test(expected = RuntimeException.class)
	public void testXmlValidatorSchemaWithNoParser() {
		new XmlValidator(SchemaType.DTD, null);
	}
	
	@Test(expected = RuntimeException.class)
	public void testXmlValidatorSchemaWithNoGrammarPool() {
		final SymbolTable sym = new SymbolTable(XmlValidatorConstants.BIG_PRIME);
		final XMLGrammarPreparser preparser = new XMLGrammarPreparser(sym);
		new XmlValidator(SchemaType.DTD, preparser);
	}

	@Test
	public void testValidApplicationXML() throws Exception {
		defaultValidator.validateFile("src/test/resources/test-valid-application-6.xml");
	}
	
	@Test(expected = XNIException.class)
	public void testInvalidApplicationXML() throws Exception {	
		defaultValidator.validateFile("src/test/resources/test-invalid-application-6.xml");
	}
	
	@Test
	public void testValidApplicationXMLFromList() throws Exception {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);		
		final List<String> schemas = new ArrayList<String>();
		schemas.add("application_6.xsd");			
		validator.loadGrammars(schemas);
		validator.validateFile("src/test/resources/test-valid-application-6.xml");
	}
	
	@Test(expected = XNIException.class)
	public void testInvalidApplicationXMLFromList() throws Exception {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);		
		final List<String> schemas = new ArrayList<String>();	
		schemas.add("application_6.xsd");		
		validator.loadGrammars(schemas);
		validator.validateFile("src/test/resources/test-invalid-application-6.xml");
	}	

	@Test
	public void testValidApplicationXMLFromStreamSource() throws Exception {	
		final String resource = getResourceContents("src/test/resources/test-valid-application-6.xml");	
		defaultValidator.validateContent(resource);
	}
	
	@Test(expected = XNIException.class)
	public void testInvalidApplicationXMLFromStreamSource() throws Exception {	
		final String resource = getResourceContents("src/test/resources/test-invalid-application-6.xml");		
		defaultValidator.validateContent(resource);
	}

	@Test
	public void testDefaultSearchLocation() throws Exception {
		Assert.assertTrue(defaultValidator.getSearchLocations().size() == 4);
	}
	
	@Test
	public void testAddSearchLocation() throws Exception {
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);
		validator.addSearchLocation("META-INF/schema");
		Assert.assertTrue(validator.getSearchLocations().size() == 5);
		Assert.assertEquals("META-INF/schema", validator.getSearchLocations().get(0));
	}
	
    // -------------------------------------------------------------------------------------||
    // Helper Methods ----------------------------------------------------------------------||
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
	   
}
