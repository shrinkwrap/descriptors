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
 * This interface defines the contract for the <code> cluster-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The cluster-config element allows to specify cluster specific settings. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ClusterConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : partition-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>partition-name</code> element with the given value will be created.
    * Otherwise, the existing <code>partition-name</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setPartitionName(String partitionName);

   /**
    * Removes the <code>partition-name</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removePartitionName();

   /**
    * Returns the <code>partition-name</code> element
    * @return the node defined for the element <code>partition-name</code> 
    */
   public String getPartitionName();

   // -------------------------------------------------------------------------------------||
   // Element type : home-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home-load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>home-load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setHomeLoadBalancePolicy(String homeLoadBalancePolicy);

   /**
    * Removes the <code>home-load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeHomeLoadBalancePolicy();

   /**
    * Returns the <code>home-load-balance-policy</code> element
    * @return the node defined for the element <code>home-load-balance-policy</code> 
    */
   public String getHomeLoadBalancePolicy();

   // -------------------------------------------------------------------------------------||
   // Element type : session-state-manager-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-state-manager-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>session-state-manager-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setSessionStateManagerJndiName(String sessionStateManagerJndiName);

   /**
    * Removes the <code>session-state-manager-jndi-name</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeSessionStateManagerJndiName();

   /**
    * Returns the <code>session-state-manager-jndi-name</code> element
    * @return the node defined for the element <code>session-state-manager-jndi-name</code> 
    */
   public String getSessionStateManagerJndiName();

   // -------------------------------------------------------------------------------------||
   // Element type : bean-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setBeanLoadBalancePolicy(String beanLoadBalancePolicy);

   /**
    * Removes the <code>bean-load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeBeanLoadBalancePolicy();

   /**
    * Returns the <code>bean-load-balance-policy</code> element
    * @return the node defined for the element <code>bean-load-balance-policy</code> 
    */
   public String getBeanLoadBalancePolicy();

   // -------------------------------------------------------------------------------------||
   // Element type : load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setLoadBalancePolicy(String loadBalancePolicy);

   /**
    * Removes the <code>load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeLoadBalancePolicy();

   /**
    * Returns the <code>load-balance-policy</code> element
    * @return the node defined for the element <code>load-balance-policy</code> 
    */
   public String getLoadBalancePolicy();

}
