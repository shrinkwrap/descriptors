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
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ExtensionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ConfigPropertyTypeImpl;

/**
 * This class implements the <code> extensionType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class ExtensionTypeImpl<T> implements Child<T>, ExtensionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExtensionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExtensionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element with the given value will be created.
    * Otherwise, the existing <code>config-property</code> element will be returned.
    * @return  a new or existing instance of <code>ConfigPropertyType<ExtensionType<T>></code> 
    */
   public ConfigPropertyType<ExtensionType<T>> getOrCreateConfigProperty()
   {
      Node node = childNode.getOrCreate("config-property");
      ConfigPropertyType<ExtensionType<T>> configProperty = new ConfigPropertyTypeImpl<ExtensionType<T>>(this, "config-property", childNode, node);
      return configProperty;
   }

   /**
    * Removes the <code>config-property</code> element 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensionType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> className(String className)
   {
      childNode.attribute("class-name", className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> attribute
    * @return the value defined for the attribute <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.getAttribute("class-name");
   }

   /**
    * Removes the <code>class-name</code> attribute 
    * @return the current instance of <code>ExtensionType<T></code> 
    */
   public ExtensionType<T> removeClassName()
   {
      childNode.removeAttribute("class-name");
      return this;
   }
}
