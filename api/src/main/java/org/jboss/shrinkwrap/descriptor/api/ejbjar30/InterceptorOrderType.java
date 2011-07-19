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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> interceptor-orderType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * The interceptor-orderType element describes a total ordering <br> 
 * of interceptor classes. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface InterceptorOrderType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : interceptor-class
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass);

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param list of <code>interceptor-class</code> objects 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> setInterceptorClassList(String... values);

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of {@link InterceptorOrderType<T>} 
    */
   public InterceptorOrderType<T> removeAllInterceptorClass();

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getInterceptorClassList();

}
