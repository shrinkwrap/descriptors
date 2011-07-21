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
 * This interface defines the contract for the <code> remove-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface RemoveMethodType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : bean-method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of {@link RemoveMethodType<T>} 
    */
   public RemoveMethodType<T> removeBeanMethod();

   /**
    * If not already created, a new <code>bean-method</code> element will be created and returned.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return the node defined for the element <code>bean-method</code> 
    */
   public NamedMethodType<RemoveMethodType<T>> beanMethod();

   // -------------------------------------------------------------------------------------||
   // Element type : retain-if-exception
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>retain-if-exception</code> element with the given value will be created.
    * Otherwise, the existing <code>retain-if-exception</code> element will be updated with the given value.
    * @return the current instance of {@link RemoveMethodType<T>} 
    */
   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException);

   /**
    * Removes the <code>retain-if-exception</code> element 
    * @return the current instance of {@link RemoveMethodType<T>} 
    */
   public RemoveMethodType<T> removeRetainIfException();

   /**
    * Returns the <code>retain-if-exception</code> element
    * @return the node defined for the element <code>retain-if-exception</code> 
    */
   public Boolean isRetainIfException();

}
