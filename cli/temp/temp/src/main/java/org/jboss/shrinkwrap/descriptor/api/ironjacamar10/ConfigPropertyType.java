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
/**
 * This interface defines the contract for the <code> config-propertyType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
 * Specifies an override for a config-property element in ra.xml or a @ConfigProperty <br> 
 *<br>
 *<br>
 *
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface ConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : config-propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-propertyType</code> element
    * @param configPropertyType the value for the element <code>config-propertyType</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(String configPropertyType);

   /**
    * Returns the <code>config-propertyType</code> element
    * @return the node defined for the element <code>config-propertyType</code> 
    */
   public String getConfigPropertyType();

   /**
    * Removes the <code>config-propertyType</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyType();
}
