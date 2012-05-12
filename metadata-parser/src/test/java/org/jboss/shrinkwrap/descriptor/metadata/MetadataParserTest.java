package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.ArrayList;

import junit.framework.Assert;

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

}
