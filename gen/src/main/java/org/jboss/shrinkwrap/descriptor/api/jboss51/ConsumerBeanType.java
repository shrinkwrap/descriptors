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
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;

/**
 * This interface defines the contract for the <code> consumer-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The consumer element holds all of the information specific about a <br> 
 * consumer bean which is a JBoss proprietary extension to EJB3 for sending JMS messages via <br> 
 * standard Java interfaces. Used in: enterprise-beans <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ConsumerBeanType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDescription();

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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDisplayName();

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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<ConsumerBeanType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConsumerBeanType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setEjbName(String ejbName);

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeEjbName();

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setEjbClass(String ejbClass);

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeEjbClass();

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setMessageDestination(String messageDestination);

   /**
    * Removes the <code>message-destination</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMessageDestination();

   /**
    * Returns the <code>message-destination</code> element
    * @return the node defined for the element <code>message-destination</code> 
    */
   public String getMessageDestination();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setMessageDestinationType(String messageDestinationType);

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMessageDestinationType();

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType();

   // -------------------------------------------------------------------------------------||
   // Element type : producer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>producer</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllProducer();

   /**
    * Returns the <code>producer</code> element
    * @return the node defined for the element <code>producer</code> 
    */
   public ProducerType<ConsumerBeanType<T>> producer();

   /**
    * Returns all <code>producer</code> elements
    * @return list of <code>producer</code> 
    */
   public List<ProducerType<ConsumerBeanType<T>>> getProducerList();

   // -------------------------------------------------------------------------------------||
   // Element type : local-producer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>local-producer</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllLocalProducer();

   /**
    * Returns the <code>local-producer</code> element
    * @return the node defined for the element <code>local-producer</code> 
    */
   public ProducerType<ConsumerBeanType<T>> localProducer();

   /**
    * Returns all <code>local-producer</code> elements
    * @return list of <code>local-producer</code> 
    */
   public List<ProducerType<ConsumerBeanType<T>>> getLocalProducerList();

   // -------------------------------------------------------------------------------------||
   // Element type : current-message
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>current-message</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeCurrentMessage();

   /**
    * If not already created, a new <code>current-message</code> element will be created and returned.
    * Otherwise, the existing <code>current-message</code> element will be returned.
    * @return the node defined for the element <code>current-message</code> 
    */
   public MethodAttributesType<ConsumerBeanType<T>> currentMessage();

   // -------------------------------------------------------------------------------------||
   // Element type : message-properties
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-properties</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllMessageProperties();

   /**
    * Returns the <code>message-properties</code> element
    * @return the node defined for the element <code>message-properties</code> 
    */
   public MessagePropertiesType<ConsumerBeanType<T>> messageProperties();

   /**
    * Returns all <code>message-properties</code> elements
    * @return list of <code>message-properties</code> 
    */
   public List<MessagePropertiesType<ConsumerBeanType<T>>> getMessagePropertiesList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ConsumerBeanType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ConsumerBeanType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ConsumerBeanType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ConsumerBeanType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeSecurityIdentity();

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<ConsumerBeanType<T>> securityIdentity();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ConsumerBeanType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ConsumerBeanType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ConsumerBeanType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ConsumerBeanType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ConsumerBeanType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ConsumerBeanType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setSecurityDomain(String securityDomain);

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeSecurityDomain();

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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeMethodAttributes();

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<ConsumerBeanType<T>> methodAttributes();

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDepends(String depends);

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setDependsList(String... values);

   /**
    * Removes the <code>depends</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllDepends();

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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllAnnotation();

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<ConsumerBeanType<T>> annotation();

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<ConsumerBeanType<T>>> getAnnotationList();

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ignore-dependency</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeIgnoreDependency();

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<ConsumerBeanType<T>> ignoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>aop-domain-name</code> element with the given value will be created.
    * Otherwise, the existing <code>aop-domain-name</code> element will be updated with the given value.
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> setAopDomainName(String aopDomainName);

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAopDomainName();

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
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removePoolConfig();

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<ConsumerBeanType<T>> poolConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeAllJndiRef();

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<ConsumerBeanType<T>> jndiRef();

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<ConsumerBeanType<T>>> getJndiRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of {@link ConsumerBeanType<T>} 
    */
   public ConsumerBeanType<T> removeActivationConfig();

   /**
    * If not already created, a new <code>activation-config</code> element will be created and returned.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return the node defined for the element <code>activation-config</code> 
    */
   public ActivationConfigType<ConsumerBeanType<T>> activationConfig();

}
