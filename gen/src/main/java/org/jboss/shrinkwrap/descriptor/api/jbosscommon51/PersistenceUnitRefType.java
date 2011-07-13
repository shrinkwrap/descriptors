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

/**
 * This interface defines the contract for the <code> persistence-unit-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setJndiName(String jndiName);

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeJndiName();

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
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeMappedName();

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
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList();

   public PersistenceUnitRefType<T> ignoreDependency();

   public Boolean isIgnoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName);

   /**
    * Removes the <code>persistence-unit-ref-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitRefName();

   /**
    * Returns the <code>persistence-unit-ref-name</code> element
    * @return the node defined for the element <code>persistence-unit-ref-name</code> 
    */
   public String getPersistenceUnitRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName);

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitName();

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName();

}
