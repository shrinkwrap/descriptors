package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class DataSourceTypeImpl<T> implements Child<T>, DataSourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String name;
   private String className;
   private String serverName;
   private Integer portNumber;
   private String databaseName;
   private String url;
   private String user;
   private String password;
   private PropertyType<DataSourceType<T>> property;
   private Integer loginTimeout;
   private Boolean transactional;
   private String isolationLevel;
   private Integer initialPoolSize;
   private Integer maxPoolSize;
   private Integer minPoolSize;
   private Integer maxIdleTime;
   private Integer maxStatements;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public DataSourceTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("data-source");   }


   public T up()
   {
      return t;
   }



   public DataSourceType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public DataSourceType<T> setName(String name)
   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return name;
   }



   public DataSourceType<T> setClassName(String className)
   {
      this.className = className;
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   public String getClassName()
   {
      return className;
   }



   public DataSourceType<T> setServerName(String serverName)
   {
      this.serverName = serverName;
      childNode.getOrCreate("server-name").text(serverName);
      return this;
   }

   public String getServerName()
   {
      return serverName;
   }



   public DataSourceType<T> setPortNumber(Integer portNumber)
   {
      this.portNumber = portNumber;
      childNode.getOrCreate("port-number").text(portNumber);
      return this;
   }

   public Integer getPortNumber()
   {
      return portNumber;
   }



   public DataSourceType<T> setDatabaseName(String databaseName)
   {
      this.databaseName = databaseName;
      childNode.getOrCreate("database-name").text(databaseName);
      return this;
   }

   public String getDatabaseName()
   {
      return databaseName;
   }



   public DataSourceType<T> setUrl(String url)
   {
      this.url = url;
      childNode.getOrCreate("url").text(url);
      return this;
   }

   public String getUrl()
   {
      return url;
   }



   public DataSourceType<T> setUser(String user)
   {
      this.user = user;
      childNode.getOrCreate("user").text(user);
      return this;
   }

   public String getUser()
   {
      return user;
   }



   public DataSourceType<T> setPassword(String password)
   {
      this.password = password;
      childNode.getOrCreate("password").text(password);
      return this;
   }

   public String getPassword()
   {
      return password;
   }



   public DataSourceType<T> setProperty(PropertyType<DataSourceType<T>> property)
   {
      this.property = property;
      childNode.getOrCreate("property").text(property);
      return this;
   }

   public PropertyType<DataSourceType<T>> getProperty()
   {
      if( property == null)
      {
          property = new PropertyTypeImpl<DataSourceType<T>>(this, "", childNode);
      }
      return property;
   }




   public DataSourceType<T> setLoginTimeout(Integer loginTimeout)
   {
      this.loginTimeout = loginTimeout;
      childNode.getOrCreate("login-timeout").text(loginTimeout);
      return this;
   }

   public Integer getLoginTimeout()
   {
      return loginTimeout;
   }



   public DataSourceType<T> setTransactional(Boolean transactional)
   {
      this.transactional = transactional;
      childNode.getOrCreate("transactional").text(transactional);
      return this;
   }

   public Boolean getTransactional()
   {
      return transactional;
   }



   public DataSourceType<T> setIsolationLevel(String isolationLevel)
   {
      this.isolationLevel = isolationLevel;
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   public String getIsolationLevel()
   {
      return isolationLevel;
   }



   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize)
   {
      this.initialPoolSize = initialPoolSize;
      childNode.getOrCreate("initial-pool-size").text(initialPoolSize);
      return this;
   }

   public Integer getInitialPoolSize()
   {
      return initialPoolSize;
   }



   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize)
   {
      this.maxPoolSize = maxPoolSize;
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   public Integer getMaxPoolSize()
   {
      return maxPoolSize;
   }



   public DataSourceType<T> setMinPoolSize(Integer minPoolSize)
   {
      this.minPoolSize = minPoolSize;
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   public Integer getMinPoolSize()
   {
      return minPoolSize;
   }



   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime)
   {
      this.maxIdleTime = maxIdleTime;
      childNode.getOrCreate("max-idle-time").text(maxIdleTime);
      return this;
   }

   public Integer getMaxIdleTime()
   {
      return maxIdleTime;
   }



   public DataSourceType<T> setMaxStatements(Integer maxStatements)
   {
      this.maxStatements = maxStatements;
      childNode.getOrCreate("max-statements").text(maxStatements);
      return this;
   }

   public Integer getMaxStatements()
   {
      return maxStatements;
   }

}
