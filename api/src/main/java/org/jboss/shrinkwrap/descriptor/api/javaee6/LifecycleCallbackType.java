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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> lifecycle-callbackType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The lifecycle-callback type specifies a method on a <br> 
 * class to be called when a lifecycle event occurs. <br> 
 * Note that each class may have only one lifecycle callback <br> 
 * method for any given event and that the method may not <br> 
 * be overloaded. <br> 
 *<br>
 * If the lifefycle-callback-class element is missing then <br> 
 * the class defining the callback is assumed to be the <br> 
 * component class in scope at the place in the descriptor <br> 
 * in which the callback definition appears. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface LifecycleCallbackType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : lifecycle-callback-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle-callback-class</code> element with the given value will be created.
    * Otherwise, the existing <code>lifecycle-callback-class</code> element will be updated with the given value.
    * @return the current instance of {@link LifecycleCallbackType<T>} 
    */
   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass);

   /**
    * Removes the <code>lifecycle-callback-class</code> element 
    * @return the current instance of {@link LifecycleCallbackType<T>} 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackClass();

   /**
    * Returns the <code>lifecycle-callback-class</code> element
    * @return the node defined for the element <code>lifecycle-callback-class</code> 
    */
   public String getLifecycleCallbackClass();

   // -------------------------------------------------------------------------------------||
   // Element type : lifecycle-callback-method
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle-callback-method</code> element with the given value will be created.
    * Otherwise, the existing <code>lifecycle-callback-method</code> element will be updated with the given value.
    * @return the current instance of {@link LifecycleCallbackType<T>} 
    */
   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);

   /**
    * Removes the <code>lifecycle-callback-method</code> element 
    * @return the current instance of {@link LifecycleCallbackType<T>} 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackMethod();

   /**
    * Returns the <code>lifecycle-callback-method</code> element
    * @return the node defined for the element <code>lifecycle-callback-method</code> 
    */
   public String getLifecycleCallbackMethod();

}
