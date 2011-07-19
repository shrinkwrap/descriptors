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
 * This interface defines the contract for the <code> entity-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The entity-beanType declares an entity bean. The declaration <br> 
 * consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name <br> 
 * - a unique name assigned to the enterprise bean <br> 
 * in the deployment descriptor <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of the entity bean's remote home interface. This <br> 
 * element is not required to be supported by all implementations. <br> 
 * Any use of this element is non-portable. <br> 
 * - the names of the entity bean's remote home <br> 
 * and remote interfaces, if any <br> 
 * - the names of the entity bean's local home and local <br> 
 * interfaces, if any <br> 
 * - the entity bean's implementation class <br> 
 * - the optional entity bean's persistence management type. If <br> 
 * this element is not specified it is defaulted to Container. <br> 
 * - the entity bean's primary key class name <br> 
 * - an indication of the entity bean's reentrancy <br> 
 * - an optional specification of the <br> 
 * entity bean's cmp-version <br> 
 * - an optional specification of the entity bean's <br> 
 * abstract schema name <br> 
 * - an optional list of container-managed fields <br> 
 * - an optional specification of the primary key <br> 
 * field <br> 
 * - an optional declaration of the bean's environment <br> 
 * entries <br> 
 * - an optional declaration of the bean's EJB <br> 
 * references <br> 
 * - an optional declaration of the bean's local <br> 
 * EJB references <br> 
 * - an optional declaration of the bean's web <br> 
 * service references <br> 
 * - an optional declaration of the security role <br> 
 * references <br> 
 * - an optional declaration of the security identity <br> 
 * to be used for the execution of the bean's methods <br> 
 * - an optional declaration of the bean's <br> 
 * resource manager connection factory references <br> 
 * - an optional declaration of the bean's <br> 
 * resource environment references <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 * - an optional set of query declarations <br> 
 * for finder and select methods for an entity <br> 
 * bean with cmp-version 2.x. <br> 
 *<br>
 * The optional abstract-schema-name element must be specified <br> 
 * for an entity bean with container-managed persistence and <br> 
 * cmp-version 2.x. <br> 
 *<br>
 * The optional primkey-field may be present in the descriptor <br> 
 * if the entity's persistence-type is Container. <br> 
 *<br>
 * The optional cmp-version element may be present in the <br> 
 * descriptor if the entity's persistence-type is Container. If <br> 
 * the persistence-type is Container and the cmp-version <br> 
 * element is not specified, its value defaults to 2.x. <br> 
 *<br>
 * The optional home and remote elements must be specified if <br> 
 * the entity bean cmp-version is 1.x. <br> 
 *<br>
 * The optional home and remote elements must be specified if <br> 
 * the entity bean has a remote home and remote interface. <br> 
 *<br>
 * The optional local-home and local elements must be specified <br> 
 * if the entity bean has a local home and local interface. <br> 
 *<br>
 * Either both the local-home and the local elements or both <br> 
 * the home and the remote elements must be specified. <br> 
 *<br>
 * The optional query elements must be present if the <br> 
 * persistence-type is Container and the cmp-version is 2.x and <br> 
 * query methods other than findByPrimaryKey have been defined <br> 
 * for the entity bean. <br> 
 *<br>
 * The other elements that are optional are "optional" in the <br> 
 * sense that they are omitted if the lists represented by them <br> 
 * are empty. <br> 
 *<br>
 * At least one cmp-field element must be present in the <br> 
 * descriptor if the entity's persistence-type is Container and <br> 
 * the cmp-version is 1.x, and none must not be present if the <br> 
 * entity's persistence-type is Bean. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EntityBeanType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllDescription();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllDisplayName();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EntityBeanType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EntityBeanType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<EntityBeanType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<EntityBeanType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<EntityBeanType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<EntityBeanType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<EntityBeanType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<EntityBeanType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<EntityBeanType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<EntityBeanType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<EntityBeanType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<EntityBeanType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<EntityBeanType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllServiceRef();

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<EntityBeanType<T>> serviceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<EntityBeanType<T>>> getServiceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeEjbName();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeMappedName();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setHome(String home);

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeHome();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setRemote(String remote);

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeRemote();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setLocalHome(String localHome);

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeLocalHome();

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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setLocal(String local);

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeLocal();

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setEjbClass(String ejbClass);

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeEjbClass();

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-type</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType);

   /**
    * If not already created, a new <code>persistence-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-type</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPersistenceType(String persistenceType);

   /**
    * Returns the <code>persistence-type</code> element
    * @return the node defined for the element <code>persistence-type</code> 
    */
   public PersistenceTypeType getPersistenceType();

   /**
    * Returns the <code>persistence-type</code> element
    * @return the node defined for the element <code>persistence-type</code> 
    */
   public String getPersistenceTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : prim-key-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prim-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>prim-key-class</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPrimKeyClass(String primKeyClass);

   /**
    * Removes the <code>prim-key-class</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removePrimKeyClass();

   /**
    * Returns the <code>prim-key-class</code> element
    * @return the node defined for the element <code>prim-key-class</code> 
    */
   public String getPrimKeyClass();

   // -------------------------------------------------------------------------------------||
   // Element type : reentrant
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reentrant</code> element with the given value will be created.
    * Otherwise, the existing <code>reentrant</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setReentrant(Boolean reentrant);

   /**
    * Removes the <code>reentrant</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeReentrant();

   /**
    * Returns the <code>reentrant</code> element
    * @return the node defined for the element <code>reentrant</code> 
    */
   public Boolean isReentrant();

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmp-version</code> element with the given value will be created.
    * Otherwise, the existing <code>cmp-version</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion);

   /**
    * If not already created, a new <code>cmp-version</code> element with the given value will be created.
    * Otherwise, the existing <code>cmp-version</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setCmpVersion(String cmpVersion);

   /**
    * Returns the <code>cmp-version</code> element
    * @return the node defined for the element <code>cmp-version</code> 
    */
   public CmpVersionType getCmpVersion();

   /**
    * Returns the <code>cmp-version</code> element
    * @return the node defined for the element <code>cmp-version</code> 
    */
   public String getCmpVersionAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : abstract-schema-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>abstract-schema-name</code> element with the given value will be created.
    * Otherwise, the existing <code>abstract-schema-name</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName);

   /**
    * Removes the <code>abstract-schema-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAbstractSchemaName();

   /**
    * Returns the <code>abstract-schema-name</code> element
    * @return the node defined for the element <code>abstract-schema-name</code> 
    */
   public String getAbstractSchemaName();

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-field
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>cmp-field</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllCmpField();

   /**
    * Returns the <code>cmp-field</code> element
    * @return the node defined for the element <code>cmp-field</code> 
    */
   public CmpFieldType<EntityBeanType<T>> cmpField();

   /**
    * Returns all <code>cmp-field</code> elements
    * @return list of <code>cmp-field</code> 
    */
   public List<CmpFieldType<EntityBeanType<T>>> getCmpFieldList();

   // -------------------------------------------------------------------------------------||
   // Element type : primkey-field
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primkey-field</code> element with the given value will be created.
    * Otherwise, the existing <code>primkey-field</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPrimkeyField(String primkeyField);

   /**
    * Removes the <code>primkey-field</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removePrimkeyField();

   /**
    * Returns the <code>primkey-field</code> element
    * @return the node defined for the element <code>primkey-field</code> 
    */
   public String getPrimkeyField();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllSecurityRoleRef();

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> securityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<EntityBeanType<T>>> getSecurityRoleRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeSecurityIdentity();

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<EntityBeanType<T>> securityIdentity();

   // -------------------------------------------------------------------------------------||
   // Element type : query
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>query</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllQuery();

   /**
    * Returns the <code>query</code> element
    * @return the node defined for the element <code>query</code> 
    */
   public QueryType<EntityBeanType<T>> query();

   /**
    * Returns all <code>query</code> elements
    * @return list of <code>query</code> 
    */
   public List<QueryType<EntityBeanType<T>>> getQueryList();

}
