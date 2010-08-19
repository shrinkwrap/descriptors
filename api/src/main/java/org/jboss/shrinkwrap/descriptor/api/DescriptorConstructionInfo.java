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

import org.jboss.shrinkwrap.descriptor.spi.SchemaDescriptorProvider;
import org.jboss.shrinkwrap.descriptor.spi.SchemaModel;

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
   final Class<? extends SchemaDescriptorProvider<? extends SchemaModel>> implClass;

   /**
    * Class used for the backing object model
    */
   final Class<? extends SchemaModel> modelClass;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance using the specified 
    * @param implClassName
    * @param modelClassName
    */
   @SuppressWarnings("unchecked")
   DescriptorConstructionInfo(final String implClassName, final String modelClassName)
   {
      // Get the TCCL
      final ClassLoader tccl = AccessController.doPrivileged(GetTcclAction.INSTANCE);

      // Load the Implementation class
      final Class<? extends SchemaDescriptorProvider<?>> implClass;
      try
      {

         implClass = (Class<? extends SchemaDescriptorProvider<?>>) Class.forName(implClassName, false, tccl);
      }
      catch (final ClassNotFoundException e)
      {
         throw new IllegalArgumentException("Could not load specified implementation class from " + tccl + ": "
               + implClassName, e);
      }
      this.implClass = implClass;

      // Load the Model class
      final Class<? extends SchemaModel> modelClass;
      try
      {

         modelClass = (Class<? extends SchemaModel>) Class.forName(modelClassName, false, tccl);
      }
      catch (final ClassNotFoundException e)
      {
         throw new IllegalArgumentException("Could not load specified implementation class from " + tccl + ": "
               + modelClassName, e);
      }
      this.modelClass = modelClass;
   }
}
