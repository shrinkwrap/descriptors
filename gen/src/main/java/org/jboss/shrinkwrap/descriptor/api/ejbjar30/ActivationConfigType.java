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
 * This interface defines the contract for the <code> activation-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The activation-configType defines information about the <br> 
 * expected configuration properties of the message-driven bean <br> 
 * in its operational environment. This may include information <br> 
 * about message acknowledgement, message selector, expected <br> 
 * destination type, etc. <br> 
 *<br>
 * The configuration information is expressed in terms of <br> 
 * name/value configuration properties. <br> 
 *<br>
 * The properties that are recognized for a particular <br> 
 * message-driven bean are determined by the messaging type. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ActivationConfigType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>activation-config-property</code> elements 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> removeAllActivationConfigProperty();

   /**
    * Returns the <code>activation-config-property</code> element
    * @return the node defined for the element <code>activation-config-property</code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty();

   /**
    * Returns all <code>activation-config-property</code> elements
    * @return list of <code>activation-config-property</code> 
    */
   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getActivationConfigPropertyList();

}
