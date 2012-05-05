package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link ComplexTypeFilter} class.
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
	
	@Test
	public void testComplexTypeFilterWithMixedContent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"loader-repositoryType\" mixed=\"true\">" +
		"      <xsd:sequence>" +
		"          <xsd:element name=\"loader-repository-config\" type=\"jboss:loader-repository-configType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>" +
		"      </xsd:sequence><xsd:attribute name=\"id\" type=\"xsd:ID\"/>" +
		"      <xsd:attribute name=\"loaderRepositoryClass\" type=\"xsd:string\"/>" +
		"   </xsd:complexType>\">" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
        Assert.assertEquals("loader-repositoryType", metadata.getClassList().get(0).getName(), "loader-repositoryType");
		
		final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
		DomTestUtil.assertElement(e.get(0), "<xsd:element name=\"loader-repositoryType\" type=\"text\"/>");
		DomTestUtil.assertElement(e.get(1), "<xsd:element name=\"loader-repository-config\" type=\"jboss:loader-repository-configType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertClassAttribute(e.get(2), "<xsd:attribute name=\"loaderRepositoryClass\" type=\"xsd:string\"/>");	
	}
	
	@Test
	public void testComplexTypeFilterWithAbstractContent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"extensibleType\" abstract=\"true\">" +
		"      <xsd:attribute name=\"id\" type=\"xsd:ID\"/>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
        Assert.assertEquals("extensibleType", metadata.getClassList().get(0).getName(), "extensibleType");
	}
	
}
