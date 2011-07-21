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
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JbossType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> jbossType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The jboss element is the root element of the jboss.xml file. It contains <br> 
 * all the information used by jboss but not described in the ejb-jar.xml file. All of it is <br> 
 * optional. 1- the application assembler can define custom container configurations for the <br> 
 * beans. Standard configurations are provided in standardjboss.xml 2- the deployer can <br> 
 * override the jndi names under which the beans are deployed 3- the deployer can specify <br> 
 * runtime jndi names for resource managers. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class JbossTypeImpl<T> implements Child<T>, JbossType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JbossTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public JbossTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllDescription()
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
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllDisplayName()
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
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<JbossType<T>> icon()
   {
      return new IconTypeImpl<JbossType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JbossType<T>>> getIconList()
   {
      List<IconType<JbossType<T>>> list = new ArrayList<IconType<JbossType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<JbossType<T>> type = new IconTypeImpl<JbossType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : loader-repository
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>loader-repository</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeLoaderRepository()
   {
      childNode.remove("loader-repository");
      return this;
   }

   /**
    * If not already created, a new <code>loader-repository</code> element will be created and returned.
    * Otherwise, the existing <code>loader-repository</code> element will be returned.
    * @return the node defined for the element <code>loader-repository</code> 
    */
   public LoaderRepositoryType<JbossType<T>> loaderRepository()
   {
      Node node = childNode.getOrCreate("loader-repository");
      LoaderRepositoryType<JbossType<T>> loaderRepository = new LoaderRepositoryTypeImpl<JbossType<T>>(this,
            "loader-repository", childNode, node);
      return loaderRepository;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jmx-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jmx-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jmx-name</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJmxName(String jmxName)
   {
      childNode.getOrCreate("jmx-name").text(jmxName);
      return this;
   }

   /**
    * Removes the <code>jmx-name</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJmxName()
   {
      childNode.remove("jmx-name");
      return this;
   }

   /**
    * Returns the <code>jmx-name</code> element
    * @return the node defined for the element <code>jmx-name</code> 
    */
   public String getJmxName()
   {
      return childNode.textValue("jmx-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeSecurityDomain()
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
   // Element type : missing-method-permissions-excluded-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>missing-method-permissions-excluded-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>missing-method-permissions-excluded-mode</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setMissingMethodPermissionsExcludedMode(Boolean missingMethodPermissionsExcludedMode)
   {
      childNode.getOrCreate("missing-method-permissions-excluded-mode").text(missingMethodPermissionsExcludedMode);
      return this;
   }

   /**
    * Removes the <code>missing-method-permissions-excluded-mode</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeMissingMethodPermissionsExcludedMode()
   {
      childNode.remove("missing-method-permissions-excluded-mode");
      return this;
   }

   /**
    * Returns the <code>missing-method-permissions-excluded-mode</code> element
    * @return the node defined for the element <code>missing-method-permissions-excluded-mode</code> 
    */
   public Boolean isMissingMethodPermissionsExcludedMode()
   {
      return Strings.isTrue(childNode.textValue("missing-method-permissions-excluded-mode"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : unauthenticated-principal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unauthenticated-principal</code> element with the given value will be created.
    * Otherwise, the existing <code>unauthenticated-principal</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setUnauthenticatedPrincipal(String unauthenticatedPrincipal)
   {
      childNode.getOrCreate("unauthenticated-principal").text(unauthenticatedPrincipal);
      return this;
   }

   /**
    * Removes the <code>unauthenticated-principal</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeUnauthenticatedPrincipal()
   {
      childNode.remove("unauthenticated-principal");
      return this;
   }

   /**
    * Returns the <code>unauthenticated-principal</code> element
    * @return the node defined for the element <code>unauthenticated-principal</code> 
    */
   public String getUnauthenticatedPrincipal()
   {
      return childNode.textValue("unauthenticated-principal");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-binding-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-binding-policy</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJndiBindingPolicy(String jndiBindingPolicy)
   {
      childNode.getOrCreate("jndi-binding-policy").text(jndiBindingPolicy);
      return this;
   }

   /**
    * Removes the <code>jndi-binding-policy</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJndiBindingPolicy()
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
   // Element type : jacc-context-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jacc-context-id</code> element with the given value will be created.
    * Otherwise, the existing <code>jacc-context-id</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJaccContextId(String jaccContextId)
   {
      childNode.getOrCreate("jacc-context-id").text(jaccContextId);
      return this;
   }

   /**
    * Removes the <code>jacc-context-id</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJaccContextId()
   {
      childNode.remove("jacc-context-id");
      return this;
   }

   /**
    * Returns the <code>jacc-context-id</code> element
    * @return the node defined for the element <code>jacc-context-id</code> 
    */
   public String getJaccContextId()
   {
      return childNode.textValue("jacc-context-id");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : webservices
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>webservices</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeWebservices()
   {
      childNode.remove("webservices");
      return this;
   }

   /**
    * If not already created, a new <code>webservices</code> element will be created and returned.
    * Otherwise, the existing <code>webservices</code> element will be returned.
    * @return the node defined for the element <code>webservices</code> 
    */
   public WebservicesType<JbossType<T>> webservices()
   {
      Node node = childNode.getOrCreate("webservices");
      WebservicesType<JbossType<T>> webservices = new WebservicesTypeImpl<JbossType<T>>(this, "webservices", childNode,
            node);
      return webservices;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeEnterpriseBeans()
   {
      childNode.remove("enterprise-beans");
      return this;
   }

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<JbossType<T>> enterpriseBeans()
   {
      Node node = childNode.getOrCreate("enterprise-beans");
      EnterpriseBeansType<JbossType<T>> enterpriseBeans = new EnterpriseBeansTypeImpl<JbossType<T>>(this,
            "enterprise-beans", childNode, node);
      return enterpriseBeans;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAssemblyDescriptor()
   {
      childNode.remove("assembly-descriptor");
      return this;
   }

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<JbossType<T>> assemblyDescriptor()
   {
      Node node = childNode.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<JbossType<T>> assemblyDescriptor = new AssemblyDescriptorTypeImpl<JbossType<T>>(this,
            "assembly-descriptor", childNode, node);
      return assemblyDescriptor;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-managers
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>resource-managers</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeResourceManagers()
   {
      childNode.remove("resource-managers");
      return this;
   }

   /**
    * If not already created, a new <code>resource-managers</code> element will be created and returned.
    * Otherwise, the existing <code>resource-managers</code> element will be returned.
    * @return the node defined for the element <code>resource-managers</code> 
    */
   public ResourceManagersType<JbossType<T>> resourceManagers()
   {
      Node node = childNode.getOrCreate("resource-managers");
      ResourceManagersType<JbossType<T>> resourceManagers = new ResourceManagersTypeImpl<JbossType<T>>(this,
            "resource-managers", childNode, node);
      return resourceManagers;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeVersion()
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

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeMetadataComplete()
   {
      childNode.attributes().remove("metadata-complete");
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

}
