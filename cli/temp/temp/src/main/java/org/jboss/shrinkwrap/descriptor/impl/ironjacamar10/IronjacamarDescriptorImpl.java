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
package org.jboss.shrinkwrap.descriptor.impl.ironjacamar10; 

import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.IronjacamarDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.BeanValidationGroupsType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.BeanValidationGroupsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.TransactionSupportType;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConnectionDefinitionsType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ConnectionDefinitionsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.AdminObjectsType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.AdminObjectsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the ironjacamar_1_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     IronjacamarDescriptor descriptor = Descriptors.create(IronjacamarDescriptor.class);
 * </code> 
 *
 *
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class IronjacamarDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<IronjacamarDescriptor>, IronjacamarDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IronjacamarDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("ironjacamar"));
   }

   public IronjacamarDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://www.jboss.org/ironjacamar/schema");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://www.jboss.org/ironjacamar/schema http://www.jboss.org/ironjacamar/schema/ironjacamar_1_0.xsd");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      Map<String, String> attributes = model.getAttributes();
      for (String name: attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      Map<String, String> attributes = model.getAttributes();
      for (String name: attributes.keySet())
      {
         String value = attributes.get(name);
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:bean-validation-groupsType ElementType : bean-validation-groups
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-validation-groups</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-validation-groups</code> element will be returned.
    * @return  a new or existing instance of <code>BeanValidationGroupsType<IronjacamarDescriptor></code> 
    */
   public BeanValidationGroupsType<IronjacamarDescriptor> getOrCreateBeanValidationGroups()
   {
      Node node = model.getOrCreate("bean-validation-groups");
      BeanValidationGroupsType<IronjacamarDescriptor> beanValidationGroups = new BeanValidationGroupsTypeImpl<IronjacamarDescriptor>(this, "bean-validation-groups", model, node);
      return beanValidationGroups;
   }

   /**
    * Removes the <code>bean-validation-groups</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeBeanValidationGroups()
   {
      model.removeChildren("bean-validation-groups");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: xsd:token ElementType : bootstrap-context
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bootstrap-context</code> element
    * @param bootstrapContext the value for the element <code>bootstrap-context</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor bootstrapContext(String bootstrapContext)
   {
      model.getOrCreate("bootstrap-context").text(bootstrapContext);
      return this;
   }

   /**
    * Returns the <code>bootstrap-context</code> element
    * @return the node defined for the element <code>bootstrap-context</code> 
    */
   public String getBootstrapContext()
   {
      return model.getTextValueForPatternName("bootstrap-context");
   }

   /**
    * Removes the <code>bootstrap-context</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeBootstrapContext()
   {
      model.removeChildren("bootstrap-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<IronjacamarDescriptor> getOrCreateConfigProperty()
   {
      List<Node> nodeList = model.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<IronjacamarDescriptor>(this, "config-property", model, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<IronjacamarDescriptor></code> 
    */
   public ConfigPropertyType<IronjacamarDescriptor> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<IronjacamarDescriptor>(this, "config-property", model);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<IronjacamarDescriptor>> getAllConfigProperty()
   {
      List<ConfigPropertyType<IronjacamarDescriptor>> list = new ArrayList<ConfigPropertyType<IronjacamarDescriptor>>();
      List<Node> nodeList = model.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<IronjacamarDescriptor>  type = new ConfigPropertyTypeImpl<IronjacamarDescriptor>(this, "config-property", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<IronjacamarDescriptor></code> 
    */
   public IronjacamarDescriptor removeAllConfigProperty()
   {
      model.removeChildren("config-property");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor transactionSupport(TransactionSupportType transactionSupport)
   {
      model.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor transactionSupport(String transactionSupport)
   {
      model.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport()
   {
      return TransactionSupportType.getFromStringValue(model.getTextValueForPatternName("transaction-support"));
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString()
   {
      return model.getTextValueForPatternName("transaction-support");
   }

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeTransactionSupport()
   {
      model.removeAttribute("transaction-support");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:connection-definitionsType ElementType : connection-definitions
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definitions</code> element with the given value will be created.
    * Otherwise, the existing <code>connection-definitions</code> element will be returned.
    * @return  a new or existing instance of <code>ConnectionDefinitionsType<IronjacamarDescriptor></code> 
    */
   public ConnectionDefinitionsType<IronjacamarDescriptor> getOrCreateConnectionDefinitions()
   {
      Node node = model.getOrCreate("connection-definitions");
      ConnectionDefinitionsType<IronjacamarDescriptor> connectionDefinitions = new ConnectionDefinitionsTypeImpl<IronjacamarDescriptor>(this, "connection-definitions", model, node);
      return connectionDefinitions;
   }

   /**
    * Removes the <code>connection-definitions</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeConnectionDefinitions()
   {
      model.removeChildren("connection-definitions");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IronjacamarDescriptor ElementName: ironjacamar:admin-objectsType ElementType : admin-objects
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-objects</code> element with the given value will be created.
    * Otherwise, the existing <code>admin-objects</code> element will be returned.
    * @return  a new or existing instance of <code>AdminObjectsType<IronjacamarDescriptor></code> 
    */
   public AdminObjectsType<IronjacamarDescriptor> getOrCreateAdminObjects()
   {
      Node node = model.getOrCreate("admin-objects");
      AdminObjectsType<IronjacamarDescriptor> adminObjects = new AdminObjectsTypeImpl<IronjacamarDescriptor>(this, "admin-objects", model, node);
      return adminObjects;
   }

   /**
    * Removes the <code>admin-objects</code> element 
    * @return the current instance of <code>IronjacamarDescriptor</code> 
    */
   public IronjacamarDescriptor removeAdminObjects()
   {
      model.removeChildren("admin-objects");
      return this;
   }

}
