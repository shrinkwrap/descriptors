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
 * This interface defines the contract for the <code> init-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface InitMethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : create-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>create-method</code> element 
    * @return the current instance of {@link InitMethodType<T>} 
    */
   public InitMethodType<T> removeCreateMethod();

   /**
    * If not already created, a new <code>create-method</code> element will be created and returned.
    * Otherwise, the existing <code>create-method</code> element will be returned.
    * @return the node defined for the element <code>create-method</code> 
    */
   public NamedMethodType<InitMethodType<T>> createMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : bean-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of {@link InitMethodType<T>} 
    */
   public InitMethodType<T> removeBeanMethod();

   /**
    * If not already created, a new <code>bean-method</code> element will be created and returned.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return the node defined for the element <code>bean-method</code> 
    */
   public NamedMethodType<InitMethodType<T>> beanMethod();

}
