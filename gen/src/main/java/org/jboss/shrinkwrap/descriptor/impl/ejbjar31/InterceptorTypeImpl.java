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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> interceptorType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The interceptorType element declares information about a single <br> 
 * interceptor class. It consists of : <br> 
 *<br>
 * - An optional description. <br> 
 * - The fully-qualified name of the interceptor class. <br> 
 * - An optional list of around invoke methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list of around timeout methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list environment dependencies for the interceptor <br> 
 * class and/or its super-classes. <br> 
 * - An optional list of post-activate methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list of pre-passivate methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class InterceptorTypeImpl<T> implements Child<T>, InterceptorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public InterceptorTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<InterceptorType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<InterceptorType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<InterceptorType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<InterceptorType<T>>> list = new ArrayList<EnvEntryType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<InterceptorType<T>> type = new EnvEntryTypeImpl<InterceptorType<T>>(this, "env-entry", childNode,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<InterceptorType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<InterceptorType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<InterceptorType<T>>> getEjbRefList()
   {
      List<EjbRefType<InterceptorType<T>>> list = new ArrayList<EjbRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<InterceptorType<T>> type = new EjbRefTypeImpl<InterceptorType<T>>(this, "ejb-ref", childNode, node);
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<InterceptorType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<InterceptorType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<InterceptorType<T>>> list = new ArrayList<EjbLocalRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<InterceptorType<T>> type = new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "ejb-local-ref",
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<InterceptorType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<InterceptorType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<InterceptorType<T>>> getResourceRefList()
   {
      List<ResourceRefType<InterceptorType<T>>> list = new ArrayList<ResourceRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<InterceptorType<T>> type = new ResourceRefTypeImpl<InterceptorType<T>>(this, "resource-ref",
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<InterceptorType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<InterceptorType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<InterceptorType<T>>> list = new ArrayList<ResourceEnvRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<InterceptorType<T>> type = new ResourceEnvRefTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<InterceptorType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<InterceptorType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<InterceptorType<T>>> list = new ArrayList<MessageDestinationRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<InterceptorType<T>> type = new MessageDestinationRefTypeImpl<InterceptorType<T>>(
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<InterceptorType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<InterceptorType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<InterceptorType<T>>> list = new ArrayList<PersistenceContextRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<InterceptorType<T>> type = new PersistenceContextRefTypeImpl<InterceptorType<T>>(
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<InterceptorType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<InterceptorType<T>>> list = new ArrayList<PersistenceUnitRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<InterceptorType<T>> type = new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>> type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>> type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<InterceptorType<T>> dataSource()
   {
      return new DataSourceTypeImpl<InterceptorType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<InterceptorType<T>>> getDataSourceList()
   {
      List<DataSourceType<InterceptorType<T>>> list = new ArrayList<DataSourceType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<InterceptorType<T>> type = new DataSourceTypeImpl<InterceptorType<T>>(this, "data-source",
               childNode, node);
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllDescription()
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
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-class</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-class</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.getOrCreate("interceptor-class").text(interceptorClass);
      return this;
   }

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeInterceptorClass()
   {
      childNode.remove("interceptor-class");
      return this;
   }

   /**
    * Returns the <code>interceptor-class</code> element
    * @return the node defined for the element <code>interceptor-class</code> 
    */
   public String getInterceptorClass()
   {
      return childNode.textValue("interceptor-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllAroundInvoke()
   {
      childNode.remove("around-invoke");
      return this;
   }

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<InterceptorType<T>> aroundInvoke()
   {
      return new AroundInvokeTypeImpl<InterceptorType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<InterceptorType<T>>> getAroundInvokeList()
   {
      List<AroundInvokeType<InterceptorType<T>>> list = new ArrayList<AroundInvokeType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for (Node node : nodeList)
      {
         AroundInvokeType<InterceptorType<T>> type = new AroundInvokeTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllAroundTimeout()
   {
      childNode.remove("around-timeout");
      return this;
   }

   /**
    * Returns the <code>around-timeout</code> element
    * @return the node defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<InterceptorType<T>> aroundTimeout()
   {
      return new AroundTimeoutTypeImpl<InterceptorType<T>>(this, "around-timeout", childNode);
   }

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<InterceptorType<T>>> getAroundTimeoutList()
   {
      List<AroundTimeoutType<InterceptorType<T>>> list = new ArrayList<AroundTimeoutType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for (Node node : nodeList)
      {
         AroundTimeoutType<InterceptorType<T>> type = new AroundTimeoutTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPostActivate()
   {
      childNode.remove("post-activate");
      return this;
   }

   /**
    * Returns the <code>post-activate</code> element
    * @return the node defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> postActivate()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-activate", childNode);
   }

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPostActivateList()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("post-activate");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>> type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this,
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
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPrePassivate()
   {
      childNode.remove("pre-passivate");
      return this;
   }

   /**
    * Returns the <code>pre-passivate</code> element
    * @return the node defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> prePassivate()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-passivate", childNode);
   }

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPrePassivateList()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("pre-passivate");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>> type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this,
               "pre-passivate", childNode, node);
         list.add(type);
      }
      return list;
   }

}
