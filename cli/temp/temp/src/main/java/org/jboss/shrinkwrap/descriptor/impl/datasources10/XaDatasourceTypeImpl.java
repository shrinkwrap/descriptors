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
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaDatasourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaDatasourcePropertyType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.XaDatasourcePropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TransactionIsolationType;
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaPoolType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.XaPoolTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DsSecurityType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.DsSecurityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.ValidationType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.ValidationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.TimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.TimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.StatementType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.StatementTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.datasources10.RecoverType;
import org.jboss.shrinkwrap.descriptor.impl.datasources10.RecoverTypeImpl;

/**
 * This class implements the <code> xa-datasourceType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public class XaDatasourceTypeImpl<T> implements Child<T>, XaDatasourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public XaDatasourceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public XaDatasourceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> jndiName(String jndiName)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeJndiName()
   {
      childNode.removeAttribute("jndi-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> poolName(String poolName)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removePoolName()
   {
      childNode.removeAttribute("pool-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> enabled(Boolean enabled)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeEnabled()
   {
      childNode.removeAttribute("enabled");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> useJavaContext(Boolean useJavaContext)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUseJavaContext()
   {
      childNode.removeAttribute("use-java-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : spy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spy</code> attribute
    * @param spy the value for the attribute <code>spy</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> spy(Boolean spy)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeSpy()
   {
      childNode.removeAttribute("spy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-ccm</code> attribute
    * @param useCcm the value for the attribute <code>use-ccm</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> useCcm(Boolean useCcm)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUseCcm()
   {
      childNode.removeAttribute("use-ccm");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:xa-datasource-propertyType ElementType : xa-datasource-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource-property</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource-property</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource-property</code> 
    */
   public XaDatasourcePropertyType<XaDatasourceType<T>> getOrCreateXaDatasourceProperty()
   {
      List<Node> nodeList = childNode.get("xa-datasource-property");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new XaDatasourcePropertyTypeImpl<XaDatasourceType<T>>(this, "xa-datasource-property", childNode, nodeList.get(0));
      }
      return createXaDatasourceProperty();
   }

   /**
    * Creates a new <code>xa-datasource-property</code> element 
    * @return the new created instance of <code>XaDatasourcePropertyType<XaDatasourceType<T>></code> 
    */
   public XaDatasourcePropertyType<XaDatasourceType<T>> createXaDatasourceProperty()
   {
      return new XaDatasourcePropertyTypeImpl<XaDatasourceType<T>>(this, "xa-datasource-property", childNode);
   }

   /**
    * Returns all <code>xa-datasource-property</code> elements
    * @return list of <code>xa-datasource-property</code> 
    */
   public List<XaDatasourcePropertyType<XaDatasourceType<T>>> getAllXaDatasourceProperty()
   {
      List<XaDatasourcePropertyType<XaDatasourceType<T>>> list = new ArrayList<XaDatasourcePropertyType<XaDatasourceType<T>>>();
      List<Node> nodeList = childNode.get("xa-datasource-property");
      for(Node node: nodeList)
      {
         XaDatasourcePropertyType<XaDatasourceType<T>>  type = new XaDatasourcePropertyTypeImpl<XaDatasourceType<T>>(this, "xa-datasource-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>xa-datasource-property</code> elements 
    * @return the current instance of <code>XaDatasourcePropertyType<XaDatasourceType<T>></code> 
    */
   public XaDatasourceType<T> removeAllXaDatasourceProperty()
   {
      childNode.removeChildren("xa-datasource-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : xa-datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-datasource-class</code> element
    * @param xaDatasourceClass the value for the element <code>xa-datasource-class</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> xaDatasourceClass(String xaDatasourceClass)
   {
      childNode.getOrCreate("xa-datasource-class").text(xaDatasourceClass);
      return this;
   }

   /**
    * Returns the <code>xa-datasource-class</code> element
    * @return the node defined for the element <code>xa-datasource-class</code> 
    */
   public String getXaDatasourceClass()
   {
      return childNode.getTextValueForPatternName("xa-datasource-class");
   }

   /**
    * Removes the <code>xa-datasource-class</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeXaDatasourceClass()
   {
      childNode.removeChildren("xa-datasource-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : driver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver</code> element
    * @param driver the value for the element <code>driver</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> driver(String driver)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeDriver()
   {
      childNode.removeChildren("driver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : url-delimiter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-delimiter</code> element
    * @param urlDelimiter the value for the element <code>url-delimiter</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> urlDelimiter(String urlDelimiter)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUrlDelimiter()
   {
      childNode.removeChildren("url-delimiter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : url-selector-strategy-class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-selector-strategy-class-name</code> element
    * @param urlSelectorStrategyClassName the value for the element <code>url-selector-strategy-class-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> urlSelectorStrategyClassName(String urlSelectorStrategyClassName)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUrlSelectorStrategyClassName()
   {
      childNode.removeChildren("url-selector-strategy-class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:string ElementType : new-connection-sql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>new-connection-sql</code> element
    * @param newConnectionSql the value for the element <code>new-connection-sql</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> newConnectionSql(String newConnectionSql)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeNewConnectionSql()
   {
      childNode.removeChildren("new-connection-sql");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:transaction-isolationType ElementType : transaction-isolation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> transactionIsolation(TransactionIsolationType transactionIsolation)
   {
      childNode.getOrCreate("transaction-isolation").text(transactionIsolation);
      return this;
   }
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> transactionIsolation(String transactionIsolation)
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
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeTransactionIsolation()
   {
      childNode.removeAttribute("transaction-isolation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:xa-poolType ElementType : xa-pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-pool</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-pool</code> element will be returned.
    * @return  a new or existing instance of <code>XaPoolType<XaDatasourceType<T>></code> 
    */
   public XaPoolType<XaDatasourceType<T>> getOrCreateXaPool()
   {
      Node node = childNode.getOrCreate("xa-pool");
      XaPoolType<XaDatasourceType<T>> xaPool = new XaPoolTypeImpl<XaDatasourceType<T>>(this, "xa-pool", childNode, node);
      return xaPool;
   }

   /**
    * Removes the <code>xa-pool</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeXaPool()
   {
      childNode.removeChildren("xa-pool");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:dsSecurityType ElementType : security
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>DsSecurityType<XaDatasourceType<T>></code> 
    */
   public DsSecurityType<XaDatasourceType<T>> getOrCreateSecurity()
   {
      Node node = childNode.getOrCreate("security");
      DsSecurityType<XaDatasourceType<T>> security = new DsSecurityTypeImpl<XaDatasourceType<T>>(this, "security", childNode, node);
      return security;
   }

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeSecurity()
   {
      childNode.removeChildren("security");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:validationType ElementType : validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<XaDatasourceType<T>></code> 
    */
   public ValidationType<XaDatasourceType<T>> getOrCreateValidation()
   {
      Node node = childNode.getOrCreate("validation");
      ValidationType<XaDatasourceType<T>> validation = new ValidationTypeImpl<XaDatasourceType<T>>(this, "validation", childNode, node);
      return validation;
   }

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeValidation()
   {
      childNode.removeChildren("validation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:timeoutType ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<XaDatasourceType<T>></code> 
    */
   public TimeoutType<XaDatasourceType<T>> getOrCreateTimeout()
   {
      Node node = childNode.getOrCreate("timeout");
      TimeoutType<XaDatasourceType<T>> timeout = new TimeoutTypeImpl<XaDatasourceType<T>>(this, "timeout", childNode, node);
      return timeout;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeTimeout()
   {
      childNode.removeChildren("timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:statementType ElementType : statement
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>statement</code> element with the given value will be created.
    * Otherwise, the existing <code>statement</code> element will be returned.
    * @return  a new or existing instance of <code>StatementType<XaDatasourceType<T>></code> 
    */
   public StatementType<XaDatasourceType<T>> getOrCreateStatement()
   {
      Node node = childNode.getOrCreate("statement");
      StatementType<XaDatasourceType<T>> statement = new StatementTypeImpl<XaDatasourceType<T>>(this, "statement", childNode, node);
      return statement;
   }

   /**
    * Removes the <code>statement</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeStatement()
   {
      childNode.removeChildren("statement");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:recoverType ElementType : recovery
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>recovery</code> element will be returned.
    * @return  a new or existing instance of <code>RecoverType<XaDatasourceType<T>></code> 
    */
   public RecoverType<XaDatasourceType<T>> getOrCreateRecovery()
   {
      Node node = childNode.getOrCreate("recovery");
      RecoverType<XaDatasourceType<T>> recovery = new RecoverTypeImpl<XaDatasourceType<T>>(this, "recovery", childNode, node);
      return recovery;
   }

   /**
    * Removes the <code>recovery</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeRecovery()
   {
      childNode.removeChildren("recovery");
      return this;
   }
}
