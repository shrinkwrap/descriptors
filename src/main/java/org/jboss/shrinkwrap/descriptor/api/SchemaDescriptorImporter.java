/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * Helper class for importing a given {@link Descriptor}.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 * @version $Revision: $
 */
final class SchemaDescriptorImporter<T extends Descriptor> implements DescriptorImporter<T>
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Class representing the object model to be used backing the schema
    */
   private final Class<?> modelType;

   /**
    * Class representing the implementation of the end-user view (to which we'll supply
    * the model during construction)
    */
   private final Class<T> endUserViewImplType;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance representing the specified backing model
    * type
    * 
    * @param The type of the backing object model for the descriptor
    * @throws IllegalArgumentException If the model type is not specified
    */
   public SchemaDescriptorImporter(final Class<?> modelType, final Class<T> endUserViewImplType)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (modelType == null)
      {
         throw new IllegalArgumentException("Model type must be specified");
      }
      if (endUserViewImplType == null)
      {
         throw new IllegalArgumentException("End user view impl type must be specified");
      }
      // Set

      this.modelType = modelType;
      this.endUserViewImplType = endUserViewImplType;
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations -----------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.io.File)
    */
   @Override
   public T from(final File file) throws IllegalArgumentException, DescriptorImportException
   {
      // Precondition checks
      if (file == null)
      {
         throw new IllegalArgumentException("File not specified");
      }

      // Delegate
      try
      {
         return this.from(new FileInputStream(file));
      }
      catch (final FileNotFoundException e)
      {
         throw new IllegalArgumentException("Specified file does not exist or is a directory: "
               + file.getAbsolutePath());
      }
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.io.InputStream)
    */
   @Override
   public T from(final InputStream in) throws IllegalArgumentException, DescriptorImportException
   {
      // Precondition check
      if (in == null)
      {
         throw new IllegalArgumentException("InputStream must be specified");
      }

      // Import from the model
      final Object model;
      try
      {
         final JAXBContext context = JAXBContext.newInstance(modelType);
         final Unmarshaller unmarshaller = context.createUnmarshaller();
         model = unmarshaller.unmarshal(in);

         if (!modelType.isInstance(model))
         {
            throw new DescriptorImportException("Unmarshalled descriptor not of expected type, " + "expected["
                  + modelType.getName() + "] but found[" + modelType.getName() + "]");
         }

      }
      catch (final JAXBException e)
      {
         throw new DescriptorImportException("Could not import descriptor " + modelType, e);
      }

      // Create the end-user view
      final Constructor<T> constructor;
      try
      {
         constructor = endUserViewImplType.getConstructor(modelType);
      }
      catch (final NoSuchMethodException e)
      {
         throw new DescriptorImportException("Descriptor impl " + endUserViewImplType.getName()
               + " does not have a constructor accepting " + modelType.getName(), e);
      }
      final T descriptor;
      try
      {
         descriptor = constructor.newInstance(model);
      }
      catch (final Exception e)
      {
         throw new DescriptorImportException("Could not create new instance using " + constructor + " with arg: "
               + model);
      }

      // Return
      return descriptor;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.lang.String)
    */
   @Override
   public T from(final String string) throws IllegalArgumentException, DescriptorImportException
   {
      // Precondition check
      if (string == null || string.length() == 0)
      {
         throw new IllegalArgumentException("Input must be specified");
      }

      // Return
      return this.from(new ByteArrayInputStream(string.getBytes()));
   }
}
