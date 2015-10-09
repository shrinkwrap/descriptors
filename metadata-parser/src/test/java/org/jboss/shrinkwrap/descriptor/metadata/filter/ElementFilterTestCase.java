package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link ElementFilter} class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ElementFilterTestCase {

	@Test
	public void testElementsWithComplexTypeAsParent() throws Exception {
		final boolean isLogging = false;
		final String xmlFragment =
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" +
		"   <xsd:complexType name=\"webType\">" +
		"       <xsd:sequence>" +
		"           <xsd:element name=\"web-uri\" type=\"javaee:pathType\"></xsd:element> " +
		"           <xsd:element name=\"context-root\" type=\"javaee:string\"></xsd:element>" +
		"       </xsd:sequence>" +
		"       <xsd:attribute name=\"id\" type=\"xsd:ID\"/>" +
		"   </xsd:complexType> " +
		"</xsd:schema>";

        final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

        Assert.assertTrue("webType", metadata.getClassList().get(0).getName().equals("webType"));

        final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
        DomTestUtil.assertElement(e.get(0), "<xsd:element name=\"web-uri\" type=\"javaee:pathType\"></xsd:element>");
        DomTestUtil.assertElement(e.get(1), "<xsd:element name=\"context-root\" type=\"javaee:string\"></xsd:element>");
    }

    @Test
    public void testElementsWithGroupAsParent() throws Exception {
        final boolean isLogging = false;
        final String xmlFragment =
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" +
	    "   <xsd:group name=\"jndiEnvironmentRefsGroup\">" +
	    "      <xsd:sequence>" +
	    "         <xsd:element name=\"env-entry\" type=\"javaee:env-entryType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"ejb-ref\" type=\"javaee:ejb-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
	    "         <xsd:element name=\"ejb-local-ref\" type=\"javaee:ejb-local-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:group ref=\"javaee:service-refGroup\"/>" +
		"         <xsd:element name=\"resource-ref\" type=\"javaee:resource-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"resource-env-ref\" type=\"javaee:resource-env-refType\" minOccurs=\"0\"  maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"message-destination-ref\" type=\"javaee:message-destination-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"persistence-context-ref\" type=\"javaee:persistence-context-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"persistence-unit-ref\" type=\"javaee:persistence-unit-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"post-construct\" type=\"javaee:lifecycle-callbackType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"pre-destroy\" type=\"javaee:lifecycle-callbackType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> " +
		"         <xsd:element name=\"data-source\" type=\"javaee:data-sourceType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>" +
		"      </xsd:sequence>" +
		"   </xsd:group>" +
		"</xsd:schema>";

		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

		Assert.assertEquals("jndiEnvironmentRefsGroup", metadata.getGroupList().get(0).getName(), "jndiEnvironmentRefsGroup");

		final List<MetadataElement> e = metadata.getGroupList().get(0).getElements();
		DomTestUtil.assertElement(e.get(0), "<xsd:element name=\"env-entry\" type=\"javaee:env-entryType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> ");
		DomTestUtil.assertElement(e.get(1), "<xsd:element name=\"ejb-ref\" type=\"javaee:ejb-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> ");
		DomTestUtil.assertElement(e.get(2), "<xsd:element name=\"ejb-local-ref\" type=\"javaee:ejb-local-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(3), "<xsd:element name=\"resource-ref\" type=\"javaee:resource-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(4), "<xsd:element name=\"resource-env-ref\" type=\"javaee:resource-env-refType\" minOccurs=\"0\"  maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(5), "<xsd:element name=\"message-destination-ref\" type=\"javaee:message-destination-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> ");
		DomTestUtil.assertElement(e.get(6), "<xsd:element name=\"persistence-context-ref\" type=\"javaee:persistence-context-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(7), "<xsd:element name=\"persistence-unit-ref\" type=\"javaee:persistence-unit-refType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(8), "<xsd:element name=\"post-construct\" type=\"javaee:lifecycle-callbackType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/> ");
		DomTestUtil.assertElement(e.get(9), "<xsd:element name=\"pre-destroy\" type=\"javaee:lifecycle-callbackType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
		DomTestUtil.assertElement(e.get(10), "<xsd:element name=\"data-source\" type=\"javaee:data-sourceType\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>");
	}

	@Test
	public void testElementsWithReferencedElements() throws Exception {
		final boolean isLogging = true;
		final String xmlFragment =
		"<xs:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" >" +
	    "   <xs:element name=\"beans\">" +
	    "      <xs:complexType>" +
	    "         <xs:choice minOccurs=\"0\" maxOccurs=\"unbounded\">" +
	    "             <xs:element ref=\"javaee:interceptors\" />" +
	    "             <xs:element ref=\"javaee:decorators\" />" +
	    "             <xs:element ref=\"javaee:alternatives\" />" +
	    "             <xs:element ref=\"javaee:scan\" />" +
	    "             <xs:any namespace=\"##other\" processContents=\"lax\"/>" +
	    "         </xs:choice></xs:complexType>" +
	    "   </xs:element>" +
	    "   <xs:element name=\"interceptors\">" +
	    "      <xs:complexType>" +
	    "         <xs:choice minOccurs=\"0\" maxOccurs=\"unbounded\">" +
	    "            <xs:element name=\"class\" type=\"xs:string\">" +
	    "            </xs:element>" +
	    "         </xs:choice>" +
	    "      </xs:complexType>" +
	    "   </xs:element>" +
	    "   <xs:element name=\"decorators\">" +
	    "      <xs:complexType>" +
	    "         <xs:choice minOccurs=\"0\" maxOccurs=\"unbounded\">" +
	    "            <xs:element name=\"class\" type=\"xs:string\"></xs:element>" +
	    "         </xs:choice>" +
	    "      </xs:complexType>" +
	    "   </xs:element>" +
	    "   <xs:element name=\"alternatives\">" +
	    "      <xs:complexType>" +
	    "         <xs:choice minOccurs=\"0\" maxOccurs=\"unbounded\">" +
	    "            <xs:element name=\"class\" type=\"xs:string\"></xs:element>" +
	    "            <xs:element name=\"stereotype\" type=\"xs:string\"></xs:element>" +
	    "         </xs:choice>" +
	    "      </xs:complexType>" +
	    "   </xs:element>" +

	    "   <xs:element name=\"scan\">" +
	    "     <xs:complexType>" +
	    "       <xs:sequence maxOccurs=\"unbounded\" minOccurs=\"0\">" +
	    "         <xs:element name=\"exclude\">" +
	    "            <xs:complexType>" +
	    "              <xs:choice maxOccurs=\"unbounded\" minOccurs=\"0\">" +
	    "                <xs:element name=\"if-class-available\">" +
	    "                  <xs:complexType>" +
	    "                    <xs:attribute name=\"name\" type=\"xs:string\" use=\"required\">" +
	    "                    </xs:attribute>" +
	    "                  </xs:complexType>" +
	    "                </xs:element>" +
	    "              </xs:choice>" +
	    "            </xs:complexType>" +
	    "          </xs:element>" +
	    "       </xs:sequence>" +
	    "     </xs:complexType>" +
	    "   </xs:element>" +
	    "</xs:schema>";

		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

		Assert.assertEquals("beans",        metadata.getClassList().get(0).getName(), "beans");
		Assert.assertEquals("interceptors", metadata.getClassList().get(1).getName(), "interceptors");
		Assert.assertEquals("decorators",   metadata.getClassList().get(2).getName(), "decorators");
		Assert.assertEquals("alternatives", metadata.getClassList().get(3).getName(), "alternatives");
		Assert.assertEquals("scan",         metadata.getClassList().get(4).getName(), "scan");

		final List<MetadataElement> e = metadata.getClassList().get(0).getElements();
		DomTestUtil.assertElement(e.get(0), "<xs:element ref=\"javaee:interceptors\" />");
		DomTestUtil.assertElement(e.get(1), "<xs:element ref=\"javaee:decorators\" />");
		DomTestUtil.assertElement(e.get(2), "<xs:element ref=\"javaee:alternatives\" />");
		DomTestUtil.assertElement(e.get(3), "<xs:element ref=\"javaee:scan\" />");

		final List<MetadataElement> e1 = metadata.getClassList().get(1).getElements();
		DomTestUtil.assertElement(e1.get(0), "<xs:element name=\"class\" type=\"xs:string\">");

		final List<MetadataElement> e2 = metadata.getClassList().get(2).getElements();
		DomTestUtil.assertElement(e2.get(0), "<xs:element name=\"class\" type=\"xs:string\"></xs:element>");

		final List<MetadataElement> e3 = metadata.getClassList().get(3).getElements();
		DomTestUtil.assertElement(e3.get(0), "<xs:element name=\"class\" type=\"xs:string\"></xs:element>");
		DomTestUtil.assertElement(e3.get(1), "<xs:element name=\"stereotype\" type=\"xs:string\"></xs:element>");
	}

}
