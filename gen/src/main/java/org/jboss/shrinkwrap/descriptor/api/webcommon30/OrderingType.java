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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> orderingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Please see section 8.2.2 of the specification for details. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface OrderingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : after
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of {@link OrderingType<T>} 
    */
   public OrderingType<T> removeAfter();

   /**
    * If not already created, a new <code>after</code> element will be created and returned.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return the node defined for the element <code>after</code> 
    */
   public OrderingOrderingType<OrderingType<T>> after();

   // -------------------------------------------------------------------------------------||
   // Element type : before
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of {@link OrderingType<T>} 
    */
   public OrderingType<T> removeBefore();

   /**
    * If not already created, a new <code>before</code> element will be created and returned.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return the node defined for the element <code>before</code> 
    */
   public OrderingOrderingType<OrderingType<T>> before();

}
