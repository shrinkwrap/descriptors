/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.spi.node.dom;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.jboss.shrinkwrap.descriptor.spi.node.DummyNodeDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:bartosz.majsak@gmail.com">Bartosz Majsak</a>
 * @version $Revision: $
 */
public class XmlDomNodeImporterTestCase {

    private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";

    public static final String XML_WITH_COMMENT = "" +
   		XML_HEADER +
   		"<root>" +
   		"  <!-- comment -->" +
   		"  <child>test</child>" +
   		"</root>";
    
    public static final String XML_WITH_CDATA_SECTION = "" +
   		XML_HEADER +
   		"<root>" +
   		"  <![CDATA[ CDATA section ]]>" +
   		"  <child>test</child>" +
   		"</root>";
   
   private static final String SINGLE_NODE = XML_HEADER + "<root></root>";

   /*
    * SHRINKDESC-31 - Comments in XML input Cause Export error
    *
    * Node[#comment] children[0] text[ comment ] 
    * Caused by: org.w3c.dom.DOMException: INVALID_CHARACTER_ERR: An invalid or illegal XML character is specified.
    *
    */
    @Test
    public void shouldBeAbleToImportXMLWithComments() throws Exception {
        Node root = load(XML_WITH_COMMENT);

        Assert.assertNotNull("Obtaining comment should not be null", root.getSingle("#comment"));
        Assert.assertNotNull("Obtaining child should not be null", root.getSingle("child"));
    }
    
    @Test
    public void shouldBeAbleToImportXMLWithCDATASection() throws Exception {
        Node root = load(XML_WITH_CDATA_SECTION);

        Assert.assertNotNull("Obtaining CDATA section should not be null", root.getSingle("#cdata-section"));
        Assert.assertNotNull("Obtaining child should not be null", root.getSingle("child"));
    }

    @Test
    public void shouldBeAbleToImportSingleNodeXmlWithAttributesAndText() throws Exception {
        // given
        XmlDomNodeDescriptorImporterImpl<NodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<NodeDescriptor>(
            NodeDescriptor.class, "test-descriptor");
        Node expectedRoot = new Node("root");
        expectedRoot.attribute("id", "1").attribute("name", "root").text("doovde");

        // when
        Node root = xmlDomNodeDescriptorImporter.getNodeImporter().importAsNode(
            new FileInputStream("src/test/resources/single.xml"), true);

        // then
        Assert.assertEquals(expectedRoot.toString(true), root.toString(true));
    }

    @Test
    public void shouldBeAbleToImportFromXmlString() throws Exception {
        // given
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "test-descriptor");

        // when
        DummyNodeDescriptor nodeDescriptor = xmlDomNodeDescriptorImporter.fromString(SINGLE_NODE);

        // then
        XmlAssert.assertIdentical(SINGLE_NODE, nodeDescriptor.exportAsString());
    }

    @Test
    public void shouldCreateSingleNodeWithGivenNameWhenEmptyStringPassedToImport() throws Exception {
        // given
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "test-descriptor");
        Node expectedRoot = new Node("dummy");

        // when
        Node importedRoot = xmlDomNodeDescriptorImporter.fromString("").getRootNode();

        // then
        Assert.assertEquals(expectedRoot.getName(), importedRoot.getName());
        Assert.assertTrue(importedRoot.getChildren().isEmpty());
    }

    @Test
    public void shouldBeAbleToImportXmlFileWithSingleNodeDescriptorWithAttributesAndText() throws Exception {
        // given
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "test-descriptor");

        Node expectedRoot = new Node("root");
        expectedRoot.attribute("id", "1").attribute("name", "root").text("doovde");

        // when
        Node root = xmlDomNodeDescriptorImporter.fromFile(new File("src/test/resources/single.xml")).getRootNode();

        // then
        Assert.assertEquals(expectedRoot.toString(true), root.toString(true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenTryingToImportFromNonExistingFile() throws Exception {
        // given
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "test-descriptor");

        // when
        Node root = xmlDomNodeDescriptorImporter.fromFile(new File("not-existing-file.xml")).getRootNode();

        // then
        // exception should be thrown
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenEndUserViewNotSpecified() throws Exception {
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            null, "test-descriptor");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDescriptorNameNotSpecified() throws Exception {
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDescriptorsNameIsEmpty() throws Exception {
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDescriptorsNameIsBlank() throws Exception {
        XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor> xmlDomNodeDescriptorImporter = new XmlDomNodeDescriptorImporterImpl<DummyNodeDescriptor>(
            DummyNodeDescriptor.class, "    ");
    }

    // Utility methods

    private Node load(String xml) {
        return XmlDomNodeImporter.INSTANCE.importAsNode(new ByteArrayInputStream(xml.getBytes()), true);
    }

}
