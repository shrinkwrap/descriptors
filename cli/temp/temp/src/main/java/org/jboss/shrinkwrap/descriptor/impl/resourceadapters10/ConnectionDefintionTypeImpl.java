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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ConnectionDefintionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.ConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.SecurityType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.SecurityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.TimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.TimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ValidationType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.ValidationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.RecoverType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.RecoverTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.PoolType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.PoolTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.XaPoolType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.XaPoolTypeImpl;

/**
 * This class implements the <code> connection-defintionType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class ConnectionDefintionTypeImpl<T> implements Child<T>, ConnectionDefintionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectionDefintionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectionDefintionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> attribute
    * @param className the value for the attribute <code>class-name</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> className(String className)
   {
      childNode.attribute("class-name", className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> attribute
    * @return the value defined for the attribute <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.getAttribute("class-name");
   }

   /**
    * Removes the <code>class-name</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeClassName()
   {
      childNode.removeAttribute("class-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> jndiName(String jndiName)
   {
      childNode.attribute("jndi-name", jndiName);
      return this;
   }

   /**
    * Returns the <code>jndi-name</code> attribute
    * @return the value defined for the attribute <code>jndi-name</code> 
    */
   public String getJndiName()
   {
      return childNode.getAttribute("jndi-name");
   }

   /**
    * Removes the <code>jndi-name</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeJndiName()
   {
      childNode.removeAttribute("jndi-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> enabled(Boolean enabled)
   {
      childNode.attribute("enabled", enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getAttribute("enabled"));
   }

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeEnabled()
   {
      childNode.removeAttribute("enabled");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> useJavaContext(Boolean useJavaContext)
   {
      childNode.attribute("use-java-context", useJavaContext);
      return this;
   }

   /**
    * Returns the <code>use-java-context</code> attribute
    * @return the value defined for the attribute <code>use-java-context</code> 
    */
   public Boolean isUseJavaContext()
   {
      return Strings.isTrue(childNode.getAttribute("use-java-context"));
   }

   /**
    * Removes the <code>use-java-context</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeUseJavaContext()
   {
      childNode.removeAttribute("use-java-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> poolName(String poolName)
   {
      childNode.attribute("pool-name", poolName);
      return this;
   }

   /**
    * Returns the <code>pool-name</code> attribute
    * @return the value defined for the attribute <code>pool-name</code> 
    */
   public String getPoolName()
   {
      return childNode.getAttribute("pool-name");
   }

   /**
    * Removes the <code>pool-name</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removePoolName()
   {
      childNode.removeAttribute("pool-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConfigPropertyType<ConnectionDefintionType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ConnectionDefintionType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ConnectionDefintionType<T>>> list = new ArrayList<ConfigPropertyType<ConnectionDefintionType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ConnectionDefintionType<T>>  type = new ConfigPropertyTypeImpl<ConnectionDefintionType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ConnectionDefintionType<T>></code> 
    */
   public ConnectionDefintionType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:securityType ElementType : security
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityType<ConnectionDefintionType<T>></code> 
    */
   public SecurityType<ConnectionDefintionType<T>> getOrCreateSecurity()
   {
      Node node = childNode.getOrCreate("security");
      SecurityType<ConnectionDefintionType<T>> security = new SecurityTypeImpl<ConnectionDefintionType<T>>(this, "security", childNode, node);
      return security;
   }

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeSecurity()
   {
      childNode.removeChildren("security");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:timeoutType ElementType : timeout
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<ConnectionDefintionType<T>></code> 
    */
   public TimeoutType<ConnectionDefintionType<T>> getOrCreateTimeout()
   {
      Node node = childNode.getOrCreate("timeout");
      TimeoutType<ConnectionDefintionType<T>> timeout = new TimeoutTypeImpl<ConnectionDefintionType<T>>(this, "timeout", childNode, node);
      return timeout;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeTimeout()
   {
      childNode.removeChildren("timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:validationType ElementType : validation
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<ConnectionDefintionType<T>></code> 
    */
   public ValidationType<ConnectionDefintionType<T>> getOrCreateValidation()
   {
      Node node = childNode.getOrCreate("validation");
      ValidationType<ConnectionDefintionType<T>> validation = new ValidationTypeImpl<ConnectionDefintionType<T>>(this, "validation", childNode, node);
      return validation;
   }

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeValidation()
   {
      childNode.removeChildren("validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:recoverType ElementType : recovery
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>recovery</code> element will be returned.
    * @return  a new or existing instance of <code>RecoverType<ConnectionDefintionType<T>></code> 
    */
   public RecoverType<ConnectionDefintionType<T>> getOrCreateRecovery()
   {
      Node node = childNode.getOrCreate("recovery");
      RecoverType<ConnectionDefintionType<T>> recovery = new RecoverTypeImpl<ConnectionDefintionType<T>>(this, "recovery", childNode, node);
      return recovery;
   }

   /**
    * Removes the <code>recovery</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeRecovery()
   {
      childNode.removeChildren("recovery");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:poolType ElementType : pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool</code> element with the given value will be created.
    * Otherwise, the existing <code>pool</code> element will be returned.
    * @return  a new or existing instance of <code>PoolType<ConnectionDefintionType<T>></code> 
    */
   public PoolType<ConnectionDefintionType<T>> getOrCreatePool()
   {
      Node node = childNode.getOrCreate("pool");
      PoolType<ConnectionDefintionType<T>> pool = new PoolTypeImpl<ConnectionDefintionType<T>>(this, "pool", childNode, node);
      return pool;
   }

   /**
    * Removes the <code>pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removePool()
   {
      childNode.removeChildren("pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: resourceadapters:xa-poolType ElementType : xa-pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-pool</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-pool</code> element will be returned.
    * @return  a new or existing instance of <code>XaPoolType<ConnectionDefintionType<T>></code> 
    */
   public XaPoolType<ConnectionDefintionType<T>> getOrCreateXaPool()
   {
      Node node = childNode.getOrCreate("xa-pool");
      XaPoolType<ConnectionDefintionType<T>> xaPool = new XaPoolTypeImpl<ConnectionDefintionType<T>>(this, "xa-pool", childNode, node);
      return xaPool;
   }

   /**
    * Removes the <code>xa-pool</code> element 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeXaPool()
   {
      childNode.removeChildren("xa-pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefintionType ElementName: xsd:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-ccm</code> attribute
    * @param useCcm the value for the attribute <code>use-ccm</code> 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> useCcm(Boolean useCcm)
   {
      childNode.attribute("use-ccm", useCcm);
      return this;
   }

   /**
    * Returns the <code>use-ccm</code> attribute
    * @return the value defined for the attribute <code>use-ccm</code> 
    */
   public Boolean isUseCcm()
   {
      return Strings.isTrue(childNode.getAttribute("use-ccm"));
   }

   /**
    * Removes the <code>use-ccm</code> attribute 
    * @return the current instance of <code>ConnectionDefintionType<T></code> 
    */
   public ConnectionDefintionType<T> removeUseCcm()
   {
      childNode.removeAttribute("use-ccm");
      return this;
   }
}
