package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.ConnectionPropertyType;
import org.jboss.datasources.api.TransactionIsolationType;
import org.jboss.datasources.api.PoolType;
import org.jboss.datasources.api.DsSecurityType;
import org.jboss.datasources.api.ValidationType;
import org.jboss.datasources.api.TimeoutType;
import org.jboss.datasources.api.StatementType;
/**
 * This interface defines the contract for the <code> datasourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface DatasourceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : jndi-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jndi-name</code> attribute
    * @param jndiName the value for the attribute <code>jndi-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> jndiName(String jndiName);

   /**
    * Returns the <code>jndi-name</code> attribute
    * @return the value defined for the attribute <code>jndi-name</code> 
    */
   public String getJndiName();

   /**
    * Removes the <code>jndi-name</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeJndiName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : pool-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pool-name</code> attribute
    * @param poolName the value for the attribute <code>pool-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> poolName(String poolName);

   /**
    * Returns the <code>pool-name</code> attribute
    * @return the value defined for the attribute <code>pool-name</code> 
    */
   public String getPoolName();

   /**
    * Removes the <code>pool-name</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removePoolName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : enabled
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> attribute
    * @param enabled the value for the attribute <code>enabled</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> attribute
    * @return the value defined for the attribute <code>enabled</code> 
    */
public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeEnabled();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : use-java-context
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-java-context</code> attribute
    * @param useJavaContext the value for the attribute <code>use-java-context</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> useJavaContext(Boolean useJavaContext);

   /**
    * Returns the <code>use-java-context</code> attribute
    * @return the value defined for the attribute <code>use-java-context</code> 
    */
public Boolean isUseJavaContext();

   /**
    * Removes the <code>use-java-context</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUseJavaContext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : spy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spy</code> attribute
    * @param spy the value for the attribute <code>spy</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> spy(Boolean spy);

   /**
    * Returns the <code>spy</code> attribute
    * @return the value defined for the attribute <code>spy</code> 
    */
public Boolean isSpy();

   /**
    * Removes the <code>spy</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeSpy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : use-ccm
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-ccm</code> attribute
    * @param useCcm the value for the attribute <code>use-ccm</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> useCcm(Boolean useCcm);

   /**
    * Returns the <code>use-ccm</code> attribute
    * @return the value defined for the attribute <code>use-ccm</code> 
    */
