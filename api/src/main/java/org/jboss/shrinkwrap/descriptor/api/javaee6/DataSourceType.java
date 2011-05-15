package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface DataSourceType<T> extends Child<T>
{
   public DataSourceType<T> description(String description);

   public DataSourceType<T> name(String name);

   public DataSourceType<T> className(String className);

   public DataSourceType<T> serverName(String serverName);

   public DataSourceType<T> portNumber(int portNumber);

   public DataSourceType<T> databaseName(String databaseName);

   public DataSourceType<T> url(String url);

   public DataSourceType<T> user(String user);

   public DataSourceType<T> password(String password);

   public DataSourceType<T> property(PropertyType[] property);

   public DataSourceType<T> loginTimeout(int loginTimeout);

   public DataSourceType<T> transactional(boolean transactional);

   public DataSourceType<T> isolationLevel(IsolationLevelType isolationLevel);

   public DataSourceType<T> initialPoolSize(int initialPoolSize);

   public DataSourceType<T> maxPoolSize(int maxPoolSize);

   public DataSourceType<T> minPoolSize(int minPoolSize);

   public DataSourceType<T> maxIdleTime(int maxIdleTime);

   public DataSourceType<T> maxStatements(int maxStatements);
}