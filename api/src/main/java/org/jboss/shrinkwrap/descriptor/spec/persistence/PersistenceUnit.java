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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration of a JPA persistence unit
 *
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
      "description",
      "provider",
      "jtaDataSource",
      "nonJtaDataSource",
      "mappingFiles",
      "jarFiles",
      "classes",
      "excludeUnlistedClasses",
      "sharedCacheMode",
      "validationMode",
      "properties" })
public class PersistenceUnit
{
   protected String description;

   protected String provider;

   @XmlElement(name = "jta-data-source")
   protected String jtaDataSource;

   @XmlElement(name = "non-jta-data-source")
   protected String nonJtaDataSource;

   @XmlElement(name = "mapping-file")
   protected List<String> mappingFiles;

   @XmlElement(name = "jar-file")
   protected List<String> jarFiles;

   @XmlElement(name = "class")
   protected List<String> classes;

   @XmlElement(name = "exclude-unlisted-classes", defaultValue = "true")
   protected Boolean excludeUnlistedClasses;

   @XmlElement(name = "shared-cache-mode")
   protected SharedCacheModeType sharedCacheMode;

   @XmlElement(name = "validation-mode")
   protected ValidationModeType validationMode;

   @XmlElementWrapper
   @XmlElement(name = "property")
   protected List<Property> properties;
   
   @XmlAttribute(name = "transaction-type")
   protected TransactionType transactionType;

   @XmlAttribute(required = true)
   protected String name;

   /**
    * Gets the value of the description property.
    */
   public String getDescription()
   {
      return description;
   }

   /**
    * Sets the value of the description property.
    */
   public void setDescription(String value)
   {
      this.description = value;
   }

   /**
    * Gets the value of the provider property.
    */
   public String getProvider()
   {
      return provider;
   }

   /**
    * Sets the value of the provider property.
    */
   public void setProvider(String value)
   {
      this.provider = value;
   }

   /**
    * Gets the value of the jtaDataSource property.
    */
   public String getJtaDataSource()
   {
      return jtaDataSource;
   }

   /**
    * Sets the value of the jtaDataSource property.
    */
   public void setJtaDataSource(String value)
   {
      this.jtaDataSource = value;
   }

   /**
    * Gets the value of the nonJtaDataSource property.
    */
   public String getNonJtaDataSource()
   {
      return nonJtaDataSource;
   }

   /**
    * Sets the value of the nonJtaDataSource property.
    */
   public void setNonJtaDataSource(String value)
   {
      this.nonJtaDataSource = value;
   }

   /**
    * Gets the value of the mappingFile property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot.
    * Therefore any modification you make to the returned list will be present
    * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
    * for the mappingFile property.
    * </p>
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getMappingFile().add(newItem);
    * </pre>
    * 
    * </p>
    */
   public List<String> getMappingFiles()
   {
      if (mappingFiles == null)
      {
         mappingFiles = new ArrayList<String>();
      }
      return this.mappingFiles;
   }

   /**
    * Gets the value of the jarFile property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot.
    * Therefore any modification you make to the returned list will be present
    * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
    * for the jarFile property.
    * </p>
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getJarFile().add(newItem);
    * </pre>
    */
   public List<String> getJarFiles()
   {
      if (jarFiles == null)
      {
         jarFiles = new ArrayList<String>();
      }
      return this.jarFiles;
   }

   /**
    * Gets the value of the clazz property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot.
    * Therefore any modification you make to the returned list will be present
    * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
    * for the clazz property.
    * </p>
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getClazz().add(newItem);
    * </pre>
    * 
    * </p>
    */
   public List<String> getClasses()
   {
      if (classes == null)
      {
         classes = new ArrayList<String>();
      }
      return this.classes;
   }

   /**
    * Gets the value of the excludeUnlistedClasses property.
    */
   public Boolean isExcludeUnlistedClasses()
   {
      return excludeUnlistedClasses;
   }

   /**
    * Sets the value of the excludeUnlistedClasses property.
    */
   public void setExcludeUnlistedClasses(Boolean value)
   {
      this.excludeUnlistedClasses = value;
   }

   /**
    * Gets the value of the sharedCacheMode property.
    */
   public SharedCacheModeType getSharedCacheMode()
   {
      return sharedCacheMode;
   }

   /**
    * Sets the value of the sharedCacheMode property.
    */
   public void setSharedCacheMode(SharedCacheModeType value)
   {
      this.sharedCacheMode = value;
   }

   /**
    * Gets the value of the validationMode property.
    */
   public ValidationModeType getValidationMode()
   {
      return validationMode;
   }

   /**
    * Sets the value of the validationMode property.
    */
   public void setValidationMode(ValidationModeType value)
   {
      this.validationMode = value;
   }

   /**
    * Gets the value of the properties property.
    * 
    * <p>
    * This accessor method returns a reference to the live list, not a snapshot.
    * Therefore any modification you make to the returned list will be present
    * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
    * for the property property.
    * </p>
    * 
    * <p>
    * For example, to add a new item, do as follows:
    * 
    * <pre>
    * getProperties().add(newItem);
    * </pre>
    * 
    * </p
    * .
    */
   public List<Property> getProperties()
   {
      if (properties == null)
      {
         this.properties = new ArrayList<Property>();
      }
      return properties;
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
    * Gets the value of the transactionType property.
    */
   public TransactionType getTransactionType()
   {
      return transactionType;
   }

   /**
    * Sets the value of the transactionType property.
    */
   public void setTransactionType(TransactionType value)
   {
      this.transactionType = value;
   }
}
