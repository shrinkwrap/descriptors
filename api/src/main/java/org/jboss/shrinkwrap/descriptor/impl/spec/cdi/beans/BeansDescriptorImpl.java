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
package org.jboss.shrinkwrap.descriptor.impl.spec.cdi.beans;

import java.lang.annotation.Annotation;
import java.util.List;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class BeansDescriptorImpl extends NodeProviderImplBase implements BeansDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private final Node beans;

   // -------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public BeansDescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("beans")
               .attribute("xmlns", "http://java.sun.com/xml/ns/javaee")
               .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance"));
   }

   public BeansDescriptorImpl(String descriptorName, Node beans)
   {
      super(descriptorName);
      this.beans = beans;
   }

   // -------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#interceptors(java.lang.String)
    */
   @Override
   public BeansDescriptor interceptors(String... classes)
   {
      for (String c : classes)
      {
         beans.getOrCreate("interceptors").create("class").text(c);
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#interceptor(java.lang.String)
    */
   @Override
   public BeansDescriptor interceptor(String clazz)
   {
      return interceptors(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#decorators(java.lang.String)
    */
   @Override
   public BeansDescriptor decorators(String... classes)
   {
      for (String c : classes)
      {
         beans.getOrCreate("decorators").create("class").text(c);
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#decorator(java.lang.String)
    */
   @Override
   public BeansDescriptor decorator(String clazz)
   {
      return decorators(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeClasses(java.lang.String)
    */
   @Override
   public BeansDescriptor alternativeClasses(String... classes)
   {
      for (String c : classes)
      {
         beans.getOrCreate("alternatives").create("class").text(c);
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeClass(java.lang.String)
    */
   @Override
   public BeansDescriptor alternativeClass(String clazz)
   {
      return alternativeClasses(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeStereotypes(java.lang.String)
    */
   @Override
   public BeansDescriptorImpl alternativeStereotypes(String... annotations)
   {
      for (String s : annotations)
      {
         beans.getOrCreate("alternatives").create("stereotype").text(s);
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeStereotype(java.lang.String)
    */
   @Override
   public BeansDescriptorImpl alternativeStereotype(String clazz)
   {
      return alternativeStereotypes(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#interceptors(java.lang.Class)
    */
   @Override
   public BeansDescriptor interceptors(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Interceptor.class))
         {
            throw new IllegalArgumentException("Class is not an interceptor");
         }
         beans.getOrCreate("interceptors").create("class").text(c.getName());
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#interceptor(java.lang.Class)
    */
   @Override
   public BeansDescriptor interceptor(Class<?> clazz)
   {
      return interceptors(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#decorators(java.lang.Class)
    */
   @Override
   public BeansDescriptor decorators(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be more thorough
         if (!c.isAnnotationPresent(Decorator.class))
         {
            throw new IllegalArgumentException("Class is not a decorator");
         }
         beans.getOrCreate("decorators").create("class").text(c.getName());
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#decorator(java.lang.Class)
    */
   @Override
   public BeansDescriptor decorator(Class<?> clazz)
   {
      return decorators(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeClasses(java.lang.Class)
    */
   @Override
   public BeansDescriptor alternativeClasses(Class<?>... classes)
   {
      for (Class<?> c : classes)
      {
         // FIXME this validation needs to be thorough
         if (!c.isAnnotationPresent(Alternative.class))
         {
            throw new IllegalArgumentException("Class is not an alternative");
         }
         beans.getOrCreate("alternatives").create("class").text(c.getName());
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeClass(java.lang.Class)
    */
   @Override
   public BeansDescriptor alternativeClass(Class<?> clazz)
   {
      return alternativeClasses(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeStereotypes(java.lang.Class)
    */
   @Override
   public BeansDescriptorImpl alternativeStereotypes(Class<? extends Annotation>... annotations)
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
         beans.getOrCreate("alternatives").create("stereotype").text(a.getName());
      }
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spec.beans.BeansDescriptor#alternativeStereotype(java.lang.Class)
    */
   @Override
   @SuppressWarnings("unchecked")
   public BeansDescriptorImpl alternativeStereotype(Class<? extends Annotation> clazz)
   {
      return alternativeStereotypes(clazz);
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spi.NodeProvider#getRootNode()
    */
   @Override
   public Node getRootNode()
   {
      return beans;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.impl.base.NodeProviderImplBase#getExporter()
    */
   @Override
   protected DescriptorExporter getExporter()
   {
      return new XMLExporter();
   }

   @Override
   public List<String> getAlternativeClasses()
   {
      return beans.textValues("alternatives/class");
   }

   @Override
   public List<String> getAlternativeStereotypes()
   {
      return beans.textValues("alternatives/stereotype");
   }

   @Override
   public List<String> getDecorators()
   {
      return beans.textValues("decorators/class");
   }

   @Override
   public List<String> getInterceptors()
   {
      return beans.textValues("interceptors/class");
   }
}