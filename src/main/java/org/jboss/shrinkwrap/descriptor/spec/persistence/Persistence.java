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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Represents a JPA deployment descriptor
 *
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = "persistenceUnits")
@XmlRootElement(name = "persistence")
public class Persistence
{
   @XmlElement(name = "persistence-unit", required = true)
   protected List<PersistenceUnit> persistenceUnits;

   @XmlAttribute(required = true)
   @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
   protected String version;

   public static String getNamespace()
   {
      return Persistence.class.getPackage().getAnnotation(XmlSchema.class).namespace();
   }
   
   /**
    * Gets the value of the persistenceUnit property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot.
    * Therefore any modification you make to the returned list will be present
    * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
    * for the persistenceUnit property.
    * </p>
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getPersistenceUnit().add(newItem);
    * </pre>
    * 
    * </p>
    */
   public List<PersistenceUnit> getPersistenceUnits()
   {
      if (persistenceUnits == null)
      {
         persistenceUnits = new ArrayList<PersistenceUnit>();
      }
      return this.persistenceUnits;
   }

   /**
    * Gets the value of the version property.
    */
   public String getVersion()
   {
      if (version == null)
      {
         return "2.0";
      }
      else
      {
         return version;
      }
   }

   /**
    * Sets the value of the version property.
    */
   public void setVersion(String value)
   {
      this.version = value;
   }

   public String getSchemaLocation()
   {
      String namespace = Persistence.getNamespace();
      return new StringBuilder().append(namespace)
            .append(" ")
            .append(namespace)
            .append("/persistence_")
            .append(getVersion().replace('.', '_'))
            .append(".xsd").toString();
   }
}
