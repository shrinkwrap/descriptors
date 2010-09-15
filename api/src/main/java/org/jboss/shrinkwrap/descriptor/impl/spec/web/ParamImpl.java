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

import org.jboss.shrinkwrap.descriptor.api.spec.web.LocalizedText;
import org.jboss.shrinkwrap.descriptor.api.spec.web.Param;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "param-valueType", propOrder = {
      "descriptions",
      "name",
      "value"
})
public class ParamImpl implements Param
{
   @XmlElement(name = "description", type = LocalizedTextImpl.class)
   protected List<LocalizedText> descriptions;
   
   @XmlElement(name = "param-name", required = true)
   protected String name;
   
   @XmlElement(name = "param-value", required = true)
   protected String value;

   public ParamImpl() {}
   
   public ParamImpl(String name, String value)
   {
      this.name = name;
      this.value = value;
   }
   
   @Override
   public List<LocalizedText> getDescriptions()
   {
      if (descriptions == null)
      {
         descriptions = new ArrayList<LocalizedText>();
      }
      return descriptions;
   }
   
   @Override
   public String getName()
   {
      return name;
   }
   
   @Override
   public void setName(String name)
   {
      this.name = name;
   }

   @Override
   public String getValue()
   {
      return value;
   }

   @Override
   public void setValue(String value)
   {
      this.value = value;
   }
}
