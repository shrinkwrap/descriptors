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

import java.security.AccessController;

import org.jboss.shrinkwrap.descriptor.spi.NodeProvider;

/**
 * Value object encompassing data needed to create new {@link Descriptor}
 * instances
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
class DescriptorConstructionInfo
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Implementation Class of the end-user view
    */
   final Class<? extends NodeProvider> implClass;

   /**
    * Implementation class for the importer
    */
   final Class<? extends DescriptorImporter<?>> importerClass;
   
   /**
    * The default name of the Descriptor 
    */
   final String defaultName;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance using the specified 
    * @param implClassName
    * @param modelClassName
    * @param defaultName The default name for this Descriptor
    */
   @SuppressWarnings("unchecked")
   DescriptorConstructionInfo(final String implClassName, String importerClassName, String defaultName)
   {
      // Get the TCCL
      final ClassLoader tccl = AccessController.doPrivileged(GetTcclAction.INSTANCE);

      // Load the Implementation class
      final Class<? extends NodeProvider> implClass;
      try
      {

         implClass = (Class<? extends NodeProvider>) Class.forName(implClassName, false, tccl);
      }
      catch (final ClassNotFoundException e)
      {
         throw new IllegalArgumentException("Could not load specified implementation class from " + tccl + ": "
               + implClassName, e);
      }
      this.implClass = implClass;

      // Load the Implementation class
      final Class<? extends DescriptorImporter<?>> importerClass;
      try
      {

         importerClass = (Class<? extends DescriptorImporter<?>>) Class.forName(importerClassName, false, tccl);
      }
      catch (final ClassNotFoundException e)
      {
         throw new IllegalArgumentException("Could not load specified importer class from " + tccl + ": "
               + importerClassName, e);
      }
      
      this.importerClass = importerClass;
      this.defaultName = defaultName;
   }
}
