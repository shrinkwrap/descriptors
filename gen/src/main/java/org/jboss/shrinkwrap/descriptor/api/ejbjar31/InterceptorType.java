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
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;

/**
 * This interface defines the contract for the <code> interceptorType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The interceptorType element declares information about a single <br> 
 * interceptor class. It consists of : <br> 
 *<br>
 * - An optional description. <br> 
 * - The fully-qualified name of the interceptor class. <br> 
 * - An optional list of around invoke methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list of around timeout methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list environment dependencies for the interceptor <br> 
 * class and/or its super-classes. <br> 
 * - An optional list of post-activate methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 * - An optional list of pre-passivate methods declared on the <br> 
 * interceptor class and/or its super-classes. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface InterceptorType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEnvEntry();

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<InterceptorType<T>> envEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<InterceptorType<T>>> getEnvEntryList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEjbRef();

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<InterceptorType<T>> ejbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<InterceptorType<T>>> getEjbRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllEjbLocalRef();

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<InterceptorType<T>> ejbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<InterceptorType<T>>> getEjbLocalRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllResourceRef();

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<InterceptorType<T>> resourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<InterceptorType<T>>> getResourceRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllResourceEnvRef();

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> resourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<InterceptorType<T>>> getResourceEnvRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllMessageDestinationRef();

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> messageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<InterceptorType<T>>> getMessageDestinationRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPersistenceContextRef();

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> persistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<InterceptorType<T>>> getPersistenceContextRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPersistenceUnitRef();

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> persistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<InterceptorType<T>>> getPersistenceUnitRefList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPostConstruct();

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> postConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPostConstructList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPreDestroy();

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> preDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPreDestroyList();

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllDataSource();

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<InterceptorType<T>> dataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<InterceptorType<T>>> getDataSourceList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-class</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-class</code> element will be updated with the given value.
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> setInterceptorClass(String interceptorClass);

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeInterceptorClass();

   /**
    * Returns the <code>interceptor-class</code> element
    * @return the node defined for the element <code>interceptor-class</code> 
    */
   public String getInterceptorClass();

   // -------------------------------------------------------------------------------------||
   // Element type : around-invoke
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllAroundInvoke();

   /**
    * Returns the <code>around-invoke</code> element
    * @return the node defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<InterceptorType<T>> aroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<InterceptorType<T>>> getAroundInvokeList();

   // -------------------------------------------------------------------------------------||
   // Element type : around-timeout
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllAroundTimeout();

   /**
    * Returns the <code>around-timeout</code> element
    * @return the node defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<InterceptorType<T>> aroundTimeout();

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<InterceptorType<T>>> getAroundTimeoutList();

   // -------------------------------------------------------------------------------------||
   // Element type : post-activate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPostActivate();

   /**
    * Returns the <code>post-activate</code> element
    * @return the node defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> postActivate();

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPostActivateList();

   // -------------------------------------------------------------------------------------||
   // Element type : pre-passivate
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of {@link InterceptorType<T>} 
    */
   public InterceptorType<T> removeAllPrePassivate();

   /**
    * Returns the <code>pre-passivate</code> element
    * @return the node defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> prePassivate();

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getPrePassivateList();

}
