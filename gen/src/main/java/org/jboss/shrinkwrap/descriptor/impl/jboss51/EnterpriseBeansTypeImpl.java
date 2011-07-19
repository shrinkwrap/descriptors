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
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ServiceBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> enterprise-beansType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The enterprise-beans element contains additional information about the <br> 
 * beans. These informations, such as jndi names, resource managers and container <br> 
 * configurations, are specific to jboss and not described in ejb-jar.xml. jboss will provide a <br> 
 * standard behaviour if no enterprise-beans element is found, see container-configurations, <br> 
 * jndi-name and resource-managers for defaults. Used in: jboss <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllSession()
   {
      childNode.remove("session");
      return this;
   }

   /**
    * Returns the <code>session</code> element
    * @return the node defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> session()
   {
      return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode);
   }

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList()
   {
      List<SessionBeanType<EnterpriseBeansType<T>>> list = new ArrayList<SessionBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("session");
      for (Node node : nodeList)
      {
         SessionBeanType<EnterpriseBeansType<T>> type = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "session", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven()
   {
      childNode.remove("message-driven");
      return this;
   }

   /**
    * Returns the <code>message-driven</code> element
    * @return the node defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven()
   {
      return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode);
   }

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList()
   {
      List<MessageDrivenBeanType<EnterpriseBeansType<T>>> list = new ArrayList<MessageDrivenBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("message-driven");
      for (Node node : nodeList)
      {
         MessageDrivenBeanType<EnterpriseBeansType<T>> type = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(
               this, "message-driven", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllService()
   {
      childNode.remove("service");
      return this;
   }

   /**
    * Returns the <code>service</code> element
    * @return the node defined for the element <code>service</code> 
    */
   public ServiceBeanType<EnterpriseBeansType<T>> service()
   {
      return new ServiceBeanTypeImpl<EnterpriseBeansType<T>>(this, "service", childNode);
   }

   /**
    * Returns all <code>service</code> elements
    * @return list of <code>service</code> 
    */
   public List<ServiceBeanType<EnterpriseBeansType<T>>> getServiceList()
   {
      List<ServiceBeanType<EnterpriseBeansType<T>>> list = new ArrayList<ServiceBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("service");
      for (Node node : nodeList)
      {
         ServiceBeanType<EnterpriseBeansType<T>> type = new ServiceBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "service", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : consumer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>consumer</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllConsumer()
   {
      childNode.remove("consumer");
      return this;
   }

   /**
    * Returns the <code>consumer</code> element
    * @return the node defined for the element <code>consumer</code> 
    */
   public ConsumerBeanType<EnterpriseBeansType<T>> consumer()
   {
      return new ConsumerBeanTypeImpl<EnterpriseBeansType<T>>(this, "consumer", childNode);
   }

   /**
    * Returns all <code>consumer</code> elements
    * @return list of <code>consumer</code> 
    */
   public List<ConsumerBeanType<EnterpriseBeansType<T>>> getConsumerList()
   {
      List<ConsumerBeanType<EnterpriseBeansType<T>>> list = new ArrayList<ConsumerBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("consumer");
      for (Node node : nodeList)
      {
         ConsumerBeanType<EnterpriseBeansType<T>> type = new ConsumerBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "consumer", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllEjb()
   {
      childNode.remove("ejb");
      return this;
   }

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public GenericBeanType<EnterpriseBeansType<T>> ejb()
   {
      return new GenericBeanTypeImpl<EnterpriseBeansType<T>>(this, "ejb", childNode);
   }

   /**
    * Returns all <code>ejb</code> elements
    * @return list of <code>ejb</code> 
    */
   public List<GenericBeanType<EnterpriseBeansType<T>>> getEjbList()
   {
      List<GenericBeanType<EnterpriseBeansType<T>>> list = new ArrayList<GenericBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("ejb");
      for (Node node : nodeList)
      {
         GenericBeanType<EnterpriseBeansType<T>> type = new GenericBeanTypeImpl<EnterpriseBeansType<T>>(this, "ejb",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
