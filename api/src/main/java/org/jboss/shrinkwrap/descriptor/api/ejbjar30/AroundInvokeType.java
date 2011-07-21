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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> around-invokeType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The around-invoke type specifies a method on a <br> 
 * class to be called during the around invoke portion of an <br> 
 * ejb invocation. Note that each class may have only one <br> 
 * around invoke method and that the method may not be <br> 
 * overloaded. <br> 
 *<br>
 * If the class element is missing then <br> 
 * the class defining the callback is assumed to be the <br> 
 * interceptor class or component class in scope at the <br> 
 * location in the descriptor in which the around invoke <br> 
 * definition appears. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface AroundInvokeType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be updated with the given value.
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> setClazz(String clazz);

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> removeClazz();

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz();

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> setMethodName(String methodName);

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link AroundInvokeType<T>} 
    */
   public AroundInvokeType<T> removeMethodName();

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

}
