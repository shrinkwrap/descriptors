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
 * This interface defines the contract for the <code> named-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface NamedMethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link NamedMethodType<T>} 
    */
   public NamedMethodType<T> setMethodName(String methodName);

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link NamedMethodType<T>} 
    */
   public NamedMethodType<T> removeMethodName();

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   // -------------------------------------------------------------------------------------||
   // Element type : method-params
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of {@link NamedMethodType<T>} 
    */
   public NamedMethodType<T> removeMethodParams();

   /**
    * If not already created, a new <code>method-params</code> element will be created and returned.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return the node defined for the element <code>method-params</code> 
    */
   public MethodParamsType<NamedMethodType<T>> methodParams();

}
