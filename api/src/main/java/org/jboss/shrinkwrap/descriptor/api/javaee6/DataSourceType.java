package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface DataSourceType<T> extends Child<T>
{
   public DataSourceType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public DataSourceType<T> setName(String name);

   @NodeInfo(xmlName = "name")
   public String getName();

   public DataSourceType<T> setClassName(Class<?> className);

   public DataSourceType<T> setClassName(String className);

   @NodeInfo(xmlName = "class-name")
   public String getClassName();

   public DataSourceType<T> setServerName(String serverName);

   @NodeInfo(xmlName = "server-name")
   public String getServerName();

   public DataSourceType<T> setPortNumber(Integer portNumber);

   @NodeInfo(xmlName = "port-number")
   public Integer getPortNumber();

   public DataSourceType<T> setDatabaseName(String databaseName);

   @NodeInfo(xmlName = "database-name")
   public String getDatabaseName();

   public DataSourceType<T> setUrl(String url);

   @NodeInfo(xmlName = "url")
   public String getUrl();

   public DataSourceType<T> setUser(String user);

   @NodeInfo(xmlName = "user")
   public String getUser();

   public DataSourceType<T> setPassword(String password);

   @NodeInfo(xmlName = "password")
   public String getPassword();

   @NodeInfo(xmlName = "property")
   public PropertyType<DataSourceType<T>> property();

   public DataSourceType<T> setLoginTimeout(Integer loginTimeout);

   @NodeInfo(xmlName = "login-timeout")
   public Integer getLoginTimeout();

   public DataSourceType<T> setTransactional(Boolean transactional);

   @NodeInfo(xmlName = "transactional")
   public Boolean getTransactional();

   public DataSourceType<T> setIsolationLevel(IsolationLevelType isolationLevel);

   public DataSourceType<T> setIsolationLevel(String isolationLevel);

   @NodeInfo(xmlName = "isolation-level")
   public String getIsolationLevel();

   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize);

   @NodeInfo(xmlName = "initial-pool-size")
   public Integer getInitialPoolSize();

   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize);

   @NodeInfo(xmlName = "max-pool-size")
   public Integer getMaxPoolSize();

   public DataSourceType<T> setMinPoolSize(Integer minPoolSize);

   @NodeInfo(xmlName = "min-pool-size")
   public Integer getMinPoolSize();

   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime);

   @NodeInfo(xmlName = "max-idle-time")
   public Integer getMaxIdleTime();

   public DataSourceType<T> setMaxStatements(Integer maxStatements);

   @NodeInfo(xmlName = "max-statements")
   public Integer getMaxStatements();
}
