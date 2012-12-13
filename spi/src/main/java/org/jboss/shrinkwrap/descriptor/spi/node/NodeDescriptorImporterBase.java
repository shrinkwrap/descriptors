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
package org.jboss.shrinkwrap.descriptor.spi.node;

import java.io.InputStream;
import java.lang.reflect.Constructor;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorImporterBase;

/**
 * Base implementation of a {@link DescriptorImporter} for {@link Node}-based content
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public abstract class NodeDescriptorImporterBase<T extends Descriptor> extends DescriptorImporterBase<T> implements
    DescriptorImporter<T> {
    // -------------------------------------------------------------------------------------||
    // Constructor ------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * Creates a new instance representing the specified backing model type
     *
     * @param The
     *            type of the backing object model for the descriptor
     * @throws IllegalArgumentException
     *             If the model type is not specified
     * @throws IllegalArgumentException
     *             If the descriptorName not specified
     */
    public NodeDescriptorImporterBase(final Class<T> endUserViewImplType, final String descriptorName)
        throws IllegalArgumentException {
        super(endUserViewImplType, descriptorName);
    }

    // -------------------------------------------------------------------------------------||
    // Required Implementations -----------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#fromStream(java.io.InputStream)
     */
    @Override
    public T fromStream(final InputStream in, final boolean close) throws IllegalArgumentException,
        DescriptorImportException {
        // Precondition check
        if (in == null) {
            throw new IllegalArgumentException("InputStream must be specified");
        }

        final Node rootNode = this.getNodeImporter().importAsNode(in, close);

        // Create the end-user view
        final Constructor<T> constructor;
        try {
            constructor = endUserViewImplType.getConstructor(String.class, Node.class);
        } catch (final NoSuchMethodException e) {
            throw new DescriptorImportException("Descriptor impl " + endUserViewImplType.getName()
                + " does not have a constructor accepting " + String.class.getName() + " and " + Node.class.getName(),
                e);
        }
        final T descriptor;
        try {
            descriptor = constructor.newInstance(descriptorName, rootNode);
        } catch (final Exception e) {
            throw new DescriptorImportException("Could not create new instance using " + constructor + " with arg: "
                + rootNode);
        }

        // Return
        return descriptor;
    }

    // -------------------------------------------------------------------------------------||
    // Contracts --------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * Importer specific behavior. Convert {@link InputStream} to Node. Will close the specified stream by default. If
     * the stream should remain open, consider using the method importRootNode(InputStream, boolean) instead.
     *
     * @param stream
     *            The Stream of data.
     * @return The Root node extracted.
     */
    public abstract NodeImporter getNodeImporter();
}
