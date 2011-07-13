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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ClusterConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> cluster-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The cluster-config element allows to specify cluster specific settings. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class ClusterConfigTypeImpl<T> implements Child<T>, ClusterConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ClusterConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ClusterConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : partition-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>partition-name</code> element with the given value will be created.
    * Otherwise, the existing <code>partition-name</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setPartitionName(String partitionName)
   {
      childNode.getOrCreate("partition-name").text(partitionName);
      return this;
   }

   /**
    * Removes the <code>partition-name</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removePartitionName()
   {
      childNode.remove("partition-name");
      return this;
   }

   /**
    * Returns the <code>partition-name</code> element
    * @return the node defined for the element <code>partition-name</code> 
    */
   public String getPartitionName()
   {
      return childNode.textValue("partition-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : home-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home-load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>home-load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setHomeLoadBalancePolicy(String homeLoadBalancePolicy)
   {
      childNode.getOrCreate("home-load-balance-policy").text(homeLoadBalancePolicy);
      return this;
   }

   /**
    * Removes the <code>home-load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeHomeLoadBalancePolicy()
   {
      childNode.remove("home-load-balance-policy");
      return this;
   }

   /**
    * Returns the <code>home-load-balance-policy</code> element
    * @return the node defined for the element <code>home-load-balance-policy</code> 
    */
   public String getHomeLoadBalancePolicy()
   {
      return childNode.textValue("home-load-balance-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : session-state-manager-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-state-manager-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>session-state-manager-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setSessionStateManagerJndiName(String sessionStateManagerJndiName)
   {
      childNode.getOrCreate("session-state-manager-jndi-name").text(sessionStateManagerJndiName);
      return this;
   }

   /**
    * Removes the <code>session-state-manager-jndi-name</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeSessionStateManagerJndiName()
   {
      childNode.remove("session-state-manager-jndi-name");
      return this;
   }

   /**
    * Returns the <code>session-state-manager-jndi-name</code> element
    * @return the node defined for the element <code>session-state-manager-jndi-name</code> 
    */
   public String getSessionStateManagerJndiName()
   {
      return childNode.textValue("session-state-manager-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : bean-load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setBeanLoadBalancePolicy(String beanLoadBalancePolicy)
   {
      childNode.getOrCreate("bean-load-balance-policy").text(beanLoadBalancePolicy);
      return this;
   }

   /**
    * Removes the <code>bean-load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeBeanLoadBalancePolicy()
   {
      childNode.remove("bean-load-balance-policy");
      return this;
   }

   /**
    * Returns the <code>bean-load-balance-policy</code> element
    * @return the node defined for the element <code>bean-load-balance-policy</code> 
    */
   public String getBeanLoadBalancePolicy()
   {
      return childNode.textValue("bean-load-balance-policy");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : load-balance-policy
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>load-balance-policy</code> element with the given value will be created.
    * Otherwise, the existing <code>load-balance-policy</code> element will be updated with the given value.
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> setLoadBalancePolicy(String loadBalancePolicy)
   {
      childNode.getOrCreate("load-balance-policy").text(loadBalancePolicy);
      return this;
   }

   /**
    * Removes the <code>load-balance-policy</code> element 
    * @return the current instance of {@link ClusterConfigType<T>} 
    */
   public ClusterConfigType<T> removeLoadBalancePolicy()
   {
      childNode.remove("load-balance-policy");
      return this;
   }

   /**
    * Returns the <code>load-balance-policy</code> element
    * @return the node defined for the element <code>load-balance-policy</code> 
    */
   public String getLoadBalancePolicy()
   {
      return childNode.textValue("load-balance-policy");
   }

}
