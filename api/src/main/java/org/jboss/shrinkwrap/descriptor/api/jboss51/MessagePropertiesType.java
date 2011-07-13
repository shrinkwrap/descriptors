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
 * This interface defines the contract for the <code> message-propertiesType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * Element for defining JMS message properties (e.g. persistence, priority) <br> 
 * for a consumer bean Used in: consumer <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface MessagePropertiesType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setClazz(String clazz);

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeClazz();

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz();

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeMethod();

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<MessagePropertiesType<T>> method();

   // -------------------------------------------------------------------------------------||
   // Element type : delivery
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>delivery</code> element with the given value will be created.
    * Otherwise, the existing <code>delivery</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setDelivery(String delivery);

   /**
    * Removes the <code>delivery</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeDelivery();

   /**
    * Returns the <code>delivery</code> element
    * @return the node defined for the element <code>delivery</code> 
    */
   public String getDelivery();

   // -------------------------------------------------------------------------------------||
   // Element type : priority
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>priority</code> element with the given value will be created.
    * Otherwise, the existing <code>priority</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setPriority(Integer priority);

   /**
    * Removes the <code>priority</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removePriority();

   /**
    * Returns the <code>priority</code> element
    * @return the node defined for the element <code>priority</code> 
    */
   public Integer getPriority();

}
