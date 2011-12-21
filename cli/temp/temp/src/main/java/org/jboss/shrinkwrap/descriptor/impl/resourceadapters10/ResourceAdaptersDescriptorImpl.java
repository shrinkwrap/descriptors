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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ResourceAdaptersDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ResourceAdapterType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.ResourceAdapterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the resource-adapters_1_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ResourceAdaptersDescriptor descriptor = Descriptors.create(ResourceAdaptersDescriptor.class);
 * </code> 
 *
 *
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class ResourceAdaptersDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ResourceAdaptersDescriptor>, ResourceAdaptersDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceAdaptersDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("resource-adapters"));
   }

   public ResourceAdaptersDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://www.jboss.org/ironjacamar/schema");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://www.jboss.org/ironjacamar/schema http://www.jboss.org/ironjacamar/schema/resource-adapters_1_0.xsd");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>ResourceAdaptersDescriptor</code> 
    */
   public ResourceAdaptersDescriptor removeAllNamespaces()
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
   // ClassName: ResourceAdaptersDescriptor ElementName: resourceadapters:resource-adapterType ElementType : resource-adapter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-adapter</code> element will be returned.
    * @return the instance defined for the element <code>resource-adapter</code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> getOrCreateResourceAdapter()
   {
      List<Node> nodeList = model.get("resource-adapter");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model, nodeList.get(0));
      }
      return createResourceAdapter();
   }

   /**
    * Creates a new <code>resource-adapter</code> element 
    * @return the new created instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdapterType<ResourceAdaptersDescriptor> createResourceAdapter()
   {
      return new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model);
   }

   /**
    * Returns all <code>resource-adapter</code> elements
    * @return list of <code>resource-adapter</code> 
    */
   public List<ResourceAdapterType<ResourceAdaptersDescriptor>> getAllResourceAdapter()
   {
      List<ResourceAdapterType<ResourceAdaptersDescriptor>> list = new ArrayList<ResourceAdapterType<ResourceAdaptersDescriptor>>();
      List<Node> nodeList = model.get("resource-adapter");
      for(Node node: nodeList)
      {
         ResourceAdapterType<ResourceAdaptersDescriptor>  type = new ResourceAdapterTypeImpl<ResourceAdaptersDescriptor>(this, "resource-adapter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-adapter</code> elements 
    * @return the current instance of <code>ResourceAdapterType<ResourceAdaptersDescriptor></code> 
    */
   public ResourceAdaptersDescriptor removeAllResourceAdapter()
   {
      model.removeChildren("resource-adapter");
      return this;
   }

}
