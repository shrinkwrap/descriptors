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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> message-driven-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The message-driven element declares a message-driven <br> 
 * bean. The declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name. <br> 
 * - a name assigned to the enterprise bean in <br> 
 * the deployment descriptor <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of destination from which this message-driven bean <br> 
 * should consume. This element is not required to be supported <br> 
 * by all implementations. Any use of this element is non-portable. <br> 
 * - the message-driven bean's implementation class <br> 
 * - an optional declaration of the bean's messaging <br> 
 * type <br> 
 * - an optional declaration of the bean's timeout method. <br> 
 * - the optional message-driven bean's transaction management <br> 
 * type. If it is not defined, it is defaulted to Container. <br> 
 * - an optional declaration of the bean's <br> 
 * message-destination-type <br> 
 * - an optional declaration of the bean's <br> 
 * message-destination-link <br> 
 * - an optional declaration of the message-driven bean's <br> 
 * activation configuration properties <br> 
 * - an optional list of the message-driven bean class and/or <br> 
 * superclass around-invoke methods. <br> 
 * - an optional declaration of the bean's environment <br> 
 * entries <br> 
 * - an optional declaration of the bean's EJB references <br> 
 * - an optional declaration of the bean's local EJB <br> 
 * references <br> 
 * - an optional declaration of the bean's web service <br> 
 * references <br> 
 * - an optional declaration of the security <br> 
 * identity to be used for the execution of the bean's <br> 
 * methods <br> 
 * - an optional declaration of the bean's <br> 
 * resource manager connection factory <br> 
 * references <br> 
 * - an optional declaration of the bean's resource <br> 
 * environment references. <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>, MessageDrivenBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDescription()
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDisplayName()
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<MessageDrivenBeanType<T>> icon()
   {
      return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDrivenBeanType<T>>> getIconList()
   {
      List<IconType<MessageDrivenBeanType<T>>> list = new ArrayList<IconType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<MessageDrivenBeanType<T>> type = new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<MessageDrivenBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<MessageDrivenBeanType<T>>> list = new ArrayList<EnvEntryType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<MessageDrivenBeanType<T>> type = new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this,
               "env-entry", childNode, node);
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<MessageDrivenBeanType<T>> type = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref",
               childNode, node);
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbLocalRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<MessageDrivenBeanType<T>> type = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<MessageDrivenBeanType<T>> type = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "resource-ref", childNode, node);
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceEnvRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<MessageDrivenBeanType<T>> type = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this,
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<MessageDrivenBeanType<T>>> list = new ArrayList<MessageDestinationRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<MessageDrivenBeanType<T>> type = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceContextRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<MessageDrivenBeanType<T>> type = new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<MessageDrivenBeanType<T>> type = new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>> type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(
               this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>> type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(
               this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllServiceRef()
   {
      childNode.remove("service-ref");
      return this;
   }

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> serviceRef()
   {
      return new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<MessageDrivenBeanType<T>>> getServiceRefList()
   {
      List<ServiceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ServiceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for (Node node : nodeList)
      {
         ServiceRefType<MessageDrivenBeanType<T>> type = new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "service-ref", childNode, node);
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbName()
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
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMappedName()
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
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbClass()
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
   // Element type : messaging-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messaging-type</code> element with the given value will be created.
    * Otherwise, the existing <code>messaging-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessagingType(String messagingType)
   {
      childNode.getOrCreate("messaging-type").text(messagingType);
      return this;
   }

   /**
    * Removes the <code>messaging-type</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessagingType()
   {
      childNode.remove("messaging-type");
      return this;
   }

   /**
    * Returns the <code>messaging-type</code> element
    * @return the node defined for the element <code>messaging-type</code> 
    */
   public String getMessagingType()
   {
      return childNode.textValue("messaging-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeTimeoutMethod()
   {
      childNode.remove("timeout-method");
      return this;
   }

   /**
    * If not already created, a new <code>timeout-method</code> element will be created and returned.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return the node defined for the element <code>timeout-method</code> 
    */
   public NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<MessageDrivenBeanType<T>>(this,
            "timeout-method", childNode, node);
      return timeoutMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setTransactionType(String transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public TransactionTypeType getTransactionType()
   {
      return TransactionTypeType.getFromStringValue(childNode.textValue("transaction-type"));
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public String getTransactionTypeAsString()
   {
      return childNode.textValue("transaction-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationType()
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
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-link</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-link</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationLink()
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

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeActivationConfig()
   {
      childNode.remove("activation-config");
      return this;
   }

   /**
    * If not already created, a new <code>activation-config</code> element will be created and returned.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return the node defined for the element <code>activation-config</code> 
    */
   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig()
   {
      Node node = childNode.getOrCreate("activation-config");
      ActivationConfigType<MessageDrivenBeanType<T>> activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(
            this, "activation-config", childNode, node);
      return activationConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllAroundInvoke()
   {
      childNode.remove("around-invoke");
      return this;
   }

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke()
   {
      return new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAroundInvokeList()
   {
      List<AroundInvokeType<MessageDrivenBeanType<T>>> list = new ArrayList<AroundInvokeType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for (Node node : nodeList)
      {
         AroundInvokeType<MessageDrivenBeanType<T>> type = new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this,
               "around-invoke", childNode, node);
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

}
