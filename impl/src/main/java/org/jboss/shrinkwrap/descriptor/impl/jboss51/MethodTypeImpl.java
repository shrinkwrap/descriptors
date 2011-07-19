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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> methodType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The method element is used to specify attributes for one method or all <br> 
 * those matching a pattern startingstring*. <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MethodTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-name</code> element with the given value will be created.
    * Otherwise, the existing <code>method-name</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setMethodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeMethodName()
   {
      childNode.remove("method-name");
      return this;
   }

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName()
   {
      return childNode.textValue("method-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : read-only
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>read-only</code> element with the given value will be created.
    * Otherwise, the existing <code>read-only</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setReadOnly(Boolean readOnly)
   {
      childNode.getOrCreate("read-only").text(readOnly);
      return this;
   }

   /**
    * Removes the <code>read-only</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeReadOnly()
   {
      childNode.remove("read-only");
      return this;
   }

   /**
    * Returns the <code>read-only</code> element
    * @return the node defined for the element <code>read-only</code> 
    */
   public Boolean isReadOnly()
   {
      return Strings.isTrue(childNode.textValue("read-only"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : idempotent
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>idempotent</code> element with the given value will be created.
    * Otherwise, the existing <code>idempotent</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setIdempotent(Boolean idempotent)
   {
      childNode.getOrCreate("idempotent").text(idempotent);
      return this;
   }

   /**
    * Removes the <code>idempotent</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeIdempotent()
   {
      childNode.remove("idempotent");
      return this;
   }

   /**
    * Returns the <code>idempotent</code> element
    * @return the node defined for the element <code>idempotent</code> 
    */
   public Boolean isIdempotent()
   {
      return Strings.isTrue(childNode.textValue("idempotent"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transaction-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transaction-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>transaction-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> setTransactionTimeout(String transactionTimeout)
   {
      childNode.getOrCreate("transaction-timeout").text(transactionTimeout);
      return this;
   }

   /**
    * Removes the <code>transaction-timeout</code> element 
    * @return the current instance of {@link MethodType<T>} 
    */
   public MethodType<T> removeTransactionTimeout()
   {
      childNode.remove("transaction-timeout");
      return this;
   }

   /**
    * Returns the <code>transaction-timeout</code> element
    * @return the node defined for the element <code>transaction-timeout</code> 
    */
   public String getTransactionTimeout()
   {
      return childNode.textValue("transaction-timeout");
   }

}
