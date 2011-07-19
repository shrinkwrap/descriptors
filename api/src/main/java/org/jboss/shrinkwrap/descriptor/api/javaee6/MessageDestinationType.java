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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> message-destinationType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 * [ <br> 
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
 * - an optional lookup name <br> 
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
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface MessageDestinationType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>display-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDisplayName(String displayName);

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setDisplayNameList(String... values);

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllDisplayName();

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getDisplayNameList();

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeAllIcon();

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<MessageDestinationType<T>> icon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDestinationType<T>>> getIconList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-name</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);

   /**
    * Removes the <code>message-destination-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeMessageDestinationName();

   /**
    * Returns the <code>message-destination-name</code> element
    * @return the node defined for the element <code>message-destination-name</code> 
    */
   public String getMessageDestinationName();

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : lookup-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lookup-name</code> element with the given value will be created.
    * Otherwise, the existing <code>lookup-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> setLookupName(String lookupName);

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of {@link MessageDestinationType<T>} 
    */
   public MessageDestinationType<T> removeLookupName();

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

}
