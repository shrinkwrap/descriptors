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
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> message-driven-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 * The message-driven element holds information specific to jboss and not <br> 
 * declared in ejb-jar.xml about a message-driven bean, such as container configuration and <br> 
 * resources. The bean should already be declared in ejb-jar.xml, with the same ejb-name. <br> 
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>, MessageDrivenBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDescription()
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDisplayName()
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
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<MessageDrivenBeanType<T>> icon()
   {
      return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDrivenBeanType<T>>> getIconList()
   {
      List<IconType<MessageDrivenBeanType<T>>> list = new ArrayList<IconType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<MessageDrivenBeanType<T>> type = new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-name</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbName()
   {
      childNode.remove("ejb-name");
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.textValue("ejb-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : activation-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeActivationConfig()
   {
      childNode.remove("activation-config");
      return this;
   }

   /**
    * If not already created, a new <code>activation-config</code> element will be created and returned.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return the node defined for the element <code>activation-config</code> 
    */
   public ActivationConfigType<MessageDrivenBeanType<T>> activationConfig()
   {
      Node node = childNode.getOrCreate("activation-config");
      ActivationConfigType<MessageDrivenBeanType<T>> activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(
            this, "activation-config", childNode, node);
      return activationConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : destination-jndi-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>destination-jndi-name</code> element with the given value will be created.
    * Otherwise, the existing <code>destination-jndi-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDestinationJndiName(String destinationJndiName)
   {
      childNode.getOrCreate("destination-jndi-name").text(destinationJndiName);
      return this;
   }

   /**
    * Removes the <code>destination-jndi-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeDestinationJndiName()
   {
      childNode.remove("destination-jndi-name");
      return this;
   }

   /**
    * Returns the <code>destination-jndi-name</code> element
    * @return the node defined for the element <code>destination-jndi-name</code> 
    */
   public String getDestinationJndiName()
   {
      return childNode.textValue("destination-jndi-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-user
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-user</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-user</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbUser(String mdbUser)
   {
      childNode.getOrCreate("mdb-user").text(mdbUser);
      return this;
   }

   /**
    * Removes the <code>mdb-user</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbUser()
   {
      childNode.remove("mdb-user");
      return this;
   }

   /**
    * Returns the <code>mdb-user</code> element
    * @return the node defined for the element <code>mdb-user</code> 
    */
   public String getMdbUser()
   {
      return childNode.textValue("mdb-user");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-passwd
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-passwd</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-passwd</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbPasswd(String mdbPasswd)
   {
      childNode.getOrCreate("mdb-passwd").text(mdbPasswd);
      return this;
   }

   /**
    * Removes the <code>mdb-passwd</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbPasswd()
   {
      childNode.remove("mdb-passwd");
      return this;
   }

   /**
    * Returns the <code>mdb-passwd</code> element
    * @return the node defined for the element <code>mdb-passwd</code> 
    */
   public String getMdbPasswd()
   {
      return childNode.textValue("mdb-passwd");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-client-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-client-id</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-client-id</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbClientId(String mdbClientId)
   {
      childNode.getOrCreate("mdb-client-id").text(mdbClientId);
      return this;
   }

   /**
    * Removes the <code>mdb-client-id</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbClientId()
   {
      childNode.remove("mdb-client-id");
      return this;
   }

   /**
    * Returns the <code>mdb-client-id</code> element
    * @return the node defined for the element <code>mdb-client-id</code> 
    */
   public String getMdbClientId()
   {
      return childNode.textValue("mdb-client-id");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : mdb-subscription-id
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mdb-subscription-id</code> element with the given value will be created.
    * Otherwise, the existing <code>mdb-subscription-id</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setMdbSubscriptionId(String mdbSubscriptionId)
   {
      childNode.getOrCreate("mdb-subscription-id").text(mdbSubscriptionId);
      return this;
   }

   /**
    * Removes the <code>mdb-subscription-id</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMdbSubscriptionId()
   {
      childNode.remove("mdb-subscription-id");
      return this;
   }

   /**
    * Returns the <code>mdb-subscription-id</code> element
    * @return the node defined for the element <code>mdb-subscription-id</code> 
    */
   public String getMdbSubscriptionId()
   {
      return childNode.textValue("mdb-subscription-id");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-adapter-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-adapter-name</code> element with the given value will be created.
    * Otherwise, the existing <code>resource-adapter-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setResourceAdapterName(String resourceAdapterName)
   {
      childNode.getOrCreate("resource-adapter-name").text(resourceAdapterName);
      return this;
   }

   /**
    * Removes the <code>resource-adapter-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeResourceAdapterName()
   {
      childNode.remove("resource-adapter-name");
      return this;
   }

   /**
    * Returns the <code>resource-adapter-name</code> element
    * @return the node defined for the element <code>resource-adapter-name</code> 
    */
   public String getResourceAdapterName()
   {
      return childNode.textValue("resource-adapter-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<MessageDrivenBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<MessageDrivenBeanType<T>> type = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-local-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbLocalRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<MessageDrivenBeanType<T>> type = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllServiceRef()
   {
      childNode.remove("service-ref");
      return this;
   }

   /**
    * Returns the <code>service-ref</code> element
    * @return the node defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> serviceRef()
   {
      return new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<MessageDrivenBeanType<T>>> getServiceRefList()
   {
      List<ServiceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ServiceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for (Node node : nodeList)
      {
         ServiceRefType<MessageDrivenBeanType<T>> type = new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<MessageDrivenBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<MessageDrivenBeanType<T>> type = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : resource-env-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceEnvRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<MessageDrivenBeanType<T>> type = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this,
               "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-destination-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<MessageDrivenBeanType<T>>> list = new ArrayList<MessageDestinationRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<MessageDrivenBeanType<T>> type = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(
               this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
            this, "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-domain</code> element with the given value will be created.
    * Otherwise, the existing <code>security-domain</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setSecurityDomain(String securityDomain)
   {
      childNode.getOrCreate("security-domain").text(securityDomain);
      return this;
   }

   /**
    * Removes the <code>security-domain</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeSecurityDomain()
   {
      childNode.remove("security-domain");
      return this;
   }

   /**
    * Returns the <code>security-domain</code> element
    * @return the node defined for the element <code>security-domain</code> 
    */
   public String getSecurityDomain()
   {
      return childNode.textValue("security-domain");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : method-attributes
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>method-attributes</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeMethodAttributes()
   {
      childNode.remove("method-attributes");
      return this;
   }

   /**
    * If not already created, a new <code>method-attributes</code> element will be created and returned.
    * Otherwise, the existing <code>method-attributes</code> element will be returned.
    * @return the node defined for the element <code>method-attributes</code> 
    */
   public MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes()
   {
      Node node = childNode.getOrCreate("method-attributes");
      MethodAttributesType<MessageDrivenBeanType<T>> methodAttributes = new MethodAttributesTypeImpl<MessageDrivenBeanType<T>>(
            this, "method-attributes", childNode, node);
      return methodAttributes;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : depends
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>depends</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDepends(String depends)
   {
      childNode.create("depends").text(depends);
      return this;
   }

   /**
    * Creates for all String objects representing <code>depends</code> elements, 
    * a new <code>depends</code> element 
    * @param list of <code>depends</code> objects 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setDependsList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDepends(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>depends</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllDepends()
   {
      childNode.remove("depends");
      return this;
   }

   /**
    * Returns all <code>depends</code> elements
    * @return list of <code>depends</code> 
    */
   public List<String> getDependsList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("depends");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-timeout-identity
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ejb-timeout-identity</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeEjbTimeoutIdentity()
   {
      childNode.remove("ejb-timeout-identity");
      return this;
   }

   /**
    * If not already created, a new <code>ejb-timeout-identity</code> element will be created and returned.
    * Otherwise, the existing <code>ejb-timeout-identity</code> element will be returned.
    * @return the node defined for the element <code>ejb-timeout-identity</code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity()
   {
      Node node = childNode.getOrCreate("ejb-timeout-identity");
      SecurityIdentityType<MessageDrivenBeanType<T>> ejbTimeoutIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(
            this, "ejb-timeout-identity", childNode, node);
      return ejbTimeoutIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : annotation
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllAnnotation()
   {
      childNode.remove("annotation");
      return this;
   }

   /**
    * Returns the <code>annotation</code> element
    * @return the node defined for the element <code>annotation</code> 
    */
   public AnnotationType<MessageDrivenBeanType<T>> annotation()
   {
      return new AnnotationTypeImpl<MessageDrivenBeanType<T>>(this, "annotation", childNode);
   }

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<MessageDrivenBeanType<T>>> getAnnotationList()
   {
      List<AnnotationType<MessageDrivenBeanType<T>>> list = new ArrayList<AnnotationType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for (Node node : nodeList)
      {
         AnnotationType<MessageDrivenBeanType<T>> type = new AnnotationTypeImpl<MessageDrivenBeanType<T>>(this,
               "annotation", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ignore-dependency
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>ignore-dependency</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeIgnoreDependency()
   {
      childNode.remove("ignore-dependency");
      return this;
   }

   /**
    * If not already created, a new <code>ignore-dependency</code> element will be created and returned.
    * Otherwise, the existing <code>ignore-dependency</code> element will be returned.
    * @return the node defined for the element <code>ignore-dependency</code> 
    */
   public IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency()
   {
      Node node = childNode.getOrCreate("ignore-dependency");
      IgnoreDependencyType<MessageDrivenBeanType<T>> ignoreDependency = new IgnoreDependencyTypeImpl<MessageDrivenBeanType<T>>(
            this, "ignore-dependency", childNode, node);
      return ignoreDependency;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : aop-domain-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>aop-domain-name</code> element with the given value will be created.
    * Otherwise, the existing <code>aop-domain-name</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setAopDomainName(String aopDomainName)
   {
      childNode.getOrCreate("aop-domain-name").text(aopDomainName);
      return this;
   }

   /**
    * Removes the <code>aop-domain-name</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAopDomainName()
   {
      childNode.remove("aop-domain-name");
      return this;
   }

   /**
    * Returns the <code>aop-domain-name</code> element
    * @return the node defined for the element <code>aop-domain-name</code> 
    */
   public String getAopDomainName()
   {
      return childNode.textValue("aop-domain-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pool-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>pool-config</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removePoolConfig()
   {
      childNode.remove("pool-config");
      return this;
   }

   /**
    * If not already created, a new <code>pool-config</code> element will be created and returned.
    * Otherwise, the existing <code>pool-config</code> element will be returned.
    * @return the node defined for the element <code>pool-config</code> 
    */
   public PoolConfigType<MessageDrivenBeanType<T>> poolConfig()
   {
      Node node = childNode.getOrCreate("pool-config");
      PoolConfigType<MessageDrivenBeanType<T>> poolConfig = new PoolConfigTypeImpl<MessageDrivenBeanType<T>>(this,
            "pool-config", childNode, node);
      return poolConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : jndi-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>jndi-ref</code> elements 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeAllJndiRef()
   {
      childNode.remove("jndi-ref");
      return this;
   }

   /**
    * Returns the <code>jndi-ref</code> element
    * @return the node defined for the element <code>jndi-ref</code> 
    */
   public JndiRefType<MessageDrivenBeanType<T>> jndiRef()
   {
      return new JndiRefTypeImpl<MessageDrivenBeanType<T>>(this, "jndi-ref", childNode);
   }

   /**
    * Returns all <code>jndi-ref</code> elements
    * @return list of <code>jndi-ref</code> 
    */
   public List<JndiRefType<MessageDrivenBeanType<T>>> getJndiRefList()
   {
      List<JndiRefType<MessageDrivenBeanType<T>>> list = new ArrayList<JndiRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("jndi-ref");
      for (Node node : nodeList)
      {
         JndiRefType<MessageDrivenBeanType<T>> type = new JndiRefTypeImpl<MessageDrivenBeanType<T>>(this, "jndi-ref",
               childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : create-destination
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>create-destination</code> element with the given value will be created.
    * Otherwise, the existing <code>create-destination</code> element will be updated with the given value.
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> setCreateDestination(Boolean createDestination)
   {
      childNode.getOrCreate("create-destination").text(createDestination);
      return this;
   }

   /**
    * Removes the <code>create-destination</code> element 
    * @return the current instance of {@link MessageDrivenBeanType<T>} 
    */
   public MessageDrivenBeanType<T> removeCreateDestination()
   {
      childNode.remove("create-destination");
      return this;
   }

   /**
    * Returns the <code>create-destination</code> element
    * @return the node defined for the element <code>create-destination</code> 
    */
   public Boolean isCreateDestination()
   {
      return Strings.isTrue(childNode.textValue("create-destination"));
   }

}
