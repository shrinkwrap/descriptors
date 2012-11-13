package org.jboss.shrinkwrap.descriptor.schemavalidator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.apache.xerces.impl.Constants;
import org.apache.xerces.parsers.XIncludeAwareParserConfiguration;
import org.apache.xerces.parsers.XMLGrammarPreparser;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLGrammarPoolImpl;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.Grammar;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParseException;
import org.apache.xerces.xni.parser.XMLParserConfiguration;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

public class ValidatorEvaluationTest {

	/** Property identifier: symbol table. */
	public static final String SYMBOL_TABLE = Constants.XERCES_PROPERTY_PREFIX
			+ Constants.SYMBOL_TABLE_PROPERTY;

	/** Property identifier: grammar pool. */
	public static final String GRAMMAR_POOL = Constants.XERCES_PROPERTY_PREFIX
			+ Constants.XMLGRAMMAR_POOL_PROPERTY;

	// feature ids

	/** Namespaces feature id (http://xml.org/sax/features/namespaces). */
	protected static final String NAMESPACES_FEATURE_ID = "http://xml.org/sax/features/namespaces";

	/** Validation feature id (http://xml.org/sax/features/validation). */
	protected static final String VALIDATION_FEATURE_ID = "http://xml.org/sax/features/validation";

	/**
	 * Schema validation feature id
	 * (http://apache.org/xml/features/validation/schema).
	 */
	protected static final String SCHEMA_VALIDATION_FEATURE_ID = "http://apache.org/xml/features/validation/schema";

	/**
	 * Schema full checking feature id
	 * (http://apache.org/xml/features/validation/schema-full-checking).
	 */
	protected static final String SCHEMA_FULL_CHECKING_FEATURE_ID = "http://apache.org/xml/features/validation/schema-full-checking";

	/**
	 * Honour all schema locations feature id
	 * (http://apache.org/xml/features/honour-all-schemaLocations).
	 */
	protected static final String HONOUR_ALL_SCHEMA_LOCATIONS_ID = "http://apache.org/xml/features/honour-all-schemaLocations";

	// a larg(ish) prime to use for a symbol table to be shared
	// among
	// potentially man parsers. Start one as close to 2K (20
	// times larger than normal) and see what happens...
	public static final int BIG_PRIME = 2039;

	// default settings

	/** Default Schema full checking support (false). */
	protected static final boolean DEFAULT_SCHEMA_FULL_CHECKING = false;

	/** Default honour all schema locations (false). */
	protected static final boolean DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS = false;


    static final String JAXP_SCHEMA_LANGUAGE
            = "http://java.sun.com/xml/jaxp/properties/schemaLanguage";
    static final String W3C_XML_SCHEMA 
            = "http://www.w3.org/2001/XMLSchema";
    static final String JAXP_SCHEMA_SOURCE
            = "http://java.sun.com/xml/jaxp/properties/schemaSource";
     
