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
package org.jboss.shrinkwrap.descriptor.impl.ironjacamar10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConfigPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> config-propertyType </code> xsd type 
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
public class ConfigPropertyTypeImpl<T> implements Child<T>, ConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:token ElementType : config-propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-propertyType</code> element
    * @param configPropertyType the value for the element <code>config-propertyType</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(String configPropertyType)
   {
      childNode.getOrCreate("config-propertyType").text(configPropertyType);
      return this;
   }

   /**
    * Returns the <code>config-propertyType</code> element
    * @return the node defined for the element <code>config-propertyType</code> 
    */
   public String getConfigPropertyType()
   {
      return childNode.getTextValueForPatternName("config-propertyType");
   }

   /**
    * Removes the <code>config-propertyType</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyType()
   {
      childNode.removeChildren("config-propertyType");
      return this;
   }
}
