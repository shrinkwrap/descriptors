package org.jboss.shrinkwrap.descriptor.metadata.filter;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.junit.Test;

/**
 * Test class testing the {@link RestrictionFilter} class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class RestrictionFilterTestCase {

	@Test
	public void testRestrictionBaseFilterWithSimpleTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:simpleType name=\"dewey-versionType\">" +
		"       <xsd:restriction base=\"xsd:token\">" +
		"           <xsd:pattern value=\"\\.?[0-9]+(\\.[0-9]+)*\"/>" +
		"       </xsd:restriction>" +
		"   </xsd:simpleType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("dewey-versionType", metadata.getDataTypeList().get(0).getName(), "dewey-versionType");	
		Assert.assertEquals("xsd:token", metadata.getDataTypeList().get(0).getMappedTo(), "xsd:token");	
	}
	
	@Test
	public void testRestrictionBaseFilterWithComplexTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"ejb-linkType\">" +
		"      <xsd:simpleContent>" +
		"          <xsd:restriction base=\"javaee:string\"/>" +
		"      </xsd:simpleContent>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("ejb-linkType", metadata.getDataTypeList().get(0).getName(), "ejb-linkType");	
		Assert.assertEquals("javaee:string", metadata.getDataTypeList().get(0).getMappedTo(), "javaee:string");	
	}

}
