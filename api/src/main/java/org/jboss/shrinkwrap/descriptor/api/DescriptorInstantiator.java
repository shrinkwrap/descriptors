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

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.security.AccessController;
import java.util.Properties;

/**
 * Utility capable of creating {@link Descriptor} instances given 
 * a requested end-user view. 
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
class DescriptorInstantiator
{
   //-------------------------------------------------------------------------------------||
   // Class Members ----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Classpath location under which mapping configuration between
    * ens-user view and implementation types is located
    */
   private static final String MAPPING_LOCATION = "META-INF/services/";

   /**
    * Key of the property denoting the implementation class for a given end-user view type
    */
   private static final String KEY_IMPL_CLASS_NAME = "implClass";

   /**
    * Key of the property denoting the default descriptor name
    */
   private static final String KEY_DEFAULT_NAME = "defaultName";

   /**
    * Key of the property denoting the backing model class for a given end-user view type
    */
   private static final String KEY_IMPORTER_CLASS_NAME = "importerClass";

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Internal constructor; not to be called
    */
   private DescriptorInstantiator()
   {
      throw new UnsupportedOperationException("No instances permitted");
   }

   //-------------------------------------------------------------------------------------||
   // Functional Methods -----------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new {@link Descriptor} instance of the specified user view type.
    * Will consult a configuration file visible to the {@link Thread} Context {@link ClassLoader}
    * named "META-INF/services/$fullyQualfiedClassName" which should contain a key=value
    * format with the keys {@link DescriptorInstantiator#KEY_IMPL_CLASS_NAME} and
    * {@link DescriptorInstantiator#KEY_MODEL_CLASS_NAME}.  The implementation class name
    * must have a constructor accepting an instance of the model class, and the model
    * class must have a no-arg constructor.
    * 
    * @param <T>
    * @param userViewClass
    * @param descriptorName The name of the descriptor. If argument is null, the default name will be used.
    * @return
    * @throws IllegalArgumentException If the user view class was not specified
    */
   static <T extends Descriptor> T createFromUserView(final Class<T> userViewClass, String descriptorName) throws IllegalArgumentException
   {
      // Get the construction information
      final DescriptorConstructionInfo info = getDescriptorConstructionInfoForUserView(userViewClass);
      
      // Get the constructor to use in making the new instance
      final Constructor<? extends Descriptor> ctor;
      try
      {
         ctor = info.implClass.getConstructor(String.class);
      }
      catch (final NoSuchMethodException nsme)
      {
         throw new RuntimeException(info.implClass + " must contain a constructor with a single String argument");
      }
      
      String name = info.defaultName;
      if(descriptorName != null)
      {
         name = descriptorName;
      }

      // Create a new descriptor instance using the backing model
      final Descriptor descriptor;
      try
      {
         descriptor = ctor.newInstance(name);
      }
      // Handle all construction errors equally
      catch (final Exception e)
      {
         throw new RuntimeException("Could not create new descriptor instance", e);
      }

      // Return
      return userViewClass.cast(descriptor);

   }

   /**
    * Creates a new {@link DescriptorImporter} instance of the specified user view type.
    * Will consult a configuration file visible to the {@link Thread} Context {@link ClassLoader}
    * named "META-INF/services/$fullyQualfiedClassName" which should contain a key=value
    * format with the keys {@link DescriptorInstantiator#KEY_IMPL_CLASS_NAME} and
    * {@link DescriptorInstantiator#KEY_MODEL_CLASS_NAME}.  The implementation class name
    * must have a constructor accepting an instance of the model class, and the model
    * class must have a no-arg constructor.
    * 
    * @param <T>
    * @param userViewClass
    * @param descriptorName The name of the descriptor. If argument is null, the default name will be used.
    * @return
    * @throws IllegalArgumentException If the user view class was not specified
    */
   @SuppressWarnings("unchecked")
   static <T extends Descriptor> DescriptorImporter<T> createImporterFromUserView(final Class<T> userViewClass, String descriptorName)
         throws IllegalArgumentException
   {
      // Get the construction information
      final DescriptorConstructionInfo info = getDescriptorConstructionInfoForUserView(userViewClass);

      // Create an importer
      final Class<?> implClass = info.implClass;
      if (!userViewClass.isAssignableFrom(implClass))
      {
         throw new RuntimeException("Configured implementation class for " + userViewClass.getName()
               + " is not assignable: " + implClass.getName());
      }
      final Class<T> implClassCasted = (Class<T>) implClass;

      String name = info.defaultName;
      if(descriptorName != null)
      {
         name = descriptorName;
      }

      final DescriptorImporter<T> importer;
      try
      {
         importer = (DescriptorImporter<T>)info.importerClass.getConstructor(Class.class, String.class).newInstance(implClassCasted, name);
      }
      catch (Exception e) 
      {
         throw new RuntimeException("Configured importer for " + userViewClass.getName()
               + " of type: " + info.importerClass + " could not be created", e);
      }
     
      
      // Return
      return importer;
   }

   //-------------------------------------------------------------------------------------||
   // Internal Helper Members ------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Obtains the {@link DescriptorConstructionInfo} for the giving end user view, using 
    * a configuration file loaded from the TCCL of name "META-INF/services.$fullyQualifiedClassName"
    * having properties as described by {@link DescriptorInstantiator#createFromUserView(Class)}.
    * 
    * @param userViewClass
    * @return The construction information needed to create new instances conforming to the user view
    * @throws IllegalArgumentException If the user view was not specified
    */
   private static DescriptorConstructionInfo getDescriptorConstructionInfoForUserView(final Class<?> userViewClass)
         throws IllegalArgumentException
   {
      // Precondition checks
      if (userViewClass == null)
      {
         throw new IllegalArgumentException("User view class must be specified");
      }

      // Get the configuration from which we'll create new instances
      final String className = userViewClass.getName();
      final String resourceName = MAPPING_LOCATION + className;
      final ClassLoader tccl = AccessController.doPrivileged(GetTcclAction.INSTANCE);
      final InputStream resourceStream = tccl.getResourceAsStream(resourceName);
      if (resourceStream == null)
      {
         throw new IllegalArgumentException("No resource " + resourceName
               + " was found configured for user view class " + userViewClass.getName());
      }

      // Load
      final Properties props = new Properties();
      try
      {
         props.load(resourceStream);
      }
      catch (final IOException e)
      {
         throw new RuntimeException("I/O Problem in reading the properties for " + userViewClass.getName(), e);
      }
      final String implClassName = props.getProperty(KEY_IMPL_CLASS_NAME);
      if (implClassName == null || implClassName.length() == 0)
      {
         throw new IllegalStateException("Resource " + resourceName + " for " + userViewClass
               + " does not contain key " + KEY_IMPL_CLASS_NAME);
      }
      final String importerClassName = props.getProperty(KEY_IMPORTER_CLASS_NAME);
      if (importerClassName == null || importerClassName.length() == 0)
      {
         throw new IllegalStateException("Resource " + resourceName + " for " + userViewClass
               + " does not contain key " + KEY_IMPORTER_CLASS_NAME);
      }
       
      final String defaultName = props.getProperty(KEY_DEFAULT_NAME);
      if(defaultName == null)
      {
         throw new IllegalStateException("Resource " + resourceName + " for " + userViewClass
               + " does not contain key " + KEY_DEFAULT_NAME);
      }

      // Get the construction information
      final DescriptorConstructionInfo info = new DescriptorConstructionInfo(implClassName, importerClassName, defaultName);

      // Return 
      return info;
   }
}
