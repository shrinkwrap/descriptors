package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link AttributeGroupFilter] class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class AttributeGroupFilterTestCase {

	@Test
	public void testAttributeGroupFilterStandalone() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:attributeGroup name=\"web-common-attributes\">" +
		"      <xsd:attribute name=\"version\" type=\"javaee:web-app-versionType\" use=\"required\"/>" +
		"      <xsd:attribute name=\"id\" type=\"xsd:ID\"/>" +
		"      <xsd:attribute name=\"metadata-complete\" type=\"xsd:boolean\">" +
		"      </xsd:attribute>" +
		"   </xsd:attributeGroup>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("descriptionType", metadata.getGroupList().get(0).getName(), "web-common-attributes");

		final List<MetadataElement> e = metadata.getGroupList().get(0).getElements();
		DomTestUtil.assertClassAttribute(e.get(0), "<xsd:attribute name=\"version\" type=\"javaee:web-app-versionType\" use=\"required\"/>");
		DomTestUtil.assertClassAttribute(e.get(1), "<xsd:attribute name=\"id\" type=\"xsd:ID\"");
		DomTestUtil.assertClassAttribute(e.get(2), "<xsd:attribute name=\"metadata-complete\" type=\"xsd:boolean\">");
	}
	
	@Test
	public void testAttributeGroupFilterWithComplexTypeAsParent() throws Exception {		
		final boolean isLogging = false;		
		final String xmlFragment = 
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xsd:complexType name=\"web-appType\">" +
		"      <xsd:choice minOccurs=\"0\" maxOccurs=\"unbounded\">" +
		"          <xsd:element name=\"module-name\" type=\"javaee:string\" minOccurs=\"0\"/>" +
		"          <xsd:group ref=\"javaee:web-commonType\"/>" +
		"          <xsd:element name=\"absolute-ordering\" type=\"javaee:absoluteOrderingType\"/>" +
		"      </xsd:choice>" +
		"      <xsd:attributeGroup ref=\"javaee:web-common-attributes\"/>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";
		
		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
				
		Assert.assertEquals("web-appType", metadata.getClassList().get(0).getName(), "web-appType");
		Assert.assertEquals("javaee:web-commonType", metadata.getClassList().get(0).getReferences().get(0).getRef(), "javaee:web-commonType");
		Assert.assertEquals("javaee:web-common-attributes", metadata.getClassList().get(0).getReferences().get(1).getRef(), "javaee:web-common-attributes");
	}
	
}
