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
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> message-propertiesType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * Element for defining JMS message properties (e.g. persistence, priority) <br> 
 * for a consumer bean Used in: consumer <br> 
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MessagePropertiesTypeImpl<T> implements Child<T>, MessagePropertiesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessagePropertiesTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MessagePropertiesTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setClazz(String clazz)
   {
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeClazz()
   {
      childNode.remove("class");
      return this;
   }

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz()
   {
      return childNode.textValue("class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeMethod()
   {
      childNode.remove("method");
      return this;
   }

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<MessagePropertiesType<T>> method()
   {
      Node node = childNode.getOrCreate("method");
      MethodType<MessagePropertiesType<T>> method = new MethodTypeImpl<MessagePropertiesType<T>>(this, "method",
            childNode, node);
      return method;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : delivery
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>delivery</code> element with the given value will be created.
    * Otherwise, the existing <code>delivery</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setDelivery(String delivery)
   {
      childNode.getOrCreate("delivery").text(delivery);
      return this;
   }

   /**
    * Removes the <code>delivery</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removeDelivery()
   {
      childNode.remove("delivery");
      return this;
   }

   /**
    * Returns the <code>delivery</code> element
    * @return the node defined for the element <code>delivery</code> 
    */
   public String getDelivery()
   {
      return childNode.textValue("delivery");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : priority
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>priority</code> element with the given value will be created.
    * Otherwise, the existing <code>priority</code> element will be updated with the given value.
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> setPriority(Integer priority)
   {
      childNode.getOrCreate("priority").text(priority);
      return this;
   }

   /**
    * Removes the <code>priority</code> element 
    * @return the current instance of {@link MessagePropertiesType<T>} 
    */
   public MessagePropertiesType<T> removePriority()
   {
      childNode.remove("priority");
      return this;
   }

   /**
    * Returns the <code>priority</code> element
    * @return the node defined for the element <code>priority</code> 
    */
   public Integer getPriority()
   {
      if (childNode.textValue("priority") != null && !childNode.textValue("priority").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("priority"));
      }
      return null;
   }

}
