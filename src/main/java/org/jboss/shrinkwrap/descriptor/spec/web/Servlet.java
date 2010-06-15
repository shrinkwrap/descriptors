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
// TODO finish me
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servletType", propOrder = {
      "name",
      "clazz",
      "initParams",
      "loadOnStartup"
})
public class Servlet extends AbstractServletArtifact
{
   @XmlElement(name = "servlet-name", required = true)
   protected String name;
   
   @XmlElement(name = "servlet-class")
   protected String clazz;
   
   @XmlElement(name = "init-param")
   protected List<Param> initParams;
   
   @XmlElement(name = "load-on-startup")
   protected Integer loadOnStartup;

   public Servlet() {}
   
   public Servlet(String name, String clazz)
   {
      this(name, clazz, null);
   }
   
   public Servlet(String name, String clazz, Integer loadOnStartup)
   {
      this.name = name;
      this.clazz = clazz;
      this.loadOnStartup = loadOnStartup;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getClazz()
   {
      return clazz;
   }

   public void setClazz(String clazz)
   {
      this.clazz = clazz;
   }
   
   public List<Param> getInitParams()
   {
      if (initParams == null)
      {
         initParams = new ArrayList<Param>();
      }
      
      return initParams;
   }

   public Integer getLoadOnStartup()
   {
      return loadOnStartup;
   }

   public void setLoadOnStartup(Integer loadOnStartup)
   {
      this.loadOnStartup = loadOnStartup;
   }
}
