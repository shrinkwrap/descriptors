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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.ConnectionPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.ConnectionPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TransactionIsolationType;
import org.jboss.shrinkwrap.descriptor.api.datasources10.PoolType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.PoolTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DsSecurityType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DsSecurityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.ValidationType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.ValidationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.TimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.StatementType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.StatementTypeImpl;

/**
 * This class implements the <code> datasourceType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class DatasourceTypeImpl<T> implements Child<T>, DatasourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DatasourceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DatasourceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> jndiName(String jndiName)
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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeJndiName()
   {
      childNode.removeAttribute("jndi-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> poolName(String poolName)
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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removePoolName()
   {
      childNode.removeAttribute("pool-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> enabled(Boolean enabled)
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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeEnabled()
   {
      childNode.removeAttribute("enabled");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> useJavaContext(Boolean useJavaContext)
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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUseJavaContext()
   {
      childNode.removeAttribute("use-java-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : spy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spy</code> attribute
    * @param spy the value for the attribute <code>spy</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> spy(Boolean spy)
   {
      childNode.attribute("spy", spy);
      return this;
   }

   /**
    * Returns the <code>spy</code> attribute
    * @return the value defined for the attribute <code>spy</code> 
    */
   public Boolean isSpy()
   {
      return Strings.isTrue(childNode.getAttribute("spy"));
   }

   /**
    * Removes the <code>spy</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeSpy()
   {
      childNode.removeAttribute("spy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-ccm</code> attribute
    * @param useCcm the value for the attribute <code>use-ccm</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> useCcm(Boolean useCcm)
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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUseCcm()
   {
      childNode.removeAttribute("use-ccm");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : connection-url
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-url</code> element
    * @param connectionUrl the value for the element <code>connection-url</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> connectionUrl(String connectionUrl)
   {
      childNode.getOrCreate("connection-url").text(connectionUrl);
      return this;
   }

   /**
    * Returns the <code>connection-url</code> element
    * @return the node defined for the element <code>connection-url</code> 
    */
   public String getConnectionUrl()
   {
      return childNode.getTextValueForPatternName("connection-url");
   }

   /**
    * Removes the <code>connection-url</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeConnectionUrl()
   {
      childNode.removeChildren("connection-url");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : driver-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver-class</code> element
    * @param driverClass the value for the element <code>driver-class</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> driverClass(String driverClass)
   {
      childNode.getOrCreate("driver-class").text(driverClass);
      return this;
   }

   /**
    * Returns the <code>driver-class</code> element
    * @return the node defined for the element <code>driver-class</code> 
    */
   public String getDriverClass()
   {
      return childNode.getTextValueForPatternName("driver-class");
   }

   /**
    * Removes the <code>driver-class</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDriverClass()
   {
      childNode.removeChildren("driver-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>datasource-class</code> element
    * @param datasourceClass the value for the element <code>datasource-class</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> datasourceClass(String datasourceClass)
   {
      childNode.getOrCreate("datasource-class").text(datasourceClass);
      return this;
   }

   /**
    * Returns the <code>datasource-class</code> element
    * @return the node defined for the element <code>datasource-class</code> 
    */
   public String getDatasourceClass()
   {
      return childNode.getTextValueForPatternName("datasource-class");
   }

   /**
    * Removes the <code>datasource-class</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDatasourceClass()
   {
      childNode.removeChildren("datasource-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : driver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver</code> element
    * @param driver the value for the element <code>driver</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> driver(String driver)
   {
      childNode.getOrCreate("driver").text(driver);
      return this;
   }

   /**
    * Returns the <code>driver</code> element
    * @return the node defined for the element <code>driver</code> 
    */
   public String getDriver()
   {
      return childNode.getTextValueForPatternName("driver");
   }

   /**
    * Removes the <code>driver</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDriver()
   {
      childNode.removeChildren("driver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:connection-propertyType ElementType : connection-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-property</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-property</code> element will be returned.
    * @return the instance defined for the element <code>connection-property</code> 
    */
   public ConnectionPropertyType<DatasourceType<T>> getOrCreateConnectionProperty()
   {
      List<Node> nodeList = childNode.get("connection-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConnectionPropertyTypeImpl<DatasourceType<T>>(this, "connection-property", childNode, nodeList.get(0));
      }
      return createConnectionProperty();
   }

   /**
    * Creates a new <code>connection-property</code> element 
    * @return the new created instance of <code>ConnectionPropertyType<DatasourceType<T>></code> 
    */
   public ConnectionPropertyType<DatasourceType<T>> createConnectionProperty()
   {
      return new ConnectionPropertyTypeImpl<DatasourceType<T>>(this, "connection-property", childNode);
   }

   /**
    * Returns all <code>connection-property</code> elements
    * @return list of <code>connection-property</code> 
    */
   public List<ConnectionPropertyType<DatasourceType<T>>> getAllConnectionProperty()
   {
      List<ConnectionPropertyType<DatasourceType<T>>> list = new ArrayList<ConnectionPropertyType<DatasourceType<T>>>();
      List<Node> nodeList = childNode.get("connection-property");
      for(Node node: nodeList)
      {
         ConnectionPropertyType<DatasourceType<T>>  type = new ConnectionPropertyTypeImpl<DatasourceType<T>>(this, "connection-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-property</code> elements 
    * @return the current instance of <code>ConnectionPropertyType<DatasourceType<T>></code> 
    */
   public DatasourceType<T> removeAllConnectionProperty()
   {
      childNode.removeChildren("connection-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:string ElementType : new-connection-sql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>new-connection-sql</code> element
    * @param newConnectionSql the value for the element <code>new-connection-sql</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> newConnectionSql(String newConnectionSql)
   {
      childNode.getOrCreate("new-connection-sql").text(newConnectionSql);
      return this;
   }

   /**
    * Returns the <code>new-connection-sql</code> element
    * @return the node defined for the element <code>new-connection-sql</code> 
    */
   public String getNewConnectionSql()
   {
      return childNode.getTextValueForPatternName("new-connection-sql");
   }

   /**
    * Removes the <code>new-connection-sql</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeNewConnectionSql()
   {
      childNode.removeChildren("new-connection-sql");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:transaction-isolationType ElementType : transaction-isolation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> transactionIsolation(TransactionIsolationType transactionIsolation)
   {
      childNode.getOrCreate("transaction-isolation").text(transactionIsolation);
      return this;
   }
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> transactionIsolation(String transactionIsolation)
   {
      childNode.getOrCreate("transaction-isolation").text(transactionIsolation);
      return this;
   }

   /**
    * Returns the <code>transaction-isolation</code> element
    * @return the value found for the element <code>transaction-isolation</code> 
    */
   public TransactionIsolationType getTransactionIsolation()
   {
      return TransactionIsolationType.getFromStringValue(childNode.getTextValueForPatternName("transaction-isolation"));
   }

   /**
    * Returns the <code>transaction-isolation</code> element
    * @return the value found for the element <code>transaction-isolation</code> 
    */
   public String  getTransactionIsolationAsString()
   {
      return childNode.getTextValueForPatternName("transaction-isolation");
   }

   /**
    * Removes the <code>transaction-isolation</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeTransactionIsolation()
   {
      childNode.removeAttribute("transaction-isolation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : url-delimiter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-delimiter</code> element
    * @param urlDelimiter the value for the element <code>url-delimiter</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> urlDelimiter(String urlDelimiter)
   {
      childNode.getOrCreate("url-delimiter").text(urlDelimiter);
      return this;
   }

   /**
    * Returns the <code>url-delimiter</code> element
    * @return the node defined for the element <code>url-delimiter</code> 
    */
   public String getUrlDelimiter()
   {
      return childNode.getTextValueForPatternName("url-delimiter");
   }

   /**
    * Removes the <code>url-delimiter</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUrlDelimiter()
   {
      childNode.removeChildren("url-delimiter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : url-selector-strategy-class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-selector-strategy-class-name</code> element
    * @param urlSelectorStrategyClassName the value for the element <code>url-selector-strategy-class-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> urlSelectorStrategyClassName(String urlSelectorStrategyClassName)
   {
      childNode.getOrCreate("url-selector-strategy-class-name").text(urlSelectorStrategyClassName);
      return this;
   }

   /**
    * Returns the <code>url-selector-strategy-class-name</code> element
    * @return the node defined for the element <code>url-selector-strategy-class-name</code> 
    */
   public String getUrlSelectorStrategyClassName()
   {
      return childNode.getTextValueForPatternName("url-selector-strategy-class-name");
   }

   /**
    * Removes the <code>url-selector-strategy-class-name</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUrlSelectorStrategyClassName()
   {
      childNode.removeChildren("url-selector-strategy-class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:poolType ElementType : pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool</code> element with the given value will be created.
    * Otherwise, the existing <code>pool</code> element will be returned.
    * @return  a new or existing instance of <code>PoolType<DatasourceType<T>></code> 
    */
   public PoolType<DatasourceType<T>> getOrCreatePool()
   {
      Node node = childNode.getOrCreate("pool");
      PoolType<DatasourceType<T>> pool = new PoolTypeImpl<DatasourceType<T>>(this, "pool", childNode, node);
      return pool;
   }

   /**
    * Removes the <code>pool</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removePool()
   {
      childNode.removeChildren("pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:dsSecurityType ElementType : security
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>DsSecurityType<DatasourceType<T>></code> 
    */
   public DsSecurityType<DatasourceType<T>> getOrCreateSecurity()
   {
      Node node = childNode.getOrCreate("security");
      DsSecurityType<DatasourceType<T>> security = new DsSecurityTypeImpl<DatasourceType<T>>(this, "security", childNode, node);
      return security;
   }

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeSecurity()
   {
      childNode.removeChildren("security");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:validationType ElementType : validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<DatasourceType<T>></code> 
    */
   public ValidationType<DatasourceType<T>> getOrCreateValidation()
   {
      Node node = childNode.getOrCreate("validation");
      ValidationType<DatasourceType<T>> validation = new ValidationTypeImpl<DatasourceType<T>>(this, "validation", childNode, node);
      return validation;
   }

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeValidation()
   {
      childNode.removeChildren("validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:timeoutType ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<DatasourceType<T>></code> 
    */
   public TimeoutType<DatasourceType<T>> getOrCreateTimeout()
   {
      Node node = childNode.getOrCreate("timeout");
      TimeoutType<DatasourceType<T>> timeout = new TimeoutTypeImpl<DatasourceType<T>>(this, "timeout", childNode, node);
      return timeout;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeTimeout()
   {
      childNode.removeChildren("timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:statementType ElementType : statement
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>statement</code> element with the given value will be created.
    * Otherwise, the existing <code>statement</code> element will be returned.
    * @return  a new or existing instance of <code>StatementType<DatasourceType<T>></code> 
    */
   public StatementType<DatasourceType<T>> getOrCreateStatement()
   {
      Node node = childNode.getOrCreate("statement");
      StatementType<DatasourceType<T>> statement = new StatementTypeImpl<DatasourceType<T>>(this, "statement", childNode, node);
      return statement;
   }

   /**
    * Removes the <code>statement</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeStatement()
   {
      childNode.removeChildren("statement");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : jta
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jta</code> attribute
    * @param jta the value for the attribute <code>jta</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> jta(Boolean jta)
   {
      childNode.attribute("jta", jta);
      return this;
   }

   /**
    * Returns the <code>jta</code> attribute
    * @return the value defined for the attribute <code>jta</code> 
    */
   public Boolean isJta()
   {
      return Strings.isTrue(childNode.getAttribute("jta"));
   }

   /**
    * Removes the <code>jta</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeJta()
   {
      childNode.removeAttribute("jta");
      return this;
   }
}
