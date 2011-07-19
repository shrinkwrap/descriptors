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
 * This interface defines the contract for the <code> activation-config-propertyType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The activation-config-propertyType contains a name/value <br> 
 * configuration property pair for a message-driven bean. <br> 
 *<br>
 * The properties that are recognized for a particular <br> 
 * message-driven bean are determined by the messaging type. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ActivationConfigPropertyType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property-name</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config-property-name</code> element will be updated with the given value.
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName);

   /**
    * Removes the <code>activation-config-property-name</code> element 
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName();

   /**
    * Returns the <code>activation-config-property-name</code> element
    * @return the node defined for the element <code>activation-config-property-name</code> 
    */
   public String getActivationConfigPropertyName();

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property-value</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config-property-value</code> element will be updated with the given value.
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue);

   /**
    * Removes the <code>activation-config-property-value</code> element 
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue();

   /**
    * Returns the <code>activation-config-property-value</code> element
    * @return the node defined for the element <code>activation-config-property-value</code> 
    */
   public String getActivationConfigPropertyValue();

}
