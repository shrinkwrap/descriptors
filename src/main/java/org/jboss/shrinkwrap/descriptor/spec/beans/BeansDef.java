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
package org.jboss.shrinkwrap.descriptor.spec.beans;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;

import org.jboss.shrinkwrap.api.asset.Asset;
import org.jboss.shrinkwrap.descriptor.api.DescriptorDef;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class BeansDef implements DescriptorDef<Beans>, Asset
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Beans beans;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public BeansDef()
   {
      this(new Beans());
   }
   
   public BeansDef(Beans beans)
   {
      this.beans = beans;
   }
   
   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public BeansDef interceptors(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Interceptor.class))
         {
            throw new IllegalArgumentException("Class is not an interceptor");
         }
         beans.getInterceptors().add(c.getName());
      }
      return this;
   }
   
   public BeansDef interceptor(Class<?> clazz)
   {
      return interceptors(clazz);
   }
   
   public BeansDef decorators(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be more thorough
         if (!c.isAnnotationPresent(Decorator.class))
         {
            throw new IllegalArgumentException("Class is not a decorator");
         }
         beans.getDecorators().add(c.getName());
      }
      return this;
   }
   
   public BeansDef decorator(Class<?> clazz)
   {
      return decorators(clazz);
   }
   
   public BeansDef alternativeClasses(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Alternative.class))
         {
            throw new IllegalArgumentException("Class is not an alternative");
         }
         beans.getAlternatives().getClasses().add(c.getName());
      }
      return this;
   }
   
   public BeansDef alternativeClass(Class<?> clazz)
   {
      return alternativeClasses(clazz);
   }
   
   public BeansDef alternativeStereotypes(Class<? extends Annotation>... annotations)
   {
      for (Class<? extends Annotation> a : annotations)
      {
         // FIXME this validation needs to be thorough
         if (!a.isAnnotationPresent(Stereotype.class))
         {
            throw new IllegalArgumentException("Annotation is not a stereotype");
         }
         // FIXME this validation needs to be thorough
         if (!a.isAnnotationPresent(Alternative.class))
         {
            throw new IllegalArgumentException("Stereotype is not an alternative");
         }
         beans.getAlternatives().getStereotypes().add(a.getName());
      }
      return this;
   }
   
   @SuppressWarnings("unchecked")
   public BeansDef alternativeStereotype(Class<? extends Annotation> clazz)
   {
      return alternativeStereotypes(clazz);
   }
   
   //-------------------------------------------------------------------------------------||
   // Required Implementations - DescriptorDef -------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public Beans descriptor()
   {
      return beans;
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations - Asset ---------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public InputStream openStream()
   {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      DescriptorExporter.to(descriptor(), out);
      return new ByteArrayInputStream(out.toByteArray());
   }
}