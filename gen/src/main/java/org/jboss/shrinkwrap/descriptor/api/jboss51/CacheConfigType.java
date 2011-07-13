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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> cache-configType </code> xsd type 
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
public interface CacheConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : cache-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-value</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-value</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheValue(String cacheValue);

   /**
    * Removes the <code>cache-value</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheValue();

   /**
    * Returns the <code>cache-value</code> element
    * @return the node defined for the element <code>cache-value</code> 
    */
   public String getCacheValue();

   // -------------------------------------------------------------------------------------||
   // Element type : cache-max-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-max-size</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-max-size</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheMaxSize(Integer cacheMaxSize);

   /**
    * Removes the <code>cache-max-size</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheMaxSize();

   /**
    * Returns the <code>cache-max-size</code> element
    * @return the node defined for the element <code>cache-max-size</code> 
    */
   public Integer getCacheMaxSize();

   // -------------------------------------------------------------------------------------||
   // Element type : idle-timeout-seconds
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>idle-timeout-seconds</code> element with the given value will be created.
    * Otherwise, the existing <code>idle-timeout-seconds</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setIdleTimeoutSeconds(Integer idleTimeoutSeconds);

   /**
    * Removes the <code>idle-timeout-seconds</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeIdleTimeoutSeconds();

   /**
    * Returns the <code>idle-timeout-seconds</code> element
    * @return the node defined for the element <code>idle-timeout-seconds</code> 
    */
   public Integer getIdleTimeoutSeconds();

   // -------------------------------------------------------------------------------------||
   // Element type : remove-timeout-seconds
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remove-timeout-seconds</code> element with the given value will be created.
    * Otherwise, the existing <code>remove-timeout-seconds</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setRemoveTimeoutSeconds(Integer removeTimeoutSeconds);

   /**
    * Removes the <code>remove-timeout-seconds</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeRemoveTimeoutSeconds();

   /**
    * Returns the <code>remove-timeout-seconds</code> element
    * @return the node defined for the element <code>remove-timeout-seconds</code> 
    */
   public Integer getRemoveTimeoutSeconds();

   // -------------------------------------------------------------------------------------||
   // Element type : cache-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cache-name</code> element with the given value will be created.
    * Otherwise, the existing <code>cache-name</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setCacheName(String cacheName);

   /**
    * Removes the <code>cache-name</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeCacheName();

   /**
    * Returns the <code>cache-name</code> element
    * @return the node defined for the element <code>cache-name</code> 
    */
   public String getCacheName();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-manager
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-manager</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-manager</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setPersistenceManager(String persistenceManager);

   /**
    * Removes the <code>persistence-manager</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removePersistenceManager();

   /**
    * Returns the <code>persistence-manager</code> element
    * @return the node defined for the element <code>persistence-manager</code> 
    */
   public String getPersistenceManager();

   // -------------------------------------------------------------------------------------||
   // Element type : replication-is-passivation
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>replication-is-passivation</code> element with the given value will be created.
    * Otherwise, the existing <code>replication-is-passivation</code> element will be updated with the given value.
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> setReplicationIsPassivation(String replicationIsPassivation);

   /**
    * Removes the <code>replication-is-passivation</code> element 
    * @return the current instance of {@link CacheConfigType<T>} 
    */
   public CacheConfigType<T> removeReplicationIsPassivation();

   /**
    * Returns the <code>replication-is-passivation</code> element
    * @return the node defined for the element <code>replication-is-passivation</code> 
    */
   public String getReplicationIsPassivation();

}
