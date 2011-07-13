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
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> persistence-unit-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
 * The persistence-unit-ref element contains a declaration <br> 
 * of Deployment Component's reference to a persistence unit <br> 
 * associated within a Deployment Component's <br> 
 * environment. It consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the persistence unit reference name <br> 
 * - an optional persistence unit name. If not specified, <br> 
 * the default persistence unit is assumed. <br> 
 * - optional injection targets <br> 
 *<br>
 * Examples: <br> 
 *<br>
 * <persistence-unit-ref> <br> 
 * <persistence-unit-ref-name>myPersistenceUnit <br> 
 * </persistence-unit-ref-name> <br> 
 * </persistence-unit-ref> <br> 
 *<br>
 * <persistence-unit-ref> <br> 
 * <persistence-unit-ref-name>myPersistenceUnit <br> 
 * </persistence-unit-ref-name> <br> 
 * <persistence-unit-name>PersistenceUnit1 <br> 
 * </persistence-unit-name> <br> 
 * </persistence-unit-ref> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class PersistenceUnitRefTypeImpl<T> implements Child<T>, PersistenceUnitRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PersistenceUnitRefTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeMappedName()
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
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceUnitRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<PersistenceUnitRefType<T>>> list = new ArrayList<InjectionTargetType<PersistenceUnitRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<PersistenceUnitRefType<T>> type = new InjectionTargetTypeImpl<PersistenceUnitRefType<T>>(
               this, "injection-target", childNode, node);
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
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removeAllDescription()
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
   // Element type : persistence-unit-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setPersistenceUnitRefName(String persistenceUnitRefName)
   {
      childNode.getOrCreate("persistence-unit-ref-name").text(persistenceUnitRefName);
      return this;
   }

   /**
    * Removes the <code>persistence-unit-ref-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitRefName()
   {
      childNode.remove("persistence-unit-ref-name");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref-name</code> element
    * @return the node defined for the element <code>persistence-unit-ref-name</code> 
    */
   public String getPersistenceUnitRefName()
   {
      return childNode.textValue("persistence-unit-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> setPersistenceUnitName(String persistenceUnitName)
   {
      childNode.getOrCreate("persistence-unit-name").text(persistenceUnitName);
      return this;
   }

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of {@link PersistenceUnitRefType<T>} 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitName()
   {
      childNode.remove("persistence-unit-name");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName()
   {
      return childNode.textValue("persistence-unit-name");
   }

}
