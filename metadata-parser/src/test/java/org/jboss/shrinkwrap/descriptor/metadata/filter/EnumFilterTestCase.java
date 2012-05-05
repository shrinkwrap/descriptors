package org.jboss.shrinkwrap.descriptor.metadata.filter;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.junit.Test;

/**
 * Test class testing the {@link EnumFilter] class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class EnumFilterTestCase {

	@Test
	public void testEnumFilterWithComplexTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"ejb-ref-typeType\">" +
		"      <xsd:simpleContent>" +
		"          <xsd:restriction base=\"javaee:string\">" +
		"             <xsd:enumeration value=\"Entity\"/>" +
		"             <xsd:enumeration value=\"Session\"/>" +
		"          </xsd:restriction>" +
		"      </xsd:simpleContent>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("ejb-ref-typeType", metadata.getEnumList().get(0).getName(), "ejb-ref-typeType");	
		Assert.assertEquals("Entity", metadata.getEnumList().get(0).getValueList().get(0), "Entity");
		Assert.assertEquals("Session", metadata.getEnumList().get(0).getValueList().get(1), "Session");
	}
	
	@Test
	public void testEnumFilterWithSimpleTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:simpleType name=\"isolation-levelType\">" +
		"      <xsd:restriction base=\"xsd:string\">" +
		"         <xsd:enumeration value=\"TRANSACTION_READ_UNCOMMITTED\"/>" +
		"         <xsd:enumeration value=\"TRANSACTION_READ_COMMITTED\"/>" +
		"         <xsd:enumeration value=\"TRANSACTION_REPEATABLE_READ\"/>" +
		"         <xsd:enumeration value=\"TRANSACTION_SERIALIZABLE\"/>" +
		"      </xsd:restriction>" +
		"   </xsd:simpleType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("isolation-levelType", metadata.getEnumList().get(0).getName(), "isolation-levelType");	
		Assert.assertEquals("TRANSACTION_READ_UNCOMMITTED", metadata.getEnumList().get(0).getValueList().get(0), "TRANSACTION_READ_UNCOMMITTED");
		Assert.assertEquals("TRANSACTION_READ_COMMITTED", metadata.getEnumList().get(0).getValueList().get(1), "TRANSACTION_READ_COMMITTED");
		Assert.assertEquals("TRANSACTION_REPEATABLE_READ", metadata.getEnumList().get(0).getValueList().get(2), "TRANSACTION_REPEATABLE_READ");
		Assert.assertEquals("TRANSACTION_SERIALIZABLE", metadata.getEnumList().get(0).getValueList().get(3), "TRANSACTION_SERIALIZABLE");
	}
}
