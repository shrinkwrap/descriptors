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
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "web-resource-collectionType", propOrder = {
      "name",
      "descriptions",
      "urlPatterns",
      "httpMethods",
      "httpMethodOmissions"
})
public class WebResourceCollection
{
   @XmlEnum
   public enum HttpMethodType {
      GET, POST, PUT, DELETE, OPTIONS, HEAD, TRACE;
      
      public String value()
      {
         return name();
      }
      
      public static HttpMethodType fromValue(String v)
      {
         return valueOf(v);
      }
   }
   
   @XmlElement(name = "web-resource-name", required = true)
   protected String name;
   
   @XmlElement(name = "description")
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "url-pattern", required = true)
   protected List<String> urlPatterns;
   
   @XmlElement(name = "http-method")
   protected List<HttpMethodType> httpMethods;
   
   @XmlElement(name = "http-method-omission")
   protected List<HttpMethodType> httpMethodOmissions;
   
   public WebResourceCollection() {}
   
   public WebResourceCollection(String name) {
      this.name = name;
   }
   
   public WebResourceCollection(String name, String[] urlPatterns, HttpMethodType... httpMethods)
   {
      this.name = name;
      for (String p : urlPatterns) {
         getUrlPatterns().add(p);
      }
      for (HttpMethodType m : httpMethods) {
         getHttpMethods().add(m);
      }
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String webResourceName)
   {
      this.name = webResourceName;
   }
   
   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null)
      {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }

   public List<String> getUrlPatterns()
   {
      if (urlPatterns == null) {
         urlPatterns = new ArrayList<String>();
      }
      return urlPatterns;
   }

   public List<HttpMethodType> getHttpMethods()
   {
      if (httpMethods == null) {
         httpMethods = new ArrayList<HttpMethodType>();
         httpMethodOmissions = null;
      }
      return httpMethods;
   }
   
   public List<HttpMethodType> getHttpMethodOmissions()
   {
      if (httpMethodOmissions == null) {
         httpMethodOmissions = new ArrayList<HttpMethodType>();
         httpMethods = null;
      }
      return httpMethodOmissions;
   }

}
