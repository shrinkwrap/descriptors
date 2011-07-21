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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> env-entryType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The env-entryType is used to declare an application's <br> 
 * environment entry. The declaration consists of an optional <br> 
 * description, the name of the environment entry, a type <br> 
 * (optional if the value is injected, otherwise required), and <br> 
 * an optional value. <br> 
 *<br>
 * It also includes optional elements to define injection of <br> 
 * the named resource into fields or JavaBeans properties. <br> 
 *<br>
 * If a value is not specified and injection is requested, <br> 
 * no injection will occur and no entry of the specified name <br> 
 * will be created. This allows an initial value to be <br> 
 * specified in the source code without being incorrectly <br> 
 * changed when no override has been specified. <br> 
 *<br>
 * If a value is not specified and no injection is requested, <br> 
 * a value must be supplied during deployment. <br> 
 *<br>
 * This type is used by env-entry elements. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface EnvEntryType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lookup-name</code> element with the given value will be created.
    * Otherwise, the existing <code>lookup-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setLookupName(String lookupName);

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeLookupName();

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

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
   public EnvEntryType<T> setEnvEntryType(String envEntryType);

   /**
    * Removes the <code>env-entry-type</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryType();

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the node defined for the element <code>env-entry-type</code> 
    */
   public String getEnvEntryType();

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
