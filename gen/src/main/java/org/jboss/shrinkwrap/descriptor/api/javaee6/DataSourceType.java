package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface DataSourceType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setDescription(String description);

   public String getDescription();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setName(String name);

   public String getName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setClassName(String className);

   public String getClassName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setServerName(String serverName);

   public String getServerName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setPortNumber(Integer portNumber);

   public Integer getPortNumber();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setDatabaseName(String databaseName);

   public String getDatabaseName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setUrl(String url);

   public String getUrl();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setUser(String user);

   public String getUser();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setPassword(String password);

   public String getPassword();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public DataSourceType<T> setProperty(PropertyType<DataSourceType<T>> property);

   public PropertyType<DataSourceType<T>> getProperty();
   public List<PropertyType<DataSourceType<T>>> getPropertyList();



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setLoginTimeout(Integer loginTimeout);

   public Integer getLoginTimeout();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setTransactional(Boolean transactional);

   public Boolean getTransactional();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setIsolationLevel(String isolationLevel);

   public String getIsolationLevel();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize);

   public Integer getInitialPoolSize();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize);

   public Integer getMaxPoolSize();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setMinPoolSize(Integer minPoolSize);

   public Integer getMinPoolSize();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime);

   public Integer getMaxIdleTime();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public DataSourceType<T> setMaxStatements(Integer maxStatements);

   public Integer getMaxStatements();

}
