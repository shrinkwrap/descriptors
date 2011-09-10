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

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.test.util.TestTreeBuilder;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Assert;
import org.junit.Test;

/**
 * TestCases to see Exporter can handle the Node Structure provided by the Importer.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XmlDomDescriptorExporterTestCase
{
   private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
   public static final String XML_WITH_COMMENT = "" +
   		XML_HEADER +
   		"<root>" +
   		"  <!-- comment -->" +
   		"  <child>test</child>" +
   		"</root>"; 

   /*
    * SHRINKDESC-31 - Comments in XML input Cause Export error
    * 
    * Node[#comment] children[0] text[ comment ] 
    * Caused by: org.w3c.dom.DOMException: INVALID_CHARACTER_ERR: An invalid or illegal XML character is specified. 
    *  
    */
   @Test
   public void shouldBeAbleToImportXMLWithComments() throws Exception
   {
      Node root = load(XML_WITH_COMMENT);
      
      Assert.assertNotNull("Obtaining comment should not be null",root.getSingle("#comment"));
      Assert.assertNotNull("Obtaining child should not be null",root.getSingle("child"));
   }
   
   /*
    * SHRINKDESC-31 - Comments in XML input Cause Export error
    * 
    * Node[#comment] children[0] text[ comment ] 
    * Caused by: org.w3c.dom.DOMException: INVALID_CHARACTER_ERR: An invalid or illegal XML character is specified. 
    *  
    */
   @Test
   public void shouldBeAbleExportXMLWithComments() throws Exception
   {
      // given
      Node root = load(XML_WITH_COMMENT);
      XmlDomDescriptorExporterImpl xmlDomDescriptorExporter = new XmlDomDescriptorExporterImpl();
      
      // when
      String exportedXml = exportAsString(root, xmlDomDescriptorExporter);
      
      // then
      XmlAssert.assertIdentical(XML_WITH_COMMENT, exportedXml);
   }
   
   @Test
   public void shouldBeAbleToExportSingleNodeTree() throws Exception
   {
      // given
      Node root = new Node("root");

      // when
      String exportedXml = exportAsString(root, new XmlDomDescriptorExporterImpl());

      // then
      XmlAssert.assertIdentical(XML_HEADER + "<root></root>", exportedXml);
   }
   
   @Test
   public void shouldBeAbleToExportSingleNodeTreeWithAttributes() throws Exception
   {
      // given
      Node root = new Node("root");
      root.attribute("id", "1").attribute("name", "root");

      // when
      String exportedXml = exportAsString(root, new XmlDomDescriptorExporterImpl());

      // then
      XmlAssert.assertIdentical(XML_HEADER + "<root id=\"1\" name=\"root\"></root>", exportedXml);

   }
   
   @Test
   public void shouldBeAbleToExportSingleNodeTreeWithAttributesAndText() throws Exception
   {
      // given
      Node root = new Node("root");
      root.attribute("id", "1")
          .attribute("name", "root")
          .text("doovde");

      // when
      String exportedXml = exportAsString(root, new XmlDomDescriptorExporterImpl());
      
      // then
      XmlAssert.assertIdentical(XML_HEADER + "<root id=\"1\" name=\"root\">doovde</root>", exportedXml);

   }
   
   @Test(expected = DescriptorExportException.class)
   public void shouldThrowExceptionWhenTreeIsNull() throws Exception
   {
      // given
      Node root = null;

      // when
      String exportedXml = exportAsString(root, new XmlDomDescriptorExporterImpl());

      // then
      // exception should be thrown
   }
   
   // Private utility methods
   
   private Node load(String xml)
   {
      return XmlDomNodeImporter.INSTANCE.importAsNode(new ByteArrayInputStream(xml.getBytes()), true);
   }
   
   private String exportAsString(Node root, XmlDomDescriptorExporterImpl xmlDomExporter)
   {
      final ByteArrayOutputStream output = new ByteArrayOutputStream();
      xmlDomExporter.to(root, output);
      return new String(output.toByteArray());
   }
}
