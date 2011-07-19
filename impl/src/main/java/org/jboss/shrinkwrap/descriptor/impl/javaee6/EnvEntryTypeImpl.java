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
package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> env-entryType </code> xsd type 
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
public class EnvEntryTypeImpl<T> implements Child<T>, EnvEntryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EnvEntryTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EnvEntryTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lookup-name</code> element with the given value will be created.
    * Otherwise, the existing <code>lookup-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setLookupName(String lookupName)
   {
      childNode.getOrCreate("lookup-name").text(lookupName);
      return this;
   }

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeLookupName()
   {
      childNode.remove("lookup-name");
      return this;
   }

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName()
   {
      return childNode.textValue("lookup-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<EnvEntryType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EnvEntryType<T>>> list = new ArrayList<InjectionTargetType<EnvEntryType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<EnvEntryType<T>> type = new InjectionTargetTypeImpl<EnvEntryType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-name</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-name</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryName(String envEntryName)
   {
      childNode.getOrCreate("env-entry-name").text(envEntryName);
      return this;
   }

   /**
    * Removes the <code>env-entry-name</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryName()
   {
      childNode.remove("env-entry-name");
      return this;
   }

   /**
    * Returns the <code>env-entry-name</code> element
    * @return the node defined for the element <code>env-entry-name</code> 
    */
   public String getEnvEntryName()
   {
      return childNode.textValue("env-entry-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-type</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-type</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryType(String envEntryType)
   {
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   /**
    * Removes the <code>env-entry-type</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryType()
   {
      childNode.remove("env-entry-type");
      return this;
   }

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the node defined for the element <code>env-entry-type</code> 
    */
   public String getEnvEntryType()
   {
      return childNode.textValue("env-entry-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry-value</code> element with the given value will be created.
    * Otherwise, the existing <code>env-entry-value</code> element will be updated with the given value.
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> setEnvEntryValue(String envEntryValue)
   {
      childNode.getOrCreate("env-entry-value").text(envEntryValue);
      return this;
   }

   /**
    * Removes the <code>env-entry-value</code> element 
    * @return the current instance of {@link EnvEntryType<T>} 
    */
   public EnvEntryType<T> removeEnvEntryValue()
   {
      childNode.remove("env-entry-value");
      return this;
   }

   /**
    * Returns the <code>env-entry-value</code> element
    * @return the node defined for the element <code>env-entry-value</code> 
    */
   public String getEnvEntryValue()
   {
      return childNode.textValue("env-entry-value");
   }

}
