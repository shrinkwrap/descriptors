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
 * Generation date :2011-06-13T14:03:48.938+02:00
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

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public DataSourceTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public DataSourceTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setDescription(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public DataSourceType<T> removeDescription()
   {
      childNode.remove("description");
      return this;
   }

   public String getDescription()
   {
      return childNode.textValue("description");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public DataSourceType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : class-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setClassName(String className)
   {
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   public DataSourceType<T> removeClassName()
   {
      childNode.remove("class-name");
      return this;
   }

   public String getClassName()
   {
      return childNode.textValue("class-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : server-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setServerName(String serverName)
   {
      childNode.getOrCreate("server-name").text(serverName);
      return this;
   }

   public DataSourceType<T> removeServerName()
   {
      childNode.remove("server-name");
      return this;
   }

   public String getServerName()
   {
      return childNode.textValue("server-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-number
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setPortNumber(Integer portNumber)
   {
      childNode.getOrCreate("port-number").text(portNumber);
      return this;
   }

   public DataSourceType<T> removePortNumber()
   {
      childNode.remove("port-number");
      return this;
   }

   public Integer getPortNumber()
   {
      return Integer.valueOf(childNode.textValue("port-number"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : database-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setDatabaseName(String databaseName)
   {
      childNode.getOrCreate("database-name").text(databaseName);
      return this;
   }

   public DataSourceType<T> removeDatabaseName()
   {
      childNode.remove("database-name");
      return this;
   }

   public String getDatabaseName()
   {
      return childNode.textValue("database-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setUrl(String url)
   {
      childNode.getOrCreate("url").text(url);
      return this;
   }

   public DataSourceType<T> removeUrl()
   {
      childNode.remove("url");
      return this;
   }

   public String getUrl()
   {
      return childNode.textValue("url");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : user
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setUser(String user)
   {
      childNode.getOrCreate("user").text(user);
      return this;
   }

   public DataSourceType<T> removeUser()
   {
      childNode.remove("user");
      return this;
   }

   public String getUser()
   {
      return childNode.textValue("user");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : password
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setPassword(String password)
   {
      childNode.getOrCreate("password").text(password);
      return this;
   }

   public DataSourceType<T> removePassword()
   {
      childNode.remove("password");
      return this;
   }

   public String getPassword()
   {
      return childNode.textValue("password");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> removeAllProperty()
   {
      childNode.remove("property");
      return this;
   }

   public PropertyType<DataSourceType<T>> property()
   {
      return new PropertyTypeImpl<DataSourceType<T>>(this, "", childNode);
   }

   public List<PropertyType<DataSourceType<T>>> getPropertyList()
   {
      List<PropertyType<DataSourceType<T>>> list = new ArrayList<PropertyType<DataSourceType<T>>>();
      List<Node> nodeList = childNode.get(PropertyTypeImpl.nodeName);
      for (Node node : nodeList)
      {
         PropertyType<DataSourceType<T>> type = new PropertyTypeImpl<DataSourceType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setLoginTimeout(Integer loginTimeout)
   {
      childNode.getOrCreate("login-timeout").text(loginTimeout);
      return this;
   }

   public DataSourceType<T> removeLoginTimeout()
   {
      childNode.remove("login-timeout");
      return this;
   }

   public Integer getLoginTimeout()
   {
      return Integer.valueOf(childNode.textValue("login-timeout"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transactional
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setTransactional(Boolean transactional)
   {
      childNode.getOrCreate("transactional").text(transactional);
      return this;
   }

   public DataSourceType<T> removeTransactional()
   {
      childNode.remove("transactional");
      return this;
   }

   public Boolean isTransactional()
   {
      return Strings.isTrue(childNode.textValue("transactional"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : isolation-level
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setIsolationLevel(String isolationLevel)
   {
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   public DataSourceType<T> removeIsolationLevel()
   {
      childNode.remove("isolation-level");
      return this;
   }

   public String getIsolationLevel()
   {
      return childNode.textValue("isolation-level");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initial-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize)
   {
      childNode.getOrCreate("initial-pool-size").text(initialPoolSize);
      return this;
   }

   public DataSourceType<T> removeInitialPoolSize()
   {
      childNode.remove("initial-pool-size");
      return this;
   }

   public Integer getInitialPoolSize()
   {
      return Integer.valueOf(childNode.textValue("initial-pool-size"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize)
   {
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   public DataSourceType<T> removeMaxPoolSize()
   {
      childNode.remove("max-pool-size");
      return this;
   }

   public Integer getMaxPoolSize()
   {
      return Integer.valueOf(childNode.textValue("max-pool-size"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : min-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setMinPoolSize(Integer minPoolSize)
   {
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   public DataSourceType<T> removeMinPoolSize()
   {
      childNode.remove("min-pool-size");
      return this;
   }

   public Integer getMinPoolSize()
   {
      return Integer.valueOf(childNode.textValue("min-pool-size"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-idle-time
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime)
   {
      childNode.getOrCreate("max-idle-time").text(maxIdleTime);
      return this;
   }

   public DataSourceType<T> removeMaxIdleTime()
   {
      childNode.remove("max-idle-time");
      return this;
   }

   public Integer getMaxIdleTime()
   {
      return Integer.valueOf(childNode.textValue("max-idle-time"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-statements
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public DataSourceType<T> setMaxStatements(Integer maxStatements)
   {
      childNode.getOrCreate("max-statements").text(maxStatements);
      return this;
   }

   public DataSourceType<T> removeMaxStatements()
   {
      childNode.remove("max-statements");
      return this;
   }

   public Integer getMaxStatements()
   {
      return Integer.valueOf(childNode.textValue("max-statements"));
   }

}
