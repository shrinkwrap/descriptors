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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> activation-configType </code> xsd type 
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
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class ActivationConfigTypeImpl<T> implements Child<T>, ActivationConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ActivationConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public ActivationConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>activation-config-property</code> elements 
    * @return the current instance of {@link ActivationConfigType<T>} 
    */
   public ActivationConfigType<T> removeAllActivationConfigProperty()
   {
      childNode.remove("activation-config-property");
      return this;
   }

   /**
    * Returns the <code>activation-config-property</code> element
    * @return the node defined for the element <code>activation-config-property</code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> activationConfigProperty()
   {
      return new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(this, "activation-config-property",
            childNode);
   }

   /**
    * Returns all <code>activation-config-property</code> elements
    * @return list of <code>activation-config-property</code> 
    */
   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getActivationConfigPropertyList()
   {
      List<ActivationConfigPropertyType<ActivationConfigType<T>>> list = new ArrayList<ActivationConfigPropertyType<ActivationConfigType<T>>>();
      List<Node> nodeList = childNode.get("activation-config-property");
      for (Node node : nodeList)
      {
         ActivationConfigPropertyType<ActivationConfigType<T>> type = new ActivationConfigPropertyTypeImpl<ActivationConfigType<T>>(
               this, "activation-config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
