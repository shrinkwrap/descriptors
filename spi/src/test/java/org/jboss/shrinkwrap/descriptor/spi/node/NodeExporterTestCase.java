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
package org.jboss.shrinkwrap.descriptor.spi.node;

import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

/**
 * TestCases to see Exporter can handle the Node Structure provided by the Importer.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public class NodeExporterTestCase {
    private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";


    @Test
    public void shouldBeAbleToExportSingleNodeTree() throws Exception {
        // given
        Node root = new Node("root");

        // when
        String exportedXml = root.exportAsString();

        // then
        XmlAssert.assertIdentical(XML_HEADER + "<root></root>", exportedXml);
    }

    @Test
    public void shouldBeAbleToExportSingleNodeTreeWithAttributes() throws Exception {
        // given
        Node root = new Node("root");
        root.attribute("id", "1").attribute("name", "root");

        // when
        String exportedXml = root.exportAsString();

        // then
        XmlAssert.assertIdentical(XML_HEADER + "<root id=\"1\" name=\"root\"></root>", exportedXml);
    }

    @Test
    public void shouldBeAbleToExportSingleNodeTreeWithAttributesAndText() throws Exception {
        // given
        Node root = new Node("root");
        root.attribute("id", "1").attribute("name", "root").text("doovde");

        // when
        String exportedXml = root.exportAsString();

        // then
        XmlAssert.assertIdentical(XML_HEADER + "<root id=\"1\" name=\"root\">doovde</root>", exportedXml);
    }

}
