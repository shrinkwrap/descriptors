package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Configuration of a DataSource.
 * 
 * 
 * 
 */
public interface DataSourceType<T> extends Child<T> {

	public DataSourceType<T> setDescription(String description);

	public DataSourceType<T> removeDescription();

	public String getDescription();

	public DataSourceType<T> setName(String name);

	public DataSourceType<T> removeName();

	public String getName();

	public DataSourceType<T> setClassName(String className);

	public DataSourceType<T> removeClassName();

	public String getClassName();

	public DataSourceType<T> setServerName(String serverName);

	public DataSourceType<T> removeServerName();

	public String getServerName();

	public DataSourceType<T> setPortNumber(Integer portNumber);

	public DataSourceType<T> removePortNumber();

	public Integer getPortNumber();

	public DataSourceType<T> setDatabaseName(String databaseName);

	public DataSourceType<T> removeDatabaseName();

	public String getDatabaseName();

	public DataSourceType<T> setUrl(String url);

	public DataSourceType<T> removeUrl();

	public String getUrl();

	public DataSourceType<T> setUser(String user);

	public DataSourceType<T> removeUser();

	public String getUser();

	public DataSourceType<T> setPassword(String password);

	public DataSourceType<T> removePassword();

	public String getPassword();

	public DataSourceType<T> removeAllProperty();

	public PropertyType<DataSourceType<T>> property();

	public List<PropertyType<DataSourceType<T>>> getPropertyList();

	public DataSourceType<T> setLoginTimeout(Integer loginTimeout);

	public DataSourceType<T> removeLoginTimeout();

	public Integer getLoginTimeout();

	public DataSourceType<T> setTransactional(Boolean transactional);

	public DataSourceType<T> removeTransactional();

	public Boolean isTransactional();

	public DataSourceType<T> setIsolationLevel(IsolationLevelType isolationLevel);

	public DataSourceType<T> setIsolationLevel(String isolationLevel);

	public IsolationLevelType getIsolationLevel();

	public String getIsolationLevelAsString();

	public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize);

	public DataSourceType<T> removeInitialPoolSize();

	public Integer getInitialPoolSize();

	public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize);

	public DataSourceType<T> removeMaxPoolSize();

	public Integer getMaxPoolSize();

	public DataSourceType<T> setMinPoolSize(Integer minPoolSize);

	public DataSourceType<T> removeMinPoolSize();

	public Integer getMinPoolSize();

	public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime);

	public DataSourceType<T> removeMaxIdleTime();

	public Integer getMaxIdleTime();

	public DataSourceType<T> setMaxStatements(Integer maxStatements);

	public DataSourceType<T> removeMaxStatements();

	public Integer getMaxStatements();

}
