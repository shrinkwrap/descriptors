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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> consumer-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The consumer element holds all of the information specific about a <br> 
 * consumer bean which is a JBoss proprietary extension to EJB3 for sending JMS messages via <br> 
 * standard Java interfaces. Used in: enterprise-beans <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ConsumerBeanTypeImpl<T> implements Child<T>, ConsumerBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConsumerBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ConsumerBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ConsumerBeanType<T>> icon()
   {
      return new IconTypeImpl<ConsumerBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConsumerBeanType<T>>> getIconList()
   {
      List<IconType<ConsumerBeanType<T>>> list = new ArrayList<IconType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ConsumerBeanType<T>> type = new IconTypeImpl<ConsumerBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeEjbClass()
   {
      childNode.remove("ejb-class");
      return this;
   }

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass()
   {
      return childNode.textValue("ejb-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setMessageDestination(String messageDestination)
   {
      childNode.getOrCreate("message-destination").text(messageDestination);
      return this;
   }

   /**
    * Removes the <code>message-destination</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public String getMessageDestination()
   {
      return childNode.textValue("message-destination");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setMessageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMessageDestinationType()
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
   // Element type : producer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>producer</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllProducer()
   {
      childNode.remove("producer");
      return this;
   }

   /**
    * Returns the <code>producer</code> element
    * @return the node defined for the element <code>producer</code> 
    */
   public ProducerType<ConsumerBeanType<T>> producer()
   {
      return new ProducerTypeImpl<ConsumerBeanType<T>>(this, "producer", childNode);
   }

   /**
    * Returns all <code>producer</code> elements
    * @return list of <code>producer</code> 
    */
   public List<ProducerType<ConsumerBeanType<T>>> getProducerList()
   {
      List<ProducerType<ConsumerBeanType<T>>> list = new ArrayList<ProducerType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("producer");
      for (Node node : nodeList)
      {
         ProducerType<ConsumerBeanType<T>> type = new ProducerTypeImpl<ConsumerBeanType<T>>(this, "producer",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-producer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>local-producer</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllLocalProducer()
   {
      childNode.remove("local-producer");
      return this;
   }

   /**
    * Returns the <code>local-producer</code> element
    * @return the node defined for the element <code>local-producer</code> 
    */
   public ProducerType<ConsumerBeanType<T>> localProducer()
   {
      return new ProducerTypeImpl<ConsumerBeanType<T>>(this, "local-producer", childNode);
   }

   /**
    * Returns all <code>local-producer</code> elements
    * @return list of <code>local-producer</code> 
    */
   public List<ProducerType<ConsumerBeanType<T>>> getLocalProducerList()
   {
      List<ProducerType<ConsumerBeanType<T>>> list = new ArrayList<ProducerType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("local-producer");
      for (Node node : nodeList)
      {
         ProducerType<ConsumerBeanType<T>> type = new ProducerTypeImpl<ConsumerBeanType<T>>(this, "local-producer",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : current-message
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>current-message</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeCurrentMessage()
   {
      childNode.remove("current-message");
      return this;
   }

   /**
    * If not already created, a new <code>current-message</code> element will be created and returned.
    * Otherwise, the existing <code>current-message</code> element will be returned.
    * @return the node defined for the element <code>current-message</code> 
    */
   public MethodAttributesType<ConsumerBeanType<T>> currentMessage()
   {
      Node node = childNode.getOrCreate("current-message");
      MethodAttributesType<ConsumerBeanType<T>> currentMessage = new MethodAttributesTypeImpl<ConsumerBeanType<T>>(
            this, "current-message", childNode, node);
      return currentMessage;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-properties
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-properties</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllMessageProperties()
   {
      childNode.remove("message-properties");
      return this;
   }

   /**
    * Returns the <code>message-properties</code> element
    * @return the node defined for the element <code>message-properties</code> 
    */
   public MessagePropertiesType<ConsumerBeanType<T>> messageProperties()
   {
      return new MessagePropertiesTypeImpl<ConsumerBeanType<T>>(this, "message-properties", childNode);
   }

   /**
    * Returns all <code>message-properties</code> elements
    * @return list of <code>message-properties</code> 
    */
   public List<MessagePropertiesType<ConsumerBeanType<T>>> getMessagePropertiesList()
   {
      List<MessagePropertiesType<ConsumerBeanType<T>>> list = new ArrayList<MessagePropertiesType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-properties");
      for (Node node : nodeList)
      {
         MessagePropertiesType<ConsumerBeanType<T>> type = new MessagePropertiesTypeImpl<ConsumerBeanType<T>>(this,
               "message-properties", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ConsumerBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<ConsumerBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ConsumerBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<ConsumerBeanType<T>>> list = new ArrayList<EjbRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<ConsumerBeanType<T>> type = new EjbRefTypeImpl<ConsumerBeanType<T>>(this, "ejb-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ConsumerBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ConsumerBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ConsumerBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<ConsumerBeanType<T>>> list = new ArrayList<EjbLocalRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<ConsumerBeanType<T>> type = new EjbLocalRefTypeImpl<ConsumerBeanType<T>>(this,
               "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<ConsumerBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<ConsumerBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<ConsumerBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ConsumerBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<ConsumerBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ConsumerBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<ConsumerBeanType<T>>> list = new ArrayList<ResourceRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<ConsumerBeanType<T>> type = new ResourceRefTypeImpl<ConsumerBeanType<T>>(this, "resource-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ConsumerBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ConsumerBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ConsumerBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<ConsumerBeanType<T>>> list = new ArrayList<ResourceEnvRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<ConsumerBeanType<T>> type = new ResourceEnvRefTypeImpl<ConsumerBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ConsumerBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ConsumerBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ConsumerBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<ConsumerBeanType<T>>> list = new ArrayList<MessageDestinationRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<ConsumerBeanType<T>> type = new MessageDestinationRefTypeImpl<ConsumerBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeSecurityDomain()
   {
      childNode.remove("security-domain");
      return this;
   }

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain()
   {
      return childNode.textValue("security-domain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-attributes
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-attributes</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMethodAttributes()
   {
      childNode.remove("method-attributes");
      return this;
   }

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<ConsumerBeanType<T>> methodAttributes()
   {
      Node node = childNode.getOrCreate("method-attributes");
      MethodAttributesType<ConsumerBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<ConsumerBeanType<T>>(
            this, "method-attributes", childNode, node);
      return methodAttributes;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDepends(String depends)
   {
      childNode.create("depends").text(depends);
      return this;
   }

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDependsList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDepends(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>depends</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDepends()
   {
      childNode.remove("depends");
      return this;
   }

   /**
    * Returns all <code>depends</code> elements
    * @return list of <code>depends</code> 
    */
   public List<String> getDependsList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("depends");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : annotation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllAnnotation()
   {
      childNode.remove("annotation");
      return this;
   }

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<ConsumerBeanType<T>> annotation()
   {
      return new AnnotationTypeImpl<ConsumerBeanType<T>>(this, "annotation", childNode);
   }

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<ConsumerBeanType<T>>> getAnnotationList()
   {
      List<AnnotationType<ConsumerBeanType<T>>> list = new ArrayList<AnnotationType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for (Node node : nodeList)
      {
         AnnotationType<ConsumerBeanType<T>> type = new AnnotationTypeImpl<ConsumerBeanType<T>>(this, "annotation",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ignore-dependency</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeIgnoreDependency()
   {
      childNode.remove("ignore-dependency");
      return this;
   }

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency()
   {
      Node node = childNode.getOrCreate("ignore-dependency");
      IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<ConsumerBeanType<T>>(
            this, "ignore-dependency", childNode, node);
      return ignoreDependency;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>aop-domain-name</code> element with the given value will be created.
    * Otherwise, the existing <code>aop-domain-name</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setAopDomainName(String aopDomainName)
   {
      childNode.getOrCreate("aop-domain-name").text(aopDomainName);
      return this;
   }

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAopDomainName()
   {
      childNode.remove("aop-domain-name");
      return this;
   }

   /**
    * Returns the <code>aop-domain-name</code> element
    * @return the node defined for the element <code>aop-domain-name</code> 
    */
   public String getAopDomainName()
   {
      return childNode.textValue("aop-domain-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>pool-config</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removePoolConfig()
   {
      childNode.remove("pool-config");
      return this;
   }

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<ConsumerBeanType<T>> poolConfig()
   {
      Node node = childNode.getOrCreate("pool-config");
      PoolConfigType<ConsumerBeanType<T>> poolConfig = new PoolConfigTypeImpl<ConsumerBeanType<T>>(this, "pool-config",
            childNode, node);
      return poolConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllJndiRef()
   {
      childNode.remove("jndi-ref");
      return this;
   }

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<ConsumerBeanType<T>> jndiRef()
   {
      return new JndiRefTypeImpl<ConsumerBeanType<T>>(this, "jndi-ref", childNode);
   }

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<ConsumerBeanType<T>>> getJndiRefList()
   {
      List<JndiRefType<ConsumerBeanType<T>>> list = new ArrayList<JndiRefType<ConsumerBeanType<T>>>();
      List<Node> nodeList = childNode.get("jndi-ref");
      for (Node node : nodeList)
      {
         JndiRefType<ConsumerBeanType<T>> type = new JndiRefTypeImpl<ConsumerBeanType<T>>(this, "jndi-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeActivationConfig()
   {
      childNode.remove("activation-config");
      return this;
   }

   /**
    * If not already created, a new <code>activation-config</code> element will be created and returned.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return the node defined for the element <code>activation-config</code> 
    */
   public ActivationConfigType<ConsumerBeanType<T>> activationConfig()
   {
      Node node = childNode.getOrCreate("activation-config");
      ActivationConfigType<ConsumerBeanType<T>> activationConfig = new ActivationConfigTypeImpl<ConsumerBeanType<T>>(
            this, "activation-config", childNode, node);
      return activationConfig;
   }

}
