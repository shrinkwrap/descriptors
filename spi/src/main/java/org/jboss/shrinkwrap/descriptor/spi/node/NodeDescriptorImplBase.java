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
package org.jboss.shrinkwrap.descriptor.spi.node;

import java.io.OutputStream;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.spi.node.dom.XmlDomDescriptorExporter;

/**
 * Base implementation of a {@link NodeDescriptor} for simple extension by more specialized types.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public abstract class NodeDescriptorImplBase extends DescriptorImplBase<NodeDescriptor> implements NodeDescriptor {

    /**
     * Creates a new instance
     *
     * @param name
     */
    public NodeDescriptorImplBase(final String name) {
        super(name);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportTo(java.io.OutputStream)
     */
    @Override
    public void exportTo(final OutputStream output) throws DescriptorExportException, IllegalArgumentException {
        if (output == null) {
            throw new IllegalArgumentException("Can not export to null stream");
        }
        this.getExporter().to(this, output);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.spi.DescriptorImplBase#getExporter()
     */
    @Override
    protected final DescriptorExporter<NodeDescriptor> getExporter() {
        return XmlDomDescriptorExporter.INSTANCE;
    }
}
