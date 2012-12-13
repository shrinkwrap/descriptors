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

import java.io.OutputStream;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorExporter;
import org.w3c.dom.Document;

/**
 * Singleton publicly-visible view of the {@link DescriptorExporter} capable of handling {@link NodeDescriptor} exports
 * by using a {@link Document} API strategy.
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum XmlDomDescriptorExporter implements NodeDescriptorExporter {
    INSTANCE;

    /**
     * Internal delegate, singleton
     */
    private final NodeDescriptorExporter delegate = new XmlDomDescriptorExporterImpl();

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.api.DescriptorExporter#to(org.jboss.shrinkwrap.descriptor.api.Descriptor,
     *      java.io.OutputStream)
     */
    @Override
    public void to(final NodeDescriptor descriptor, final OutputStream out) throws DescriptorExportException,
        IllegalArgumentException {
        // Delegate
        delegate.to(descriptor, out);

    }
}
