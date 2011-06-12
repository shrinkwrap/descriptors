package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface DataSourceType<T> extends Child<T>
{

   public DataSourceType<T> setDescription(String description);

   public String getDescription();

   public DataSourceType<T> setName(String name);

   public String getName();

   public DataSourceType<T> setClassName(String className);

   public String getClassName();

   public DataSourceType<T> setServerName(String serverName);

   public String getServerName();

   public DataSourceType<T> setPortNumber(Integer portNumber);

   public Integer getPortNumber();

   public DataSourceType<T> setDatabaseName(String databaseName);

   public String getDatabaseName();

   public DataSourceType<T> setUrl(String url);

   public String getUrl();

   public DataSourceType<T> setUser(String user);

   public String getUser();

   public DataSourceType<T> setPassword(String password);

   public String getPassword();

   public DataSourceType<T> removeAllProperty();

   public PropertyType<DataSourceType<T>> getProperty();

   public List<PropertyType<DataSourceType<T>>> getPropertyList();

   public DataSourceType<T> setLoginTimeout(Integer loginTimeout);

   public Integer getLoginTimeout();

   public DataSourceType<T> setTransactional(Boolean transactional);

   public Boolean isTransactional();

   public DataSourceType<T> setIsolationLevel(String isolationLevel);

   public String getIsolationLevel();

   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize);

   public Integer getInitialPoolSize();

   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize);

   public Integer getMaxPoolSize();

   public DataSourceType<T> setMinPoolSize(Integer minPoolSize);

   public Integer getMinPoolSize();

   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime);

   public Integer getMaxIdleTime();

   public DataSourceType<T> setMaxStatements(Integer maxStatements);

   public Integer getMaxStatements();

}
