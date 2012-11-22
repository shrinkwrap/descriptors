/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shrinkwrap.descriptor.schemavalidator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.parsers.XIncludeAwareParserConfiguration;
import org.apache.xerces.parsers.XMLGrammarPreparser;
import org.apache.xerces.util.SymbolTable;
import org.apache.xerces.util.XMLGrammarPoolImpl;
import org.apache.xerces.xni.XMLResourceIdentifier;
import org.apache.xerces.xni.XNIException;
import org.apache.xerces.xni.grammars.XMLGrammarDescription;
import org.apache.xerces.xni.grammars.XMLGrammarPool;
import org.apache.xerces.xni.parser.XMLEntityResolver;
import org.apache.xerces.xni.parser.XMLErrorHandler;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.apache.xerces.xni.parser.XMLParseException;
import org.apache.xerces.xni.parser.XMLParserConfiguration;


/**
 * This class is able to validate XML files against corresponding
 * DTD and XSD schemas.
 * <p>
 * The implementation is based on the xerces xni library.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class XmlValidator {	

	/** Defines the schema types */
	public enum SchemaType {
		DTD,
		XSD
	}	
	
	/** contains all search locations used by <code>getResourceAsStream()</code> */
	private static List<String> searchLocationList = new ArrayList<String>();
		
	static {
		searchLocationList.add("META-INF/xsd/");
		searchLocationList.add("xsd/");
		searchLocationList.add("");
		searchLocationList.add("META-INF/2001/");
	}
	
	/** schema type we have to know for loading the grammars */
	private final SchemaType schemaType;
	
	/** preparser and grammar pool */
	private final SymbolTable sym = new SymbolTable(XmlValidatorConstants.BIG_PRIME);
	private final XMLGrammarPreparser preparser;
	private final XMLGrammarPool grammarPool;
	
	/** preparser and parser configuration settings */
	private boolean nameSpacesID; 
	private boolean validationID;
	private boolean schemaValidationID;
	private boolean schemaFullCheckingID;
	private boolean honourAllSchemaID;
	
	/** used for tracking how many grammars are loaded */
	private int grammarCount = 0;
	
	/** User specific error handler */
	private XMLErrorHandler errorHandler;
	
	//-----------------------------------------------------------------------||
	//-- Public Constructors ------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	/**
	 * Default constructor. Initializes the DTD and XSD preparser.
	 * TODO describe default settings
	 */
	public XmlValidator(final SchemaType type) {
		schemaType = type;
		grammarPool = new XMLGrammarPoolImpl();
		preparser = new XMLGrammarPreparser(sym);
		
		if (schemaType == SchemaType.DTD) {
			preparser.registerPreparser(XMLGrammarDescription.XML_DTD, null);	
		} else {
			preparser.registerPreparser(XMLGrammarDescription.XML_SCHEMA, null);
		}
		
		preparser.setProperty(XmlValidatorConstants.GRAMMAR_POOL, grammarPool);
		nameSpacesID = XmlValidatorConstants.DEFAULT_NAMESPACES_FEATURE_ID; 
		validationID = XmlValidatorConstants.DEFAULT_VALIDATION_FEATURE_ID;
		schemaValidationID = XmlValidatorConstants.DEFAULT_SCHEMA_VALIDATION_FEATURE_ID;
		schemaFullCheckingID = XmlValidatorConstants.DEFAULT_SCHEMA_FULL_CHECKING;
		honourAllSchemaID = XmlValidatorConstants.DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS;
		
		// apply default settings
		initializePreparser();
	}
	
	/**
	 * Constructs an individual configured validator.
	 * @param type defines the schema type.
	 * @param nameSpacesFeatureID TODO
	 * @param validationFeatureID TODO
	 * @param schemaValidationFeatureID TODO
	 * @param schemaFullCheckingFeatureID TODO
	 * @param honourAllSchemaLocationsID TODO
	 */
	public XmlValidator(final SchemaType type, 
			final boolean nameSpacesFeatureID, 
			final boolean validationFeatureID, 
			final boolean schemaValidationFeatureID,
			final boolean schemaFullCheckingFeatureID, 
			final boolean honourAllSchemaLocationsID) {
		
		schemaType = type;
		preparser = new XMLGrammarPreparser(sym);
		grammarPool = new XMLGrammarPoolImpl();
		preparser.setProperty(XmlValidatorConstants.GRAMMAR_POOL, grammarPool);
		nameSpacesID = nameSpacesFeatureID; 
		validationID = validationFeatureID;
		schemaValidationID = schemaValidationFeatureID;
		schemaFullCheckingID = schemaFullCheckingFeatureID;
		honourAllSchemaID = honourAllSchemaLocationsID;
		
		// apply given settings
		initializePreparser();
				
		if (schemaType == SchemaType.DTD) {
			preparser.registerPreparser(XMLGrammarDescription.XML_DTD, null);	
		} else {
			preparser.registerPreparser(XMLGrammarDescription.XML_SCHEMA, null);
		}
	}
	
	/**
	 * Constructor allowing to define the <code>XMLGrammarPreparser</code> and
	 * <code>XMLGrammarPoolImpl</code> outside of the class.
	 * @param type defines the schema type.
	 * @param preparser the preparser created by the caller.
	 * @param grammarPool the grammar pool created by the caller.
	 */
	public XmlValidator(
			final SchemaType type, 
			final XMLGrammarPreparser preparser) {
		
		if (type == null) {
			throw new RuntimeException("The schema type must be initialized");
		}
		
		if (preparser == null) {
			throw new RuntimeException("The preparser must be initialized");
		}
		
		if (preparser.getGrammarPool() == null) {
			throw new RuntimeException("The grammar pool must be initialized");
		}
		
		this.schemaType = type;
		this.preparser = preparser;
		this.grammarPool = preparser.getGrammarPool();
	}
	
	//-----------------------------------------------------------------------||
	//-- Public Grammar Loader Methods --------------------------------------||
	//-----------------------------------------------------------------------||
	
	/**
	 * Installs the user <code>XMLErrorHandler</code> instance.
	 * @param errorHandler the user specific error handler.
	 */
	public void setErrorHandler(final XMLErrorHandler errorHandler) {
		this.errorHandler = errorHandler;
	}
	
	public void addSearchLocation(final String location) {
		searchLocationList.add(location);
	}
	
	/**
	 * Loads the grammar.
	 * @param schema the grammar to be loaded.
	 * @throws XNIException
	 * @throws IOException
	 */
	public void loadGrammar(final String schema) throws XNIException, IOException {		
		if (isResourceCandidate(schema)) {
			final InputStream inputStream = getFirstValidInputStream(schema);
			if (inputStream != null) {
				XMLInputSource xmlInputStream = new XMLInputSource(null, 
						schema, null, inputStream, null);
				preparser.preparseGrammar(getGrammarDescription(), xmlInputStream);
			}
		} else {			
			preparser.preparseGrammar(getGrammarDescription(), stringToXIS(schema));
		}
		grammarCount++;	
	}
	
	/**
	 * Loads the grammars extracted from the given list of schemas.
	 * @param schemaList
	 * @throws XNIException
	 * @throws IOException
	 */
	public void loadGrammars(final List<String> schemaList) throws XNIException, IOException {
		for (String schema: schemaList) {	
			loadGrammar(schema);
		}
	}

	//-----------------------------------------------------------------------||
	//-- Public Validator  Methods ------------------------------------------||
	//-----------------------------------------------------------------------||
	
	public void validateFile(final String pathToFile) throws XNIException, IOException {
		checkGrammarPoolSize();
		final XMLParserConfiguration parserConfiguration = getParserConfiguration();
		parserConfiguration.parse(stringToXIS(pathToFile));
	}

	public void validateFile(final File xmlFile) throws XNIException, IOException  {
		checkGrammarPoolSize();
		validateFile(xmlFile.getAbsolutePath());
	}

	public void validateContent(final String xmlString) throws XNIException, IOException  {
		checkGrammarPoolSize();
		final XMLParserConfiguration parserConfiguration = getParserConfiguration();
		parserConfiguration.parse(new XMLInputSource(null, null, null, new StringReader(xmlString), null));
	}	

	//-----------------------------------------------------------------------||
	//-- Other Public Methods -----------------------------------------------||
	//-----------------------------------------------------------------------||

	public SchemaType getSchemaType() {
		return schemaType;
	}

	
	//-----------------------------------------------------------------------||
	//-- Private Methods ----------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	/**
	 * Returns the <code>XMLGrammarDescription</code> string based in the schema type.
	 * @return
	 */
	private String getGrammarDescription() {
		String grammarDescr = null;
		if (schemaType == SchemaType.DTD) {
			grammarDescr = XMLGrammarDescription.XML_DTD;
		} else if (schemaType == SchemaType.XSD) {
			grammarDescr = XMLGrammarDescription.XML_SCHEMA;
		} else {
			throw new RuntimeException("Not supported: " + schemaType);
		}
		return grammarDescr;
	}
	
	/**
	 * Returns a <code>XMLParserConfiguration</code> based on the preparser configuration.
	 * @return a <code>XMLParserConfiguration</code>.
	 */
	private XMLParserConfiguration getParserConfiguration() {
		final XMLParserConfiguration parserConfiguration = new XIncludeAwareParserConfiguration(sym, grammarPool);
		
		// copy over the parser configuration
		parserConfiguration.setFeature(XmlValidatorConstants.NAMESPACES_FEATURE_ID, nameSpacesID);		
		parserConfiguration.setFeature(XmlValidatorConstants.VALIDATION_FEATURE_ID, validationID);		
		parserConfiguration.setFeature(XmlValidatorConstants.SCHEMA_VALIDATION_FEATURE_ID, schemaValidationID);		
		parserConfiguration.setFeature(XmlValidatorConstants.SCHEMA_FULL_CHECKING_FEATURE_ID, schemaFullCheckingID);		
		parserConfiguration.setFeature(XmlValidatorConstants.HONOUR_ALL_SCHEMA_LOCATIONS_ID, honourAllSchemaID);
		
		// install our own error handler in case no external error hander is defined.
		if (errorHandler == null) {
			parserConfiguration.setErrorHandler(new ErrorHandler());
		}
		
		return parserConfiguration;
	}
	
	/**
	 * Checks that at least one grammar is loaded.
	 */
	private void checkGrammarPoolSize() {
		if (grammarCount == 0) {
			throw new RuntimeException("No grammar loaded. Please, load the grammars first");
		}
	}
	
	private void initializePreparser() {
		preparser.setProperty(XmlValidatorConstants.GRAMMAR_POOL, grammarPool);
		preparser.setFeature(XmlValidatorConstants.NAMESPACES_FEATURE_ID, nameSpacesID);
		preparser.setFeature(XmlValidatorConstants.VALIDATION_FEATURE_ID, validationID);
		preparser.setFeature(XmlValidatorConstants.SCHEMA_VALIDATION_FEATURE_ID, schemaValidationID);
		preparser.setFeature(XmlValidatorConstants.SCHEMA_FULL_CHECKING_FEATURE_ID, schemaFullCheckingID);
		preparser.setFeature(XmlValidatorConstants.HONOUR_ALL_SCHEMA_LOCATIONS_ID, honourAllSchemaID);
		preparser.setEntityResolver(new ResourceStreamResolver());
	}
	
	/**
	 * Returns a <code>XMLInputSource</code> object.
	 * @param uri the URI from which the input source is created.
	 * @return
	 */
	private static XMLInputSource stringToXIS(final String uri) {
		return new XMLInputSource(null, uri, null);
	}
	

	//-----------------------------------------------------------------------||
	//-- Private Classes ----------------------------------------------------||
	//-----------------------------------------------------------------------||
	
	/**
	 * This our default entity resolver. This class is able to resolve
	 * system id's as a resource stream preventing HTTP calls.
	 */
	private class ResourceStreamResolver implements XMLEntityResolver {

		@Override
		public XMLInputSource resolveEntity(final XMLResourceIdentifier resourceIdentifier) 
				throws XNIException, IOException {
			
			XMLInputSource xmlInputStream = null;
			InputStream inputStream = null;
			if (resourceIdentifier.getExpandedSystemId().equals("http://www.w3.org/2001/xml.xsd")) {
				inputStream = getFirstValidInputStream("xml.xsd");
				
			} else {				
				// try to get the resource from a resource
				inputStream = getInputStream(resourceIdentifier); 
			}
			
			if (inputStream != null) {
				xmlInputStream = new XMLInputSource(null, 
						resourceIdentifier.getExpandedSystemId(), null, inputStream, null);
			}
			
			return xmlInputStream;
		}
		
	}
	
	/**
	 * Checks if the given resource name starts with a path seperator. If yes, 
	 * then the resource is a <code>File</code> resource. If not, then
	 * we assume that the resource can be loaded via resource stream.
	 * @param resourceName
	 * @return true, if the resource can be loaded via resources stream, otherwise
	 * it is assumed that the resource is file on the file system.
	 */
	private boolean isResourceCandidate(final String resourceName) {
		if (resourceName.indexOf(File.pathSeparator) >= 0) {
			return false;
		}
		return true;
	}
	
	private InputStream getInputStream(final XMLResourceIdentifier resourceIdentifier) throws MalformedURLException {
		final File url = new File(resourceIdentifier.getExpandedSystemId());		
		return getFirstValidInputStream(url.getName());
	}
	
	/**
	 * Returns the first not nullable <code>InputStream</code>.
	 * @param resources
	 * @return the first resolvable <code>InputStream</code>, or null if non of the resources are found.
	 */
	private InputStream getFirstValidInputStream(final String schema) {
		InputStream inputStream = null;
		for (String location: searchLocationList) {
			inputStream = getClassLoaderForClass(this.getClass()).getResourceAsStream(location + schema);
			if (inputStream != null) {
				break;
			}
		}
		return inputStream;
	}
	
	/**
	 * This is our default error handler.
	 */
	private class ErrorHandler implements XMLErrorHandler {

		@Override
		public void warning(String domain, String key,
				XMLParseException exception) throws XNIException {
			// we ignore warnings
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
	}
	
	/**
	 * Returns the right ClassLoader.
	 * @param clazz
	 * @return 
	 */
	private static ClassLoader getClassLoaderForClass(final Class<?> clazz){
	    assert clazz!=null:"Class must be specified";
	    if(System.getSecurityManager()==null){
	        return clazz.getClassLoader();
	    }
	    else{
	        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>(){

                @Override
                public ClassLoader run() {
                    return clazz.getClassLoader();
                }});
	    }
	}
}
