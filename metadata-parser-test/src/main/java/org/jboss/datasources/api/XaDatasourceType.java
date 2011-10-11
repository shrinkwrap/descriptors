package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.XaDatasourcePropertyType;
import org.jboss.datasources.api.TransactionIsolationType;
import org.jboss.datasources.api.XaPoolType;
import org.jboss.datasources.api.DsSecurityType;
import org.jboss.datasources.api.ValidationType;
import org.jboss.datasources.api.TimeoutType;
import org.jboss.datasources.api.StatementType;
import org.jboss.datasources.api.RecoverType;
/**
 * This interface defines the contract for the <code> xa-datasourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface XaDatasourceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> jndiName(String jndiName);

   /**
    * Returns the <code>jndi-name</code> attribute
    * @return the value defined for the attribute <code>jndi-name</code> 
    */
   public String getJndiName();

   /**
    * Removes the <code>jndi-name</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeJndiName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> poolName(String poolName);

   /**
    * Returns the <code>pool-name</code> attribute
    * @return the value defined for the attribute <code>pool-name</code> 
    */
   public String getPoolName();

   /**
    * Removes the <code>pool-name</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removePoolName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeEnabled();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> useJavaContext(Boolean useJavaContext);

   /**
    * Returns the <code>use-java-context</code> attribute
    * @return the value defined for the attribute <code>use-java-context</code> 
    */
public Boolean isUseJavaContext();

   /**
    * Removes the <code>use-java-context</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUseJavaContext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : spy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spy</code> attribute
    * @param spy the value for the attribute <code>spy</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> spy(Boolean spy);

   /**
    * Returns the <code>spy</code> attribute
    * @return the value defined for the attribute <code>spy</code> 
    */
public Boolean isSpy();

   /**
    * Removes the <code>spy</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeSpy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-ccm</code> attribute
    * @param useCcm the value for the attribute <code>use-ccm</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> useCcm(Boolean useCcm);

   /**
    * Returns the <code>use-ccm</code> attribute
    * @return the value defined for the attribute <code>use-ccm</code> 
    */
