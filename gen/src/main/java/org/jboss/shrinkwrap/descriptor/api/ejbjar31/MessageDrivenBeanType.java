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
package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;

/**
 * This interface defines the contract for the <code> message-driven-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The message-driven element declares a message-driven <br> 
 * bean. The declaration consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name. <br> 
 * - a name assigned to the enterprise bean in <br> 
 * the deployment descriptor <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of destination from which this message-driven bean <br> 
 * should consume. This element is not required to be supported <br> 
 * by all implementations. Any use of this element is non-portable. <br> 
 * - the message-driven bean's implementation class <br> 
 * - an optional declaration of the bean's messaging <br> 
 * type <br> 
 * - an optional declaration of the bean's timeout method for <br> 
 * handling programmatically created timers <br> 
 * - an optional declaration of timers to be automatically created at <br> 
 * deployment time <br> 
 * - the optional message-driven bean's transaction management <br> 
 * type. If it is not defined, it is defaulted to Container. <br> 
 * - an optional declaration of the bean's <br> 
 * message-destination-type <br> 
 * - an optional declaration of the bean's <br> 
 * message-destination-link <br> 
 * - an optional declaration of the message-driven bean's <br> 
 * activation configuration properties <br> 
 * - an optional list of the message-driven bean class and/or <br> 
 * superclass around-invoke methods. <br> 
 * - an optional list of the message-driven bean class and/or <br> 
 * superclass around-timeout methods. <br> 
 * - an optional declaration of the bean's environment <br> 
 * entries <br> 
 * - an optional declaration of the bean's EJB references <br> 
 * - an optional declaration of the bean's local EJB <br> 
 * references <br> 
 * - an optional declaration of the bean's web service <br> 
 * references <br> 
 * - an optional declaration of the security role <br> 
 * references <br> 
 * - an optional declaration of the security <br> 
 * identity to be used for the execution of the bean's <br> 
 * methods <br> 
 * - an optional declaration of the bean's <br> 
 * resource manager connection factory <br> 
 * references <br> 
 * - an optional declaration of the bean's resource <br> 
 * environment references. <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface MessageDrivenBeanType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDescription();

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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDisplayName();

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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<MessageDrivenBeanType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDrivenBeanType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<MessageDrivenBeanType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDataSource();

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<MessageDrivenBeanType<T>> dataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<MessageDrivenBeanType<T>>> getDataSourceList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbName();

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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setEjbClass(String ejbClass);

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbClass();

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   // -------------------------------------------------------------------------------------||
   // Element type : messaging-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messaging-type</code> element with the given value will be created.
    * Otherwise, the existing <code>messaging-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessagingType(String messagingType);

   /**
    * Removes the <code>messaging-type</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessagingType();

   /**
    * Returns the <code>messaging-type</code> element
    * @return the node defined for the element <code>messaging-type</code> 
    */
   public String getMessagingType();

   // -------------------------------------------------------------------------------------||
   // Element type : timeout-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeTimeoutMethod();

   /**
    * If not already created, a new <code>timeout-method</code> element will be created and returned.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return the node defined for the element <code>timeout-method</code> 
    */
   public NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : timer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>timer</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllTimer();

   /**
    * Returns the <code>timer</code> element
    * @return the node defined for the element <code>timer</code> 
    */
   public TimerType<MessageDrivenBeanType<T>> timer();

   /**
    * Returns all <code>timer</code> elements
    * @return list of <code>timer</code> 
    */
   public List<TimerType<MessageDrivenBeanType<T>>> getTimerList();

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setTransactionType(TransactionTypeType transactionType);

   /**
    * If not already created, a new <code>transaction-type</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setTransactionType(String transactionType);

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
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessageDestinationType(String messageDestinationType);

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationType();

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-link</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-link</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMessageDestinationLink(String messageDestinationLink);

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationLink();

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink();

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeActivationConfig();

   /**
    * If not already created, a new <code>activation-config</code> element will be created and returned.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return the node defined for the element <code>activation-config</code> 
    */
   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllAroundInvoke();

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> aroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAroundInvokeList();

   // -------------------------------------------------------------------------------------||
   // Element type : around-timeout
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllAroundTimeout();

   /**
    * Returns the <code>around-timeout</code> element
    * @return the node defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<MessageDrivenBeanType<T>> aroundTimeout();

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<MessageDrivenBeanType<T>>> getAroundTimeoutList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllSecurityRoleRef();

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<MessageDrivenBeanType<T>> securityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<MessageDrivenBeanType<T>>> getSecurityRoleRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeSecurityIdentity();

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity();

}
