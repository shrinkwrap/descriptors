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
 * This interface defines the contract for the <code> stateful-timeoutType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The stateful-timeoutType represents the amount of time <br> 
 * a stateful session bean can be idle(not receive any client <br> 
 * invocations) before it is eligible for removal by the container. <br> 
 *<br>
 * A timeout value of 0 means the bean is immediately eligible for removal. <br> 
 *<br>
 * A timeout value of -1 means the bean will never be removed due to timeout. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface StatefulTimeoutType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be updated with the given value.
    * @return the current instance of {@link StatefulTimeoutType<T>} 
    */
   public StatefulTimeoutType<T> setTimeout(Integer timeout);

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of {@link StatefulTimeoutType<T>} 
    */
   public StatefulTimeoutType<T> removeTimeout();

   /**
    * Returns the <code>timeout</code> element
    * @return the node defined for the element <code>timeout</code> 
    */
   public Integer getTimeout();

   // -------------------------------------------------------------------------------------||
   // Element type : unit
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unit</code> element with the given value will be created.
    * Otherwise, the existing <code>unit</code> element will be updated with the given value.
    * @return the current instance of {@link StatefulTimeoutType<T>} 
    */
   public StatefulTimeoutType<T> setUnit(TimeUnitTypeType unit);

   /**
    * If not already created, a new <code>unit</code> element with the given value will be created.
    * Otherwise, the existing <code>unit</code> element will be updated with the given value.
    * @return the current instance of {@link StatefulTimeoutType<T>} 
    */
   public StatefulTimeoutType<T> setUnit(String unit);

   /**
    * Returns the <code>unit</code> element
    * @return the node defined for the element <code>unit</code> 
    */
   public TimeUnitTypeType getUnit();

   /**
    * Returns the <code>unit</code> element
    * @return the node defined for the element <code>unit</code> 
    */
   public String getUnitAsString();

}
