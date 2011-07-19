/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitCachingType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitValidationModeType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> persistence-unit </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class PersistenceUnitImpl<T> implements Child<T>, PersistenceUnit<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PersistenceUnitImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>description</code> element with the given value will be created.
    * Otherwise, the existing <code>description</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setDescription(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.textValue("description");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : provider
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>provider</code> element with the given value will be created.
    * Otherwise, the existing <code>provider</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setProvider(String provider)
   {
      childNode.getOrCreate("provider").text(provider);
      return this;
   }

   /**
    * Removes the <code>provider</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeProvider()
   {
      childNode.remove("provider");
      return this;
   }

   /**
    * Returns the <code>provider</code> element
    * @return the node defined for the element <code>provider</code> 
    */
   public String getProvider()
   {
      return childNode.textValue("provider");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jta-data-source</code> element with the given value will be created.
    * Otherwise, the existing <code>jta-data-source</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJtaDataSource(String jtaDataSource)
   {
      childNode.getOrCreate("jta-data-source").text(jtaDataSource);
      return this;
   }

   /**
    * Removes the <code>jta-data-source</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeJtaDataSource()
   {
      childNode.remove("jta-data-source");
      return this;
   }

   /**
    * Returns the <code>jta-data-source</code> element
    * @return the node defined for the element <code>jta-data-source</code> 
    */
   public String getJtaDataSource()
   {
      return childNode.textValue("jta-data-source");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : non-jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>non-jta-data-source</code> element with the given value will be created.
    * Otherwise, the existing <code>non-jta-data-source</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setNonJtaDataSource(String nonJtaDataSource)
   {
      childNode.getOrCreate("non-jta-data-source").text(nonJtaDataSource);
      return this;
   }

   /**
    * Removes the <code>non-jta-data-source</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeNonJtaDataSource()
   {
      childNode.remove("non-jta-data-source");
      return this;
   }

   /**
    * Returns the <code>non-jta-data-source</code> element
    * @return the node defined for the element <code>non-jta-data-source</code> 
    */
   public String getNonJtaDataSource()
   {
      return childNode.textValue("non-jta-data-source");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapping-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>mapping-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setMappingFile(String mappingFile)
   {
      childNode.create("mapping-file").text(mappingFile);
      return this;
   }

   /**
    * Creates for all String objects representing <code>mapping-file</code> elements, 
    * a new <code>mapping-file</code> element 
    * @param list of <code>mapping-file</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setMappingFileList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setMappingFile(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>mapping-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllMappingFile()
   {
      childNode.remove("mapping-file");
      return this;
   }

   /**
    * Returns all <code>mapping-file</code> elements
    * @return list of <code>mapping-file</code> 
    */
   public List<String> getMappingFileList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("mapping-file");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jar-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>jar-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJarFile(String jarFile)
   {
      childNode.create("jar-file").text(jarFile);
      return this;
   }

   /**
    * Creates for all String objects representing <code>jar-file</code> elements, 
    * a new <code>jar-file</code> element 
    * @param list of <code>jar-file</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJarFileList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setJarFile(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>jar-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllJarFile()
   {
      childNode.remove("jar-file");
      return this;
   }

   /**
    * Returns all <code>jar-file</code> elements
    * @return list of <code>jar-file</code> 
    */
   public List<String> getJarFileList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("jar-file");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>class</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setClazz(String clazz)
   {
      childNode.create("class").text(clazz);
      return this;
   }

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param list of <code>class</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setClazzList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setClazz(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllClazz()
   {
      childNode.remove("class");
      return this;
   }

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
   public List<String> getClazzList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("class");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-unlisted-classes
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-unlisted-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-unlisted-classes</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setExcludeUnlistedClasses(Boolean excludeUnlistedClasses)
   {
      childNode.getOrCreate("exclude-unlisted-classes").text(excludeUnlistedClasses);
      return this;
   }

   /**
    * Removes the <code>exclude-unlisted-classes</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeExcludeUnlistedClasses()
   {
      childNode.remove("exclude-unlisted-classes");
      return this;
   }

   /**
    * Returns the <code>exclude-unlisted-classes</code> element
    * @return the node defined for the element <code>exclude-unlisted-classes</code> 
    */
   public Boolean isExcludeUnlistedClasses()
   {
      return Strings.isTrue(childNode.textValue("exclude-unlisted-classes"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : shared-cache-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>shared-cache-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>shared-cache-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setSharedCacheMode(PersistenceUnitCachingType sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }

   /**
    * If not already created, a new <code>shared-cache-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>shared-cache-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setSharedCacheMode(String sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the node defined for the element <code>shared-cache-mode</code> 
    */
   public PersistenceUnitCachingType getSharedCacheMode()
   {
      return PersistenceUnitCachingType.getFromStringValue(childNode.textValue("shared-cache-mode"));
   }

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the node defined for the element <code>shared-cache-mode</code> 
    */
   public String getSharedCacheModeAsString()
   {
      return childNode.textValue("shared-cache-mode");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : validation-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>validation-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setValidationMode(PersistenceUnitValidationModeType validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }

   /**
    * If not already created, a new <code>validation-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>validation-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setValidationMode(String validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }

   /**
    * Returns the <code>validation-mode</code> element
    * @return the node defined for the element <code>validation-mode</code> 
    */
   public PersistenceUnitValidationModeType getValidationMode()
   {
      return PersistenceUnitValidationModeType.getFromStringValue(childNode.textValue("validation-mode"));
   }

   /**
    * Returns the <code>validation-mode</code> element
    * @return the node defined for the element <code>validation-mode</code> 
    */
   public String getValidationModeAsString()
   {
      return childNode.textValue("validation-mode");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : properties
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeProperties()
   {
      childNode.remove("properties");
      return this;
   }

   /**
    * If not already created, a new <code>properties</code> element will be created and returned.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return the node defined for the element <code>properties</code> 
    */
   public Properties<PersistenceUnit<T>> properties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<PersistenceUnit<T>> properties = new PropertiesImpl<PersistenceUnit<T>>(this, "properties", childNode,
            node);
      return properties;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setName(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeName()
   {
      childNode.attributes().remove("name");
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.attributes().get("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setTransactionType(PersistenceUnitTransactionType transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setTransactionType(String transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeTransactionType()
   {
      childNode.attributes().remove("transaction-type");
      return this;
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public PersistenceUnitTransactionType getTransactionType()
   {
      return PersistenceUnitTransactionType.getFromStringValue(childNode.attribute("transaction-type"));
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public String getTransactionTypeAsString()
   {
      return childNode.attribute("transaction-type");
   }

}
