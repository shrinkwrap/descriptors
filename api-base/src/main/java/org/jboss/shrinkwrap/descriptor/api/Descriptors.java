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
    * Creates a new Descriptor instance, predefined default descriptor name will be used.
    * 
    * @param <T>
    * @param type
    * @return
    * @see #create(Class, String)
    */
   public static <T extends Descriptor> T create(final Class<T> type)
   {
      return create(type, null);
   }

   /**
    * Creates a new named Descriptor instance.
    * 
    * @param <T>
    * @param type
    * @param descriptorName the descriptor name 
    * @return
    */
   public static <T extends Descriptor> T create(final Class<T> type, String descriptorName)
   {
      return DescriptorInstantiator.createFromUserView(type, descriptorName);
   }

   public static <T extends Descriptor> DescriptorImporter<T> importAs(final Class<T> type)
   {
      return importAs(type, null);
   }

   public static <T extends Descriptor> DescriptorImporter<T> importAs(final Class<T> type, String descriptorName)
   {
      return DescriptorInstantiator.createImporterFromUserView(type, descriptorName);
   }

   //   public static <T extends Descriptor, X extends Descriptor<T>> X create(Class<X> defType, InputStream xmlStream)
   //   {
   //      Class<T> descriptorClass = (Class<T>)getDescriptorType(defType);
   //      return create(defType, descriptorClass, xmlStream);
   //   }
   //
   //   static <T extends Descriptor, X extends Descriptor<T>> X create(Class<X> defType, Class<T> type, InputStream xmlStream)
   //   {
   //      T descriptor = DescriptorImporter.from(type, xmlStream);
   //      return defType.cast(createInstance((Class<Descriptor<T>>)defType, descriptor));
   //   }
   //   
   //   static <T extends Descriptor> Descriptor<T> createInstance(Class<Descriptor<T>> type, T descriptor)
   //   {
   //      try
   //      {
   //         return type.getConstructor(descriptor.getClass()).newInstance(descriptor);
   //      }
   //      catch (Exception e) 
   //      {
   //         throw new DescriptorException(
   //               "Could not create DescriptorDef " + type.getName() + 
   //               " using descriptor " + descriptor.getClass().getName());
   //      }
   //   }

   //   private static <T extends Descriptor> Class<? extends Descriptor> getDescriptorType(Class<? extends Descriptor<T>> descriptorDefType)
   //   {
   //      for(Type type : descriptorDefType.getGenericInterfaces())
   //      {
   //         if (type instanceof ParameterizedType)
   //         {
   //            ParameterizedType paramType = (ParameterizedType) type;
   //            for(Type actualType : paramType.getActualTypeArguments())
   //            {
   //               return (Class<T>)actualType;
   //            }
   //         }
   //      }
   //      return null;
   //   }
}