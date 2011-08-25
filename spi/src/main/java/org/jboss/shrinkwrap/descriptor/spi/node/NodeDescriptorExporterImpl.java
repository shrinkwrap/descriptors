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

/**
 * {@link NodeDescriptorExporter} base implementation which provides base
 * support for building a full implementation.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public abstract class NodeDescriptorExporterImpl implements NodeDescriptorExporter
{

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorExporter#to(org.jboss.shrinkwrap.descriptor.api.Descriptor, java.io.OutputStream)
    */
   @Override
   public void to(final NodeDescriptor descriptor, final OutputStream output) throws DescriptorExportException,
         IllegalArgumentException
   {
      // Precondition checks
      if (descriptor == null)
      {
         throw new IllegalArgumentException("descriptor must be specified");
      }
      if (output == null)
      {
         throw new IllegalArgumentException("stream must be specified");
      }

      // Get the root node
      final Node root = descriptor.getRootNode();

      // Delegate
      this.to(root, output);
   }

   /**
    * Exports the specified {@link Node} to the
    * specified {@link OutputStream}
    * @param node
    * @param output
    * @throws IllegalArgumentException If either argument is not specified
    */
   public abstract void to(Node node, OutputStream output) throws IllegalArgumentException;
}
