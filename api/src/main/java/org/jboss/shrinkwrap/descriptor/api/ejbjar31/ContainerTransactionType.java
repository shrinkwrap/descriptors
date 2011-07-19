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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> container-transactionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The container-transactionType specifies how the container <br> 
 * must manage transaction scopes for the enterprise bean's <br> 
 * method invocations. It defines an optional description, a <br> 
 * list of method elements, and a transaction attribute. The <br> 
 * transaction attribute is to be applied to all the specified <br> 
 * methods. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface ContainerTransactionType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> removeAllMethod();

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<ContainerTransactionType<T>> method();

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<ContainerTransactionType<T>>> getMethodList();

   // -------------------------------------------------------------------------------------||
   // Element type : trans-attribute
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>trans-attribute</code> element with the given value will be created.
    * Otherwise, the existing <code>trans-attribute</code> element will be updated with the given value.
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> setTransAttribute(TransAttributeType transAttribute);

   /**
    * If not already created, a new <code>trans-attribute</code> element with the given value will be created.
    * Otherwise, the existing <code>trans-attribute</code> element will be updated with the given value.
    * @return the current instance of {@link ContainerTransactionType<T>} 
    */
   public ContainerTransactionType<T> setTransAttribute(String transAttribute);

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the node defined for the element <code>trans-attribute</code> 
    */
   public TransAttributeType getTransAttribute();

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the node defined for the element <code>trans-attribute</code> 
    */
   public String getTransAttributeAsString();

}
