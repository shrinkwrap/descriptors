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
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;

/**
 * This interface defines the contract for the <code> service-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The service element holds all of the information specific about a service <br> 
 * bean which is a JBoss proprietary extension to EJB3 creating multithreaded, singleton <br> 
 * services. Service beans are the EJB3 analogy for JMX MBeans. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ServiceBeanType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllDescription();

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
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllDisplayName();

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
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ServiceBeanType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceBeanType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<ServiceBeanType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<ServiceBeanType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ServiceBeanType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ServiceBeanType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ServiceBeanType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ServiceBeanType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ServiceBeanType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ServiceBeanType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ServiceBeanType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ServiceBeanType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ServiceBeanType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ServiceBeanType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<ServiceBeanType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<ServiceBeanType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<ServiceBeanType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<ServiceBeanType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<ServiceBeanType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<ServiceBeanType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<ServiceBeanType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<ServiceBeanType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllServiceRef();

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<ServiceBeanType<T>> serviceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<ServiceBeanType<T>>> getServiceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeEjbName();

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : business-local
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>business-local</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setBusinessLocal(String businessLocal);

   /**
    * Creates for all String objects representing <code>business-local</code> elements, 
    * a new <code>business-local</code> element 
    * @param list of <code>business-local</code> objects 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setBusinessLocalList(String... values);

   /**
    * Removes the <code>business-local</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllBusinessLocal();

   /**
    * Returns all <code>business-local</code> elements
    * @return list of <code>business-local</code> 
    */
   public List<String> getBusinessLocalList();

   // -------------------------------------------------------------------------------------||
   // Element type : business-remote
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>business-remote</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setBusinessRemote(String businessRemote);

   /**
    * Creates for all String objects representing <code>business-remote</code> elements, 
    * a new <code>business-remote</code> element 
    * @param list of <code>business-remote</code> objects 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setBusinessRemoteList(String... values);

   /**
    * Removes the <code>business-remote</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllBusinessRemote();

   /**
    * Returns all <code>business-remote</code> elements
    * @return list of <code>business-remote</code> 
    */
   public List<String> getBusinessRemoteList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setEjbClass(String ejbClass);

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeEjbClass();

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeSecurityIdentity();

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<ServiceBeanType<T>> securityIdentity();

   // -------------------------------------------------------------------------------------||
   // Element type : object-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>object-name</code> element with the given value will be created.
    * Otherwise, the existing <code>object-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setObjectName(String objectName);

   /**
    * Removes the <code>object-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeObjectName();

   /**
    * Returns the <code>object-name</code> element
    * @return the node defined for the element <code>object-name</code> 
    */
   public String getObjectName();

   // -------------------------------------------------------------------------------------||
   // Element type : management
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>management</code> element with the given value will be created.
    * Otherwise, the existing <code>management</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setManagement(String management);

   /**
    * Removes the <code>management</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeManagement();

   /**
    * Returns the <code>management</code> element
    * @return the node defined for the element <code>management</code> 
    */
   public String getManagement();

   // -------------------------------------------------------------------------------------||
   // Element type : xmbean
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xmbean</code> element with the given value will be created.
    * Otherwise, the existing <code>xmbean</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setXmbean(String xmbean);

   /**
    * Removes the <code>xmbean</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeXmbean();

   /**
    * Returns the <code>xmbean</code> element
    * @return the node defined for the element <code>xmbean</code> 
    */
   public String getXmbean();

   // -------------------------------------------------------------------------------------||
   // Element type : local-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>local-binding</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllLocalBinding();

   /**
    * Returns the <code>local-binding</code> element
    * @return the node defined for the element <code>local-binding</code> 
    */
   public LocalBindingType<ServiceBeanType<T>> localBinding();

   /**
    * Returns all <code>local-binding</code> elements
    * @return list of <code>local-binding</code> 
    */
   public List<LocalBindingType<ServiceBeanType<T>>> getLocalBindingList();

   // -------------------------------------------------------------------------------------||
   // Element type : remote-binding
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>remote-binding</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllRemoteBinding();

   /**
    * Returns the <code>remote-binding</code> element
    * @return the node defined for the element <code>remote-binding</code> 
    */
   public RemoteBindingType<ServiceBeanType<T>> remoteBinding();

   /**
    * Returns all <code>remote-binding</code> elements
    * @return list of <code>remote-binding</code> 
    */
   public List<RemoteBindingType<ServiceBeanType<T>>> getRemoteBindingList();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setJndiName(String jndiName);

   /**
    * Removes the <code>jndi-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeJndiName();

   /**
    * Returns the <code>jndi-name</code> element
    * @return the node defined for the element <code>jndi-name</code> 
    */
   public String getJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : home-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>home-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setHomeJndiName(String homeJndiName);

   /**
    * Removes the <code>home-jndi-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeHomeJndiName();

   /**
    * Returns the <code>home-jndi-name</code> element
    * @return the node defined for the element <code>home-jndi-name</code> 
    */
   public String getHomeJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : local-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>local-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setLocalJndiName(String localJndiName);

   /**
    * Removes the <code>local-jndi-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeLocalJndiName();

   /**
    * Returns the <code>local-jndi-name</code> element
    * @return the node defined for the element <code>local-jndi-name</code> 
    */
   public String getLocalJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-binding-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jndi-binding-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>jndi-binding-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setJndiBindingPolicy(String jndiBindingPolicy);

   /**
    * Removes the <code>jndi-binding-policy</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeJndiBindingPolicy();

   /**
    * Returns the <code>jndi-binding-policy</code> element
    * @return the node defined for the element <code>jndi-binding-policy</code> 
    */
   public String getJndiBindingPolicy();

   // -------------------------------------------------------------------------------------||
   // Element type : clustered
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>clustered</code> element with the given value will be created.
    * Otherwise, the existing <code>clustered</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setClustered(Boolean clustered);

   /**
    * Removes the <code>clustered</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeClustered();

   /**
    * Returns the <code>clustered</code> element
    * @return the node defined for the element <code>clustered</code> 
    */
   public Boolean isClustered();

   // -------------------------------------------------------------------------------------||
   // Element type : cluster-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>cluster-config</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeClusterConfig();

   /**
    * If not already created, a new <code>cluster-config</code> element will be created and returned.
    * Otherwise, the existing <code>cluster-config</code> element will be returned.
    * @return the node defined for the element <code>cluster-config</code> 
    */
   public ClusterConfigType<ServiceBeanType<T>> clusterConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setSecurityDomain(String securityDomain);

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeSecurityDomain();

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain();

   // -------------------------------------------------------------------------------------||
   // Element type : method-attributes
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-attributes</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeMethodAttributes();

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<ServiceBeanType<T>> methodAttributes();

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDepends(String depends);

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setDependsList(String... values);

   /**
    * Removes the <code>depends</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllDepends();

   /**
    * Returns all <code>depends</code> elements
    * @return list of <code>depends</code> 
    */
   public List<String> getDependsList();

   // -------------------------------------------------------------------------------------||
   // Element type : annotation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllAnnotation();

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<ServiceBeanType<T>> annotation();

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<ServiceBeanType<T>>> getAnnotationList();

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ignore-dependency</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeIgnoreDependency();

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<ServiceBeanType<T>> ignoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>aop-domain-name</code> element with the given value will be created.
    * Otherwise, the existing <code>aop-domain-name</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setAopDomainName(String aopDomainName);

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAopDomainName();

   /**
    * Returns the <code>aop-domain-name</code> element
    * @return the node defined for the element <code>aop-domain-name</code> 
    */
   public String getAopDomainName();

   // -------------------------------------------------------------------------------------||
   // Element type : pool-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>pool-config</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removePoolConfig();

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<ServiceBeanType<T>> poolConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : concurrent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>concurrent</code> element with the given value will be created.
    * Otherwise, the existing <code>concurrent</code> element will be updated with the given value.
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> setConcurrent(Boolean concurrent);

   /**
    * Removes the <code>concurrent</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeConcurrent();

   /**
    * Returns the <code>concurrent</code> element
    * @return the node defined for the element <code>concurrent</code> 
    */
   public Boolean isConcurrent();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeAllJndiRef();

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<ServiceBeanType<T>> jndiRef();

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<ServiceBeanType<T>>> getJndiRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : port-component
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>port-component</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removePortComponent();

   /**
    * If not already created, a new <code>port-component</code> element will be created and returned.
    * Otherwise, the existing <code>port-component</code> element will be returned.
    * @return the node defined for the element <code>port-component</code> 
    */
   public PortComponentType<ServiceBeanType<T>> portComponent();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-timeout-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ejb-timeout-identity</code> element 
    * @return the current instance of {@link ServiceBeanType<T>} 
    */
   public ServiceBeanType<T> removeEjbTimeoutIdentity();

   /**
    * If not already created, a new <code>ejb-timeout-identity</code> element will be created and returned.
    * Otherwise, the existing <code>ejb-timeout-identity</code> element will be returned.
    * @return the node defined for the element <code>ejb-timeout-identity</code> 
    */
   public SecurityIdentityType<ServiceBeanType<T>> ejbTimeoutIdentity();

}
