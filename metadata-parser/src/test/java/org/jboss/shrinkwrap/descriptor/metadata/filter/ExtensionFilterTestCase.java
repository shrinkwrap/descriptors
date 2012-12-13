package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link ExtensionFilter} class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ExtensionFilterTestCase {

    @Test
    public void testExtensionWithComplexTypeAsExtension() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
        "<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" + 
        "   <xs:complexType name=\"poolType\">" +
        "      <xs:sequence>" +
        "         <xs:element name=\"min-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>" +
        "         <xs:element name=\"max-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>" +
        "         <xs:element name=\"prefill\" type=\"xs:boolean\" minOccurs=\"0\"></xs:element>" +
        "         <xs:element name=\"use-strict-min\" type=\"xs:boolean\" minOccurs=\"0\" maxOccurs=\"1\"> </xs:element>" +
        "         <xs:element name=\"flush-strategy\" type=\"xs:token\" minOccurs=\"0\" maxOccurs=\"1\"></xs:element>" +
        "      </xs:sequence>" +
        "   </xs:complexType>" +         
        "   <xs:complexType name=\"xa-poolType\">" +
        "      <xs:complexContent>" +
        "         <xs:extension base=\"poolType\">" +
        "            <xs:sequence>" +
        "               <xs:element name=\"is-same-rm-override\" type=\"xs:boolean\" minOccurs=\"0\"></xs:element>" +
        "               <xs:element name=\"interleaving\" type=\"boolean-presenceType\" minOccurs=\"0\"></xs:element>" +
        "               <xs:element name=\"no-tx-separate-pools\" type=\"boolean-presenceType\" minOccurs=\"0\"></xs:element>" +
        "               <xs:element name=\"pad-xid\" type=\"xs:boolean\" default=\"false\" minOccurs=\"0\"></xs:element>" +
        "               <xs:element name=\"wrap-xa-resource\" type=\"xs:boolean\" default=\"false\" minOccurs=\"0\"></xs:element>" +
        "            </xs:sequence>" +
        "         </xs:extension>" +
        "      </xs:complexContent>" +
        "   </xs:complexType>" +
        "</xs:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertTrue("poolType", metadata.getClassList().get(0).getName().equals("poolType"));
        Assert.assertTrue("xa-poolType", metadata.getClassList().get(1).getName().equals("xa-poolType"));

        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertElement(e.get(0),
            "<xs:element name=\"min-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e.get(1),
            "<xs:element name=\"max-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e.get(2),
            "<xs:element name=\"prefill\" type=\"xs:boolean\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e.get(3),
            "<xs:element name=\"use-strict-min\" type=\"xs:boolean\" minOccurs=\"0\" maxOccurs=\"1\"> </xs:element>");
        DomTestUtil.assertElement(e.get(4),
            "<xs:element name=\"flush-strategy\" type=\"xs:token\" minOccurs=\"0\" maxOccurs=\"1\"></xs:element>");

        final List<MetadataElement> e2 = metadata.getClassList().get(1).getElements();
        DomTestUtil.assertElement(e2.get(0),
            "<xs:element name=\"min-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e2.get(1),
            "<xs:element name=\"max-pool-size\" type=\"xs:nonNegativeInteger\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e2.get(2),
            "<xs:element name=\"prefill\" type=\"xs:boolean\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e2.get(3),
            "<xs:element name=\"use-strict-min\" type=\"xs:boolean\" minOccurs=\"0\" maxOccurs=\"1\"> </xs:element>");
        DomTestUtil.assertElement(e2.get(4),
            "<xs:element name=\"flush-strategy\" type=\"xs:token\" minOccurs=\"0\" maxOccurs=\"1\"></xs:element>");
        DomTestUtil.assertElement(e2.get(5),
            "<xs:element name=\"is-same-rm-override\" type=\"xs:boolean\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e2.get(6),
            "<xs:element name=\"interleaving\" type=\"javaee:boolean-presenceType\" minOccurs=\"0\"></xs:element>");
        DomTestUtil
            .assertElement(e2.get(7),
                "<xs:element name=\"no-tx-separate-pools\" type=\"javaee:boolean-presenceType\" minOccurs=\"0\"></xs:element>");
        DomTestUtil.assertElement(e2.get(8),
            "<xs:element name=\"pad-xid\" type=\"xs:boolean\" default=\"false\" minOccurs=\"0\"></xs:element>");
        DomTestUtil
            .assertElement(e2.get(9),
                "<xs:element name=\"wrap-xa-resource\" type=\"xs:boolean\" default=\"false\" minOccurs=\"0\"></xs:element>");
    }

}
