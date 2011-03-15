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

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImporter;
import org.jboss.shrinkwrap.descriptor.api.Node;

/**
 * DescriptorImporterBase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public abstract class DescriptorImporterBase<T extends Descriptor> implements DescriptorImporter<T>
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Class representing the implementation of the end-user view (to which we'll supply
    * the model during construction)
    */
   private final Class<T> endUserViewImplType;
   
   private final String descriptorName; 
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance representing the specified backing model
    * type
    * 
    * @param The type of the backing object model for the descriptor
    * @throws IllegalArgumentException If the model type is not specified
    * @throws IllegalArgumentException If the descriptorName not specified
    */
   public DescriptorImporterBase(final Class<T> endUserViewImplType, String descriptorName)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (endUserViewImplType == null)
      {
         throw new IllegalArgumentException("End user view impl type must be specified");
      }
      if (descriptorName == null)
      {
         throw new IllegalArgumentException("Descriptor name must be specified");
      }

      // Set

      this.endUserViewImplType = endUserViewImplType;
      this.descriptorName = descriptorName;
   }

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

      final Node rootNode = importRootNode(in);

      // Create the end-user view
      final Constructor<T> constructor;
      try
      {
         constructor = endUserViewImplType.getConstructor(String.class, Node.class);
      }
      catch (final NoSuchMethodException e)
      {
         throw new DescriptorImportException("Descriptor impl " + endUserViewImplType.getName()
               + " does not have a constructor accepting " + String.class.getName() + " and " + Node.class.getName(), e);
      }
      final T descriptor;
      try
      {
         descriptor = constructor.newInstance(descriptorName, rootNode);
      }
      catch (final Exception e)
      {
         throw new DescriptorImportException("Could not create new instance using " + constructor + " with arg: "
               + rootNode);
      }

      // Return
      return descriptor;
   }
   
   /**
    * Importer specific behavior. Convert {@link InputStream} to Node.
    *  
    * @param stream The Stream of data.
    * @return The Root node extracted.
    */
   public abstract Node importRootNode(InputStream stream) throws DescriptorImportException;
}
