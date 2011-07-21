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
package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryTypeValuesType;

/**
 * This interface defines the contract for the <code> env-entryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setJndiName(String jndiName);

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeJndiName();

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EnvEntryType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList();

   public EnvEntryType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-name</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryName(String envEntryName);

   /**
    * Removes the <code>env-entry-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryName();

   /**
    * Returns the <code>env-entry-name</code> element
    * @return the node defined for the element <code>env-entry-name</code> 
    */
   public String getEnvEntryName();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-type</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-type</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryType(EnvEntryTypeValuesType envEntryType);

   /**
    * If not already created, a new <code>env-entry-type</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-type</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the node defined for the element <code>env-entry-type</code> 
    */
   public EnvEntryTypeValuesType getEnvEntryType();

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the node defined for the element <code>env-entry-type</code> 
    */
   public String getEnvEntryTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-value</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-value</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);

   /**
    * Removes the <code>env-entry-value</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryValue();

   /**
    * Returns the <code>env-entry-value</code> element
    * @return the node defined for the element <code>env-entry-value</code> 
    */
   public String getEnvEntryValue();

}
