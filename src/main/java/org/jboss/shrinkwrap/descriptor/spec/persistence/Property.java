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
package org.jboss.shrinkwrap.descriptor.spec.persistence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * A persistence unit property
 *
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Property
{
   @XmlAttribute(required = true)
   protected String value;
   
   @XmlAttribute(required = true)
   protected String name;

   public Property()
   {
   }
   
   public Property(String name, String value)
   {
      this.name = name;
      this.value = value;
   }

   /**
    * Gets the value of the name property.
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the value property.
    */
   public String getValue()
   {
      return value;
   }

   /**
    * Sets the value of the value property.
    */
   public void setValue(String value)
   {
      this.value = value;
   }
}
