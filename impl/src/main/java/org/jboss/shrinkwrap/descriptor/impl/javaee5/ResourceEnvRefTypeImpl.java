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
package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> resource-env-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * The resource-env-refType is used to define <br> 
 * resource-env-type elements. It contains a declaration of a <br> 
 * Deployment Component's reference to an administered object <br> 
 * associated with a resource in the Deployment Component's <br> 
 * environment. It consists of an optional description, the <br> 
 * resource environment reference name, and an optional <br> 
 * indication of the resource environment reference type <br> 
 * expected by the Deployment Component code. <br> 
 *<br>
 * It also includes optional elements to define injection of <br> 
 * the named resource into fields or JavaBeans properties. <br> 
 *<br>
 * The resource environment type must be supplied unless an <br> 
 * injection target is specified, in which case the type <br> 
 * of the target is used. If both are specified, the type <br> 
 * must be assignment compatible with the type of the injection <br> 
 * target. <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <resource-env-ref> <br> 
 * <resource-env-ref-name>jms/StockQueue <br> 
 * </resource-env-ref-name> <br> 
 * <resource-env-ref-type>javax.jms.Queue <br> 
 * </resource-env-ref-type> <br> 
 * </resource-env-ref> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ResourceEnvRefTypeImpl<T> implements Child<T>, ResourceEnvRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ResourceEnvRefTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> removeMappedName()
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
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ResourceEnvRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ResourceEnvRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<ResourceEnvRefType<T>>> list = new ArrayList<InjectionTargetType<ResourceEnvRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<ResourceEnvRefType<T>> type = new InjectionTargetTypeImpl<ResourceEnvRefType<T>>(this,
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
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> removeAllDescription()
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
   // Element type : resource-env-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-env-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> setResourceEnvRefName(String resourceEnvRefName)
   {
      childNode.getOrCreate("resource-env-ref-name").text(resourceEnvRefName);
      return this;
   }

   /**
    * Removes the <code>resource-env-ref-name</code> element 
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefName()
   {
      childNode.remove("resource-env-ref-name");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref-name</code> element
    * @return the node defined for the element <code>resource-env-ref-name</code> 
    */
   public String getResourceEnvRefName()
   {
      return childNode.textValue("resource-env-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref-type</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-env-ref-type</code> element will be updated with the given value.
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> setResourceEnvRefType(String resourceEnvRefType)
   {
      childNode.getOrCreate("resource-env-ref-type").text(resourceEnvRefType);
      return this;
   }

   /**
    * Removes the <code>resource-env-ref-type</code> element 
    * @return the current instance of {@link ResourceEnvRefType<T>} 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefType()
   {
      childNode.remove("resource-env-ref-type");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref-type</code> element
    * @return the node defined for the element <code>resource-env-ref-type</code> 
    */
   public String getResourceEnvRefType()
   {
      return childNode.textValue("resource-env-ref-type");
   }

}