public Boolean isUseCcm();

   /**
    * Removes the <code>use-ccm</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUseCcm();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:xa-datasource-propertyType ElementType : xa-datasource-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource-property</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource-property</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource-property</code> 
    */
   public XaDatasourcePropertyType<XaDatasourceType<T>> getOrCreateXaDatasourceProperty();

   /**
    * Creates a new <code>xa-datasource-property</code> element 
    * @return the new created instance of <code>XaDatasourcePropertyType<XaDatasourceType<T>></code> 
    */
   public XaDatasourcePropertyType<XaDatasourceType<T>> createXaDatasourceProperty();

   /**
    * Returns all <code>xa-datasource-property</code> elements
    * @return list of <code>xa-datasource-property</code> 
    */
   public List<XaDatasourcePropertyType<XaDatasourceType<T>>> getAllXaDatasourceProperty();

   /**
    * Removes all <code>xa-datasource-property</code> elements 
    * @return the current instance of <code>XaDatasourcePropertyType<XaDatasourceType<T>></code> 
    */
   public XaDatasourceType<T> removeAllXaDatasourceProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : xa-datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-datasource-class</code> element
    * @param xaDatasourceClass the value for the element <code>xa-datasource-class</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> xaDatasourceClass(String xaDatasourceClass);

   /**
    * Returns the <code>xa-datasource-class</code> element
    * @return the node defined for the element <code>xa-datasource-class</code> 
    */
   public String getXaDatasourceClass();

   /**
    * Removes the <code>xa-datasource-class</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeXaDatasourceClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : driver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver</code> element
    * @param driver the value for the element <code>driver</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> driver(String driver);

   /**
    * Returns the <code>driver</code> element
    * @return the node defined for the element <code>driver</code> 
    */
   public String getDriver();

   /**
    * Removes the <code>driver</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeDriver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : url-delimiter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-delimiter</code> element
    * @param urlDelimiter the value for the element <code>url-delimiter</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> urlDelimiter(String urlDelimiter);

   /**
    * Returns the <code>url-delimiter</code> element
    * @return the node defined for the element <code>url-delimiter</code> 
    */
   public String getUrlDelimiter();

   /**
    * Removes the <code>url-delimiter</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUrlDelimiter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:token ElementType : url-selector-strategy-class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-selector-strategy-class-name</code> element
    * @param urlSelectorStrategyClassName the value for the element <code>url-selector-strategy-class-name</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> urlSelectorStrategyClassName(String urlSelectorStrategyClassName);

   /**
    * Returns the <code>url-selector-strategy-class-name</code> element
    * @return the node defined for the element <code>url-selector-strategy-class-name</code> 
    */
   public String getUrlSelectorStrategyClassName();

   /**
    * Removes the <code>url-selector-strategy-class-name</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeUrlSelectorStrategyClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: xsd:string ElementType : new-connection-sql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>new-connection-sql</code> element
    * @param newConnectionSql the value for the element <code>new-connection-sql</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> newConnectionSql(String newConnectionSql);

   /**
    * Returns the <code>new-connection-sql</code> element
    * @return the node defined for the element <code>new-connection-sql</code> 
    */
   public String getNewConnectionSql();

   /**
    * Removes the <code>new-connection-sql</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeNewConnectionSql();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:transaction-isolationType ElementType : transaction-isolation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> transactionIsolation(TransactionIsolationType transactionIsolation);
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> transactionIsolation(String transactionIsolation);

   /**
    * Returns the <code>transaction-isolation</code> element
    * @return the value found for the element <code>transaction-isolation</code> 
    */
   public TransactionIsolationType getTransactionIsolation();

   /**
    * Returns the <code>transaction-isolation</code> element
    * @return the value found for the element <code>transaction-isolation</code> 
    */
   public String  getTransactionIsolationAsString();

   /**
    * Removes the <code>transaction-isolation</code> attribute 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeTransactionIsolation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:xa-poolType ElementType : xa-pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-pool</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-pool</code> element will be returned.
    * @return  a new or existing instance of <code>XaPoolType<XaDatasourceType<T>></code> 
    */
   public XaPoolType<XaDatasourceType<T>> getOrCreateXaPool();

   /**
    * Removes the <code>xa-pool</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeXaPool();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:dsSecurityType ElementType : security
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>DsSecurityType<XaDatasourceType<T>></code> 
    */
   public DsSecurityType<XaDatasourceType<T>> getOrCreateSecurity();

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeSecurity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:validationType ElementType : validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<XaDatasourceType<T>></code> 
    */
   public ValidationType<XaDatasourceType<T>> getOrCreateValidation();

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:timeoutType ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<XaDatasourceType<T>></code> 
    */
   public TimeoutType<XaDatasourceType<T>> getOrCreateTimeout();

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:statementType ElementType : statement
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>statement</code> element with the given value will be created.
    * Otherwise, the existing <code>statement</code> element will be returned.
    * @return  a new or existing instance of <code>StatementType<XaDatasourceType<T>></code> 
    */
   public StatementType<XaDatasourceType<T>> getOrCreateStatement();

   /**
    * Removes the <code>statement</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeStatement();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: XaDatasourceType ElementName: datasources:recoverType ElementType : recovery
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>recovery</code> element with the given value will be created.
    * Otherwise, the existing <code>recovery</code> element will be returned.
    * @return  a new or existing instance of <code>RecoverType<XaDatasourceType<T>></code> 
    */
   public RecoverType<XaDatasourceType<T>> getOrCreateRecovery();

   /**
    * Removes the <code>recovery</code> element 
    * @return the current instance of <code>XaDatasourceType<T></code> 
    */
   public XaDatasourceType<T> removeRecovery();
}
