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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbJar30Descriptor;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the ejb-jar_3_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     EjbJar30Descriptor descriptor = Descriptors.create(EjbJar30Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class EjbJar30DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<EjbJar30Descriptor>,
         EjbJar30Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EjbJar30DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("ejb-jar"));
   }

   public EjbJar30DescriptorImpl(String descriptorName, Node node)
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

   public EjbJar30Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/ejb-jar_3_0.xsd");
      return this;
   }

   public EjbJar30Descriptor addNamespace(String name, String value)
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

   public EjbJar30Descriptor removeAllNamespaces()
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
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeEnterpriseBeans()
   {
      model.remove("enterprise-beans");
      return this;
   }

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans()
   {
      Node node = model.getOrCreate("enterprise-beans");
      EnterpriseBeansType<EjbJar30Descriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJar30Descriptor>(this,
            "enterprise-beans", model, node);
      return enterpriseBeans;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptors
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeInterceptors()
   {
      model.remove("interceptors");
      return this;
   }

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return the node defined for the element <code>interceptors</code> 
    */
   public InterceptorsType<EjbJar30Descriptor> interceptors()
   {
      Node node = model.getOrCreate("interceptors");
      InterceptorsType<EjbJar30Descriptor> interceptors = new InterceptorsTypeImpl<EjbJar30Descriptor>(this,
            "interceptors", model, node);
      return interceptors;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : relationships
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeRelationships()
   {
      model.remove("relationships");
      return this;
   }

   /**
    * If not already created, a new <code>relationships</code> element will be created and returned.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return the node defined for the element <code>relationships</code> 
    */
   public RelationshipsType<EjbJar30Descriptor> relationships()
   {
      Node node = model.getOrCreate("relationships");
      RelationshipsType<EjbJar30Descriptor> relationships = new RelationshipsTypeImpl<EjbJar30Descriptor>(this,
            "relationships", model, node);
      return relationships;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAssemblyDescriptor()
   {
      model.remove("assembly-descriptor");
      return this;
   }

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor()
   {
      Node node = model.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<EjbJar30Descriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJar30Descriptor>(
            this, "assembly-descriptor", model, node);
      return assemblyDescriptor;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-client-jar
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-client-jar</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-client-jar</code> element will be updated with the given value.
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setEjbClientJar(String ejbClientJar)
   {
      model.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeEjbClientJar()
   {
      model.remove("ejb-client-jar");
      return this;
   }

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar()
   {
      return model.textValue("ejb-client-jar");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeVersion()
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
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setMetadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeMetadataComplete()
   {
      model.attributes().remove("metadata-complete");
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.attribute("metadata-complete"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDescriptionList(String... values)
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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllDescription()
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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor setDisplayNameList(String... values)
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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllDisplayName()
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
    * @return the current instance of {@link EjbJar30Descriptor} 
    */
   public EjbJar30Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EjbJar30Descriptor> icon()
   {
      return new IconTypeImpl<EjbJar30Descriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJar30Descriptor>> getIconList()
   {
      List<IconType<EjbJar30Descriptor>> list = new ArrayList<IconType<EjbJar30Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<EjbJar30Descriptor> type = new IconTypeImpl<EjbJar30Descriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

}
