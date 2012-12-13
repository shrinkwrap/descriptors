/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImporter;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImporterBase;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeImporter;
import org.w3c.dom.Document;

/**
 * Adaptor to use a {@link Document} API approach to {@link Descriptor} imports as defined by the
 * {@link DescriptorImporter} API
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class XmlDomNodeDescriptorImporterImpl<T extends Descriptor> extends NodeDescriptorImporterBase<T> implements
    DescriptorImporter<T> {

    /**
     * Creates a new instance
     *
     * @param endUserViewImplType
     * @param descriptorName
     * @throws IllegalArgumentException
     */
    public XmlDomNodeDescriptorImporterImpl(final Class<T> endUserViewImplType, final String descriptorName)
        throws IllegalArgumentException {
        super(endUserViewImplType, descriptorName);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImporterBase#getNodeImporter()
     */
    @Override
    public NodeImporter getNodeImporter() {
        return XmlDomNodeImporter.INSTANCE;
    }

}
