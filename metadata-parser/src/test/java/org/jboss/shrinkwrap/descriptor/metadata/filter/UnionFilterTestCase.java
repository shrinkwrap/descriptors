package org.jboss.shrinkwrap.descriptor.metadata.filter;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.junit.Test;

/**
 * Test class testing the {@link UnionFilter] class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class UnionFilterTestCase {

	@Test
	public void testUnionFilterWithSimpleTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:simpleType name=\"protocol-bindingType\">" +
		"      <xsd:union memberTypes=\"xsd:anyURI javaee:protocol-URIAliasType\"/>" +
		"   </xsd:simpleType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("protocol-bindingListType", metadata.getDataTypeList().get(0).getName(), "protocol-bindingType");	
		Assert.assertEquals("xsd:anyURI", metadata.getDataTypeList().get(0).getMappedTo(), "xsd:anyURI");			
	}
	
	
}
