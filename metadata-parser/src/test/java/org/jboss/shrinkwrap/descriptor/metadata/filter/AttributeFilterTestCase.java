package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Assert;
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
    public void testAttributeFilterWithComplexTypeAsParent() throws Exception {
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
		"      <xsd:attribute name=\"id\" type=\"xsd:ID\"/>" +
		"   </xsd:complexType>" +
		"</xsd:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertEquals("join-column", metadata.getClassList().get(0).getName(), "join-column");

        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertClassAttribute(e.get(0), "<xsd:attribute name=\"name\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(1),
            "<xsd:attribute name=\"referenced-column-name\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(2), "<xsd:attribute name=\"unique\" type=\"xsd:boolean\"/>");
        DomTestUtil.assertClassAttribute(e.get(3), "<xsd:attribute name=\"nullable\" type=\"xsd:boolean\"/>");
        DomTestUtil.assertClassAttribute(e.get(4), "<xsd:attribute name=\"insertable\" type=\"xsd:boolean\"/>");
        DomTestUtil.assertClassAttribute(e.get(5), "<xsd:attribute name=\"updatable\" type=\"xsd:boolean\"/>");
        DomTestUtil.assertClassAttribute(e.get(6), "<xsd:attribute name=\"column-definition\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(7), "<xsd:attribute name=\"table\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(8), "<xsd:attribute name=\"id\" type=\"xsd:ID\"/>");
    }

    @Test
    public void testAttributeFilterWithGlobalDeclaration() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
		"<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
		"   <xs:attribute name=\"lang\"/>" +
		"   <xs:attribute name=\"space\"/>" +		
		"   <xs:complexType name=\"attrType\">" +
		"      <xs:attribute ref=\"lang\" use=\"required\"/>" +
		"      <xs:attribute ref=\"space\" default=\"preserve\"/>" +
		"      <xs:attribute name=\"version\" type=\"xs:string\" fixed=\"1.0\"/>" +
		"   </xs:complexType>" +
		"</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertEquals("lang", metadata.getDataTypeList().get(0).getName(), "lang");
        Assert.assertEquals("space", metadata.getDataTypeList().get(1).getName(), "space");
        Assert.assertEquals("xsd:string", metadata.getDataTypeList().get(0).getMappedTo(), "xsd:string");
        Assert.assertEquals("xsd:string", metadata.getDataTypeList().get(1).getMappedTo(), "xsd:string");

        Assert.assertEquals("attrType", metadata.getClassList().get(0).getName(), "attrType");
        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertClassAttribute(e.get(0), "<xsd:attribute name=\"lang\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(1), "<xsd:attribute name=\"space\" type=\"xsd:string\"/>");
        DomTestUtil.assertClassAttribute(e.get(2), "<xs:attribute name=\"version\" type=\"xs:string\" fixed=\"1.0\"/>");
    }
    
    @Test
    public void testFixedDeclaration() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "   <xs:complexType name=\"attrType\">" +
        "      <xs:attribute name=\"version\" type=\"xs:string\" fixed=\"1.0\"/>" +
        "   </xs:complexType>" +
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
        Assert.assertEquals("attrType", metadata.getClassList().get(0).getName(), "attrType");
        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        Assert.assertEquals("1.0", e.get(0).getFixedValue());
        Assert.assertNull(e.get(0).getDefaultValue());
        Assert.assertNull(e.get(0).getUse());
    }
    
    @Test
    public void testDefaultDeclaration() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "   <xs:complexType name=\"attrType\">" +
        "      <xs:attribute name=\"version\" type=\"xs:string\" default=\"2.0\"/>" +
        "   </xs:complexType>" +
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
        Assert.assertEquals("attrType", metadata.getClassList().get(0).getName(), "attrType");
        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        Assert.assertEquals("2.0", e.get(0).getDefaultValue());
        Assert.assertNull(e.get(0).getFixedValue());
        Assert.assertNull(e.get(0).getUse());
    }
    
    @Test
    public void testUseDeclaration() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "   <xs:complexType name=\"attrType\">" +
        "      <xs:attribute name=\"version\" type=\"xs:string\" use=\"required\"/>" +
        "   </xs:complexType>" +
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
        Assert.assertEquals("attrType", metadata.getClassList().get(0).getName(), "attrType");
        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        Assert.assertEquals("required", e.get(0).getUse());
        Assert.assertNull(e.get(0).getDefaultValue());
        Assert.assertNull(e.get(0).getFixedValue());
    }
    
}
