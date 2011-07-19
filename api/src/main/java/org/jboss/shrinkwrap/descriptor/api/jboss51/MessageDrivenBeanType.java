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
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;

/**
 * This interface defines the contract for the <code> message-driven-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The message-driven element holds information specific to jboss and not <br> 
 * declared in ejb-jar.xml about a message-driven bean, such as container configuration and <br> 
 * resources. The bean should already be declared in ejb-jar.xml, with the same ejb-name. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
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
   // Element type : destination-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>destination-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>destination-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDestinationJndiName(String destinationJndiName);

   /**
    * Removes the <code>destination-jndi-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeDestinationJndiName();

   /**
    * Returns the <code>destination-jndi-name</code> element
    * @return the node defined for the element <code>destination-jndi-name</code> 
    */
   public String getDestinationJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-user
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-user</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-user</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbUser(String mdbUser);

   /**
    * Removes the <code>mdb-user</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbUser();

   /**
    * Returns the <code>mdb-user</code> element
    * @return the node defined for the element <code>mdb-user</code> 
    */
   public String getMdbUser();

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-passwd
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-passwd</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-passwd</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbPasswd(String mdbPasswd);

   /**
    * Removes the <code>mdb-passwd</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbPasswd();

   /**
    * Returns the <code>mdb-passwd</code> element
    * @return the node defined for the element <code>mdb-passwd</code> 
    */
   public String getMdbPasswd();

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-client-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-client-id</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-client-id</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbClientId(String mdbClientId);

   /**
    * Removes the <code>mdb-client-id</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbClientId();

   /**
    * Returns the <code>mdb-client-id</code> element
    * @return the node defined for the element <code>mdb-client-id</code> 
    */
   public String getMdbClientId();

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-subscription-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-subscription-id</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-subscription-id</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbSubscriptionId(String mdbSubscriptionId);

   /**
    * Removes the <code>mdb-subscription-id</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbSubscriptionId();

   /**
    * Returns the <code>mdb-subscription-id</code> element
    * @return the node defined for the element <code>mdb-subscription-id</code> 
    */
   public String getMdbSubscriptionId();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-adapter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter-name</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-adapter-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setResourceAdapterName(String resourceAdapterName);

   /**
    * Removes the <code>resource-adapter-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeResourceAdapterName();

   /**
    * Returns the <code>resource-adapter-name</code> element
    * @return the node defined for the element <code>resource-adapter-name</code> 
    */
   public String getResourceAdapterName();

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
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllServiceRef();

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> serviceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<MessageDrivenBeanType<T>>> getServiceRefList();

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
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
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

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setSecurityDomain(String securityDomain);

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeSecurityDomain();

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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMethodAttributes();

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes();

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDepends(String depends);

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDependsList(String... values);

   /**
    * Removes the <code>depends</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDepends();

   /**
    * Returns all <code>depends</code> elements
    * @return list of <code>depends</code> 
    */
   public List<String> getDependsList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-timeout-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ejb-timeout-identity</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbTimeoutIdentity();

   /**
    * If not already created, a new <code>ejb-timeout-identity</code> element will be created and returned.
    * Otherwise, the existing <code>ejb-timeout-identity</code> element will be returned.
    * @return the node defined for the element <code>ejb-timeout-identity</code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity();

   // -------------------------------------------------------------------------------------||
   // Element type : annotation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllAnnotation();

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<MessageDrivenBeanType<T>> annotation();

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<MessageDrivenBeanType<T>>> getAnnotationList();

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ignore-dependency</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeIgnoreDependency();

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency();

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>aop-domain-name</code> element with the given value will be created.
    * Otherwise, the existing <code>aop-domain-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setAopDomainName(String aopDomainName);

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAopDomainName();

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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removePoolConfig();

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<MessageDrivenBeanType<T>> poolConfig();

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllJndiRef();

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<MessageDrivenBeanType<T>> jndiRef();

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<MessageDrivenBeanType<T>>> getJndiRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : create-destination
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>create-destination</code> element with the given value will be created.
    * Otherwise, the existing <code>create-destination</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setCreateDestination(Boolean createDestination);

   /**
    * Removes the <code>create-destination</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeCreateDestination();

   /**
    * Returns the <code>create-destination</code> element
    * @return the node defined for the element <code>create-destination</code> 
    */
   public Boolean isCreateDestination();

}
