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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;

/**
 * This interface defines the contract for the <code> session-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The session-beanType declares an session bean. The <br> 
 * declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name <br> 
 * - a name assigned to the enterprise bean <br> 
 * in the deployment description <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of the session bean's remote home/business interface. <br> 
 * This element is not required to be supported by all <br> 
 * implementations. Any use of this element is non-portable. <br> 
 * - the names of all the remote or local business interfaces, <br> 
 * if any <br> 
 * - the names of the session bean's remote home and <br> 
 * remote interfaces, if any <br> 
 * - the names of the session bean's local home and <br> 
 * local interfaces, if any <br> 
 * - the name of the session bean's web service endpoint <br> 
 * interface, if any <br> 
 * - the session bean's implementation class <br> 
 * - the session bean's state management type <br> 
 * - an optional declaration of the session bean's timeout method. <br> 
 * - the optional session bean's transaction management type. <br> 
 * If it is not present, it is defaulted to Container. <br> 
 * - an optional list of the session bean class and/or <br> 
 * superclass around-invoke methods. <br> 
 * - an optional declaration of the bean's <br> 
 * environment entries <br> 
 * - an optional declaration of the bean's EJB references <br> 
 * - an optional declaration of the bean's local <br> 
 * EJB references <br> 
 * - an optional declaration of the bean's web <br> 
 * service references <br> 
 * - an optional declaration of the security role <br> 
 * references <br> 
 * - an optional declaration of the security identity <br> 
 * to be used for the execution of the bean's methods <br> 
 * - an optional declaration of the bean's resource <br> 
 * manager connection factory references <br> 
 * - an optional declaration of the bean's resource <br> 
 * environment references. <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 *<br>
 * The elements that are optional are "optional" in the sense <br> 
 * that they are omitted when if lists represented by them are <br> 
 * empty. <br> 
 *<br>
 * Either both the local-home and the local elements or both <br> 
 * the home and the remote elements must be specified for the <br> 
 * session bean. <br> 
 *<br>
 * The service-endpoint element may only be specified if the <br> 
 * bean is a stateless session bean. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface SessionBeanType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllDescription();

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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllDisplayName();

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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<SessionBeanType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<SessionBeanType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<SessionBeanType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<SessionBeanType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<SessionBeanType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<SessionBeanType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<SessionBeanType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<SessionBeanType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<SessionBeanType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<SessionBeanType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<SessionBeanType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<SessionBeanType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<SessionBeanType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllServiceRef();

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<SessionBeanType<T>> serviceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<SessionBeanType<T>>> getServiceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeEjbName();

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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home</code> element with the given value will be created.
    * Otherwise, the existing <code>home</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setHome(String home);

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeHome();

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome();

   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remote</code> element with the given value will be created.
    * Otherwise, the existing <code>remote</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setRemote(String remote);

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeRemote();

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote();

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setLocalHome(String localHome);

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeLocalHome();

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome();

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local</code> element with the given value will be created.
    * Otherwise, the existing <code>local</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setLocal(String local);

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeLocal();

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   // -------------------------------------------------------------------------------------||
   // Element type : business-local
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>business-local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessLocal(String businessLocal);

   /**
    * Creates for all String objects representing <code>business-local</code> elements, 
    * a new <code>business-local</code> element 
    * @param list of <code>business-local</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessLocalList(String... values);

   /**
    * Removes the <code>business-local</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllBusinessLocal();

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
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessRemote(String businessRemote);

   /**
    * Creates for all String objects representing <code>business-remote</code> elements, 
    * a new <code>business-remote</code> element 
    * @param list of <code>business-remote</code> objects 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setBusinessRemoteList(String... values);

   /**
    * Removes the <code>business-remote</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllBusinessRemote();

   /**
    * Returns all <code>business-remote</code> elements
    * @return list of <code>business-remote</code> 
    */
   public List<String> getBusinessRemoteList();

   // -------------------------------------------------------------------------------------||
   // Element type : service-endpoint
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-endpoint</code> element with the given value will be created.
    * Otherwise, the existing <code>service-endpoint</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setServiceEndpoint(String serviceEndpoint);

   /**
    * Removes the <code>service-endpoint</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeServiceEndpoint();

   /**
    * Returns the <code>service-endpoint</code> element
    * @return the node defined for the element <code>service-endpoint</code> 
    */
   public String getServiceEndpoint();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setEjbClass(String ejbClass);

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeEjbClass();

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   // -------------------------------------------------------------------------------------||
   // Element type : session-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-type</code> element with the given value will be created.
    * Otherwise, the existing <code>session-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setSessionType(SessionTypeType sessionType);

   /**
    * If not already created, a new <code>session-type</code> element with the given value will be created.
    * Otherwise, the existing <code>session-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setSessionType(String sessionType);

   /**
    * Returns the <code>session-type</code> element
    * @return the node defined for the element <code>session-type</code> 
    */
   public SessionTypeType getSessionType();

   /**
    * Returns the <code>session-type</code> element
    * @return the node defined for the element <code>session-type</code> 
    */
   public String getSessionTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeTimeoutMethod();

   /**
    * If not already created, a new <code>timeout-method</code> element will be created and returned.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return the node defined for the element <code>timeout-method</code> 
    */
   public NamedMethodType<SessionBeanType<T>> timeoutMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : init-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>init-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllInitMethod();

   /**
    * Returns the <code>init-method</code> element
    * @return the node defined for the element <code>init-method</code> 
    */
   public InitMethodType<SessionBeanType<T>> initMethod();

   /**
    * Returns all <code>init-method</code> elements
    * @return list of <code>init-method</code> 
    */
   public List<InitMethodType<SessionBeanType<T>>> getInitMethodList();

   // -------------------------------------------------------------------------------------||
   // Element type : remove-method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>remove-method</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllRemoveMethod();

   /**
    * Returns the <code>remove-method</code> element
    * @return the node defined for the element <code>remove-method</code> 
    */
   public RemoveMethodType<SessionBeanType<T>> removeMethod();

   /**
    * Returns all <code>remove-method</code> elements
    * @return list of <code>remove-method</code> 
    */
   public List<RemoveMethodType<SessionBeanType<T>>> getRemoveMethodList();

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setTransactionType(TransactionTypeType transactionType);

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> setTransactionType(String transactionType);

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public TransactionTypeType getTransactionType();

   /**
    * Returns the <code>transaction-type</code> element
    * @return the node defined for the element <code>transaction-type</code> 
    */
   public String getTransactionTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllAroundInvoke();

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<SessionBeanType<T>> aroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<SessionBeanType<T>>> getAroundInvokeList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-activate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPostActivate();

   /**
    * Returns the <code>post-activate</code> element
    * @return the node defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> postActivate();

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPostActivateList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-passivate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllPrePassivate();

   /**
    * Returns the <code>pre-passivate</code> element
    * @return the node defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> prePassivate();

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getPrePassivateList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeAllSecurityRoleRef();

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> securityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<SessionBeanType<T>>> getSecurityRoleRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link SessionBeanType<T>} 
    */
   public SessionBeanType<T> removeSecurityIdentity();

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<SessionBeanType<T>> securityIdentity();

}
