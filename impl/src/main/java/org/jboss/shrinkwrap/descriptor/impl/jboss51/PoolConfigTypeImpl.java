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

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> pool-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * Element for specifying the class used to provide the caching mechanism for a bean, <br> 
 * and the cache parameters <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class PoolConfigTypeImpl<T> implements Child<T>, PoolConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PoolConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PoolConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-value</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-value</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolValue(String poolValue)
   {
      childNode.getOrCreate("pool-value").text(poolValue);
      return this;
   }

   /**
    * Removes the <code>pool-value</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolValue()
   {
      childNode.remove("pool-value");
      return this;
   }

   /**
    * Returns the <code>pool-value</code> element
    * @return the node defined for the element <code>pool-value</code> 
    */
   public String getPoolValue()
   {
      return childNode.textValue("pool-value");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-max-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-max-size</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-max-size</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolMaxSize(Integer poolMaxSize)
   {
      childNode.getOrCreate("pool-max-size").text(poolMaxSize);
      return this;
   }

   /**
    * Removes the <code>pool-max-size</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolMaxSize()
   {
      childNode.remove("pool-max-size");
      return this;
   }

   /**
    * Returns the <code>pool-max-size</code> element
    * @return the node defined for the element <code>pool-max-size</code> 
    */
   public Integer getPoolMaxSize()
   {
      if (childNode.textValue("pool-max-size") != null && !childNode.textValue("pool-max-size").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("pool-max-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolTimeout(Integer poolTimeout)
   {
      childNode.getOrCreate("pool-timeout").text(poolTimeout);
      return this;
   }

   /**
    * Removes the <code>pool-timeout</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolTimeout()
   {
      childNode.remove("pool-timeout");
      return this;
   }

   /**
    * Returns the <code>pool-timeout</code> element
    * @return the node defined for the element <code>pool-timeout</code> 
    */
   public Integer getPoolTimeout()
   {
      if (childNode.textValue("pool-timeout") != null && !childNode.textValue("pool-timeout").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("pool-timeout"));
      }
      return null;
   }

}
