package org.jboss.shrinkwrap.descriptor.metadata.filter;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.metadata.DomTestUtil;
import org.jboss.shrinkwrap.descriptor.metadata.Metadata;
import org.junit.Test;

/**
 * Test class testing the {@link ListFilter} class.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 */
public class ListFilterTestCase {

	@Test
	public void testListFilterWithSimpleTypeAsParent() throws Exception {
		final boolean isLogging = false;
		final String xmlFragment =
		"<xsd:schema xmlns=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" >" +
		"   <xsd:simpleType name=\"protocol-bindingListType\">" +
		"      <xsd:list itemType=\"javaee:protocol-bindingType\"/>" +
		"   </xsd:simpleType>" +
		"</xsd:schema>";

		final Metadata metadata = DomTestUtil.parse(xmlFragment, isLogging);

		Assert.assertEquals("protocol-bindingListType", metadata.getDataTypeList().get(0).getName(), "protocol-bindingListType");
		Assert.assertEquals("protocol-bindingListType", metadata.getDataTypeList().get(0).getMappedTo(), "xsd:string");
	}


}
