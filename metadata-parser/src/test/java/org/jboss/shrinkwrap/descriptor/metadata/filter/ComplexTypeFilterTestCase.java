package org.jboss.shrinkwrap.descriptor.metadata.filter;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.junit.Test;

/**
 * Test class testing the {@link ComplexTypeFilter] class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ComplexTypeFilterTestCase {

	@Test
	public void testComplexTypeFilterStandaloneComplexType() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"emptyType\"/>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("emptyType", metadata.getDataTypeList().get(0).getName(), "emptyType");	
		Assert.assertEquals("javaee:emptyType", metadata.getDataTypeList().get(0).getMappedTo(), "javaee:emptyType");		
	}
	
}
