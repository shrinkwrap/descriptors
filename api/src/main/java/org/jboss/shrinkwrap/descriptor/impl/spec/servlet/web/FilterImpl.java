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
package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Param;

/**
 * Backend object view of a Web Descriptor Filter element
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class FilterImpl implements Filter
{

   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * filter/filter-name
    */
   private String name;

   /**
    * filter/filter-class
    */
   private String clazz;

   /**
    * filter/init-param
    */
   private final List<Param> initParams;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance with the specified name
    * @param name filter-name
    * @param clazz filter-class
    * @throws IllegalArgumentException If either name or class is not specified
    */
   public FilterImpl(final String name, final String clazz)
   {
      // Precondition checks
      if (name == null || name.length() == 0)
      {
         throw new IllegalArgumentException("name must be specified");
      }
      if (clazz == null || clazz.length() == 0)
      {
         throw new IllegalArgumentException("clazz must be specified");
      }

      // Set
      this.name = name;
      this.clazz = clazz;
      this.initParams = new ArrayList<Param>();
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations -----------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter#getName()
    */
   @Override
   public String getName()
   {
      return this.name;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter#setName(java.lang.String)
    */
   @Override
   public void setName(final String name)
   {
      if (name == null || name.length() == 0)
      {
         throw new IllegalArgumentException("name must be specified");
      }
      this.name = name;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter#getClazz()
    */
   @Override
   public String getClazz()
   {
      return this.clazz;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter#setClazz(java.lang.String)
    */
   @Override
   public void setClazz(final String clazz)
   {
      if (clazz == null || clazz.length() == 0)
      {
         throw new IllegalArgumentException("clazz must be specified");
      }
      this.clazz = clazz;

   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.Filter#getInitParams()
    */
   @Override
   public List<Param> getInitParams()
   {
      return this.initParams;
   }

   /**
    * {@inheritDoc}
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return FilterImpl.class.getSimpleName() + " [name=" + name + ", clazz=" + clazz + "]";
   }

}
