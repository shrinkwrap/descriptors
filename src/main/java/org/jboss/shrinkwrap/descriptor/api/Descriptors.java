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

import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class Descriptors
{
   public static <T extends DescriptorDef<?>> T create(Class<T> type)
   {
      return (T)createInstance((Class<DescriptorDef<?>>)type);
   }
   
   public static <T extends Descriptor, X extends DescriptorDef<T>> X create(Class<X> defType, InputStream xmlStream)
   {
      Class<T> descriptorClass = (Class<T>)getDescriptorType(defType);
      return create(defType, descriptorClass, xmlStream);
   }

   static <T extends Descriptor, X extends DescriptorDef<T>> X create(Class<X> defType, Class<T> type, InputStream xmlStream)
   {
      T descriptor = DescriptorImporter.from(type, xmlStream);
      return defType.cast(createInstance((Class<DescriptorDef<T>>)defType, descriptor));
   }
   
   static <T extends Descriptor> DescriptorDef<T> createInstance(Class<DescriptorDef<T>> type, T descriptor)
   {
      try
      {
         return type.getConstructor(descriptor.getClass()).newInstance(descriptor);
      }
      catch (Exception e) 
      {
         throw new DescriptorException(
               "Could not create DescriptorDef " + type.getName() + 
               " using descriptor " + descriptor.getClass().getName());
      }
   }
   
   static DescriptorDef<?> createInstance(Class<DescriptorDef<?>> type)
   {
      try
      {
         return type.getConstructor().newInstance();
      }
      catch (Exception e) 
      {
         throw new DescriptorException(
               "Could not create DescriptorDef " + type.getName());
      }
   }

   static <T extends Descriptor> Class<? extends Descriptor> getDescriptorType(Class<? extends DescriptorDef<T>> descriptorDefType)
   {
      for(Type type : descriptorDefType.getGenericInterfaces())
      {
         if (type instanceof ParameterizedType)
         {
            ParameterizedType paramType = (ParameterizedType) type;
            for(Type actualType : paramType.getActualTypeArguments())
            {
               return (Class<T>)actualType;
            }
         }
      }
      return null;
   }
}