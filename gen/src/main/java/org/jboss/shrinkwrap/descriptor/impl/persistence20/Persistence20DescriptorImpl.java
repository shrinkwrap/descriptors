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
package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence20Descriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the persistence_2_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Persistence20Descriptor descriptor = Descriptors.create(Persistence20Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class Persistence20DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Persistence20Descriptor>,
         Persistence20Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public Persistence20DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("persistence"));
   }

   public Persistence20DescriptorImpl(String descriptorName, Node node)
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

   public Persistence20Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/persistence");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd");
      return this;
   }

   public Persistence20Descriptor addNamespace(String name, String value)
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

   public Persistence20Descriptor removeAllNamespaces()
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
   // Element type : persistence-unit
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor removeAllPersistenceUnit()
   {
      model.remove("persistence-unit");
      return this;
   }

   /**
    * Returns the <code>persistence-unit</code> element
    * @return the node defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<Persistence20Descriptor> persistenceUnit()
   {
      return new PersistenceUnitImpl<Persistence20Descriptor>(this, "persistence-unit", model);
   }

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<Persistence20Descriptor>> getPersistenceUnitList()
   {
      List<PersistenceUnit<Persistence20Descriptor>> list = new ArrayList<PersistenceUnit<Persistence20Descriptor>>();
      List<Node> nodeList = model.get("persistence-unit");
      for (Node node : nodeList)
      {
         PersistenceUnit<Persistence20Descriptor> type = new PersistenceUnitImpl<Persistence20Descriptor>(this,
               "persistence-unit", model, node);
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
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor removeVersion()
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

}
