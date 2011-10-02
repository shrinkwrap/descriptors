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
package org.jboss.shrinkwrap.descriptor.api.ironjacamar10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConfigPropertyType;
/**
 * This interface defines the contract for the <code> admin-objectType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface AdminObjectType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> className(String className);

   /**
    * Returns the <code>class-name</code> attribute
    * @return the value defined for the attribute <code>class-name</code> 
    */
public String getClassName();

   /**
    * Removes the <code>class-name</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeClassName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> jndiName(String jndiName);

   /**
    * Returns the <code>jndi-name</code> attribute
    * @return the value defined for the attribute <code>jndi-name</code> 
    */
public String getJndiName();

   /**
    * Removes the <code>jndi-name</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeJndiName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeEnabled();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> useJavaContext(Boolean useJavaContext);

   /**
    * Returns the <code>use-java-context</code> attribute
    * @return the value defined for the attribute <code>use-java-context</code> 
    */
public Boolean isUseJavaContext();

   /**
    * Removes the <code>use-java-context</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removeUseJavaContext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> poolName(String poolName);

   /**
    * Returns the <code>pool-name</code> attribute
    * @return the value defined for the attribute <code>pool-name</code> 
    */
public String getPoolName();

   /**
    * Removes the <code>pool-name</code> attribute 
    * @return the current instance of <code>AdminObjectType<T></code> 
    */
   public AdminObjectType<T> removePoolName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<AdminObjectType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<AdminObjectType<T>></code> 
    */
   public ConfigPropertyType<AdminObjectType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<AdminObjectType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<AdminObjectType<T>></code> 
    */
   public AdminObjectType<T> removeAllConfigProperty();
}
