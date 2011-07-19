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

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> properties </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * A list of standard and vendor-specific properties <br> 
 * and hints. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class PropertiesImpl<T> implements Child<T>, Properties<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PropertiesImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public PropertiesImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of {@link Properties<T>} 
    */
   public Properties<T> removeAllProperty()
   {
      childNode.remove("property");
      return this;
   }

   /**
    * Returns the <code>property</code> element
    * @return the node defined for the element <code>property</code> 
    */
   public Property<Properties<T>> property()
   {
      return new PropertyImpl<Properties<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<Property<Properties<T>>> getPropertyList()
   {
      List<Property<Properties<T>>> list = new ArrayList<Property<Properties<T>>>();
      List<Node> nodeList = childNode.get("property");
      for (Node node : nodeList)
      {
         Property<Properties<T>> type = new PropertyImpl<Properties<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
