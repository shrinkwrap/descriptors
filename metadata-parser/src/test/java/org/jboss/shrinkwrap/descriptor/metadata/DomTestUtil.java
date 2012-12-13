package org.jboss.shrinkwrap.descriptor.metadata;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import junit.framework.Assert;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.DOMWriter;
import org.junit.Ignore;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.TreeWalker;

@Ignore
public class DomTestUtil {

    private static final Logger log = Logger.getLogger(DomTestUtil.class.getName());

    /**
     * Returns a <code>Metadata</code> object containing the parsed XML fragment information.
     */
    public static Metadata parse(final String xmlFragment, final boolean isLogging) throws DocumentException {
        final Metadata metadata = new Metadata();
        final StringBuilder sb = new StringBuilder();
        final FilterChain filterChain = new FilterChain();

        metadata.setCurrentNamespace("javaee");
        metadata.setCurrentSchmema("");
        metadata.setCurrentPackageApi("test.api");
        metadata.setCurrentPackageImpl("test.impl");

        final org.w3c.dom.Document w3cDoc = DomTestUtil.getW3CDocument(xmlFragment);
        final DocumentTraversal traversal = (DocumentTraversal) w3cDoc;
        final TreeWalker walker = traversal.createTreeWalker(w3cDoc.getDocumentElement(), NodeFilter.SHOW_ELEMENT,
            null, true);

        filterChain.traverseAndFilter(walker, "", metadata, sb);

        if (isLogging) {
            log.info(sb.toString());
            new MetadataUtil().log(metadata);
        }

        return metadata;
    }

    /**
     * Returns a <code>org.w3c.dom.Document</code> based on the given XML fragment.
     */
    public static org.w3c.dom.Document getW3CDocument(final String xmlFragment) throws DocumentException {
        final org.dom4j.Document dom4jDoc = DocumentHelper.parseText(xmlFragment);
        final DOMWriter writer = new DOMWriter();
        return writer.write(dom4jDoc);
    }

    /**
     * Tests the given xmlFragement against the given MetadataElement.
     * 
     * @param element
     *            contains the parsed element information.
     * @param xmlFragment
     *            the original XML element information.
     */
    public static void assertElement(final MetadataElement element, final String xmlFragment) {
        final String tmpStr = xmlFragment.replace("\"", "").replaceAll("/>|>", "")
            .replaceAll("</?[a-z]*:element>?", "").trim();
        final String[] attributes = tmpStr.split(" ", -1);
        for (String attribute : attributes) {
            final String[] items = attribute.split("=", -1);
            if (items.length == 2) {
                final String attrName = items[0];
                final String attrValue = items[1];
                if (attrName.equals("name")) {
                    Assert.assertEquals(attrValue, element.getName());
                } else if (attrName.equals("type")) {
                    Assert.assertEquals(attrValue, element.getType());
                } else if (attrName.equals("minOccurs")) {
                    Assert.assertEquals(attrValue, element.getMinOccurs());
                } else if (attrName.equals("maxOccurs")) {
                    Assert.assertEquals(attrValue, element.getMaxOccurs());
                } else if (attrName.equals("ref")) {
                    Assert.assertEquals(attrValue, element.getType());
                }
            }
        }
    }

    /**
     * Tests the given xmlFragement against the given MetadataElement.
     * 
     * @param element
     *            contains the parsed element information.
     * @param xmlFragment
     *            the original XML element information.
     */
    public static void assertClassAttribute(final MetadataElement element, final String xmlFragment) {
        final String tmpStr = xmlFragment.replace("\"", "").replaceAll("/>|>", "")
            .replaceAll("</?[a-z]*:attribute>?", "").trim();
        final String[] attributes = tmpStr.split(" ", -1);
        for (String attribute : attributes) {
            final String[] items = attribute.split("=", -1);
            if (items.length == 2) {
                final String attrName = items[0];
                final String attrValue = items[1];
                if (attrName.equals("name")) {
                    Assert.assertEquals(attrValue, element.getName());
                } else if (attrName.equals("type")) {
                    Assert.assertEquals(attrValue, element.getType());
                }
            }
        }
        Assert.assertTrue("Must be an attribute: " + element.getName(), element.getIsAttribute());
    }

    /**
     * Tests the given xmlFragement against the given MetadataElement.
     * 
     * @param group
     *            contains the parsed element information.
     * @param xmlFragment
     *            the original XML element information.
     */
    public static void assertGroup(final MetadataElement group, final String xmlFragment) {
        final String tmpStr = xmlFragment.replace("\"", "").replaceAll("/>|>", "").replaceAll("</?[a-z]*:group>?", "")
            .trim();
        final String[] attributes = tmpStr.split(" ", -1);
        for (String attribute : attributes) {
            final String[] items = attribute.split("=", -1);
            if (items.length == 2) {
                final String attrName = items[0];
                final String attrValue = items[1];
                if (attrName.equals("ref")) {
                    Assert.assertEquals(attrValue, group.getRef());
                }
            }
        }
    }

    /**
     * Tests that a class, enum or group name is not multiple times defined.
     */
    public static void assertDistinctElements(final Metadata metadata) {
        final Map<String, Object> map = new HashMap<String, Object>();

        for (final MetadataItem item : metadata.getClassList()) {
            add(map, item.getName(), item);
        }

        for (final MetadataEnum enumeration : metadata.getEnumList()) {
            add(map, enumeration.getName(), enumeration);
        }

        for (final MetadataItem item : metadata.getGroupList()) {
            add(map, item.getName(), item);
        }
    }

    private static void add(final Map<String, Object> map, final String key, final Object obj) {
        Assert.assertFalse("Dublicate name found: " + key, map.containsKey(key));
        map.put(key, obj);
    }
}
