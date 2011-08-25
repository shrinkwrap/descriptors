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
package org.jboss.shrinkwrap.descriptor.spi;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * Base implementation for a {@link Descriptor}. 
 * 
 * Enforces descriptor name constructor argument contract 
 * from extension loading.
 *
 * @param <T> Concrete descriptor type
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public abstract class DescriptorImplBase<T extends Descriptor> implements Descriptor
{

   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Name of the descriptor
    */
   private final String name;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Create a named Descriptor. 
    */
   public DescriptorImplBase(final String name)
   {
      this.name = name;
   }

   //-------------------------------------------------------------------------------------||
   // Implemented Methods ----------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#getDescriptorName()
    */
   @Override
   public String getDescriptorName()
   {
      return name;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.Descriptor#exportAsString()
    */
   @Override
   public String exportAsString() throws DescriptorExportException
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

   //-------------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Obtains the {@link DescriptorExporter} implementation to be used
    * by default in {@link Descriptor#exportTo(java.io.OutputStream)}
    * @return
    */
   protected abstract DescriptorExporter<T> getExporter();
}
