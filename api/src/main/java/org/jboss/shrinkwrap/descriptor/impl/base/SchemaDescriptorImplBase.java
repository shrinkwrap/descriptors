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
package org.jboss.shrinkwrap.descriptor.impl.base;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.spi.SchemaDescriptorProvider;
import org.jboss.shrinkwrap.descriptor.spi.SchemaModel;

/**
 * Base support for implementations of {@link SchemaDescriptorProvider}s
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public abstract class SchemaDescriptorImplBase<T extends SchemaModel> implements SchemaDescriptorProvider<T>
{
   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportAsString()
    */
   @Override
   public final String exportAsString() throws DescriptorExportException
   {
      // Export as bytes
      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
      this.exportTo(baos);

      // Make a String out of the bytes
      final String content;
      try
      {
         content = baos.toString(Charset.UTF8.name());
      }
      catch (final UnsupportedEncodingException e)
      {
         throw new DescriptorExportException("Inconsistent encoding used during export", e);
      }

      // Return
      return content;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportTo(java.io.OutputStream)
    */
   @Override
   public final void exportTo(final OutputStream output) throws DescriptorExportException, IllegalArgumentException
   {
      // Precondition check
      if (output == null)
      {
         throw new IllegalArgumentException("OutputStream must be specified");
      }

      // Get the underlying model
      final T schemaModel = this.getSchemaModel();
      assert schemaModel != null : "Schema model must be provided";

      // Export
      try
      {
         final JAXBContext context = JAXBContext.newInstance(schemaModel.getClass());
         final Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_ENCODING, Charset.UTF8.name());
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, schemaModel.getSchemaLocation());
         m.marshal(schemaModel, output);
      }
      catch (final PropertyException e)
      {
         throw new DescriptorExportException("Could not export descriptor model " + schemaModel, e);
      }
      catch (final JAXBException e)
      {
         throw new DescriptorExportException("Could not export descriptor model " + schemaModel, e);
      }
   }

}
