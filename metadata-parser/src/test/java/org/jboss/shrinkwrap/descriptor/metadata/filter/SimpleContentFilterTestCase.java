package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Ignore;
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
    @Ignore
    public void testSimpleContent() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" +
        "   <xs:element name=\"shoesize\">" +
        "      <xs:complexType>" +
        "         <xs:simpleContent>" +
        "            <xs:extension base=\"xs:integer\">" +
        "               <xs:attribute name=\"country\" type=\"xs:string\" />" +
        "            </xs:extension>" +
        "         </xs:simpleContent>" +
        "      </xs:complexType>" +
        "   </xs:element>" +
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertEquals("shoesize", metadata.getClassList().get(0).getName(), "shoesize");

        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertElement(e.get(0), "<xs:element name=\"shoesize\" type=\"text\">");
        DomTestUtil.assertClassAttribute(e.get(1), "<xs:attribute name=\"country\" type=\"xs:string\" />");
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
