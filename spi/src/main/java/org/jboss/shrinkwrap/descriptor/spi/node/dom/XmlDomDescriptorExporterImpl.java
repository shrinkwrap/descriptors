/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
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

import java.io.OutputStream;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorExporterImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;

/**
 * {@link NodeDescriptorExporterImpl} implementation backed by the {@link Document} API
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
final class XmlDomDescriptorExporterImpl extends NodeDescriptorExporterImpl implements
    DescriptorExporter<NodeDescriptor> {

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorExporterImpl#to(org.jboss.shrinkwrap.descriptor.spi.node.Node,
     *      java.io.OutputStream)
     */
    @Override
    public void to(final Node node, final OutputStream out) throws DescriptorExportException {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document root = builder.newDocument();
            root.setXmlStandalone(true);

            writeRecursive(root, node);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");

            StreamResult result = new StreamResult(out);
            transformer.transform(new DOMSource(root), result);
        } catch (Exception e) {
            throw new DescriptorExportException("Could not export Node structure to XML", e);
        }
    }

    /**
     * @param root
     * @param node
     */
    private void writeRecursive(final org.w3c.dom.Node target, final Node source) {
        Document owned = target.getOwnerDocument();
        if (owned == null) {
            owned = (Document) target;
        }
        org.w3c.dom.Node targetChild = null;
        // Comment node
        if (source.isComment()) {
            targetChild = owned.createComment(source.getText());
        } else if (source.getText() != null) {
            targetChild = owned.createElement(source.getName());
            targetChild.appendChild(owned.createTextNode(source.getText()));
        } else {
            targetChild = owned.createElement(source.getName());
        }

        target.appendChild(targetChild);

        for (Map.Entry<String, String> attribute : source.getAttributes().entrySet()) {
            Attr attr = owned.createAttribute(attribute.getKey());
            attr.setValue(attribute.getValue());

            targetChild.getAttributes().setNamedItem(attr);
        }

        for (Node sourceChild : source.getChildren()) {
            writeRecursive(targetChild, sourceChild);
        }
    }
}
