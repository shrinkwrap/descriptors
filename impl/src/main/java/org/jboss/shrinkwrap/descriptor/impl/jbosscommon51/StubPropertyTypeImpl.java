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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.StubPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> stub-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class StubPropertyTypeImpl<T> implements Child<T>, StubPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public StubPropertyTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public StubPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : prop-name
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prop-name</code> element with the given value will be created.
    * Otherwise, the existing <code>prop-name</code> element will be updated with the given value.
    * @return the current instance of {@link StubPropertyType<T>} 
    */
   public StubPropertyType<T> setPropName(String propName)
   {
      childNode.getOrCreate("prop-name").text(propName);
      return this;
   }

   /**
    * Removes the <code>prop-name</code> element 
    * @return the current instance of {@link StubPropertyType<T>} 
    */
   public StubPropertyType<T> removePropName()
   {
      childNode.remove("prop-name");
      return this;
   }

   /**
    * Returns the <code>prop-name</code> element
    * @return the node defined for the element <code>prop-name</code> 
    */
   public String getPropName()
   {
      return childNode.textValue("prop-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : prop-value
   // isComplexType: false   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prop-value</code> element with the given value will be created.
    * Otherwise, the existing <code>prop-value</code> element will be updated with the given value.
    * @return the current instance of {@link StubPropertyType<T>} 
    */
   public StubPropertyType<T> setPropValue(String propValue)
   {
      childNode.getOrCreate("prop-value").text(propValue);
      return this;
   }

   /**
    * Removes the <code>prop-value</code> element 
    * @return the current instance of {@link StubPropertyType<T>} 
    */
   public StubPropertyType<T> removePropValue()
   {
      childNode.remove("prop-value");
      return this;
   }

   /**
    * Returns the <code>prop-value</code> element
    * @return the node defined for the element <code>prop-value</code> 
    */
   public String getPropValue()
   {
      return childNode.textValue("prop-value");
   }

}
