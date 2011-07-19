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
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.application6.Application6Descriptor;
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
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the application_6.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Application6Descriptor descriptor = Descriptors.create(Application6Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class Application6DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Application6Descriptor>,
         Application6Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public Application6DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("application"));
   }

   public Application6DescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }

   protected DescriptorExporter getExporter()
   {
      return new XmlDomExporter();
   }

   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||

   public Application6Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_6.xsd");
      return this;
   }

   public Application6Descriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   public Application6Descriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.attributes();
      for (String name : attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://"))
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name : nameSpaceKeys)
      {
         model.attributes().remove(name);
      }
      return this;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : application-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application-name</code> element with the given value will be created.
    * Otherwise, the existing <code>application-name</code> element will be updated with the given value.
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setApplicationName(String applicationName)
   {
      model.getOrCreate("application-name").text(applicationName);
      return this;
   }

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeApplicationName()
   {
      model.remove("application-name");
      return this;
   }

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return model.textValue("application-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initialize-in-order
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>initialize-in-order</code> element with the given value will be created.
    * Otherwise, the existing <code>initialize-in-order</code> element will be updated with the given value.
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setInitializeInOrder(GenericBooleanType initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * If not already created, a new <code>initialize-in-order</code> element with the given value will be created.
    * Otherwise, the existing <code>initialize-in-order</code> element will be updated with the given value.
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setInitializeInOrder(String initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the node defined for the element <code>initialize-in-order</code> 
    */
   public GenericBooleanType getInitializeInOrder()
   {
      return GenericBooleanType.getFromStringValue(model.textValue("initialize-in-order"));
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the node defined for the element <code>initialize-in-order</code> 
    */
   public String getInitializeInOrderAsString()
   {
      return model.textValue("initialize-in-order");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllModule()
   {
      model.remove("module");
      return this;
   }

   /**
    * Returns the <code>module</code> element
    * @return the node defined for the element <code>module</code> 
    */
   public ModuleType<Application6Descriptor> module()
   {
      return new ModuleTypeImpl<Application6Descriptor>(this, "module", model);
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<Application6Descriptor>> getModuleList()
   {
      List<ModuleType<Application6Descriptor>> list = new ArrayList<ModuleType<Application6Descriptor>>();
      List<Node> nodeList = model.get("module");
      for (Node node : nodeList)
      {
         ModuleType<Application6Descriptor> type = new ModuleTypeImpl<Application6Descriptor>(this, "module", model,
               node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<Application6Descriptor> securityRole()
   {
      return new SecurityRoleTypeImpl<Application6Descriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<Application6Descriptor>> getSecurityRoleList()
   {
      List<SecurityRoleType<Application6Descriptor>> list = new ArrayList<SecurityRoleType<Application6Descriptor>>();
      List<Node> nodeList = model.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<Application6Descriptor> type = new SecurityRoleTypeImpl<Application6Descriptor>(this,
               "security-role", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setLibraryDirectory(String libraryDirectory)
   {
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeLibraryDirectory()
   {
      model.remove("library-directory");
      return this;
   }

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return model.textValue("library-directory");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllEnvEntry()
   {
      model.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<Application6Descriptor> envEntry()
   {
      return new EnvEntryTypeImpl<Application6Descriptor>(this, "env-entry", model);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<Application6Descriptor>> getEnvEntryList()
   {
      List<EnvEntryType<Application6Descriptor>> list = new ArrayList<EnvEntryType<Application6Descriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<Application6Descriptor> type = new EnvEntryTypeImpl<Application6Descriptor>(this, "env-entry",
               model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllEjbRef()
   {
      model.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<Application6Descriptor> ejbRef()
   {
      return new EjbRefTypeImpl<Application6Descriptor>(this, "ejb-ref", model);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<Application6Descriptor>> getEjbRefList()
   {
      List<EjbRefType<Application6Descriptor>> list = new ArrayList<EjbRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<Application6Descriptor> type = new EjbRefTypeImpl<Application6Descriptor>(this, "ejb-ref", model,
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllEjbLocalRef()
   {
      model.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<Application6Descriptor> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<Application6Descriptor>(this, "ejb-local-ref", model);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<Application6Descriptor>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<Application6Descriptor>> list = new ArrayList<EjbLocalRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<Application6Descriptor> type = new EjbLocalRefTypeImpl<Application6Descriptor>(this,
               "ejb-local-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllResourceRef()
   {
      model.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<Application6Descriptor> resourceRef()
   {
      return new ResourceRefTypeImpl<Application6Descriptor>(this, "resource-ref", model);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<Application6Descriptor>> getResourceRefList()
   {
      List<ResourceRefType<Application6Descriptor>> list = new ArrayList<ResourceRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<Application6Descriptor> type = new ResourceRefTypeImpl<Application6Descriptor>(this,
               "resource-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllResourceEnvRef()
   {
      model.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<Application6Descriptor> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<Application6Descriptor>(this, "resource-env-ref", model);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<Application6Descriptor>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<Application6Descriptor>> list = new ArrayList<ResourceEnvRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<Application6Descriptor> type = new ResourceEnvRefTypeImpl<Application6Descriptor>(this,
               "resource-env-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllMessageDestinationRef()
   {
      model.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<Application6Descriptor> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<Application6Descriptor>(this, "message-destination-ref", model);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<Application6Descriptor>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<Application6Descriptor>> list = new ArrayList<MessageDestinationRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<Application6Descriptor> type = new MessageDestinationRefTypeImpl<Application6Descriptor>(
               this, "message-destination-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllPersistenceContextRef()
   {
      model.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<Application6Descriptor> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<Application6Descriptor>(this, "persistence-context-ref", model);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<Application6Descriptor>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<Application6Descriptor>> list = new ArrayList<PersistenceContextRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<Application6Descriptor> type = new PersistenceContextRefTypeImpl<Application6Descriptor>(
               this, "persistence-context-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllPersistenceUnitRef()
   {
      model.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<Application6Descriptor> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<Application6Descriptor>(this, "persistence-unit-ref", model);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<Application6Descriptor>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<Application6Descriptor>> list = new ArrayList<PersistenceUnitRefType<Application6Descriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<Application6Descriptor> type = new PersistenceUnitRefTypeImpl<Application6Descriptor>(
               this, "persistence-unit-ref", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllMessageDestination()
   {
      model.remove("message-destination");
      return this;
   }

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<Application6Descriptor> messageDestination()
   {
      return new MessageDestinationTypeImpl<Application6Descriptor>(this, "message-destination", model);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<Application6Descriptor>> getMessageDestinationList()
   {
      List<MessageDestinationType<Application6Descriptor>> list = new ArrayList<MessageDestinationType<Application6Descriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for (Node node : nodeList)
      {
         MessageDestinationType<Application6Descriptor> type = new MessageDestinationTypeImpl<Application6Descriptor>(
               this, "message-destination", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllDataSource()
   {
      model.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<Application6Descriptor> dataSource()
   {
      return new DataSourceTypeImpl<Application6Descriptor>(this, "data-source", model);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<Application6Descriptor>> getDataSourceList()
   {
      List<DataSourceType<Application6Descriptor>> list = new ArrayList<DataSourceType<Application6Descriptor>>();
      List<Node> nodeList = model.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<Application6Descriptor> type = new DataSourceTypeImpl<Application6Descriptor>(this,
               "data-source", model, node);
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeVersion()
   {
      model.attributes().remove("version");
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return model.attributes().get("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setDescriptionList(String... values)
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllDescription()
   {
      model.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("description");
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor setDisplayNameList(String... values)
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllDisplayName()
   {
      model.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("display-name");
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
    * @return the current instance of {@link Application6Descriptor} 
    */
   public Application6Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<Application6Descriptor> icon()
   {
      return new IconTypeImpl<Application6Descriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<Application6Descriptor>> getIconList()
   {
      List<IconType<Application6Descriptor>> list = new ArrayList<IconType<Application6Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<Application6Descriptor> type = new IconTypeImpl<Application6Descriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

}
