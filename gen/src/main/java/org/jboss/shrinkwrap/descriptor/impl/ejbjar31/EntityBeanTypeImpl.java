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
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpVersionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.PersistenceTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> entity-beanType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The entity-beanType declares an entity bean. The declaration <br> 
 * consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - an optional display name <br> 
 * - an optional icon element that contains a small and a large <br> 
 * icon file name <br> 
 * - a unique name assigned to the enterprise bean <br> 
 * in the deployment descriptor <br> 
 * - an optional mapped-name element that can be used to provide <br> 
 * vendor-specific deployment information such as the physical <br> 
 * jndi-name of the entity bean's remote home interface. This <br> 
 * element is not required to be supported by all implementations. <br> 
 * Any use of this element is non-portable. <br> 
 * - the names of the entity bean's remote home <br> 
 * and remote interfaces, if any <br> 
 * - the names of the entity bean's local home and local <br> 
 * interfaces, if any <br> 
 * - the entity bean's implementation class <br> 
 * - the optional entity bean's persistence management type. If <br> 
 * this element is not specified it is defaulted to Container. <br> 
 * - the entity bean's primary key class name <br> 
 * - an indication of the entity bean's reentrancy <br> 
 * - an optional specification of the <br> 
 * entity bean's cmp-version <br> 
 * - an optional specification of the entity bean's <br> 
 * abstract schema name <br> 
 * - an optional list of container-managed fields <br> 
 * - an optional specification of the primary key <br> 
 * field <br> 
 * - an optional declaration of the bean's environment <br> 
 * entries <br> 
 * - an optional declaration of the bean's EJB <br> 
 * references <br> 
 * - an optional declaration of the bean's local <br> 
 * EJB references <br> 
 * - an optional declaration of the bean's web <br> 
 * service references <br> 
 * - an optional declaration of the security role <br> 
 * references <br> 
 * - an optional declaration of the security identity <br> 
 * to be used for the execution of the bean's methods <br> 
 * - an optional declaration of the bean's <br> 
 * resource manager connection factory references <br> 
 * - an optional declaration of the bean's <br> 
 * resource environment references <br> 
 * - an optional declaration of the bean's message <br> 
 * destination references <br> 
 * - an optional set of query declarations <br> 
 * for finder and select methods for an entity <br> 
 * bean with cmp-version 2.x. <br> 
 *<br>
 * The optional abstract-schema-name element must be specified <br> 
 * for an entity bean with container-managed persistence and <br> 
 * cmp-version 2.x. <br> 
 *<br>
 * The optional primkey-field may be present in the descriptor <br> 
 * if the entity's persistence-type is Container. <br> 
 *<br>
 * The optional cmp-version element may be present in the <br> 
 * descriptor if the entity's persistence-type is Container. If <br> 
 * the persistence-type is Container and the cmp-version <br> 
 * element is not specified, its value defaults to 2.x. <br> 
 *<br>
 * The optional home and remote elements must be specified if <br> 
 * the entity bean cmp-version is 1.x. <br> 
 *<br>
 * The optional home and remote elements must be specified if <br> 
 * the entity bean has a remote home and remote interface. <br> 
 *<br>
 * The optional local-home and local elements must be specified <br> 
 * if the entity bean has a local home and local interface. <br> 
 *<br>
 * Either both the local-home and the local elements or both <br> 
 * the home and the remote elements must be specified. <br> 
 *<br>
 * The optional query elements must be present if the <br> 
 * persistence-type is Container and the cmp-version is 2.x and <br> 
 * query methods other than findByPrimaryKey have been defined <br> 
 * for the entity bean. <br> 
 *<br>
 * The other elements that are optional are "optional" in the <br> 
 * sense that they are omitted if the lists represented by them <br> 
 * are empty. <br> 
 *<br>
 * At least one cmp-field element must be present in the <br> 
 * descriptor if the entity's persistence-type is Container and <br> 
 * the cmp-version is 1.x, and none must not be present if the <br> 
 * entity's persistence-type is Bean. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class EntityBeanTypeImpl<T> implements Child<T>, EntityBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityBeanTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public EntityBeanTypeImpl(T t, String nodeName, Node node, Node childNode)
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDescriptionList(String... values)
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllDescription()
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param list of <code>display-name</code> objects 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setDisplayNameList(String... values)
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllDisplayName()
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   /**
    * Returns the <code>icon</code> element
    * @return the node defined for the element <code>icon</code> 
    */
   public IconType<EntityBeanType<T>> icon()
   {
      return new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EntityBeanType<T>>> getIconList()
   {
      List<IconType<EntityBeanType<T>>> list = new ArrayList<IconType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<EntityBeanType<T>> type = new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEnvEntry()
   {
      childNode.remove("env-entry");
      return this;
   }

   /**
    * Returns the <code>env-entry</code> element
    * @return the node defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<EntityBeanType<T>> envEntry()
   {
      return new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<EntityBeanType<T>>> getEnvEntryList()
   {
      List<EnvEntryType<EntityBeanType<T>>> list = new ArrayList<EnvEntryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for (Node node : nodeList)
      {
         EnvEntryType<EntityBeanType<T>> type = new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEjbRef()
   {
      childNode.remove("ejb-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-ref</code> element
    * @return the node defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<EntityBeanType<T>> ejbRef()
   {
      return new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<EntityBeanType<T>>> getEjbRefList()
   {
      List<EjbRefType<EntityBeanType<T>>> list = new ArrayList<EjbRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for (Node node : nodeList)
      {
         EjbRefType<EntityBeanType<T>> type = new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode, node);
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllEjbLocalRef()
   {
      childNode.remove("ejb-local-ref");
      return this;
   }

   /**
    * Returns the <code>ejb-local-ref</code> element
    * @return the node defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> ejbLocalRef()
   {
      return new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<EntityBeanType<T>>> getEjbLocalRefList()
   {
      List<EjbLocalRefType<EntityBeanType<T>>> list = new ArrayList<EjbLocalRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for (Node node : nodeList)
      {
         EjbLocalRefType<EntityBeanType<T>> type = new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref",
               childNode, node);
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllResourceRef()
   {
      childNode.remove("resource-ref");
      return this;
   }

   /**
    * Returns the <code>resource-ref</code> element
    * @return the node defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<EntityBeanType<T>> resourceRef()
   {
      return new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<EntityBeanType<T>>> getResourceRefList()
   {
      List<ResourceRefType<EntityBeanType<T>>> list = new ArrayList<ResourceRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for (Node node : nodeList)
      {
         ResourceRefType<EntityBeanType<T>> type = new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref",
               childNode, node);
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllResourceEnvRef()
   {
      childNode.remove("resource-env-ref");
      return this;
   }

   /**
    * Returns the <code>resource-env-ref</code> element
    * @return the node defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> resourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<EntityBeanType<T>>> getResourceEnvRefList()
   {
      List<ResourceEnvRefType<EntityBeanType<T>>> list = new ArrayList<ResourceEnvRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for (Node node : nodeList)
      {
         ResourceEnvRefType<EntityBeanType<T>> type = new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this,
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.remove("message-destination-ref");
      return this;
   }

   /**
    * Returns the <code>message-destination-ref</code> element
    * @return the node defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> messageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<EntityBeanType<T>>> getMessageDestinationRefList()
   {
      List<MessageDestinationRefType<EntityBeanType<T>>> list = new ArrayList<MessageDestinationRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for (Node node : nodeList)
      {
         MessageDestinationRefType<EntityBeanType<T>> type = new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this,
               "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.remove("persistence-context-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-context-ref</code> element
    * @return the node defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> persistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<EntityBeanType<T>>> getPersistenceContextRefList()
   {
      List<PersistenceContextRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceContextRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for (Node node : nodeList)
      {
         PersistenceContextRefType<EntityBeanType<T>> type = new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this,
               "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.remove("persistence-unit-ref");
      return this;
   }

   /**
    * Returns the <code>persistence-unit-ref</code> element
    * @return the node defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> persistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<EntityBeanType<T>>> getPersistenceUnitRefList()
   {
      List<PersistenceUnitRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for (Node node : nodeList)
      {
         PersistenceUnitRefType<EntityBeanType<T>> type = new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this,
               "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : post-construct
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPostConstruct()
   {
      childNode.remove("post-construct");
      return this;
   }

   /**
    * Returns the <code>post-construct</code> element
    * @return the node defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> postConstruct()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPostConstructList()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>> type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this,
               "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : pre-destroy
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllPreDestroy()
   {
      childNode.remove("pre-destroy");
      return this;
   }

   /**
    * Returns the <code>pre-destroy</code> element
    * @return the node defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> preDestroy()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getPreDestroyList()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for (Node node : nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>> type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this,
               "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : data-source
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllDataSource()
   {
      childNode.remove("data-source");
      return this;
   }

   /**
    * Returns the <code>data-source</code> element
    * @return the node defined for the element <code>data-source</code> 
    */
   public DataSourceType<EntityBeanType<T>> dataSource()
   {
      return new DataSourceTypeImpl<EntityBeanType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<EntityBeanType<T>>> getDataSourceList()
   {
      List<DataSourceType<EntityBeanType<T>>> list = new ArrayList<DataSourceType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for (Node node : nodeList)
      {
         DataSourceType<EntityBeanType<T>> type = new DataSourceTypeImpl<EntityBeanType<T>>(this, "data-source",
               childNode, node);
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
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setEjbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeEjbName()
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
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeMappedName()
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

   // -------------------------------------------------------------------------------------||
   // Element type : home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>home</code> element with the given value will be created.
    * Otherwise, the existing <code>home</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setHome(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeHome()
   {
      childNode.remove("home");
      return this;
   }

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome()
   {
      return childNode.textValue("home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : remote
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remote</code> element with the given value will be created.
    * Otherwise, the existing <code>remote</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setRemote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeRemote()
   {
      childNode.remove("remote");
      return this;
   }

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote()
   {
      return childNode.textValue("remote");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local-home
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local-home</code> element with the given value will be created.
    * Otherwise, the existing <code>local-home</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setLocalHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeLocalHome()
   {
      childNode.remove("local-home");
      return this;
   }

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome()
   {
      return childNode.textValue("local-home");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : local
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>local</code> element with the given value will be created.
    * Otherwise, the existing <code>local</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setLocal(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeLocal()
   {
      childNode.remove("local");
      return this;
   }

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal()
   {
      return childNode.textValue("local");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-class</code> element with the given value will be created.
    * Otherwise, the existing <code>ejb-class</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setEjbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeEjbClass()
   {
      childNode.remove("ejb-class");
      return this;
   }

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass()
   {
      return childNode.textValue("ejb-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-type</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPersistenceType(PersistenceTypeType persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   /**
    * If not already created, a new <code>persistence-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-type</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPersistenceType(String persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   /**
    * Returns the <code>persistence-type</code> element
    * @return the node defined for the element <code>persistence-type</code> 
    */
   public PersistenceTypeType getPersistenceType()
   {
      return PersistenceTypeType.getFromStringValue(childNode.textValue("persistence-type"));
   }

   /**
    * Returns the <code>persistence-type</code> element
    * @return the node defined for the element <code>persistence-type</code> 
    */
   public String getPersistenceTypeAsString()
   {
      return childNode.textValue("persistence-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : prim-key-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>prim-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>prim-key-class</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPrimKeyClass(String primKeyClass)
   {
      childNode.getOrCreate("prim-key-class").text(primKeyClass);
      return this;
   }

   /**
    * Removes the <code>prim-key-class</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removePrimKeyClass()
   {
      childNode.remove("prim-key-class");
      return this;
   }

   /**
    * Returns the <code>prim-key-class</code> element
    * @return the node defined for the element <code>prim-key-class</code> 
    */
   public String getPrimKeyClass()
   {
      return childNode.textValue("prim-key-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : reentrant
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reentrant</code> element with the given value will be created.
    * Otherwise, the existing <code>reentrant</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setReentrant(Boolean reentrant)
   {
      childNode.getOrCreate("reentrant").text(reentrant);
      return this;
   }

   /**
    * Removes the <code>reentrant</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeReentrant()
   {
      childNode.remove("reentrant");
      return this;
   }

   /**
    * Returns the <code>reentrant</code> element
    * @return the node defined for the element <code>reentrant</code> 
    */
   public Boolean isReentrant()
   {
      return Strings.isTrue(childNode.textValue("reentrant"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmp-version</code> element with the given value will be created.
    * Otherwise, the existing <code>cmp-version</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setCmpVersion(CmpVersionType cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   /**
    * If not already created, a new <code>cmp-version</code> element with the given value will be created.
    * Otherwise, the existing <code>cmp-version</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setCmpVersion(String cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   /**
    * Returns the <code>cmp-version</code> element
    * @return the node defined for the element <code>cmp-version</code> 
    */
   public CmpVersionType getCmpVersion()
   {
      return CmpVersionType.getFromStringValue(childNode.textValue("cmp-version"));
   }

   /**
    * Returns the <code>cmp-version</code> element
    * @return the node defined for the element <code>cmp-version</code> 
    */
   public String getCmpVersionAsString()
   {
      return childNode.textValue("cmp-version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : abstract-schema-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>abstract-schema-name</code> element with the given value will be created.
    * Otherwise, the existing <code>abstract-schema-name</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setAbstractSchemaName(String abstractSchemaName)
   {
      childNode.getOrCreate("abstract-schema-name").text(abstractSchemaName);
      return this;
   }

   /**
    * Removes the <code>abstract-schema-name</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAbstractSchemaName()
   {
      childNode.remove("abstract-schema-name");
      return this;
   }

   /**
    * Returns the <code>abstract-schema-name</code> element
    * @return the node defined for the element <code>abstract-schema-name</code> 
    */
   public String getAbstractSchemaName()
   {
      return childNode.textValue("abstract-schema-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cmp-field
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>cmp-field</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllCmpField()
   {
      childNode.remove("cmp-field");
      return this;
   }

   /**
    * Returns the <code>cmp-field</code> element
    * @return the node defined for the element <code>cmp-field</code> 
    */
   public CmpFieldType<EntityBeanType<T>> cmpField()
   {
      return new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode);
   }

   /**
    * Returns all <code>cmp-field</code> elements
    * @return list of <code>cmp-field</code> 
    */
   public List<CmpFieldType<EntityBeanType<T>>> getCmpFieldList()
   {
      List<CmpFieldType<EntityBeanType<T>>> list = new ArrayList<CmpFieldType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("cmp-field");
      for (Node node : nodeList)
      {
         CmpFieldType<EntityBeanType<T>> type = new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : primkey-field
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primkey-field</code> element with the given value will be created.
    * Otherwise, the existing <code>primkey-field</code> element will be updated with the given value.
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> setPrimkeyField(String primkeyField)
   {
      childNode.getOrCreate("primkey-field").text(primkeyField);
      return this;
   }

   /**
    * Removes the <code>primkey-field</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removePrimkeyField()
   {
      childNode.remove("primkey-field");
      return this;
   }

   /**
    * Returns the <code>primkey-field</code> element
    * @return the node defined for the element <code>primkey-field</code> 
    */
   public String getPrimkeyField()
   {
      return childNode.textValue("primkey-field");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-role-ref
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.remove("security-role-ref");
      return this;
   }

   /**
    * Returns the <code>security-role-ref</code> element
    * @return the node defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> securityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<EntityBeanType<T>>> getSecurityRoleRefList()
   {
      List<SecurityRoleRefType<EntityBeanType<T>>> list = new ArrayList<SecurityRoleRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for (Node node : nodeList)
      {
         SecurityRoleRefType<EntityBeanType<T>> type = new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this,
               "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : security-identity
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeSecurityIdentity()
   {
      childNode.remove("security-identity");
      return this;
   }

   /**
    * If not already created, a new <code>security-identity</code> element will be created and returned.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return the node defined for the element <code>security-identity</code> 
    */
   public SecurityIdentityType<EntityBeanType<T>> securityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<EntityBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<EntityBeanType<T>>(this,
            "security-identity", childNode, node);
      return securityIdentity;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : query
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>query</code> elements 
    * @return the current instance of {@link EntityBeanType<T>} 
    */
   public EntityBeanType<T> removeAllQuery()
   {
      childNode.remove("query");
      return this;
   }

   /**
    * Returns the <code>query</code> element
    * @return the node defined for the element <code>query</code> 
    */
   public QueryType<EntityBeanType<T>> query()
   {
      return new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode);
   }

   /**
    * Returns all <code>query</code> elements
    * @return list of <code>query</code> 
    */
   public List<QueryType<EntityBeanType<T>>> getQueryList()
   {
      List<QueryType<EntityBeanType<T>>> list = new ArrayList<QueryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("query");
      for (Node node : nodeList)
      {
         QueryType<EntityBeanType<T>> type = new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode, node);
         list.add(type);
      }
      return list;
   }

}
