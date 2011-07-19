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

/**
 * This interface defines the contract for the <code> enterprise-beansType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The enterprise-beans element contains additional information about the <br> 
 * beans. These informations, such as jndi names, resource managers and container <br> 
 * configurations, are specific to jboss and not described in ejb-jar.xml. jboss will provide a <br> 
 * standard behaviour if no enterprise-beans element is found, see container-configurations, <br> 
 * jndi-name and resource-managers for defaults. Used in: jboss <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface EnterpriseBeansType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllSession();

   /**
    * Returns the <code>session</code> element
    * @return the node defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> session();

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven();

   /**
    * Returns the <code>message-driven</code> element
    * @return the node defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven();

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList();

   // -------------------------------------------------------------------------------------||
   // Element type : service
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllService();

   /**
    * Returns the <code>service</code> element
    * @return the node defined for the element <code>service</code> 
    */
   public ServiceBeanType<EnterpriseBeansType<T>> service();

   /**
    * Returns all <code>service</code> elements
    * @return list of <code>service</code> 
    */
   public List<ServiceBeanType<EnterpriseBeansType<T>>> getServiceList();

   // -------------------------------------------------------------------------------------||
   // Element type : consumer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>consumer</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllConsumer();

   /**
    * Returns the <code>consumer</code> element
    * @return the node defined for the element <code>consumer</code> 
    */
   public ConsumerBeanType<EnterpriseBeansType<T>> consumer();

   /**
    * Returns all <code>consumer</code> elements
    * @return list of <code>consumer</code> 
    */
   public List<ConsumerBeanType<EnterpriseBeansType<T>>> getConsumerList();

   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb</code> elements 
    * @return the current instance of {@link EnterpriseBeansType<T>} 
    */
   public EnterpriseBeansType<T> removeAllEjb();

   /**
    * Returns the <code>ejb</code> element
    * @return the node defined for the element <code>ejb</code> 
    */
   public GenericBeanType<EnterpriseBeansType<T>> ejb();

   /**
    * Returns all <code>ejb</code> elements
    * @return list of <code>ejb</code> 
    */
   public List<GenericBeanType<EnterpriseBeansType<T>>> getEjbList();

}
