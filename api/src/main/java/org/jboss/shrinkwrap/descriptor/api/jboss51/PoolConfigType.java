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
 * This interface defines the contract for the <code> pool-configType </code> xsd type 
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
public interface PoolConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : pool-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-value</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-value</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolValue(String poolValue);

   /**
    * Removes the <code>pool-value</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolValue();

   /**
    * Returns the <code>pool-value</code> element
    * @return the node defined for the element <code>pool-value</code> 
    */
   public String getPoolValue();

   // -------------------------------------------------------------------------------------||
   // Element type : pool-max-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-max-size</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-max-size</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolMaxSize(Integer poolMaxSize);

   /**
    * Removes the <code>pool-max-size</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolMaxSize();

   /**
    * Returns the <code>pool-max-size</code> element
    * @return the node defined for the element <code>pool-max-size</code> 
    */
   public Integer getPoolMaxSize();

   // -------------------------------------------------------------------------------------||
   // Element type : pool-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>pool-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> setPoolTimeout(Integer poolTimeout);

   /**
    * Removes the <code>pool-timeout</code> element 
    * @return the current instance of {@link PoolConfigType<T>} 
    */
   public PoolConfigType<T> removePoolTimeout();

   /**
    * Returns the <code>pool-timeout</code> element
    * @return the node defined for the element <code>pool-timeout</code> 
    */
   public Integer getPoolTimeout();

}
