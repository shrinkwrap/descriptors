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
package org.jboss.shrinkwrap.descriptor.spi.xml.dom;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.junit.Assert;
import org.junit.Test;

/**
 * TestCases to see Exporter can handle the Node Structure provided by the Importer.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XMLRoundTripTestCase
{
   public static final String XML_WITH_COMMENT = "" +
   		"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
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
   public void shouldBeAbleToImportAndExportXMLWithComments() throws Exception
   {
      Node root = load(XML_WITH_COMMENT);
      
      Assert.assertNotNull(root.getSingle("#comment"));
      Assert.assertNotNull(root.getSingle("child"));
      
      System.out.println(export(root));
   }
   
   @SuppressWarnings({"unchecked", "rawtypes"})
   private Node load(String xml)
   {
      return new XmlDomImporter(Object.class, "test.xml")
         .importRootNode(new ByteArrayInputStream(xml.getBytes()));
   }
   
   private String export(Node root)
   {
      ByteArrayOutputStream output = new ByteArrayOutputStream();
      new XmlDomExporter().to(root, output);
      return new String(output.toByteArray());
   }
}
