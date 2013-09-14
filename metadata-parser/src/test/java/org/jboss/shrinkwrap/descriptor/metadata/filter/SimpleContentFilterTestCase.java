package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link UnionFilter} class.
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class SimpleContentFilterTestCase {

    /**
     * SimpleContent as used for text only types are not supported at the moment!
     */

    @Test
    public void testSimpleContent() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" +
        "   <xs:complexType name=\"propertyType\">" +        
        "         <xs:simpleContent>" +
        "            <xs:extension base=\"xs:string\">" +
        "               <xs:attribute name=\"name\" use=\"required\" type=\"xs:string\" />" +
        "            </xs:extension>" +
        "         </xs:simpleContent>" +
        "   </xs:complexType>" +       
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertEquals("propertyType", metadata.getClassList().get(0).getName(), "propertyType");

        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertElement(e.get(0), "<xs:complexType name=\"propertyType\">");
        DomTestUtil.assertClassAttribute(e.get(1), "<xs:attribute name=\"name\" type=\"xs:string\" />");
    }

    @Test
    public void testSimpleContentWithEnumeration() throws Exception {        
        final boolean isLogging = false;        
        final String xmlFragment = 
        "<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "   <xsd:complexType name=\"ejb-ref-typeType\">" +
        "      <xsd:simpleContent>" +
        "          <xsd:restriction base=\"j2ee:string\">" +
        "              <xsd:enumeration value=\"Entity\"/>" +
        "              <xsd:enumeration value=\"Session\"/>" +
        "          </xsd:restriction>" +
        "      </xsd:simpleContent>" +
        "   </xsd:complexType>" +
        "</xsd:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertEquals("ejb-ref-typeType", metadata.getEnumList().get(0).getName(), "ejb-ref-typeType");
        Assert.assertEquals("Entity", metadata.getEnumList().get(0).getValueList().get(0), "Entity");
        Assert.assertEquals("Session", metadata.getEnumList().get(0).getValueList().get(1), "Session");
    }
}
