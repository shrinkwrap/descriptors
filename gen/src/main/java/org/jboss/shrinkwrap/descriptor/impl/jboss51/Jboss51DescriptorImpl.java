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
import java.util.Map;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.Jboss51Descriptor;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.spi.NodeProviderImplBase;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the jboss_5_1.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Jboss51Descriptor descriptor = Descriptors.create(Jboss51Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class Jboss51DescriptorImpl extends NodeProviderImplBase
      implements
         DescriptorNamespace<Jboss51Descriptor>,
         Jboss51Descriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public Jboss51DescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("jboss"));
   }

   public Jboss51DescriptorImpl(String descriptorName, Node node)
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

   public Jboss51Descriptor addDefaultNamespaces()
   {
      addNamespace("xmlns", "http://www.jboss.com/xml/ns/javaee");
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation",
            "http://www.jboss.com/xml/ns/javaee http://www.jboss.org/j2ee/schema/jboss_5_1.xsd");
      return this;
   }

   public Jboss51Descriptor addNamespace(String name, String value)
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

   public Jboss51Descriptor removeAllNamespaces()
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
   // Element type : loader-repository
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>loader-repository</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeLoaderRepository()
   {
      model.remove("loader-repository");
      return this;
   }

   /**
    * If not already created, a new <code>loader-repository</code> element will be created and returned.
    * Otherwise, the existing <code>loader-repository</code> element will be returned.
    * @return the node defined for the element <code>loader-repository</code> 
    */
   public LoaderRepositoryType<Jboss51Descriptor> loaderRepository()
   {
      Node node = model.getOrCreate("loader-repository");
      LoaderRepositoryType<Jboss51Descriptor> loaderRepository = new LoaderRepositoryTypeImpl<Jboss51Descriptor>(this,
            "loader-repository", model, node);
      return loaderRepository;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jmx-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jmx-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jmx-name</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setJmxName(String jmxName)
   {
      model.getOrCreate("jmx-name").text(jmxName);
      return this;
   }

   /**
    * Removes the <code>jmx-name</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeJmxName()
   {
      model.remove("jmx-name");
      return this;
   }

   /**
    * Returns the <code>jmx-name</code> element
    * @return the node defined for the element <code>jmx-name</code> 
    */
   public String getJmxName()
   {
      return model.textValue("jmx-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setSecurityDomain(String securityDomain)
   {
      model.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeSecurityDomain()
   {
      model.remove("security-domain");
      return this;
   }

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain()
   {
      return model.textValue("security-domain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : missing-method-permissions-excluded-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>missing-method-permissions-excluded-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>missing-method-permissions-excluded-mode</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setMissingMethodPermissionsExcludedMode(Boolean missingMethodPermissionsExcludedMode)
   {
      model.getOrCreate("missing-method-permissions-excluded-mode").text(missingMethodPermissionsExcludedMode);
      return this;
   }

   /**
    * Removes the <code>missing-method-permissions-excluded-mode</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeMissingMethodPermissionsExcludedMode()
   {
      model.remove("missing-method-permissions-excluded-mode");
      return this;
   }

   /**
    * Returns the <code>missing-method-permissions-excluded-mode</code> element
    * @return the node defined for the element <code>missing-method-permissions-excluded-mode</code> 
    */
   public Boolean isMissingMethodPermissionsExcludedMode()
   {
      return Strings.isTrue(model.textValue("missing-method-permissions-excluded-mode"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : unauthenticated-principal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unauthenticated-principal</code> element with the given value will be created.
    * Otherwise, the existing <code>unauthenticated-principal</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setUnauthenticatedPrincipal(String unauthenticatedPrincipal)
   {
      model.getOrCreate("unauthenticated-principal").text(unauthenticatedPrincipal);
      return this;
   }

   /**
    * Removes the <code>unauthenticated-principal</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeUnauthenticatedPrincipal()
   {
      model.remove("unauthenticated-principal");
      return this;
   }

   /**
    * Returns the <code>unauthenticated-principal</code> element
    * @return the node defined for the element <code>unauthenticated-principal</code> 
    */
   public String getUnauthenticatedPrincipal()
   {
      return model.textValue("unauthenticated-principal");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-binding-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-binding-policy</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setJndiBindingPolicy(String jndiBindingPolicy)
   {
      model.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
      return this;
   }

   /**
    * Removes the <code>jndi-binding-policy</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeJndiBindingPolicy()
   {
      model.remove("jndi-binding-policy");
      return this;
   }

   /**
    * Returns the <code>jndi-binding-policy</code> element
    * @return the node defined for the element <code>jndi-binding-policy</code> 
    */
   public String getJndiBindingPolicy()
   {
      return model.textValue("jndi-binding-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jacc-context-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jacc-context-id</code> element with the given value will be created.
    * Otherwise, the existing <code>jacc-context-id</code> element will be updated with the given value.
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setJaccContextId(String jaccContextId)
   {
      model.getOrCreate("jacc-context-id").text(jaccContextId);
      return this;
   }

   /**
    * Removes the <code>jacc-context-id</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeJaccContextId()
   {
      model.remove("jacc-context-id");
      return this;
   }

   /**
    * Returns the <code>jacc-context-id</code> element
    * @return the node defined for the element <code>jacc-context-id</code> 
    */
   public String getJaccContextId()
   {
      return model.textValue("jacc-context-id");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : webservices
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>webservices</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeWebservices()
   {
      model.remove("webservices");
      return this;
   }

   /**
    * If not already created, a new <code>webservices</code> element will be created and returned.
    * Otherwise, the existing <code>webservices</code> element will be returned.
    * @return the node defined for the element <code>webservices</code> 
    */
   public WebservicesType<Jboss51Descriptor> webservices()
   {
      Node node = model.getOrCreate("webservices");
      WebservicesType<Jboss51Descriptor> webservices = new WebservicesTypeImpl<Jboss51Descriptor>(this, "webservices",
            model, node);
      return webservices;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeEnterpriseBeans()
   {
      model.remove("enterprise-beans");
      return this;
   }

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<Jboss51Descriptor> enterpriseBeans()
   {
      Node node = model.getOrCreate("enterprise-beans");
      EnterpriseBeansType<Jboss51Descriptor> enterpriseBeans = new EnterpriseBeansTypeImpl<Jboss51Descriptor>(this,
            "enterprise-beans", model, node);
      return enterpriseBeans;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeAssemblyDescriptor()
   {
      model.remove("assembly-descriptor");
      return this;
   }

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<Jboss51Descriptor> assemblyDescriptor()
   {
      Node node = model.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<Jboss51Descriptor> assemblyDescriptor = new AssemblyDescriptorTypeImpl<Jboss51Descriptor>(
            this, "assembly-descriptor", model, node);
      return assemblyDescriptor;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-managers
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>resource-managers</code> element 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeResourceManagers()
   {
      model.remove("resource-managers");
      return this;
   }

   /**
    * If not already created, a new <code>resource-managers</code> element will be created and returned.
    * Otherwise, the existing <code>resource-managers</code> element will be returned.
    * @return the node defined for the element <code>resource-managers</code> 
    */
   public ResourceManagersType<Jboss51Descriptor> resourceManagers()
   {
      Node node = model.getOrCreate("resource-managers");
      ResourceManagersType<Jboss51Descriptor> resourceManagers = new ResourceManagersTypeImpl<Jboss51Descriptor>(this,
            "resource-managers", model, node);
      return resourceManagers;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setVersion(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeVersion()
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setMetadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeMetadataComplete()
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setDescription(String description)
   {
      model.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setDescriptionList(String... values)
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeAllDescription()
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setDisplayName(String displayName)
   {
      model.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor setDisplayNameList(String... values)
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeAllDisplayName()
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
    * @return the current instance of {@link Jboss51Descriptor} 
    */
   public Jboss51Descriptor removeAllIcon()
   {
      model.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<Jboss51Descriptor> icon()
   {
      return new IconTypeImpl<Jboss51Descriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<Jboss51Descriptor>> getIconList()
   {
      List<IconType<Jboss51Descriptor>> list = new ArrayList<IconType<Jboss51Descriptor>>();
      List<Node> nodeList = model.get("icon");
      for (Node node : nodeList)
      {
         IconType<Jboss51Descriptor> type = new IconTypeImpl<Jboss51Descriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

}
