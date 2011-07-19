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
import org.jboss.shrinkwrap.descriptor.api.jboss51.CacheConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> cache-configType </code> xsd type 
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
public class CacheConfigTypeImpl<T> implements Child<T>, CacheConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CacheConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public CacheConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cache-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-value</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-value</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheValue(String cacheValue)
   {
      childNode.getOrCreate("cache-value").text(cacheValue);
      return this;
   }

   /**
    * Removes the <code>cache-value</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheValue()
   {
      childNode.remove("cache-value");
      return this;
   }

   /**
    * Returns the <code>cache-value</code> element
    * @return the node defined for the element <code>cache-value</code> 
    */
   public String getCacheValue()
   {
      return childNode.textValue("cache-value");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cache-max-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-max-size</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-max-size</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheMaxSize(Integer cacheMaxSize)
   {
      childNode.getOrCreate("cache-max-size").text(cacheMaxSize);
      return this;
   }

   /**
    * Removes the <code>cache-max-size</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheMaxSize()
   {
      childNode.remove("cache-max-size");
      return this;
   }

   /**
    * Returns the <code>cache-max-size</code> element
    * @return the node defined for the element <code>cache-max-size</code> 
    */
   public Integer getCacheMaxSize()
   {
      if (childNode.textValue("cache-max-size") != null && !childNode.textValue("cache-max-size").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("cache-max-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : idle-timeout-seconds
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>idle-timeout-seconds</code> element with the given value will be created.
    * Otherwise, the existing <code>idle-timeout-seconds</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setIdleTimeoutSeconds(Integer idleTimeoutSeconds)
   {
      childNode.getOrCreate("idle-timeout-seconds").text(idleTimeoutSeconds);
      return this;
   }

   /**
    * Removes the <code>idle-timeout-seconds</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeIdleTimeoutSeconds()
   {
      childNode.remove("idle-timeout-seconds");
      return this;
   }

   /**
    * Returns the <code>idle-timeout-seconds</code> element
    * @return the node defined for the element <code>idle-timeout-seconds</code> 
    */
   public Integer getIdleTimeoutSeconds()
   {
      if (childNode.textValue("idle-timeout-seconds") != null
            && !childNode.textValue("idle-timeout-seconds").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("idle-timeout-seconds"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remove-timeout-seconds
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remove-timeout-seconds</code> element with the given value will be created.
    * Otherwise, the existing <code>remove-timeout-seconds</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setRemoveTimeoutSeconds(Integer removeTimeoutSeconds)
   {
      childNode.getOrCreate("remove-timeout-seconds").text(removeTimeoutSeconds);
      return this;
   }

   /**
    * Removes the <code>remove-timeout-seconds</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeRemoveTimeoutSeconds()
   {
      childNode.remove("remove-timeout-seconds");
      return this;
   }

   /**
    * Returns the <code>remove-timeout-seconds</code> element
    * @return the node defined for the element <code>remove-timeout-seconds</code> 
    */
   public Integer getRemoveTimeoutSeconds()
   {
      if (childNode.textValue("remove-timeout-seconds") != null
            && !childNode.textValue("remove-timeout-seconds").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("remove-timeout-seconds"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cache-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-name</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-name</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheName(String cacheName)
   {
      childNode.getOrCreate("cache-name").text(cacheName);
      return this;
   }

   /**
    * Removes the <code>cache-name</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheName()
   {
      childNode.remove("cache-name");
      return this;
   }

   /**
    * Returns the <code>cache-name</code> element
    * @return the node defined for the element <code>cache-name</code> 
    */
   public String getCacheName()
   {
      return childNode.textValue("cache-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-manager
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-manager</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-manager</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setPersistenceManager(String persistenceManager)
   {
      childNode.getOrCreate("persistence-manager").text(persistenceManager);
      return this;
   }

   /**
    * Removes the <code>persistence-manager</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removePersistenceManager()
   {
      childNode.remove("persistence-manager");
      return this;
   }

   /**
    * Returns the <code>persistence-manager</code> element
    * @return the node defined for the element <code>persistence-manager</code> 
    */
   public String getPersistenceManager()
   {
      return childNode.textValue("persistence-manager");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : replication-is-passivation
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>replication-is-passivation</code> element with the given value will be created.
    * Otherwise, the existing <code>replication-is-passivation</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setReplicationIsPassivation(String replicationIsPassivation)
   {
      childNode.getOrCreate("replication-is-passivation").text(replicationIsPassivation);
      return this;
   }

   /**
    * Removes the <code>replication-is-passivation</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeReplicationIsPassivation()
   {
      childNode.remove("replication-is-passivation");
      return this;
   }

   /**
    * Returns the <code>replication-is-passivation</code> element
    * @return the node defined for the element <code>replication-is-passivation</code> 
    */
   public String getReplicationIsPassivation()
   {
      return childNode.textValue("replication-is-passivation");
   }

}
