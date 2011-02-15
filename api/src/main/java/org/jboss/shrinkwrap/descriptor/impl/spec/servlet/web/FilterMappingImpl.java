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

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping;

/**
 * Backend object view of a Web Descriptor Filter Mapping element
 * 
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public class FilterMappingImpl implements FilterMapping
{

   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * filter-mapping/filter-name
    */
   private String filterName;

   /**
    * filter-mapping/url-pattern
    */
   private String urlPattern;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new instance with the specified name
    * @param name filter-name
    * @param urlPattern url-pattern
    * @throws IllegalArgumentException If either name or urlPattern is not specified
    */
   public FilterMappingImpl(final String name, final String urlPattern)
   {
      // Precondition checks
      if (name == null || name.length() == 0)
      {
         throw new IllegalArgumentException("name must be specified");
      }
      if (urlPattern == null || urlPattern.length() == 0)
      {
         throw new IllegalArgumentException("urlPattern must be specified");
      }

      // Set
      this.filterName = name;
      this.urlPattern = urlPattern;
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations -----------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping#getFilterName()
    */
   @Override
   public String getFilterName()
   {
      return this.filterName;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping#setFilterName(java.lang.String)
    */
   @Override
   public void setFilterName(final String name)
   {
      if (name == null || name.length() == 0)
      {
         throw new IllegalArgumentException("name must be specified");
      }
      this.filterName = name;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping#getUrlPattern()
    */
   @Override
   public String getUrlPattern()
   {
      return this.urlPattern;
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.FilterMapping#setUrlPattern(java.lang.String)
    */
   @Override
   public void setUrlPattern(final String urlPattern)
   {
      if (urlPattern == null || urlPattern.length() == 0)
      {
         throw new IllegalArgumentException("urlPattern must be specified");
      }
      this.urlPattern = urlPattern;
   }

}