public Boolean isUseCcm();

   /**
    * Removes the <code>use-ccm</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUseCcm();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : connection-url
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-url</code> element
    * @param connectionUrl the value for the element <code>connection-url</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> connectionUrl(String connectionUrl);

   /**
    * Returns the <code>connection-url</code> element
    * @return the node defined for the element <code>connection-url</code> 
    */
   public String getConnectionUrl();

   /**
    * Removes the <code>connection-url</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeConnectionUrl();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : driver-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver-class</code> element
    * @param driverClass the value for the element <code>driver-class</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> driverClass(String driverClass);

   /**
    * Returns the <code>driver-class</code> element
    * @return the node defined for the element <code>driver-class</code> 
    */
   public String getDriverClass();

   /**
    * Removes the <code>driver-class</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDriverClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>datasource-class</code> element
    * @param datasourceClass the value for the element <code>datasource-class</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> datasourceClass(String datasourceClass);

   /**
    * Returns the <code>datasource-class</code> element
    * @return the node defined for the element <code>datasource-class</code> 
    */
   public String getDatasourceClass();

   /**
    * Removes the <code>datasource-class</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDatasourceClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : driver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver</code> element
    * @param driver the value for the element <code>driver</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> driver(String driver);

   /**
    * Returns the <code>driver</code> element
    * @return the node defined for the element <code>driver</code> 
    */
   public String getDriver();

   /**
    * Removes the <code>driver</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeDriver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:connection-propertyType ElementType : connection-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-property</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-property</code> element will be returned.
    * @return the instance defined for the element <code>connection-property</code> 
    */
   public ConnectionPropertyType<DatasourceType<T>> getOrCreateConnectionProperty();

   /**
    * Creates a new <code>connection-property</code> element 
    * @return the new created instance of <code>ConnectionPropertyType<DatasourceType<T>></code> 
    */
   public ConnectionPropertyType<DatasourceType<T>> createConnectionProperty();

   /**
    * Returns all <code>connection-property</code> elements
    * @return list of <code>connection-property</code> 
    */
   public List<ConnectionPropertyType<DatasourceType<T>>> getAllConnectionProperty();

   /**
    * Removes all <code>connection-property</code> elements 
    * @return the current instance of <code>ConnectionPropertyType<DatasourceType<T>></code> 
    */
   public DatasourceType<T> removeAllConnectionProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:string ElementType : new-connection-sql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>new-connection-sql</code> element
    * @param newConnectionSql the value for the element <code>new-connection-sql</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> newConnectionSql(String newConnectionSql);

   /**
    * Returns the <code>new-connection-sql</code> element
    * @return the node defined for the element <code>new-connection-sql</code> 
    */
   public String getNewConnectionSql();

   /**
    * Removes the <code>new-connection-sql</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeNewConnectionSql();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:transaction-isolationType ElementType : transaction-isolation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> transactionIsolation(TransactionIsolationType transactionIsolation);
   /**
    * Sets the <code>transaction-isolation</code> element
    * @param transactionIsolation the value for the element <code>transaction-isolation</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> transactionIsolation(String transactionIsolation);

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
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeTransactionIsolation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : url-delimiter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-delimiter</code> element
    * @param urlDelimiter the value for the element <code>url-delimiter</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> urlDelimiter(String urlDelimiter);

   /**
    * Returns the <code>url-delimiter</code> element
    * @return the node defined for the element <code>url-delimiter</code> 
    */
   public String getUrlDelimiter();

   /**
    * Removes the <code>url-delimiter</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUrlDelimiter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:token ElementType : url-selector-strategy-class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url-selector-strategy-class-name</code> element
    * @param urlSelectorStrategyClassName the value for the element <code>url-selector-strategy-class-name</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> urlSelectorStrategyClassName(String urlSelectorStrategyClassName);

   /**
    * Returns the <code>url-selector-strategy-class-name</code> element
    * @return the node defined for the element <code>url-selector-strategy-class-name</code> 
    */
   public String getUrlSelectorStrategyClassName();

   /**
    * Removes the <code>url-selector-strategy-class-name</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeUrlSelectorStrategyClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:poolType ElementType : pool
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pool</code> element with the given value will be created.
    * Otherwise, the existing <code>pool</code> element will be returned.
    * @return  a new or existing instance of <code>PoolType<DatasourceType<T>></code> 
    */
   public PoolType<DatasourceType<T>> getOrCreatePool();

   /**
    * Removes the <code>pool</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removePool();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:dsSecurityType ElementType : security
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security</code> element with the given value will be created.
    * Otherwise, the existing <code>security</code> element will be returned.
    * @return  a new or existing instance of <code>DsSecurityType<DatasourceType<T>></code> 
    */
   public DsSecurityType<DatasourceType<T>> getOrCreateSecurity();

   /**
    * Removes the <code>security</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeSecurity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:validationType ElementType : validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validation</code> element with the given value will be created.
    * Otherwise, the existing <code>validation</code> element will be returned.
    * @return  a new or existing instance of <code>ValidationType<DatasourceType<T>></code> 
    */
   public ValidationType<DatasourceType<T>> getOrCreateValidation();

   /**
    * Removes the <code>validation</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:timeoutType ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout</code> element will be returned.
    * @return  a new or existing instance of <code>TimeoutType<DatasourceType<T>></code> 
    */
   public TimeoutType<DatasourceType<T>> getOrCreateTimeout();

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: datasources:statementType ElementType : statement
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>statement</code> element with the given value will be created.
    * Otherwise, the existing <code>statement</code> element will be returned.
    * @return  a new or existing instance of <code>StatementType<DatasourceType<T>></code> 
    */
   public StatementType<DatasourceType<T>> getOrCreateStatement();

   /**
    * Removes the <code>statement</code> element 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeStatement();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourceType ElementName: xsd:boolean ElementType : jta
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jta</code> attribute
    * @param jta the value for the attribute <code>jta</code> 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> jta(Boolean jta);

   /**
    * Returns the <code>jta</code> attribute
    * @return the value defined for the attribute <code>jta</code> 
    */
public Boolean isJta();

   /**
    * Removes the <code>jta</code> attribute 
    * @return the current instance of <code>DatasourceType<T></code> 
    */
   public DatasourceType<T> removeJta();
}
