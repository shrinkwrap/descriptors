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
package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> property </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * A name-value pair. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class PropertyImpl<T> implements Child<T>, Property<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PropertyImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PropertyImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of {@link Property<T>} 
    */
   public Property<T> setName(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of {@link Property<T>} 
    */
   public Property<T> removeName()
   {
      childNode.attributes().remove("name");
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.attributes().get("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : value
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> attribute
    * @param value the value for the attribute <code>value</code> 
    * @return the current instance of {@link Property<T>} 
    */
   public Property<T> setValue(String value)
   {
      childNode.attribute("value", value);
      return this;
   }

   /**
    * Removes the <code>value</code> attribute 
    * @return the current instance of {@link Property<T>} 
    */
   public Property<T> removeValue()
   {
      childNode.attributes().remove("value");
      return this;
   }

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue()
   {
      return childNode.attributes().get("value");
   }

}
