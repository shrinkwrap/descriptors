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

    @Test
    public void testRestrictionBaseFilterWithComplexTypeAsParentUnbound() throws Exception {        
        final boolean isLogging = true;        
        final String xmlFragment = 
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "<xs:complexType name=\"executable-validationType\">" +
        "  <xs:sequence>" +
        "    <xs:element type=\"config:default-validated-executable-typesType\" name=\"default-validated-executable-types\" minOccurs=\"0\"/>" +
        "  </xs:sequence>" +
        "  <xs:attribute name=\"enabled\" use=\"optional\" type=\"xs:boolean\" default=\"true\"/>" +
        "</xs:complexType>" +
        "<xs:complexType name=\"default-validated-executable-typesType\">" + 
        "  <xs:sequence>" + 
        "    <xs:element name=\"executable-type\" maxOccurs=\"unbounded\" minOccurs=\"1\">" + 
        "      <xs:simpleType>" + 
        "        <xs:restriction base=\"xs:string\">" + 
        "            <xs:enumeration value=\"NONE\"/>" + 
        "            <xs:enumeration value=\"CONSTRUCTORS\"/>" + 
        "            <xs:enumeration value=\"NON_GETTER_METHODS\"/>" + 
        "            <xs:enumeration value=\"GETTER_METHODS\"/>" + 
        "            <xs:enumeration value=\"ALL\"/>" + 
        "        </xs:restriction>" + 
        "      </xs:simpleType>" + 
        "    </xs:element>" + 
        "  </xs:sequence>" + 
        "</xs:complexType>" +
        "</xs:schema>";

	    final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);
	
	    Assert.assertEquals("executable-validationType", metadata.getClassList().get(0).getName(), "executable-validationType");
	    Assert.assertEquals("default-validated-executable-typesType", metadata.getClassList().get(1).getName(), "default-validated-executable-typesType");
    }
}