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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourcesDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DriversType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DriversTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourceType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DatasourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaDatasourceType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.XaDatasourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the datasources_1_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     DatasourcesDescriptor descriptor = Descriptors.create(DatasourcesDescriptor.class);
 * </code> 
 *
 *
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class DatasourcesDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<DatasourcesDescriptor>, DatasourcesDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DatasourcesDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("datasources"));
   }

   public DatasourcesDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://www.jboss.org/ironjacamar/schema");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://www.jboss.org/ironjacamar/schema http://www.jboss.org/ironjacamar/schema/datasources_1_0.xsd");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeAllNamespaces()
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
   // ClassName: DatasourcesDescriptor ElementName: datasources:driversType ElementType : drivers
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>drivers</code> element with the given value will be created.
    * Otherwise, the existing <code>drivers</code> element will be returned.
    * @return  a new or existing instance of <code>DriversType<DatasourcesDescriptor></code> 
    */
   public DriversType<DatasourcesDescriptor> getOrCreateDrivers()
   {
      Node node = model.getOrCreate("drivers");
      DriversType<DatasourcesDescriptor> drivers = new DriversTypeImpl<DatasourcesDescriptor>(this, "drivers", model, node);
      return drivers;
   }

   /**
    * Removes the <code>drivers</code> element 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeDrivers()
   {
      model.removeChildren("drivers");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element with the given value will be created.
    * Otherwise, the existing <code>datasource</code> element will be returned.
    * @return  a new or existing instance of <code>DatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourceType<DatasourcesDescriptor> getOrCreateDatasource()
   {
      Node node = model.getOrCreate("datasource");
      DatasourceType<DatasourcesDescriptor> datasource = new DatasourceTypeImpl<DatasourcesDescriptor>(this, "datasource", model, node);
      return datasource;
   }

   /**
    * Removes the <code>datasource</code> element 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeDatasource()
   {
      model.removeChildren("datasource");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-datasource</code> element will be returned.
    * @return  a new or existing instance of <code>XaDatasourceType<DatasourcesDescriptor></code> 
    */
   public XaDatasourceType<DatasourcesDescriptor> getOrCreateXaDatasource()
   {
      Node node = model.getOrCreate("xa-datasource");
      XaDatasourceType<DatasourcesDescriptor> xaDatasource = new XaDatasourceTypeImpl<DatasourcesDescriptor>(this, "xa-datasource", model, node);
      return xaDatasource;
   }

   /**
    * Removes the <code>xa-datasource</code> element 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeXaDatasource()
   {
      model.removeChildren("xa-datasource");
      return this;
   }

}
