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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> activation-config-propertyType </code> xsd type 
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
public class ActivationConfigPropertyTypeImpl<T> implements Child<T>, ActivationConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property-name</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config-property-name</code> element will be updated with the given value.
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> setActivationConfigPropertyName(String activationConfigPropertyName)
   {
      childNode.getOrCreate("activation-config-property-name").text(activationConfigPropertyName);
      return this;
   }

   /**
    * Removes the <code>activation-config-property-name</code> element 
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName()
   {
      childNode.remove("activation-config-property-name");
      return this;
   }

   /**
    * Returns the <code>activation-config-property-name</code> element
    * @return the node defined for the element <code>activation-config-property-name</code> 
    */
   public String getActivationConfigPropertyName()
   {
      return childNode.textValue("activation-config-property-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property-value</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config-property-value</code> element will be updated with the given value.
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> setActivationConfigPropertyValue(String activationConfigPropertyValue)
   {
      childNode.getOrCreate("activation-config-property-value").text(activationConfigPropertyValue);
      return this;
   }

   /**
    * Removes the <code>activation-config-property-value</code> element 
    * @return the current instance of {@link ActivationConfigPropertyType<T>} 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue()
   {
      childNode.remove("activation-config-property-value");
      return this;
   }

   /**
    * Returns the <code>activation-config-property-value</code> element
    * @return the node defined for the element <code>activation-config-property-value</code> 
    */
   public String getActivationConfigPropertyValue()
   {
      return childNode.textValue("activation-config-property-value");
   }

}
