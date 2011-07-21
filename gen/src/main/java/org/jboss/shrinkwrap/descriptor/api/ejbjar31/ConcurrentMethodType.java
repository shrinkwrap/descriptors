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

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> concurrent-methodType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The concurrent-methodType specifies information about a method <br> 
 * of a bean with container managed concurrency. <br> 
 *<br>
 * The optional lock element specifies the kind of concurrency <br> 
 * lock asssociated with the method. <br> 
 *<br>
 * The optional access-timeout element specifies the amount of <br> 
 * time (in a given time unit) the container should wait for a <br> 
 * concurrency lock before throwing an exception to the client. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface ConcurrentMethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of {@link ConcurrentMethodType<T>} 
    */
   public ConcurrentMethodType<T> removeMethod();

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return the node defined for the element <code>method</code> 
    */
   public NamedMethodType<ConcurrentMethodType<T>> method();

   // -------------------------------------------------------------------------------------||
   // Element type : lock
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lock</code> element with the given value will be created.
    * Otherwise, the existing <code>lock</code> element will be updated with the given value.
    * @return the current instance of {@link ConcurrentMethodType<T>} 
    */
   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock);

   /**
    * If not already created, a new <code>lock</code> element with the given value will be created.
    * Otherwise, the existing <code>lock</code> element will be updated with the given value.
    * @return the current instance of {@link ConcurrentMethodType<T>} 
    */
   public ConcurrentMethodType<T> setLock(String lock);

   /**
    * Returns the <code>lock</code> element
    * @return the node defined for the element <code>lock</code> 
    */
   public ConcurrentLockTypeType getLock();

   /**
    * Returns the <code>lock</code> element
    * @return the node defined for the element <code>lock</code> 
    */
   public String getLockAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : access-timeout
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>access-timeout</code> element 
    * @return the current instance of {@link ConcurrentMethodType<T>} 
    */
   public ConcurrentMethodType<T> removeAccessTimeout();

   /**
    * If not already created, a new <code>access-timeout</code> element will be created and returned.
    * Otherwise, the existing <code>access-timeout</code> element will be returned.
    * @return the node defined for the element <code>access-timeout</code> 
    */
   public AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout();

}
