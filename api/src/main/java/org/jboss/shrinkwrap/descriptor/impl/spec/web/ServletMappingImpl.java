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
package org.jboss.shrinkwrap.descriptor.impl.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jboss.shrinkwrap.descriptor.api.spec.web.ServletMapping;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servlet-mappingType", propOrder = {
      "servletName",
      "urlPatterns"
})
public class ServletMappingImpl implements ServletMapping
{
   @XmlElement(name = "servlet-name", required = true)
   protected String servletName;

   @XmlElement(name = "url-pattern", required = true)
   protected List<String> urlPatterns;

   public ServletMappingImpl() {}
   
   public ServletMappingImpl(String servletName, String... urlPatterns)
   {
      this.servletName = servletName;
      for (String urlPattern : urlPatterns)
      {
         getUrlPatterns().add(urlPattern);
      }
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.impl.spec.web.ServletMapping#getServletName()
    */
   @Override
   public String getServletName()
   {
      return servletName;
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.impl.spec.web.ServletMapping#setServletName(java.lang.String)
    */
   @Override
   public void setServletName(String servletName)
   {
      this.servletName = servletName;
   }
   
   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.impl.spec.web.ServletMapping#getUrlPatterns()
    */
   @Override
   public List<String> getUrlPatterns()
   {
      if (urlPatterns == null)
      {
         urlPatterns = new ArrayList<String>();
      }
      return urlPatterns;
   }
}
