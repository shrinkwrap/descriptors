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
package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> message-destination-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * The message-destination-ref element contains a declaration <br> 
 * of Deployment Component's reference to a message destination <br> 
 * associated with a resource in Deployment Component's <br> 
 * environment. It consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the message destination reference name <br> 
 * - an optional message destination type <br> 
 * - an optional specification as to whether <br> 
 * the destination is used for <br> 
 * consuming or producing messages, or both. <br> 
 * if not specified, "both" is assumed. <br> 
 * - an optional link to the message destination <br> 
 * - optional injection targets <br> 
 *<br>
 * The message destination type must be supplied unless an <br> 
 * injection target is specified, in which case the type <br> 
 * of the target is used. If both are specified, the type <br> 
 * must be assignment compatible with the type of the injection <br> 
 * target. <br> 
 *<br>
 * Examples: <br> 
 *<br>
 * <message-destination-ref> <br> 
 * <message-destination-ref-name>jms/StockQueue <br> 
 * </message-destination-ref-name> <br> 
 * <message-destination-type>javax.jms.Queue <br> 
 * </message-destination-type> <br> 
 * <message-destination-usage>Consumes <br> 
 * </message-destination-usage> <br> 
 * <message-destination-link>CorporateStocks <br> 
 * </message-destination-link> <br> 
 * </message-destination-ref> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface MessageDestinationRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getInjectionTargetList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationRefName(String messageDestinationRefName);

   /**
    * Removes the <code>message-destination-ref-name</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationRefName();

   /**
    * Returns the <code>message-destination-ref-name</code> element
    * @return the node defined for the element <code>message-destination-ref-name</code> 
    */
   public String getMessageDestinationRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-type</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-type</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationType(String messageDestinationType);

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationType();

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-usage
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-usage</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-usage</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);

   /**
    * If not already created, a new <code>message-destination-usage</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-usage</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationUsage(String messageDestinationUsage);

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the node defined for the element <code>message-destination-usage</code> 
    */
   public MessageDestinationUsageType getMessageDestinationUsage();

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the node defined for the element <code>message-destination-usage</code> 
    */
   public String getMessageDestinationUsageAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-link
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-link</code> element with the given value will be created.
    * Otherwise, the existing <code>message-destination-link</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> setMessageDestinationLink(String messageDestinationLink);

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of {@link MessageDestinationRefType<T>} 
    */
   public MessageDestinationRefType<T> removeMessageDestinationLink();

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink();

}
