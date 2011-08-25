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
package org.jboss.shrinkwrap.descriptor.api;

/**
 * Main entry point into the ShrinkWrap Descriptors project.
 * 
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public final class Descriptors
{

   /**
    * Internal Constructor; not to be called
    */
   private Descriptors()
   {
      throw new UnsupportedOperationException("No instances permitted");
   }

   /**
    * Creates a new Descriptor instance; the predefined default descriptor 
    * name for this type will be used.
    * 
    * @param <T>
    * @param type
    * @return
    * @see #create(Class, String)
    * @throws IllegalArgumentException If the type is not specified
    */
   public static <T extends Descriptor> T create(final Class<T> type) throws IllegalArgumentException
   {
      return create(type, null);
   }

   /**
    * Creates a new named {@link Descriptor} instance.  If the name specified is null, 
    * the default name for this type will be assigned.
    * 
    * @param <T>
    * @param type
    * @param descriptorName the descriptor name 
    * @return
    * @throws IllegalArgumentException If the type is not specified
    */
   public static <T extends Descriptor> T create(final Class<T> type, final String descriptorName)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (type == null)
      {
         throw new IllegalArgumentException("type must be specified");
      }

      // Create
      return DescriptorInstantiator.createFromUserView(type, descriptorName);
   }

   /**
    * Returns a new {@link DescriptorImporter} instance, ready to import as a 
    * new {@link Descriptor} instance of the given type
    * @param type
    * @return
    * @throws IllegalArgumentException If the type is not specified
    */
   public static <T extends Descriptor> DescriptorImporter<T> importAs(final Class<T> type)
         throws IllegalArgumentException
   {
      return importAs(type, null);
   }

   /**
    * Returns a new named {@link DescriptorImporter} instance, ready to import as a 
    * new {@link Descriptor} instance of the given type.  If the name specified is null, 
    * the default name for this type will be assigned. 
    * 
    * @param type
    * @param descriptorName
    * @return
    * @throws IllegalArgumentException If the type is not specified
    */
   public static <T extends Descriptor> DescriptorImporter<T> importAs(final Class<T> type, final String descriptorName)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (type == null)
      {
         throw new IllegalArgumentException("type must be specified");
      }

      // Create new importer
      return DescriptorInstantiator.createImporterFromUserView(type, descriptorName);
   }
}