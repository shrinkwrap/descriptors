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
package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> persistence-unit </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface PersistenceUnit<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>description</code> element with the given value will be created.
    * Otherwise, the existing <code>description</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setDescription(String description);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeDescription();

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   // -------------------------------------------------------------------------------------||
   // Element type : provider
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>provider</code> element with the given value will be created.
    * Otherwise, the existing <code>provider</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setProvider(String provider);

   /**
    * Removes the <code>provider</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeProvider();

   /**
    * Returns the <code>provider</code> element
    * @return the node defined for the element <code>provider</code> 
    */
   public String getProvider();

   // -------------------------------------------------------------------------------------||
   // Element type : jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jta-data-source</code> element with the given value will be created.
    * Otherwise, the existing <code>jta-data-source</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJtaDataSource(String jtaDataSource);

   /**
    * Removes the <code>jta-data-source</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeJtaDataSource();

   /**
    * Returns the <code>jta-data-source</code> element
    * @return the node defined for the element <code>jta-data-source</code> 
    */
   public String getJtaDataSource();

   // -------------------------------------------------------------------------------------||
   // Element type : non-jta-data-source
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>non-jta-data-source</code> element with the given value will be created.
    * Otherwise, the existing <code>non-jta-data-source</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setNonJtaDataSource(String nonJtaDataSource);

   /**
    * Removes the <code>non-jta-data-source</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeNonJtaDataSource();

   /**
    * Returns the <code>non-jta-data-source</code> element
    * @return the node defined for the element <code>non-jta-data-source</code> 
    */
   public String getNonJtaDataSource();

   // -------------------------------------------------------------------------------------||
   // Element type : mapping-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>mapping-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setMappingFile(String mappingFile);

   /**
    * Creates for all String objects representing <code>mapping-file</code> elements, 
    * a new <code>mapping-file</code> element 
    * @param list of <code>mapping-file</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setMappingFileList(String... values);

   /**
    * Removes the <code>mapping-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllMappingFile();

   /**
    * Returns all <code>mapping-file</code> elements
    * @return list of <code>mapping-file</code> 
    */
   public List<String> getMappingFileList();

   // -------------------------------------------------------------------------------------||
   // Element type : jar-file
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>jar-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJarFile(String jarFile);

   /**
    * Creates for all String objects representing <code>jar-file</code> elements, 
    * a new <code>jar-file</code> element 
    * @param list of <code>jar-file</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setJarFileList(String... values);

   /**
    * Removes the <code>jar-file</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllJarFile();

   /**
    * Returns all <code>jar-file</code> elements
    * @return list of <code>jar-file</code> 
    */
   public List<String> getJarFileList();

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>class</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setClazz(String clazz);

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param list of <code>class</code> objects 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setClazzList(String... values);

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeAllClazz();

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
   public List<String> getClazzList();

   // -------------------------------------------------------------------------------------||
   // Element type : exclude-unlisted-classes
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-unlisted-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-unlisted-classes</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setExcludeUnlistedClasses(Boolean excludeUnlistedClasses);

   /**
    * Removes the <code>exclude-unlisted-classes</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeExcludeUnlistedClasses();

   /**
    * Returns the <code>exclude-unlisted-classes</code> element
    * @return the node defined for the element <code>exclude-unlisted-classes</code> 
    */
   public Boolean isExcludeUnlistedClasses();

   // -------------------------------------------------------------------------------------||
   // Element type : shared-cache-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>shared-cache-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>shared-cache-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setSharedCacheMode(PersistenceUnitCachingType sharedCacheMode);

   /**
    * If not already created, a new <code>shared-cache-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>shared-cache-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setSharedCacheMode(String sharedCacheMode);

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the node defined for the element <code>shared-cache-mode</code> 
    */
   public PersistenceUnitCachingType getSharedCacheMode();

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the node defined for the element <code>shared-cache-mode</code> 
    */
   public String getSharedCacheModeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : validation-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>validation-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setValidationMode(PersistenceUnitValidationModeType validationMode);

   /**
    * If not already created, a new <code>validation-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>validation-mode</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setValidationMode(String validationMode);

   /**
    * Returns the <code>validation-mode</code> element
    * @return the node defined for the element <code>validation-mode</code> 
    */
   public PersistenceUnitValidationModeType getValidationMode();

   /**
    * Returns the <code>validation-mode</code> element
    * @return the node defined for the element <code>validation-mode</code> 
    */
   public String getValidationModeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : properties
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeProperties();

   /**
    * If not already created, a new <code>properties</code> element will be created and returned.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return the node defined for the element <code>properties</code> 
    */
   public Properties<PersistenceUnit<T>> properties();

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setName(String name);

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeName();

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setTransactionType(PersistenceUnitTransactionType transactionType);

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> setTransactionType(String transactionType);

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of {@link PersistenceUnit<T>} 
    */
   public PersistenceUnit<T> removeTransactionType();

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public PersistenceUnitTransactionType getTransactionType();

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public String getTransactionTypeAsString();

}
