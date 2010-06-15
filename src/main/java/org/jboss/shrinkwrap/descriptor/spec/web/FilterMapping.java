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
package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filter-mappingType", propOrder = {
      "filterName",
      "dispatchers"
})
public class FilterMapping extends ServletMapping
{
   @XmlElement(name = "filter-name")
   protected String filterName;
   
   // FIXME should be an enum
   @XmlElement(name = "dispatcher")
   protected List<String> dispatchers;
   
   public FilterMapping() {}
   
   public FilterMapping(String filterName, String... urlPatterns)
   {
      this.filterName = filterName;
      for (String urlPattern : urlPatterns)
      {
         getUrlPatterns().add(urlPattern);
      }
   }
   
   public String getFilterName()
   {
      return filterName;
   }

   public void setFilterName(String filterName)
   {
      this.filterName = filterName;
   }

   public List<String> getDispatchers()
   {
      if (dispatchers == null)
      {
         dispatchers = new ArrayList<String>();
         
      }

      return dispatchers;
   }
}
