package org.jboss.shrinkwrap.descriptor.metadata.filter;

import java.util.List;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.jboss.shrinkwrap.descriptor.metadata.MetadataElement;
import org.junit.Test;

/**
 * Test class testing the {@link GroupFilter} class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class GroupFilterTestCase {

    @Test
    public void testGroupWithGroupAsParent() throws Exception {
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

        Assert.assertEquals("jndiEnvironmentRefsGroup", metadata.getGroupList().get(0).getName(),
            "jndiEnvironmentRefsGroup");

        final List<MetadataElement> e = metadata.getGroupList().get(0).getReferences();
        DomTestUtil.assertGroup(e.get(0), "<xsd:group ref=\"javaee:service-refGroup\"/>");
    }

}
