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

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeImporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

/**
 * {@link NodeImporter} implementation backed by the {@link Document} API.
 *
 * @see {@link XmlDomNodeImporter} For convenience singleton
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public final class XmlDomNodeImporterImpl implements NodeImporter {

    /**
     * Logger
     */
    private final Logger log = Logger.getLogger(XmlDomNodeImporterImpl.class.getName());

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.spi.node.NodeImporter#importAsNode(java.io.InputStream, boolean)
     */
    @Override
    public Node importAsNode(final InputStream stream, final boolean close) throws DescriptorImportException {
        try {
            // Empty contents? If so, no root Node
            if (stream.available() == 0) {
                return null;
            }

            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document doc = builder.parse(stream);

            final Element element = doc.getDocumentElement();

            final Node root = new Node(element.getNodeName());

            readRecursive(root, element);
            return root;

        } catch (final Exception e) {
            throw new DescriptorImportException("Could not import XML from stream", e);
        } finally {
            if (close) {
                try {
                    stream.close();
                } catch (final IOException ioe) {
                    try {
                        stream.close();
                    } catch (final IOException i) {
                        log.log(Level.WARNING, "Unclosable stream specified to be closed: {0}", stream);
                    }
                }
            }
        }
    }

    private void readRecursive(final Node target, final org.w3c.dom.Node source) {
        readAttributes(target, source);
        final NodeList sourceChildren = source.getChildNodes();
        if (sourceChildren != null) {
            for (int i = 0; i < sourceChildren.getLength(); i++) {
                final org.w3c.dom.Node child = sourceChildren.item(i);
                if (child.getNodeType() != org.w3c.dom.Node.TEXT_NODE) {
                    // Create our representation of the Node
                    final Node newTarget = target.createChild(child.getNodeName());

                    if (onlyTextChildren(child)) {
                        // See if we're dealing with a comment and mark specifically
                        if (child.getNodeType() == org.w3c.dom.Node.COMMENT_NODE) {
                            newTarget.setComment(true);
                        }

                        // Set text
                        newTarget.text(child.getTextContent());
                        readAttributes(newTarget, child);
                    } else {
                        readRecursive(newTarget, child);
                    }
                } else {
                    target.text(child.getTextContent());
                }

            }
        }
    }

    private void readAttributes(final Node target, final org.w3c.dom.Node source) {
        final NamedNodeMap attributes = source.getAttributes();
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                final org.w3c.dom.Node attribute = attributes.item(i);
                target.attribute(attribute.getNodeName(), attribute.getNodeValue());
            }
        }
    }

    /**
     * @param source
     * @return
     */
    private boolean onlyTextChildren(final org.w3c.dom.Node source) {
        final NodeList children = source.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            final org.w3c.dom.Node child = children.item(i);
            if (child.getNodeType() != org.w3c.dom.Node.TEXT_NODE) {
                return false;
            }
        }
        return true;
    }
}
