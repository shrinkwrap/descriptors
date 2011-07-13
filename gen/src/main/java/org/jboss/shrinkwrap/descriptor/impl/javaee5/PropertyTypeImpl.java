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
package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> propertyType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Specifies a name/value pair. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class PropertyTypeImpl<T> implements Child<T>, PropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PropertyTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PropertyTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>name</code> element with the given value will be created.
    * Otherwise, the existing <code>name</code> element will be updated with the given value.
    * @return the current instance of {@link PropertyType<T>} 
    */
   public PropertyType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link PropertyType<T>} 
    */
   public PropertyType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.textValue("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>value</code> element with the given value will be created.
    * Otherwise, the existing <code>value</code> element will be updated with the given value.
    * @return the current instance of {@link PropertyType<T>} 
    */
   public PropertyType<T> setValue(String value)
   {
      childNode.getOrCreate("value").text(value);
      return this;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of {@link PropertyType<T>} 
    */
   public PropertyType<T> removeValue()
   {
      childNode.remove("value");
      return this;
   }

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue()
   {
      return childNode.textValue("value");
   }

}
