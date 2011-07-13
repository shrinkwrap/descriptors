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

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> method-attributesType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The method-attributes element can be used to specify which methods are <br> 
 * read only or idempotent. This is used to reduce the need for locks and replication. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MethodAttributesTypeImpl<T> implements Child<T>, MethodAttributesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodAttributesTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MethodAttributesTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of {@link MethodAttributesType<T>} 
    */
   public MethodAttributesType<T> removeAllMethod()
   {
      childNode.remove("method");
      return this;
   }

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public MethodType<MethodAttributesType<T>> method()
   {
      return new MethodTypeImpl<MethodAttributesType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<MethodAttributesType<T>>> getMethodList()
   {
      List<MethodType<MethodAttributesType<T>>> list = new ArrayList<MethodType<MethodAttributesType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for (Node node : nodeList)
      {
         MethodType<MethodAttributesType<T>> type = new MethodTypeImpl<MethodAttributesType<T>>(this, "method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
