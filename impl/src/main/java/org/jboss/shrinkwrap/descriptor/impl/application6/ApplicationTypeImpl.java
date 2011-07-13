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
package org.jboss.shrinkwrap.descriptor.impl.application6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> applicationType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The applicationType defines the structure of the <br> 
 * application. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class ApplicationTypeImpl<T> implements Child<T>, ApplicationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ApplicationTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ApplicationTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllDescription()
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllDisplayName()
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ApplicationType<T>> icon()
   {
      return new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ApplicationType<T>>> getIconList()
   {
      List<IconType<ApplicationType<T>>> list = new ArrayList<IconType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<ApplicationType<T>> type = new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : application-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application-name</code> element with the given value will be created.
    * Otherwise, the existing <code>application-name</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setApplicationName(String applicationName)
   {
      childNode.getOrCreate("application-name").text(applicationName);
      return this;
   }

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeApplicationName()
   {
      childNode.remove("application-name");
      return this;
   }

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return childNode.textValue("application-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initialize-in-order
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>initialize-in-order</code> element with the given value will be created.
    * Otherwise, the existing <code>initialize-in-order</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setInitializeInOrder(GenericBooleanType initializeInOrder)
   {
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * If not already created, a new <code>initialize-in-order</code> element with the given value will be created.
    * Otherwise, the existing <code>initialize-in-order</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setInitializeInOrder(String initializeInOrder)
   {
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the node defined for the element <code>initialize-in-order</code> 
    */
   public GenericBooleanType getInitializeInOrder()
   {
      return GenericBooleanType.getFromStringValue(childNode.textValue("initialize-in-order"));
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the node defined for the element <code>initialize-in-order</code> 
    */
   public String getInitializeInOrderAsString()
   {
      return childNode.textValue("initialize-in-order");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllModule()
   {
      childNode.remove("module");
      return this;
   }

   /**
    * Returns the <code>module</code> element
    * @return the node defined for the element <code>module</code> 
    */
   public ModuleType<ApplicationType<T>> module()
   {
      return new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode);
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<ApplicationType<T>>> getModuleList()
   {
      List<ModuleType<ApplicationType<T>>> list = new ArrayList<ModuleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("module");
      for (Node node : nodeList)
      {
         ModuleType<ApplicationType<T>> type = new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllSecurityRole()
   {
      childNode.remove("security-role");
      return this;
   }

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<ApplicationType<T>> securityRole()
   {
      return new SecurityRoleTypeImpl<ApplicationType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<ApplicationType<T>>> getSecurityRoleList()
   {
      List<SecurityRoleType<ApplicationType<T>>> list = new ArrayList<SecurityRoleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<ApplicationType<T>> type = new SecurityRoleTypeImpl<ApplicationType<T>>(this,
               "security-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : library-directory
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>library-directory</code> element with the given value will be created.
    * Otherwise, the existing <code>library-directory</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setLibraryDirectory(String libraryDirectory)
   {
      childNode.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeLibraryDirectory()
   {
      childNode.remove("library-directory");
      return this;
   }

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return childNode.textValue("library-directory");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<ApplicationType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<ApplicationType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<ApplicationType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<ApplicationType<T>>> list = new ArrayList<EnvEntryType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<ApplicationType<T>> type = new EnvEntryTypeImpl<ApplicationType<T>>(this, "env-entry", childNode,
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ApplicationType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<ApplicationType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ApplicationType<T>>> getEjbRefList()
   {
      List<EjbRefType<ApplicationType<T>>> list = new ArrayList<EjbRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<ApplicationType<T>> type = new EjbRefTypeImpl<ApplicationType<T>>(this, "ejb-ref", childNode, node);
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ApplicationType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ApplicationType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<ApplicationType<T>>> list = new ArrayList<EjbLocalRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<ApplicationType<T>> type = new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "ejb-local-ref",
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ApplicationType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<ApplicationType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ApplicationType<T>>> getResourceRefList()
   {
      List<ResourceRefType<ApplicationType<T>>> list = new ArrayList<ResourceRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<ApplicationType<T>> type = new ResourceRefTypeImpl<ApplicationType<T>>(this, "resource-ref",
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ApplicationType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ApplicationType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<ApplicationType<T>>> list = new ArrayList<ResourceEnvRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<ApplicationType<T>> type = new ResourceEnvRefTypeImpl<ApplicationType<T>>(this,
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ApplicationType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ApplicationType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<ApplicationType<T>>> list = new ArrayList<MessageDestinationRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<ApplicationType<T>> type = new MessageDestinationRefTypeImpl<ApplicationType<T>>(
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<ApplicationType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<ApplicationType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<ApplicationType<T>>> list = new ArrayList<PersistenceContextRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<ApplicationType<T>> type = new PersistenceContextRefTypeImpl<ApplicationType<T>>(
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<ApplicationType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<ApplicationType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<ApplicationType<T>>> list = new ArrayList<PersistenceUnitRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<ApplicationType<T>> type = new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllMessageDestination()
   {
      childNode.remove("message-destination");
      return this;
   }

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<ApplicationType<T>> messageDestination()
   {
      return new MessageDestinationTypeImpl<ApplicationType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<ApplicationType<T>>> getMessageDestinationList()
   {
      List<MessageDestinationType<ApplicationType<T>>> list = new ArrayList<MessageDestinationType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for (Node node : nodeList)
      {
         MessageDestinationType<ApplicationType<T>> type = new MessageDestinationTypeImpl<ApplicationType<T>>(this,
               "message-destination", childNode, node);
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
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<ApplicationType<T>> dataSource()
   {
      return new DataSourceTypeImpl<ApplicationType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<ApplicationType<T>>> getDataSourceList()
   {
      List<DataSourceType<ApplicationType<T>>> list = new ArrayList<DataSourceType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<ApplicationType<T>> type = new DataSourceTypeImpl<ApplicationType<T>>(this, "data-source",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link ApplicationType<T>} 
    */
   public ApplicationType<T> removeVersion()
   {
      childNode.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return childNode.attributes().get("version");
   }

}
