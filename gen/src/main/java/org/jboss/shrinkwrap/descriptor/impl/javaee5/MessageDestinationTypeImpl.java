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

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> message-destinationType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * The message-destinationType specifies a message <br> 
 * destination. The logical destination described by this <br> 
 * element is mapped to a physical destination by the Deployer. <br> 
 *<br>
 * The message destination element contains: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display-name <br> 
 * - an optional icon <br> 
 * - a message destination name which must be unique <br> 
 * among message destination names within the same <br> 
 * Deployment File. <br> 
 * - an optional mapped name <br> 
 *<br>
 * Example: <br> 
 *<br>
 * <message-destination> <br> 
 * <message-destination-name>CorporateStocks <br> 
 * </message-destination-name> <br> 
 * </message-destination> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MessageDestinationTypeImpl<T> implements Child<T>, MessageDestinationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDestinationTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MessageDestinationTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllDescription()
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
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDisplayNameList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDisplayName(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<MessageDestinationType<T>> icon()
   {
      return new IconTypeImpl<MessageDestinationType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDestinationType<T>>> getIconList()
   {
      List<IconType<MessageDestinationType<T>>> list = new ArrayList<IconType<MessageDestinationType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<MessageDestinationType<T>> type = new IconTypeImpl<MessageDestinationType<T>>(this, "icon",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-name</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName)
   {
      childNode.getOrCreate("message-destination-name").text(messageDestinationName);
      return this;
   }

   /**
    * Removes the <code>message-destination-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeMessageDestinationName()
   {
      childNode.remove("message-destination-name");
      return this;
   }

   /**
    * Returns the <code>message-destination-name</code> element
    * @return the node defined for the element <code>message-destination-name</code> 
    */
   public String getMessageDestinationName()
   {
      return childNode.textValue("message-destination-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

}
