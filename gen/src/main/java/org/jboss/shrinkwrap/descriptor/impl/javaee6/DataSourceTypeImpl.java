package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class DataSourceTypeImpl<T> implements Child<T>, DataSourceType<T>
{
   public final static String nodeName = "data-source";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String description;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String name;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String className;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String serverName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer portNumber;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String databaseName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String url;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String user;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String password;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private PropertyType<DataSourceType<T>> property;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer loginTimeout;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean transactional;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String isolationLevel;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer initialPoolSize;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer maxPoolSize;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer minPoolSize;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer maxIdleTime;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer maxStatements;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public DataSourceTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public DataSourceTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setDescription(String description)   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return childNode.textValue("description");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setName(String name)   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setClassName(String className)   {
      this.className = className;
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   public String getClassName()
   {
      return childNode.textValue("class-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setServerName(String serverName)   {
      this.serverName = serverName;
      childNode.getOrCreate("server-name").text(serverName);
      return this;
   }

   public String getServerName()
   {
      return childNode.textValue("server-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setPortNumber(Integer portNumber)   {
      this.portNumber = portNumber;
      childNode.getOrCreate("port-number").text(portNumber);
      return this;
   }

   public Integer getPortNumber()
   {
      return Integer.valueOf(childNode.textValue("port-number"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setDatabaseName(String databaseName)   {
      this.databaseName = databaseName;
      childNode.getOrCreate("database-name").text(databaseName);
      return this;
   }

   public String getDatabaseName()
   {
      return childNode.textValue("database-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setUrl(String url)   {
      this.url = url;
      childNode.getOrCreate("url").text(url);
      return this;
   }

   public String getUrl()
   {
      return childNode.textValue("url");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setUser(String user)   {
      this.user = user;
      childNode.getOrCreate("user").text(user);
      return this;
   }

   public String getUser()
   {
      return childNode.textValue("user");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setPassword(String password)   {
      this.password = password;
      childNode.getOrCreate("password").text(password);
      return this;
   }

   public String getPassword()
   {
      return childNode.textValue("password");
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setProperty(PropertyType<DataSourceType<T>> property)
   {
      childNode.create("property").text(property);
      return this;
   }

   public PropertyType<DataSourceType<T>> getProperty()
   {
      return new PropertyTypeImpl<DataSourceType<T>>(this, "", childNode);
   }

   public List<PropertyType<DataSourceType<T>>> getPropertyList()
   {
      List<PropertyType<DataSourceType<T>>> list = new ArrayList<PropertyType<DataSourceType<T>>>();
      List<Node> nodeList = childNode.get(PropertyTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         PropertyType<DataSourceType<T>>  type = new PropertyTypeImpl<DataSourceType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setLoginTimeout(Integer loginTimeout)   {
      this.loginTimeout = loginTimeout;
      childNode.getOrCreate("login-timeout").text(loginTimeout);
      return this;
   }

   public Integer getLoginTimeout()
   {
      return Integer.valueOf(childNode.textValue("login-timeout"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setTransactional(Boolean transactional)   {
      this.transactional = transactional;
      childNode.getOrCreate("transactional").text(transactional);
      return this;
   }

   public Boolean getTransactional()
   {
      return Strings.isTrue(childNode.textValue("transactional"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setIsolationLevel(String isolationLevel)   {
      this.isolationLevel = isolationLevel;
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   public String getIsolationLevel()
   {
      return childNode.textValue("isolation-level");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize)   {
      this.initialPoolSize = initialPoolSize;
      childNode.getOrCreate("initial-pool-size").text(initialPoolSize);
      return this;
   }

   public Integer getInitialPoolSize()
   {
      return Integer.valueOf(childNode.textValue("initial-pool-size"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize)   {
      this.maxPoolSize = maxPoolSize;
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   public Integer getMaxPoolSize()
   {
      return Integer.valueOf(childNode.textValue("max-pool-size"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setMinPoolSize(Integer minPoolSize)   {
      this.minPoolSize = minPoolSize;
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   public Integer getMinPoolSize()
   {
      return Integer.valueOf(childNode.textValue("min-pool-size"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime)   {
      this.maxIdleTime = maxIdleTime;
      childNode.getOrCreate("max-idle-time").text(maxIdleTime);
      return this;
   }

   public Integer getMaxIdleTime()
   {
      return Integer.valueOf(childNode.textValue("max-idle-time"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public DataSourceType<T> setMaxStatements(Integer maxStatements)   {
      this.maxStatements = maxStatements;
      childNode.getOrCreate("max-statements").text(maxStatements);
      return this;
   }

   public Integer getMaxStatements()
   {
      return Integer.valueOf(childNode.textValue("max-statements"));
   }

}
