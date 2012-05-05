package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link AttributeFilter} class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class AttributeFilterTestCase {

	@Test
	public void testAttributeFilterWithStandaloneComplexTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"descriptionType\">" +
		"      <xsd:simpleContent>" +
		"         <xsd:extension base=\"javaee:xsdStringType\">" +
		"            <xsd:attribute ref=\"xml:lang\"/>" +
		"         </xsd:extension>" +
		"      </xsd:simpleContent>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("descriptionType", metadata.getDataTypeList().get(0).getName(), "descriptionType");	
		Assert.assertEquals("descriptionType", metadata.getDataTypeList().get(0).getMappedTo(), "javaee:xsdStringType");			
	}
	
	@Test
	public void testAttributeFilterWithComplexTypeAsParen() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"join-column\">" +
		"      <xsd:attribute name=\"name\" type=\"xsd:string\"/>" +
		"      <xsd:attribute name=\"referenced-column-name\" type=\"xsd:string\"/>" +
		"      <xsd:attribute name=\"unique\" type=\"xsd:boolean\"/>" +
		"      <xsd:attribute name=\"nullable\" type=\"xsd:boolean\"/>" +
		"      <xsd:attribute name=\"insertable\" type=\"xsd:boolean\"/>" +
		"      <xsd:attribute name=\"updatable\" type=\"xsd:boolean\"/>" +
		"      <xsd:attribute name=\"column-definition\" type=\"xsd:string\"/>" +
		"      <xsd:attribute name=\"table\" type=\"xsd:string\"/>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("join-column", metadata.getClassList().get(0).getName(), "join-column");
		
		final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
		DomTestUtil.assertClassAttribute(e.get(0), "<xsd:attribute name=\"name\" type=\"xsd:string\"/>");
		DomTestUtil.assertClassAttribute(e.get(1), "<xsd:attribute name=\"referenced-column-name\" type=\"xsd:string\"/>");
		DomTestUtil.assertClassAttribute(e.get(2), "<xsd:attribute name=\"unique\" type=\"xsd:boolean\"/>");
		DomTestUtil.assertClassAttribute(e.get(3), "<xsd:attribute name=\"nullable\" type=\"xsd:boolean\"/>");
		DomTestUtil.assertClassAttribute(e.get(4), "<xsd:attribute name=\"insertable\" type=\"xsd:boolean\"/>");
		DomTestUtil.assertClassAttribute(e.get(5), "<xsd:attribute name=\"updatable\" type=\"xsd:boolean\"/>");
		DomTestUtil.assertClassAttribute(e.get(6), "<xsd:attribute name=\"column-definition\" type=\"xsd:string\"/>");
		DomTestUtil.assertClassAttribute(e.get(7), "<xsd:attribute name=\"table\" type=\"xsd:string\"/>");
	}
	
}
