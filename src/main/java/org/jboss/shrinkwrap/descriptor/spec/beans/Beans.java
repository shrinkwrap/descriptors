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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;

/**
 * CDI bean descriptor
 * 
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "interceptors",
      "decorators",
      "alternatives",
      "extensions" })
@XmlRootElement(name = "beans")
public class Beans
{
   @XmlAnyElement(lax = true)
   protected List<Object> extensions;

   @XmlElementWrapper
   @XmlElement(name = "class")
   protected List<String> interceptors;

   @XmlElementWrapper
   @XmlElement(name = "class")
   protected List<String> decorators;

   protected Alternatives alternatives;

   public static String getNamespace()
   {
      return Beans.class.getPackage().getAnnotation(XmlSchema.class).namespace();
   }

   public List<Object> getExtensions()
   {
      if (extensions == null)
      {
         extensions = new ArrayList<Object>();
      }
      return this.extensions;
   }

   public List<String> getInterceptors()
   {
      if (interceptors == null)
      {
         interceptors = new ArrayList<String>();
      }
      return this.interceptors;
   }

   public List<String> getDecorators()
   {
      if (decorators == null)
      {
         decorators = new ArrayList<String>();
      }
      return this.decorators;
   }

   public Alternatives getAlternatives()
   {
      if (alternatives == null)
      {
         alternatives = new Alternatives();
      }
      return this.alternatives;
   }

   public String getSchemaLocation()
   {
      String namespace = Beans.getNamespace();
      return new StringBuilder().append(namespace).append(" ").append(namespace).append("/beans_1_0.xsd").toString();
   }
}