    @Test
	public void testJaxpValidator() throws Exception {
    	 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         factory.setNamespaceAware(true);
         factory.setValidating(true);
          
         factory.setAttribute(JAXP_SCHEMA_LANGUAGE, W3C_XML_SCHEMA);

         // Set the schema file
         factory.setAttribute(JAXP_SCHEMA_SOURCE, new File("../gen/src/main/resources/xsd/application_6.xsd"));
          
         try {
             DocumentBuilder parser = factory.newDocumentBuilder();

             // Parse the file. If errors found, they will be printed.
             parser.parse("../test/src/test/resources/test-gen-application6.xml");
             parser.getSchema();
              
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
    
    
	@Test
	public void testXMLValidator() throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		
		// read the XML file
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(new File("../test/src/test/resources/test-gen-application6.xml"));
		
		// create a SchemaFactory and a Schema
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Source schemaFile = new StreamSource(new File("../gen/src/main/resources/xsd/application_6.xsd"));
		Schema schema = schemaFactory.newSchema(schemaFile);
		
		// create a Validator object and validate the XML file
		Validator validator = schema.newValidator();
		validator.validate(new DOMSource(doc));
		
//		XStream xstream = new XStream();
//		String xml = xstream.toXML(validator);
//		
//		Object newNamedMap = (Object)xstream.fromXML(xml);
//		
//		SchemaGrammarSerializer.serialize(serializableSchema, "/tmp/schema.ser");
//		final SerializableSchema newSchema = SchemaGrammarSerializer.deserialize(SerializableSchema.class, "/tmp/schema.ser");
	}
	
	@Test
	public void testResolver() throws XMLStreamException {
//		
//		final XMLMapper mapper = XMLMapper.Factory.create();
//		mapper.parseDocument(null, null);
//		
//		try {
//			DOMParser parser = new DOMParser();
////			parser.
//			parser.setFeature("http://xml.org/sax/features/validation", true);
//			parser.setProperty(
//					"http://apache.org/xml/properties/schema/external-noNamespaceSchemaLocation",
//					"../gen/src/main/resources/xsd/application_6.xsd");
//			// ErrorChecker errors = new ErrorChecker();
//			// parser.setErrorHandler(errors);
//			parser.parse("../test/src/test/resources/test-gen-application6.xml");
//		} catch (Exception e) {
//			System.out.print("Problem parsing the file.");
//		}

		//
		// SchemaFactory schemaFactory =
		// SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		//
		// schemaFactory.setResourceResolver(new ClasspathResourceResolver());
	}
	
	
	@Test
	public void testXerces() throws Exception {
		final boolean externalDTDs = false;
		final SymbolTable sym = new SymbolTable(BIG_PRIME);
		final XMLGrammarPreparser preparser = new XMLGrammarPreparser(sym);
		final XMLGrammarPoolImpl grammarPool = new XMLGrammarPoolImpl();
		String grammarDescr = null;
		
		boolean isDTD = false;
		if (externalDTDs) {
			preparser.registerPreparser(XMLGrammarDescription.XML_DTD, null);
			grammarDescr = XMLGrammarDescription.XML_DTD;
			isDTD = true;
		} 
		else {
			preparser.registerPreparser(XMLGrammarDescription.XML_SCHEMA, null);
			grammarDescr = XMLGrammarDescription.XML_SCHEMA;
			isDTD = false;
		}

		final List<String> schemas = new ArrayList<String>();				
//		schemas.add("../gen/src/main/resources/xsd/2001/xml.xsd");	
//		schemas.add("../gen/src/main/resources/xsd/javaee_6.xsd");	
//		schemas.add("../gen/src/main/resources/xsd/javaee_web_services_client_1_3.xsd");
		schemas.add("../gen/src/main/resources/xsd/application_6.xsd");		
		
		final List<String> xmlFiles = new ArrayList<String>();	
		xmlFiles.add("src/test/resources/test-invalid-application-6.xml");
		
        boolean schemaFullChecking = DEFAULT_SCHEMA_FULL_CHECKING;
        boolean honourAllSchemaLocations = DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS;
        
		preparser.setProperty(GRAMMAR_POOL, grammarPool);
		preparser.setFeature(NAMESPACES_FEATURE_ID, true);
		preparser.setFeature(VALIDATION_FEATURE_ID, true);
		
		// note we can set schema features just in case...
		preparser.setFeature(SCHEMA_VALIDATION_FEATURE_ID, true);
		preparser.setFeature(SCHEMA_FULL_CHECKING_FEATURE_ID, schemaFullChecking);
		preparser.setFeature(HONOUR_ALL_SCHEMA_LOCATIONS_ID, honourAllSchemaLocations);
		
		preparser.setEntityResolver(new XMLEntityResolver() {

			@Override
			public XMLInputSource resolveEntity(
					XMLResourceIdentifier resourceIdentifier)
					throws XNIException, IOException {
				
				if (resourceIdentifier.getExpandedSystemId().equals("http://www.w3.org/2001/xml.xsd")) {
					return stringToXIS("../gen/src/main/resources/xsd/2001/xml.xsd");
				}
				return null;
			}
			
		});
		
		// parse the grammar...

		try {
			for (String schema: schemas) {
				final Grammar g = preparser.preparseGrammar(grammarDescr, stringToXIS(schema));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
				
		XMLParserConfiguration parserConfiguration = null;
		
		// Now we have a grammar pool and a SymbolTable; just
		// build a configuration and we're on our way!
		if (parserConfiguration == null) {
			parserConfiguration = new XIncludeAwareParserConfiguration(sym,	grammarPool);
		} else {
			// set GrammarPool and SymbolTable...
			parserConfiguration.setProperty(SYMBOL_TABLE, sym);
			parserConfiguration.setProperty(GRAMMAR_POOL, grammarPool);
		}
		
		// now must reset features, unfortunately:
		try {
			parserConfiguration.setFeature(NAMESPACES_FEATURE_ID, true);
			parserConfiguration.setFeature(VALIDATION_FEATURE_ID, true);
			parserConfiguration.setFeature(SCHEMA_VALIDATION_FEATURE_ID, true);
			parserConfiguration.setFeature(SCHEMA_FULL_CHECKING_FEATURE_ID,	schemaFullChecking);
			parserConfiguration.setFeature(HONOUR_ALL_SCHEMA_LOCATIONS_ID, honourAllSchemaLocations);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		parserConfiguration.setErrorHandler(new XMLErrorHandler() {

			@Override
			public void warning(String domain, String key,
					XMLParseException exception) throws XNIException {
				
			}

			@Override
			public void error(String domain, String key,
					XMLParseException exception) throws XNIException {
				throw new XNIException(exception);
			}

			@Override
			public void fatalError(String domain, String key,
					XMLParseException exception) throws XNIException {
				throw new XNIException(exception);
			}
			
		});
		
				
		// then for each instance file, try to validate it
		if (xmlFiles != null) {
//			try {
				for (String xmlFile: xmlFiles) {
					parserConfiguration.parse(stringToXIS(xmlFile));
				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.exit(1);
//			}
		}
	}

	private static XMLInputSource stringToXIS(String uri) {
		return new XMLInputSource(null, uri, null);
	}

	@Test
	public void testWoodstock() throws Exception {
//		final XMLValidationSchemaFactory sf = XMLValidationSchemaFactory.newInstance(XMLValidationSchema.SCHEMA_ID_W3C_SCHEMA);
//		final File schemaFile = new File("../gen/src/main/resources/xsd/persistence_2_0.xsd");
//		XMLValidationSchema dtd = null;
//
//		try {
//			dtd = sf.createSchema(schemaFile);
//		} catch (XMLStreamException xe) {
//			System.err.println("Failed to process the XSD file ('" + schemaFile
//					+ "'): " + xe);
//			System.exit(1);
//		}
//
//		W3CSchema w3cSchema = (W3CSchema)dtd;
//		XMLSchemaGrammar grammar = getGrammar(w3cSchema);
//		
//		File inputFile = new File(
//				"../test/src/test/resources/test-gen-persistence20.xml");
//		try {
//			XMLInputFactory2 ifact = (XMLInputFactory2) XMLInputFactory.newInstance();
//			XMLStreamReader2 sr = ifact.createXMLStreamReader(inputFile);
//
//			try {
//				sr.validateAgainst(dtd);
//				/*
//				 * Document validation is done as document is read through (ie.
//				 * it's fully streaming as well as parsing), so just need to
//				 * traverse the contents.
//				 */
//				while (sr.hasNext()) {
//					sr.next();
//				}
//			} catch (XMLValidationException vex) {
//				System.err.println("Document '" + inputFile
//						+ "' failed validation: " + vex);
//				System.exit(1);
//			}
//		} catch (XMLStreamException xse) {
//			System.err.println("Failed parse the input document ('" + inputFile
//					+ "'): " + xse);
//			System.exit(1);
//		}
//		System.out.println("Document '" + inputFile
//				+ "' succesfully validated.");
	}

	private void serialize(final Object obj) throws IOException {
		try {
			// Serialize to a file
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
			out.writeObject(obj);
			out.close();

			// Serialize to a byte array
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			out = new ObjectOutputStream(bos);
			out.writeObject(obj);
			out.close();

			// Get the bytes of the serialized object
			byte[] buf = bos.toByteArray();
		} catch (IOException e) {
			throw(e);
		}
	}
	
	private class ClasspathResourceResolver implements LSResourceResolver {
		 
	    @Override
	    public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {
	 
	        LSInputImpl input = new LSInputImpl();
	 
	        InputStream stream = getClass().getClassLoader().getResourceAsStream(systemId);
	 
	        input.setPublicId(publicId);
	        input.setSystemId(systemId);
	        input.setBaseURI(baseURI);
	        input.setCharacterStream(new InputStreamReader(stream));
	 
	        return input;
	    }
	}
	
	private class LSInputImpl implements LSInput {
		 
	    private Reader characterStream;
	    private InputStream byteStream;
	    private String stringData;
	    private String systemId;
	    private String publicId;
	    private String baseURI;
	    private String encoding;
	    private boolean certifiedText;
	    
		@Override
		public String getBaseURI() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public InputStream getByteStream() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean getCertifiedText() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public Reader getCharacterStream() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getEncoding() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String getPublicId() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public String getStringData() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public String getSystemId() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void setBaseURI(String arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setByteStream(InputStream arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setCertifiedText(boolean arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setCharacterStream(Reader arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void setEncoding(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setPublicId(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setStringData(String arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void setSystemId(String arg0) {
			// TODO Auto-generated method stub
			
		}
	 
	    // Getters and setters here
	}
	
//	private XMLSchemaGrammar getGrammar(final W3CSchema schema) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
//		final Field f = schema.getClass().getDeclaredField("mGrammar");
//		f.setAccessible(true);
//		final XMLSchemaGrammar grammar = (XMLSchemaGrammar) f.get(schema);
//		return grammar;
//	}
}
