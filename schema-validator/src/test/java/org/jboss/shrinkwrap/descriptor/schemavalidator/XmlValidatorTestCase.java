package org.jboss.shrinkwrap.descriptor.schemavalidator;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.apache.xerces.parsers.XMLGrammarPreparser;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.xni.XNIException;
import org.jboss.shrinkwrap.descriptor.schemavalidator.XmlValidator.SchemaType;
import org.junit.Test;

public class XmlValidatorTestCase {

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
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);
		validator.loadGrammar("application_6.xsd");
		validator.validate("src/test/resources/test-valid-application-6.xml");
	}
	
	@Test(expected = XNIException.class)
	public void testInvalidApplicationXML() throws Exception {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);
		validator.loadGrammar("application_6.xsd");
		validator.validate("src/test/resources/test-invalid-application-6.xml");
	}
	
	@Test
	public void testValidApplicationXMLFromList() throws Exception {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);		
		final List<String> schemas = new ArrayList<String>();
		schemas.add("application_6.xsd");			
		validator.loadGrammars(schemas);
		validator.validate("src/test/resources/test-valid-application-6.xml");
	}
	
	@Test(expected = XNIException.class)
	public void testInvalidApplicationXMLFromList() throws Exception {		
		final XmlValidator validator = new XmlValidator(SchemaType.XSD);		
		final List<String> schemas = new ArrayList<String>();	
		schemas.add("application_6.xsd");		
		validator.loadGrammars(schemas);
		validator.validate("src/test/resources/test-invalid-application-6.xml");
	}

}
