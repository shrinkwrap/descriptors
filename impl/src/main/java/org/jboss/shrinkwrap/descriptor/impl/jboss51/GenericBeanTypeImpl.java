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
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> generic-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class GenericBeanTypeImpl<T> implements Child<T>, GenericBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public GenericBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public GenericBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllDescription()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllDisplayName()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<GenericBeanType<T>> icon()
   {
      return new IconTypeImpl<GenericBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<GenericBeanType<T>>> getIconList()
   {
      List<IconType<GenericBeanType<T>>> list = new ArrayList<IconType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<GenericBeanType<T>> type = new IconTypeImpl<GenericBeanType<T>>(this, "icon", childNode, node);
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<GenericBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<GenericBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<GenericBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<GenericBeanType<T>>> list = new ArrayList<EnvEntryType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<GenericBeanType<T>> type = new EnvEntryTypeImpl<GenericBeanType<T>>(this, "env-entry", childNode,
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<GenericBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<GenericBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<GenericBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<GenericBeanType<T>>> list = new ArrayList<EjbRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<GenericBeanType<T>> type = new EjbRefTypeImpl<GenericBeanType<T>>(this, "ejb-ref", childNode, node);
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<GenericBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<GenericBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<GenericBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<GenericBeanType<T>>> list = new ArrayList<EjbLocalRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<GenericBeanType<T>> type = new EjbLocalRefTypeImpl<GenericBeanType<T>>(this, "ejb-local-ref",
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<GenericBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<GenericBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<GenericBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<GenericBeanType<T>>> list = new ArrayList<ResourceRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<GenericBeanType<T>> type = new ResourceRefTypeImpl<GenericBeanType<T>>(this, "resource-ref",
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<GenericBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<GenericBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<GenericBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<GenericBeanType<T>>> list = new ArrayList<ResourceEnvRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<GenericBeanType<T>> type = new ResourceEnvRefTypeImpl<GenericBeanType<T>>(this,
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<GenericBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<GenericBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<GenericBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<GenericBeanType<T>>> list = new ArrayList<MessageDestinationRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<GenericBeanType<T>> type = new MessageDestinationRefTypeImpl<GenericBeanType<T>>(
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<GenericBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<GenericBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<GenericBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<GenericBeanType<T>>> list = new ArrayList<PersistenceContextRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<GenericBeanType<T>> type = new PersistenceContextRefTypeImpl<GenericBeanType<T>>(
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<GenericBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<GenericBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<GenericBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<GenericBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<GenericBeanType<T>> type = new PersistenceUnitRefTypeImpl<GenericBeanType<T>>(this,
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<GenericBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<GenericBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<GenericBeanType<T>>> list = new ArrayList<LifecycleCallbackType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<GenericBeanType<T>> type = new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this,
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<GenericBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<GenericBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<GenericBeanType<T>>> list = new ArrayList<LifecycleCallbackType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<GenericBeanType<T>> type = new LifecycleCallbackTypeImpl<GenericBeanType<T>>(this,
               "pre-destroy", childNode, node);
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllServiceRef()
   {
      childNode.remove("service-ref");
      return this;
   }

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<GenericBeanType<T>> serviceRef()
   {
      return new ServiceRefTypeImpl<GenericBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<GenericBeanType<T>>> getServiceRefList()
   {
      List<ServiceRefType<GenericBeanType<T>>> list = new ArrayList<ServiceRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for (Node node : nodeList)
      {
         ServiceRefType<GenericBeanType<T>> type = new ServiceRefTypeImpl<GenericBeanType<T>>(this, "service-ref",
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeEjbName()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeMappedName()
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
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<GenericBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<GenericBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<GenericBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setJndiName(String jndiName)
   {
      childNode.getOrCreate("jndi-name").text(jndiName);
      return this;
   }

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeJndiName()
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
   // Element type : home-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>home-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setHomeJndiName(String homeJndiName)
   {
      childNode.getOrCreate("home-jndi-name").text(homeJndiName);
      return this;
   }

   /**
    * Removes the <code>home-jndi-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeHomeJndiName()
   {
      childNode.remove("home-jndi-name");
      return this;
   }

   /**
    * Returns the <code>home-jndi-name</code> element
    * @return the node defined for the element <code>home-jndi-name</code> 
    */
   public String getHomeJndiName()
   {
      return childNode.textValue("home-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>local-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setLocalJndiName(String localJndiName)
   {
      childNode.getOrCreate("local-jndi-name").text(localJndiName);
      return this;
   }

   /**
    * Removes the <code>local-jndi-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeLocalJndiName()
   {
      childNode.remove("local-jndi-name");
      return this;
   }

   /**
    * Returns the <code>local-jndi-name</code> element
    * @return the node defined for the element <code>local-jndi-name</code> 
    */
   public String getLocalJndiName()
   {
      return childNode.textValue("local-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setLocalHomeJndiName(String localHomeJndiName)
   {
      childNode.getOrCreate("local-home-jndi-name").text(localHomeJndiName);
      return this;
   }

   /**
    * Removes the <code>local-home-jndi-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeLocalHomeJndiName()
   {
      childNode.remove("local-home-jndi-name");
      return this;
   }

   /**
    * Returns the <code>local-home-jndi-name</code> element
    * @return the node defined for the element <code>local-home-jndi-name</code> 
    */
   public String getLocalHomeJndiName()
   {
      return childNode.textValue("local-home-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-binding-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-binding-policy</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy)
   {
      childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
      return this;
   }

   /**
    * Removes the <code>jndi-binding-policy</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeJndiBindingPolicy()
   {
      childNode.remove("jndi-binding-policy");
      return this;
   }

   /**
    * Returns the <code>jndi-binding-policy</code> element
    * @return the node defined for the element <code>jndi-binding-policy</code> 
    */
   public String getJndiBindingPolicy()
   {
      return childNode.textValue("jndi-binding-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeSecurityDomain()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeMethodAttributes()
   {
      childNode.remove("method-attributes");
      return this;
   }

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<GenericBeanType<T>> methodAttributes()
   {
      Node node = childNode.getOrCreate("method-attributes");
      MethodAttributesType<GenericBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<GenericBeanType<T>>(
            this, "method-attributes", childNode, node);
      return methodAttributes;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDepends(String depends)
   {
      childNode.create("depends").text(depends);
      return this;
   }

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setDependsList(String... values)
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllDepends()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllAnnotation()
   {
      childNode.remove("annotation");
      return this;
   }

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<GenericBeanType<T>> annotation()
   {
      return new AnnotationTypeImpl<GenericBeanType<T>>(this, "annotation", childNode);
   }

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<GenericBeanType<T>>> getAnnotationList()
   {
      List<AnnotationType<GenericBeanType<T>>> list = new ArrayList<AnnotationType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for (Node node : nodeList)
      {
         AnnotationType<GenericBeanType<T>> type = new AnnotationTypeImpl<GenericBeanType<T>>(this, "annotation",
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeIgnoreDependency()
   {
      childNode.remove("ignore-dependency");
      return this;
   }

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<GenericBeanType<T>> ignoreDependency()
   {
      Node node = childNode.getOrCreate("ignore-dependency");
      IgnoreDependencyType<GenericBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<GenericBeanType<T>>(
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> setAopDomainName(String aopDomainName)
   {
      childNode.getOrCreate("aop-domain-name").text(aopDomainName);
      return this;
   }

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAopDomainName()
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
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removePoolConfig()
   {
      childNode.remove("pool-config");
      return this;
   }

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<GenericBeanType<T>> poolConfig()
   {
      Node node = childNode.getOrCreate("pool-config");
      PoolConfigType<GenericBeanType<T>> poolConfig = new PoolConfigTypeImpl<GenericBeanType<T>>(this, "pool-config",
            childNode, node);
      return poolConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removeAllJndiRef()
   {
      childNode.remove("jndi-ref");
      return this;
   }

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<GenericBeanType<T>> jndiRef()
   {
      return new JndiRefTypeImpl<GenericBeanType<T>>(this, "jndi-ref", childNode);
   }

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<GenericBeanType<T>>> getJndiRefList()
   {
      List<JndiRefType<GenericBeanType<T>>> list = new ArrayList<JndiRefType<GenericBeanType<T>>>();
      List<Node> nodeList = childNode.get("jndi-ref");
      for (Node node : nodeList)
      {
         JndiRefType<GenericBeanType<T>> type = new JndiRefTypeImpl<GenericBeanType<T>>(this, "jndi-ref", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-component
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>port-component</code> element 
    * @return the current instance of {@link GenericBeanType<T>} 
    */
   public GenericBeanType<T> removePortComponent()
   {
      childNode.remove("port-component");
      return this;
   }

   /**
    * If not already created, a new <code>port-component</code> element will be created and returned.
    * Otherwise, the existing <code>port-component</code> element will be returned.
    * @return the node defined for the element <code>port-component</code> 
    */
   public PortComponentType<GenericBeanType<T>> portComponent()
   {
      Node node = childNode.getOrCreate("port-component");
      PortComponentType<GenericBeanType<T>> portComponent = new PortComponentTypeImpl<GenericBeanType<T>>(this,
            "port-component", childNode, node);
      return portComponent;
   }

}
