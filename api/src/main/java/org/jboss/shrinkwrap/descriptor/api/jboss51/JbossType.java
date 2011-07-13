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
package org.jboss.shrinkwrap.descriptor.api.jboss51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;

/**
 * This interface defines the contract for the <code> jbossType </code> xsd type 
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
public interface JbossType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<JbossType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JbossType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : loader-repository
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>loader-repository</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeLoaderRepository();

   /**
    * If not already created, a new <code>loader-repository</code> element will be created and returned.
    * Otherwise, the existing <code>loader-repository</code> element will be returned.
    * @return the node defined for the element <code>loader-repository</code> 
    */
   public LoaderRepositoryType<JbossType<T>> loaderRepository();

   // -------------------------------------------------------------------------------------||
   // Element type : jmx-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jmx-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jmx-name</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJmxName(String jmxName);

   /**
    * Removes the <code>jmx-name</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJmxName();

   /**
    * Returns the <code>jmx-name</code> element
    * @return the node defined for the element <code>jmx-name</code> 
    */
   public String getJmxName();

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setSecurityDomain(String securityDomain);

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeSecurityDomain();

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   // -------------------------------------------------------------------------------------||
   // Element type : missing-method-permissions-excluded-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>missing-method-permissions-excluded-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>missing-method-permissions-excluded-mode</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setMissingMethodPermissionsExcludedMode(Boolean missingMethodPermissionsExcludedMode);

   /**
    * Removes the <code>missing-method-permissions-excluded-mode</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeMissingMethodPermissionsExcludedMode();

   /**
    * Returns the <code>missing-method-permissions-excluded-mode</code> element
    * @return the node defined for the element <code>missing-method-permissions-excluded-mode</code> 
    */
   public Boolean isMissingMethodPermissionsExcludedMode();

   // -------------------------------------------------------------------------------------||
   // Element type : unauthenticated-principal
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unauthenticated-principal</code> element with the given value will be created.
    * Otherwise, the existing <code>unauthenticated-principal</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setUnauthenticatedPrincipal(String unauthenticatedPrincipal);

   /**
    * Removes the <code>unauthenticated-principal</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeUnauthenticatedPrincipal();

   /**
    * Returns the <code>unauthenticated-principal</code> element
    * @return the node defined for the element <code>unauthenticated-principal</code> 
    */
   public String getUnauthenticatedPrincipal();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-binding-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-binding-policy</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJndiBindingPolicy(String jndiBindingPolicy);

   /**
    * Removes the <code>jndi-binding-policy</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJndiBindingPolicy();

   /**
    * Returns the <code>jndi-binding-policy</code> element
    * @return the node defined for the element <code>jndi-binding-policy</code> 
    */
   public String getJndiBindingPolicy();

   // -------------------------------------------------------------------------------------||
   // Element type : jacc-context-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jacc-context-id</code> element with the given value will be created.
    * Otherwise, the existing <code>jacc-context-id</code> element will be updated with the given value.
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setJaccContextId(String jaccContextId);

   /**
    * Removes the <code>jacc-context-id</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeJaccContextId();

   /**
    * Returns the <code>jacc-context-id</code> element
    * @return the node defined for the element <code>jacc-context-id</code> 
    */
   public String getJaccContextId();

   // -------------------------------------------------------------------------------------||
   // Element type : webservices
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>webservices</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeWebservices();

   /**
    * If not already created, a new <code>webservices</code> element will be created and returned.
    * Otherwise, the existing <code>webservices</code> element will be returned.
    * @return the node defined for the element <code>webservices</code> 
    */
   public WebservicesType<JbossType<T>> webservices();

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeEnterpriseBeans();

   /**
    * If not already created, a new <code>enterprise-beans</code> element will be created and returned.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return the node defined for the element <code>enterprise-beans</code> 
    */
   public EnterpriseBeansType<JbossType<T>> enterpriseBeans();

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeAssemblyDescriptor();

   /**
    * If not already created, a new <code>assembly-descriptor</code> element will be created and returned.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return the node defined for the element <code>assembly-descriptor</code> 
    */
   public AssemblyDescriptorType<JbossType<T>> assemblyDescriptor();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-managers
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>resource-managers</code> element 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeResourceManagers();

   /**
    * If not already created, a new <code>resource-managers</code> element will be created and returned.
    * Otherwise, the existing <code>resource-managers</code> element will be returned.
    * @return the node defined for the element <code>resource-managers</code> 
    */
   public ResourceManagersType<JbossType<T>> resourceManagers();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setVersion(String version);

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> setMetadataComplete(Boolean metadataComplete);

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of {@link JbossType<T>} 
    */
   public JbossType<T> removeMetadataComplete();

   /**
    * Returns the <code>metadata-complete</code> element
    * @return the node defined for the element <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete();

}
