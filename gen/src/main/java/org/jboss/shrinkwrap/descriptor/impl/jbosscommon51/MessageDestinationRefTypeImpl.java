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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationUsageType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> message-destination-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MessageDestinationRefTypeImpl<T> implements Child<T>, MessageDestinationRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDestinationRefTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MessageDestinationRefTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeJndiName()
   {
      childNode.remove("jndi-name");
      return this;
   }

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName()
   {
      return childNode.textValue("jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMappedName()
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
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(this, "injection-target", childNode);
   }

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<MessageDestinationRefType<T>>> list = new ArrayList<InjectionTargetType<MessageDestinationRefType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<MessageDestinationRefType<T>> type = new InjectionTargetTypeImpl<MessageDestinationRefType<T>>(
               this, "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MessageDestinationRefType<T> ignoreDependency()
   {
      childNode.getOrCreate("ignore-dependency");
      return this;
   }

   public Boolean isIgnoreDependency()
   {
      return childNode.getSingle("ignore-dependency") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeAllDescription()
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
   // Element type : message-destination-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName)
   {
      childNode.getOrCreate("message-destination-ref-name").text(messageDestinationRefName);
      return this;
   }

   /**
    * Removes the <code>message-destination-ref-name</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationRefName()
   {
      childNode.remove("message-destination-ref-name");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref-name</code> element
    * @return the node defined for the element <code>message-destination-ref-name</code> 
    */
   public String getMessageDestinationRefName()
   {
      return childNode.textValue("message-destination-ref-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationType()
   {
      childNode.remove("message-destination-type");
      return this;
   }

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType()
   {
      return childNode.textValue("message-destination-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-usage
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-usage</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-usage</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage)
   {
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   /**
    * If not already created, a new <code>message-destination-usage</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-usage</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage)
   {
      childNode.getOrCreate("message-destination-usage").text(messageDestinationUsage);
      return this;
   }

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the node defined for the element <code>message-destination-usage</code> 
    */
   public MessageDestinationUsageType getMessageDestinationUsage()
   {
      return MessageDestinationUsageType.getFromStringValue(childNode.textValue("message-destination-usage"));
   }

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the node defined for the element <code>message-destination-usage</code> 
    */
   public String getMessageDestinationUsageAsString()
   {
      return childNode.textValue("message-destination-usage");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-link</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-link</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationLink()
   {
      childNode.remove("message-destination-link");
      return this;
   }

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink()
   {
      return childNode.textValue("message-destination-link");
   }

}
