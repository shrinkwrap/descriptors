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
 * This interface defines the contract for the <code> methodType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The method element is used to specify attributes for one method or all <br> 
 * those matching a pattern startingstring*. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface MethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setMethodName(String methodName);

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeMethodName();

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   // -------------------------------------------------------------------------------------||
   // Element type : read-only
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>read-only</code> element with the given value will be created.
    * Otherwise, the existing <code>read-only</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setReadOnly(Boolean readOnly);

   /**
    * Removes the <code>read-only</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeReadOnly();

   /**
    * Returns the <code>read-only</code> element
    * @return the node defined for the element <code>read-only</code> 
    */
   public Boolean isReadOnly();

   // -------------------------------------------------------------------------------------||
   // Element type : idempotent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>idempotent</code> element with the given value will be created.
    * Otherwise, the existing <code>idempotent</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setIdempotent(Boolean idempotent);

   /**
    * Removes the <code>idempotent</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeIdempotent();

   /**
    * Returns the <code>idempotent</code> element
    * @return the node defined for the element <code>idempotent</code> 
    */
   public Boolean isIdempotent();

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setTransactionTimeout(String transactionTimeout);

   /**
    * Removes the <code>transaction-timeout</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeTransactionTimeout();

   /**
    * Returns the <code>transaction-timeout</code> element
    * @return the node defined for the element <code>transaction-timeout</code> 
    */
   public String getTransactionTimeout();

}
