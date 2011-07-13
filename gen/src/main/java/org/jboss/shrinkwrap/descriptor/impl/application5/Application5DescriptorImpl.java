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
package org.jboss.shrinkwrap.descriptor.impl.application5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.application5.Application5Descriptor;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the application_5.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Application5Descriptor descriptor = Descriptors.create(Application5Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class Application5DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Application5Descriptor>,
         Application5Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public Application5DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("application"));
   }

   public Application5DescriptorImpl(String descriptorName, Node node)
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

   public Application5Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_5.xsd");
      return this;
   }

   public Application5Descriptor addNamespace(String name, String value)
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

   public Application5Descriptor removeAllNamespaces()
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
   // Element type : module
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllModule()
   {
      model.remove("module");
      return this;
   }

   /**
    * Returns the <code>module</code> element
    * @return the node defined for the element <code>module</code> 
    */
   public ModuleType<Application5Descriptor> module()
   {
      return new ModuleTypeImpl<Application5Descriptor>(this, "module", model);
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<Application5Descriptor>> getModuleList()
   {
      List<ModuleType<Application5Descriptor>> list = new ArrayList<ModuleType<Application5Descriptor>>();
      List<Node> nodeList = model.get("module");
      for (Node node : nodeList)
      {
         ModuleType<Application5Descriptor> type = new ModuleTypeImpl<Application5Descriptor>(this, "module", model,
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllSecurityRole()
   {
      model.remove("security-role");
      return this;
   }

   /**
    * Returns the <code>security-role</code> element
    * @return the node defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<Application5Descriptor> securityRole()
   {
      return new SecurityRoleTypeImpl<Application5Descriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<Application5Descriptor>> getSecurityRoleList()
   {
      List<SecurityRoleType<Application5Descriptor>> list = new ArrayList<SecurityRoleType<Application5Descriptor>>();
      List<Node> nodeList = model.get("security-role");
      for (Node node : nodeList)
      {
         SecurityRoleType<Application5Descriptor> type = new SecurityRoleTypeImpl<Application5Descriptor>(this,
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setLibraryDirectory(String libraryDirectory)
   {
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeLibraryDirectory()
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
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeVersion()
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDescriptionList(String... values)
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllDescription()
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor setDisplayNameList(String... values)
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllDisplayName()
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
    * @return the current instance of {@link Application5Descriptor} 
    */
   public Application5Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<Application5Descriptor> icon()
   {
      return new IconTypeImpl<Application5Descriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<Application5Descriptor>> getIconList()
   {
      List<IconType<Application5Descriptor>> list = new ArrayList<IconType<Application5Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<Application5Descriptor> type = new IconTypeImpl<Application5Descriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

}
