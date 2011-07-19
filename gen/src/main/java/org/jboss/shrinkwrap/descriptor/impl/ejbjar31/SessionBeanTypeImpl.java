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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AsyncMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrencyManagementTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> session-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The session-beanType declares an session bean. The <br> 
 * declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name <br> 
 * - a name assigned to the enterprise bean <br> 
 * in the deployment description <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of the session bean's remote home/business interface. <br> 
 * This element is not required to be supported by all <br> 
 * implementations. Any use of this element is non-portable. <br> 
 * - the names of all the remote or local business interfaces, <br> 
 * if any <br> 
 * - the names of the session bean's remote home and <br> 
 * remote interfaces, if any <br> 
 * - the names of the session bean's local home and <br> 
 * local interfaces, if any <br> 
 * - an optional declaration that this bean exposes a <br> 
 * no-interface view <br> 
 * - the name of the session bean's web service endpoint <br> 
 * interface, if any <br> 
 * - the session bean's implementation class <br> 
 * - the session bean's state management type <br> 
 * - an optional declaration of a stateful session bean's timeout value <br> 
 * - an optional declaration of the session bean's timeout method for <br> 
 * handling programmatically created timers <br> 
 * - an optional declaration of timers to be automatically created at <br> 
 * deployment time <br> 
 * - an optional declaration that a Singleton bean has eager <br> 
 * initialization <br> 
 * - an optional declaration of a Singleton/Stateful bean's concurrency <br> 
 * management type <br> 
 * - an optional declaration of the method locking metadata <br> 
 * for a Singleton with container managed concurrency <br> 
 * - an optional declaration of the other Singleton beans in the <br> 
 * application that must be initialized before this bean <br> 
 * - an optional declaration of the session bean's asynchronous <br> 
 * methods <br> 
 * - the optional session bean's transaction management type. <br> 
 * If it is not present, it is defaulted to Container. <br> 
 * - an optional declaration of a stateful session bean's <br> 
 * afterBegin, beforeCompletion, and/or afterCompletion methods <br> 
 * - an optional list of the session bean class and/or <br> 
 * superclass around-invoke methods. <br> 
 * - an optional list of the session bean class and/or <br> 
 * superclass around-timeout methods. <br> 
 * - an optional declaration of the bean's <br> 
 * environment entries <br> 
 * - an optional declaration of the bean's EJB references <br> 
 * - an optional declaration of the bean's local <br> 
 * EJB references <br> 
 * - an optional declaration of the bean's web <br> 
 * service references <br> 
 * - an optional declaration of the security role <br> 
 * references <br> 
 * - an optional declaration of the security identity <br> 
 * to be used for the execution of the bean's methods <br> 
 * - an optional declaration of the bean's resource <br> 
 * manager connection factory references <br> 
 * - an optional declaration of the bean's resource <br> 
 * environment references. <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 *<br>
 * The elements that are optional are "optional" in the sense <br> 
 * that they are omitted when if lists represented by them are <br> 
 * empty. <br> 
 *<br>
 * The service-endpoint element may only be specified if the <br> 
 * bean is a stateless session bean. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class SessionBeanTypeImpl<T> implements Child<T>, SessionBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SessionBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public SessionBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllDescription()
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllDisplayName()
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<SessionBeanType<T>> icon()
   {
      return new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<SessionBeanType<T>>> getIconList()
   {
      List<IconType<SessionBeanType<T>>> list = new ArrayList<IconType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<SessionBeanType<T>> type = new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<SessionBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<SessionBeanType<T>>> list = new ArrayList<EnvEntryType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<SessionBeanType<T>> type = new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode,
               node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<SessionBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<SessionBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<SessionBeanType<T>>> list = new ArrayList<EjbRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<SessionBeanType<T>> type = new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<SessionBeanType<T>>> list = new ArrayList<EjbLocalRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<SessionBeanType<T>> type = new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref",
               childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<SessionBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<SessionBeanType<T>>> list = new ArrayList<ResourceRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<SessionBeanType<T>> type = new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref",
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<SessionBeanType<T>>> list = new ArrayList<ResourceEnvRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<SessionBeanType<T>> type = new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this,
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<SessionBeanType<T>>> list = new ArrayList<MessageDestinationRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<SessionBeanType<T>> type = new MessageDestinationRefTypeImpl<SessionBeanType<T>>(
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceContextRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<SessionBeanType<T>> type = new PersistenceContextRefTypeImpl<SessionBeanType<T>>(
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<SessionBeanType<T>> type = new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this,
               "persistence-unit-ref", childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "post-construct", childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<SessionBeanType<T>> dataSource()
   {
      return new DataSourceTypeImpl<SessionBeanType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<SessionBeanType<T>>> getDataSourceList()
   {
      List<DataSourceType<SessionBeanType<T>>> list = new ArrayList<DataSourceType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<SessionBeanType<T>> type = new DataSourceTypeImpl<SessionBeanType<T>>(this, "data-source",
               childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeEjbName()
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeMappedName()
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
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home</code> element with the given value will be created.
    * Otherwise, the existing <code>home</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setHome(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeHome()
   {
      childNode.remove("home");
      return this;
   }

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome()
   {
      return childNode.textValue("home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remote</code> element with the given value will be created.
    * Otherwise, the existing <code>remote</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setRemote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeRemote()
   {
      childNode.remove("remote");
      return this;
   }

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote()
   {
      return childNode.textValue("remote");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setLocalHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeLocalHome()
   {
      childNode.remove("local-home");
      return this;
   }

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome()
   {
      return childNode.textValue("local-home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local</code> element with the given value will be created.
    * Otherwise, the existing <code>local</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setLocal(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeLocal()
   {
      childNode.remove("local");
      return this;
   }

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal()
   {
      return childNode.textValue("local");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : business-local
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>business-local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessLocal(String businessLocal)
   {
      childNode.create("business-local").text(businessLocal);
      return this;
   }

   /**
    * Creates for all String objects representing <code>business-local</code> elements, 
    * a new <code>business-local</code> element 
    * @param list of <code>business-local</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessLocalList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setBusinessLocal(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>business-local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllBusinessLocal()
   {
      childNode.remove("business-local");
      return this;
   }

   /**
    * Returns all <code>business-local</code> elements
    * @return list of <code>business-local</code> 
    */
   public List<String> getBusinessLocalList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-local");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : business-remote
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>business-remote</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessRemote(String businessRemote)
   {
      childNode.create("business-remote").text(businessRemote);
      return this;
   }

   /**
    * Creates for all String objects representing <code>business-remote</code> elements, 
    * a new <code>business-remote</code> element 
    * @param list of <code>business-remote</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessRemoteList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setBusinessRemote(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>business-remote</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllBusinessRemote()
   {
      childNode.remove("business-remote");
      return this;
   }

   /**
    * Returns all <code>business-remote</code> elements
    * @return list of <code>business-remote</code> 
    */
   public List<String> getBusinessRemoteList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-remote");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-bean
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionBeanType<T> localBean()
   {
      childNode.getOrCreate("local-bean");
      return this;
   }

   public Boolean isLocalBean()
   {
      return childNode.getSingle("local-bean") != null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-endpoint
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-endpoint</code> element with the given value will be created.
    * Otherwise, the existing <code>service-endpoint</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint)
   {
      childNode.getOrCreate("service-endpoint").text(serviceEndpoint);
      return this;
   }

   /**
    * Removes the <code>service-endpoint</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeServiceEndpoint()
   {
      childNode.remove("service-endpoint");
      return this;
   }

   /**
    * Returns the <code>service-endpoint</code> element
    * @return the node defined for the element <code>service-endpoint</code> 
    */
   public String getServiceEndpoint()
   {
      return childNode.textValue("service-endpoint");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeEjbClass()
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
   // Element type : session-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-type</code> element with the given value will be created.
    * Otherwise, the existing <code>session-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setSessionType(SessionTypeType sessionType)
   {
      childNode.getOrCreate("session-type").text(sessionType);
      return this;
   }

   /**
    * If not already created, a new <code>session-type</code> element with the given value will be created.
    * Otherwise, the existing <code>session-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setSessionType(String sessionType)
   {
      childNode.getOrCreate("session-type").text(sessionType);
      return this;
   }

   /**
    * Returns the <code>session-type</code> element
    * @return the node defined for the element <code>session-type</code> 
    */
   public SessionTypeType getSessionType()
   {
      return SessionTypeType.getFromStringValue(childNode.textValue("session-type"));
   }

   /**
    * Returns the <code>session-type</code> element
    * @return the node defined for the element <code>session-type</code> 
    */
   public String getSessionTypeAsString()
   {
      return childNode.textValue("session-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : stateful-timeout
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>stateful-timeout</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeStatefulTimeout()
   {
      childNode.remove("stateful-timeout");
      return this;
   }

   /**
    * If not already created, a new <code>stateful-timeout</code> element will be created and returned.
    * Otherwise, the existing <code>stateful-timeout</code> element will be returned.
    * @return the node defined for the element <code>stateful-timeout</code> 
    */
   public StatefulTimeoutType<SessionBeanType<T>> statefulTimeout()
   {
      Node node = childNode.getOrCreate("stateful-timeout");
      StatefulTimeoutType<SessionBeanType<T>> statefulTimeout = new StatefulTimeoutTypeImpl<SessionBeanType<T>>(this,
            "stateful-timeout", childNode, node);
      return statefulTimeout;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeTimeoutMethod()
   {
      childNode.remove("timeout-method");
      return this;
   }

   /**
    * If not already created, a new <code>timeout-method</code> element will be created and returned.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return the node defined for the element <code>timeout-method</code> 
    */
   public NamedMethodType<SessionBeanType<T>> timeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<SessionBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this,
            "timeout-method", childNode, node);
      return timeoutMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : timer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>timer</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllTimer()
   {
      childNode.remove("timer");
      return this;
   }

   /**
    * Returns the <code>timer</code> element
    * @return the node defined for the element <code>timer</code> 
    */
   public TimerType<SessionBeanType<T>> timer()
   {
      return new TimerTypeImpl<SessionBeanType<T>>(this, "timer", childNode);
   }

   /**
    * Returns all <code>timer</code> elements
    * @return list of <code>timer</code> 
    */
   public List<TimerType<SessionBeanType<T>>> getTimerList()
   {
      List<TimerType<SessionBeanType<T>>> list = new ArrayList<TimerType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("timer");
      for (Node node : nodeList)
      {
         TimerType<SessionBeanType<T>> type = new TimerTypeImpl<SessionBeanType<T>>(this, "timer", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-on-startup
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-on-startup</code> element with the given value will be created.
    * Otherwise, the existing <code>init-on-startup</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setInitOnStartup(Boolean initOnStartup)
   {
      childNode.getOrCreate("init-on-startup").text(initOnStartup);
      return this;
   }

   /**
    * Removes the <code>init-on-startup</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeInitOnStartup()
   {
      childNode.remove("init-on-startup");
      return this;
   }

   /**
    * Returns the <code>init-on-startup</code> element
    * @return the node defined for the element <code>init-on-startup</code> 
    */
   public Boolean isInitOnStartup()
   {
      return Strings.isTrue(childNode.textValue("init-on-startup"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : concurrency-management-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>concurrency-management-type</code> element with the given value will be created.
    * Otherwise, the existing <code>concurrency-management-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setConcurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType)
   {
      childNode.getOrCreate("concurrency-management-type").text(concurrencyManagementType);
      return this;
   }

   /**
    * If not already created, a new <code>concurrency-management-type</code> element with the given value will be created.
    * Otherwise, the existing <code>concurrency-management-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setConcurrencyManagementType(String concurrencyManagementType)
   {
      childNode.getOrCreate("concurrency-management-type").text(concurrencyManagementType);
      return this;
   }

   /**
    * Returns the <code>concurrency-management-type</code> element
    * @return the node defined for the element <code>concurrency-management-type</code> 
    */
   public ConcurrencyManagementTypeType getConcurrencyManagementType()
   {
      return ConcurrencyManagementTypeType.getFromStringValue(childNode.textValue("concurrency-management-type"));
   }

   /**
    * Returns the <code>concurrency-management-type</code> element
    * @return the node defined for the element <code>concurrency-management-type</code> 
    */
   public String getConcurrencyManagementTypeAsString()
   {
      return childNode.textValue("concurrency-management-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : concurrent-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>concurrent-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllConcurrentMethod()
   {
      childNode.remove("concurrent-method");
      return this;
   }

   /**
    * Returns the <code>concurrent-method</code> element
    * @return the node defined for the element <code>concurrent-method</code> 
    */
   public ConcurrentMethodType<SessionBeanType<T>> concurrentMethod()
   {
      return new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this, "concurrent-method", childNode);
   }

   /**
    * Returns all <code>concurrent-method</code> elements
    * @return list of <code>concurrent-method</code> 
    */
   public List<ConcurrentMethodType<SessionBeanType<T>>> getConcurrentMethodList()
   {
      List<ConcurrentMethodType<SessionBeanType<T>>> list = new ArrayList<ConcurrentMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("concurrent-method");
      for (Node node : nodeList)
      {
         ConcurrentMethodType<SessionBeanType<T>> type = new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this,
               "concurrent-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends-on
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>depends-on</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeDependsOn()
   {
      childNode.remove("depends-on");
      return this;
   }

   /**
    * If not already created, a new <code>depends-on</code> element will be created and returned.
    * Otherwise, the existing <code>depends-on</code> element will be returned.
    * @return the node defined for the element <code>depends-on</code> 
    */
   public DependsOnType<SessionBeanType<T>> dependsOn()
   {
      Node node = childNode.getOrCreate("depends-on");
      DependsOnType<SessionBeanType<T>> dependsOn = new DependsOnTypeImpl<SessionBeanType<T>>(this, "depends-on",
            childNode, node);
      return dependsOn;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : init-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllInitMethod()
   {
      childNode.remove("init-method");
      return this;
   }

   /**
    * Returns the <code>init-method</code> element
    * @return the node defined for the element <code>init-method</code> 
    */
   public InitMethodType<SessionBeanType<T>> initMethod()
   {
      return new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method", childNode);
   }

   /**
    * Returns all <code>init-method</code> elements
    * @return list of <code>init-method</code> 
    */
   public List<InitMethodType<SessionBeanType<T>>> getInitMethodList()
   {
      List<InitMethodType<SessionBeanType<T>>> list = new ArrayList<InitMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("init-method");
      for (Node node : nodeList)
      {
         InitMethodType<SessionBeanType<T>> type = new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remove-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>remove-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllRemoveMethod()
   {
      childNode.remove("remove-method");
      return this;
   }

   /**
    * Returns the <code>remove-method</code> element
    * @return the node defined for the element <code>remove-method</code> 
    */
   public RemoveMethodType<SessionBeanType<T>> removeMethod()
   {
      return new RemoveMethodTypeImpl<SessionBeanType<T>>(this, "remove-method", childNode);
   }

   /**
    * Returns all <code>remove-method</code> elements
    * @return list of <code>remove-method</code> 
    */
   public List<RemoveMethodType<SessionBeanType<T>>> getRemoveMethodList()
   {
      List<RemoveMethodType<SessionBeanType<T>>> list = new ArrayList<RemoveMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("remove-method");
      for (Node node : nodeList)
      {
         RemoveMethodType<SessionBeanType<T>> type = new RemoveMethodTypeImpl<SessionBeanType<T>>(this,
               "remove-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : async-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>async-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllAsyncMethod()
   {
      childNode.remove("async-method");
      return this;
   }

   /**
    * Returns the <code>async-method</code> element
    * @return the node defined for the element <code>async-method</code> 
    */
   public AsyncMethodType<SessionBeanType<T>> asyncMethod()
   {
      return new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "async-method", childNode);
   }

   /**
    * Returns all <code>async-method</code> elements
    * @return list of <code>async-method</code> 
    */
   public List<AsyncMethodType<SessionBeanType<T>>> getAsyncMethodList()
   {
      List<AsyncMethodType<SessionBeanType<T>>> list = new ArrayList<AsyncMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("async-method");
      for (Node node : nodeList)
      {
         AsyncMethodType<SessionBeanType<T>> type = new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "async-method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setTransactionType(String transactionType)
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
   // Element type : after-begin-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>after-begin-method</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAfterBeginMethod()
   {
      childNode.remove("after-begin-method");
      return this;
   }

   /**
    * If not already created, a new <code>after-begin-method</code> element will be created and returned.
    * Otherwise, the existing <code>after-begin-method</code> element will be returned.
    * @return the node defined for the element <code>after-begin-method</code> 
    */
   public NamedMethodType<SessionBeanType<T>> afterBeginMethod()
   {
      Node node = childNode.getOrCreate("after-begin-method");
      NamedMethodType<SessionBeanType<T>> afterBeginMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this,
            "after-begin-method", childNode, node);
      return afterBeginMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : before-completion-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>before-completion-method</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeBeforeCompletionMethod()
   {
      childNode.remove("before-completion-method");
      return this;
   }

   /**
    * If not already created, a new <code>before-completion-method</code> element will be created and returned.
    * Otherwise, the existing <code>before-completion-method</code> element will be returned.
    * @return the node defined for the element <code>before-completion-method</code> 
    */
   public NamedMethodType<SessionBeanType<T>> beforeCompletionMethod()
   {
      Node node = childNode.getOrCreate("before-completion-method");
      NamedMethodType<SessionBeanType<T>> beforeCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this,
            "before-completion-method", childNode, node);
      return beforeCompletionMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : after-completion-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>after-completion-method</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAfterCompletionMethod()
   {
      childNode.remove("after-completion-method");
      return this;
   }

   /**
    * If not already created, a new <code>after-completion-method</code> element will be created and returned.
    * Otherwise, the existing <code>after-completion-method</code> element will be returned.
    * @return the node defined for the element <code>after-completion-method</code> 
    */
   public NamedMethodType<SessionBeanType<T>> afterCompletionMethod()
   {
      Node node = childNode.getOrCreate("after-completion-method");
      NamedMethodType<SessionBeanType<T>> afterCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this,
            "after-completion-method", childNode, node);
      return afterCompletionMethod;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllAroundInvoke()
   {
      childNode.remove("around-invoke");
      return this;
   }

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<SessionBeanType<T>> aroundInvoke()
   {
      return new AroundInvokeTypeImpl<SessionBeanType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<SessionBeanType<T>>> getAroundInvokeList()
   {
      List<AroundInvokeType<SessionBeanType<T>>> list = new ArrayList<AroundInvokeType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for (Node node : nodeList)
      {
         AroundInvokeType<SessionBeanType<T>> type = new AroundInvokeTypeImpl<SessionBeanType<T>>(this,
               "around-invoke", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-timeout
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllAroundTimeout()
   {
      childNode.remove("around-timeout");
      return this;
   }

   /**
    * Returns the <code>around-timeout</code> element
    * @return the node defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<SessionBeanType<T>> aroundTimeout()
   {
      return new AroundTimeoutTypeImpl<SessionBeanType<T>>(this, "around-timeout", childNode);
   }

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<SessionBeanType<T>>> getAroundTimeoutList()
   {
      List<AroundTimeoutType<SessionBeanType<T>>> list = new ArrayList<AroundTimeoutType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for (Node node : nodeList)
      {
         AroundTimeoutType<SessionBeanType<T>> type = new AroundTimeoutTypeImpl<SessionBeanType<T>>(this,
               "around-timeout", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-activate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPostActivate()
   {
      childNode.remove("post-activate");
      return this;
   }

   /**
    * Returns the <code>post-activate</code> element
    * @return the node defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> postActivate()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-activate", childNode);
   }

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostActivateList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-activate");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "post-activate", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-passivate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPrePassivate()
   {
      childNode.remove("pre-passivate");
      return this;
   }

   /**
    * Returns the <code>pre-passivate</code> element
    * @return the node defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> prePassivate()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-passivate", childNode);
   }

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPrePassivateList()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-passivate");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>> type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this,
               "pre-passivate", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.remove("security-role-ref");
      return this;
   }

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<SessionBeanType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<SessionBeanType<T>>> list = new ArrayList<SecurityRoleRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for (Node node : nodeList)
      {
         SecurityRoleRefType<SessionBeanType<T>> type = new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this,
               "security-role-ref", childNode, node);
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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<SessionBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<SessionBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

}
