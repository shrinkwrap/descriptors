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
@XmlType(name = "servlet-mappingType", propOrder = {
      "servletName",
      "urlPatterns"
})
public class ServletMapping
{
   @XmlElement(name = "servlet-name", required = true)
   protected String servletName;

   @XmlElement(name = "url-pattern", required = true)
   protected List<String> urlPatterns;

   public ServletMapping() {}
   
   public ServletMapping(String servletName, String... urlPatterns)
   {
      this.servletName = servletName;
      for (String urlPattern : urlPatterns)
      {
         getUrlPatterns().add(urlPattern);
      }
   }

   public String getServletName()
   {
      return servletName;
   }

   public void setServletName(String servletName)
   {
      this.servletName = servletName;
   }
   
   public List<String> getUrlPatterns()
   {
      if (urlPatterns == null)
      {
         urlPatterns = new ArrayList<String>();
      }
      return urlPatterns;
   }
}
