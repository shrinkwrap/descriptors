package org.jboss.shrinkwrap.descriptor.schemavalidator;

import org.apache.xerces.impl.Constants;

public interface XmlValidatorConstants {

	/** Property identifier: symbol table. */
	public static final String SYMBOL_TABLE = Constants.XERCES_PROPERTY_PREFIX
			+ Constants.SYMBOL_TABLE_PROPERTY;

	/** Property identifier: grammar pool. */
	public static final String GRAMMAR_POOL = Constants.XERCES_PROPERTY_PREFIX
			+ Constants.XMLGRAMMAR_POOL_PROPERTY;

	/** Namespaces feature id (http://xml.org/sax/features/namespaces). */
	public static final String NAMESPACES_FEATURE_ID = "http://xml.org/sax/features/namespaces";

	/** Validation feature id (http://xml.org/sax/features/validation). */
	public static final String VALIDATION_FEATURE_ID = "http://xml.org/sax/features/validation";

	/**
	 * Schema validation feature id
	 * (http://apache.org/xml/features/validation/schema).
	 */
	public static final String SCHEMA_VALIDATION_FEATURE_ID = "http://apache.org/xml/features/validation/schema";

	/**
	 * Schema full checking feature id
	 * (http://apache.org/xml/features/validation/schema-full-checking).
	 */
	public static final String SCHEMA_FULL_CHECKING_FEATURE_ID = "http://apache.org/xml/features/validation/schema-full-checking";

	/**
	 * Honour all schema locations feature id
	 * (http://apache.org/xml/features/honour-all-schemaLocations).
	 */
	public static final String HONOUR_ALL_SCHEMA_LOCATIONS_ID = "http://apache.org/xml/features/honour-all-schemaLocations";
	
	// a larg(ish) prime to use for a symbol table to be shared
	// among
	// potentially man parsers. Start one as close to 2K (20
	// times larger than normal) and see what happens...
	public static final int BIG_PRIME = 2039;

	// default settings	
	public static final boolean DEFAULT_NAMESPACES_FEATURE_ID = true;
	public static final boolean DEFAULT_VALIDATION_FEATURE_ID = true;
	public static final boolean DEFAULT_SCHEMA_VALIDATION_FEATURE_ID = true;
	public static final boolean DEFAULT_SCHEMA_FULL_CHECKING = false;
	public static final boolean DEFAULT_HONOUR_ALL_SCHEMA_LOCATIONS = false;
		
}
