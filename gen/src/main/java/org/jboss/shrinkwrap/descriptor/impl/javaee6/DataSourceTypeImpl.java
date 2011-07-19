/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.javaee6;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IsolationLevelType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> data-sourceType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Configuration of a DataSource. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class DataSourceTypeImpl<T> implements Child<T>, DataSourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DataSourceTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public DataSourceTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * If not already created, a new <code>description</code> element with the given value will be created.
    * Otherwise, the existing <code>description</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setDescription(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.textValue("description");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>name</code> element with the given value will be created.
    * Otherwise, the existing <code>name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setName(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.textValue("name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : class-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class-name</code> element with the given value will be created.
    * Otherwise, the existing <code>class-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setClassName(String className)
   {
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeClassName()
   {
      childNode.remove("class-name");
      return this;
   }

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.textValue("class-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : server-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>server-name</code> element with the given value will be created.
    * Otherwise, the existing <code>server-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setServerName(String serverName)
   {
      childNode.getOrCreate("server-name").text(serverName);
      return this;
   }

   /**
    * Removes the <code>server-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeServerName()
   {
      childNode.remove("server-name");
      return this;
   }

   /**
    * Returns the <code>server-name</code> element
    * @return the node defined for the element <code>server-name</code> 
    */
   public String getServerName()
   {
      return childNode.textValue("server-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : port-number
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-number</code> element with the given value will be created.
    * Otherwise, the existing <code>port-number</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setPortNumber(Integer portNumber)
   {
      childNode.getOrCreate("port-number").text(portNumber);
      return this;
   }

   /**
    * Removes the <code>port-number</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removePortNumber()
   {
      childNode.remove("port-number");
      return this;
   }

   /**
    * Returns the <code>port-number</code> element
    * @return the node defined for the element <code>port-number</code> 
    */
   public Integer getPortNumber()
   {
      if (childNode.textValue("port-number") != null && !childNode.textValue("port-number").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("port-number"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : database-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>database-name</code> element with the given value will be created.
    * Otherwise, the existing <code>database-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setDatabaseName(String databaseName)
   {
      childNode.getOrCreate("database-name").text(databaseName);
      return this;
   }

   /**
    * Removes the <code>database-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeDatabaseName()
   {
      childNode.remove("database-name");
      return this;
   }

   /**
    * Returns the <code>database-name</code> element
    * @return the node defined for the element <code>database-name</code> 
    */
   public String getDatabaseName()
   {
      return childNode.textValue("database-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>url</code> element with the given value will be created.
    * Otherwise, the existing <code>url</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setUrl(String url)
   {
      childNode.getOrCreate("url").text(url);
      return this;
   }

   /**
    * Removes the <code>url</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeUrl()
   {
      childNode.remove("url");
      return this;
   }

   /**
    * Returns the <code>url</code> element
    * @return the node defined for the element <code>url</code> 
    */
   public String getUrl()
   {
      return childNode.textValue("url");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : user
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user</code> element with the given value will be created.
    * Otherwise, the existing <code>user</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setUser(String user)
   {
      childNode.getOrCreate("user").text(user);
      return this;
   }

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeUser()
   {
      childNode.remove("user");
      return this;
   }

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser()
   {
      return childNode.textValue("user");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : password
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>password</code> element with the given value will be created.
    * Otherwise, the existing <code>password</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setPassword(String password)
   {
      childNode.getOrCreate("password").text(password);
      return this;
   }

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removePassword()
   {
      childNode.remove("password");
      return this;
   }

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword()
   {
      return childNode.textValue("password");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeAllProperty()
   {
      childNode.remove("property");
      return this;
   }

   /**
    * Returns the <code>property</code> element
    * @return the node defined for the element <code>property</code> 
    */
   public PropertyType<DataSourceType<T>> property()
   {
      return new PropertyTypeImpl<DataSourceType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<DataSourceType<T>>> getPropertyList()
   {
      List<PropertyType<DataSourceType<T>>> list = new ArrayList<PropertyType<DataSourceType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for (Node node : nodeList)
      {
         PropertyType<DataSourceType<T>> type = new PropertyTypeImpl<DataSourceType<T>>(this, "property", childNode,
               node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : login-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>login-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setLoginTimeout(Integer loginTimeout)
   {
      childNode.getOrCreate("login-timeout").text(loginTimeout);
      return this;
   }

   /**
    * Removes the <code>login-timeout</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeLoginTimeout()
   {
      childNode.remove("login-timeout");
      return this;
   }

   /**
    * Returns the <code>login-timeout</code> element
    * @return the node defined for the element <code>login-timeout</code> 
    */
   public Integer getLoginTimeout()
   {
      if (childNode.textValue("login-timeout") != null && !childNode.textValue("login-timeout").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("login-timeout"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : transactional
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transactional</code> element with the given value will be created.
    * Otherwise, the existing <code>transactional</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setTransactional(Boolean transactional)
   {
      childNode.getOrCreate("transactional").text(transactional);
      return this;
   }

   /**
    * Removes the <code>transactional</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeTransactional()
   {
      childNode.remove("transactional");
      return this;
   }

   /**
    * Returns the <code>transactional</code> element
    * @return the node defined for the element <code>transactional</code> 
    */
   public Boolean isTransactional()
   {
      return Strings.isTrue(childNode.textValue("transactional"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : isolation-level
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>isolation-level</code> element with the given value will be created.
    * Otherwise, the existing <code>isolation-level</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setIsolationLevel(IsolationLevelType isolationLevel)
   {
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   /**
    * If not already created, a new <code>isolation-level</code> element with the given value will be created.
    * Otherwise, the existing <code>isolation-level</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setIsolationLevel(String isolationLevel)
   {
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   /**
    * Returns the <code>isolation-level</code> element
    * @return the node defined for the element <code>isolation-level</code> 
    */
   public IsolationLevelType getIsolationLevel()
   {
      return IsolationLevelType.getFromStringValue(childNode.textValue("isolation-level"));
   }

   /**
    * Returns the <code>isolation-level</code> element
    * @return the node defined for the element <code>isolation-level</code> 
    */
   public String getIsolationLevelAsString()
   {
      return childNode.textValue("isolation-level");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : initial-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>initial-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>initial-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize)
   {
      childNode.getOrCreate("initial-pool-size").text(initialPoolSize);
      return this;
   }

   /**
    * Removes the <code>initial-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeInitialPoolSize()
   {
      childNode.remove("initial-pool-size");
      return this;
   }

   /**
    * Returns the <code>initial-pool-size</code> element
    * @return the node defined for the element <code>initial-pool-size</code> 
    */
   public Integer getInitialPoolSize()
   {
      if (childNode.textValue("initial-pool-size") != null && !childNode.textValue("initial-pool-size").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("initial-pool-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize)
   {
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxPoolSize()
   {
      childNode.remove("max-pool-size");
      return this;
   }

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize()
   {
      if (childNode.textValue("max-pool-size") != null && !childNode.textValue("max-pool-size").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("max-pool-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : min-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>min-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>min-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMinPoolSize(Integer minPoolSize)
   {
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMinPoolSize()
   {
      childNode.remove("min-pool-size");
      return this;
   }

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize()
   {
      if (childNode.textValue("min-pool-size") != null && !childNode.textValue("min-pool-size").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("min-pool-size"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-idle-time
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-idle-time</code> element with the given value will be created.
    * Otherwise, the existing <code>max-idle-time</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime)
   {
      childNode.getOrCreate("max-idle-time").text(maxIdleTime);
      return this;
   }

   /**
    * Removes the <code>max-idle-time</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxIdleTime()
   {
      childNode.remove("max-idle-time");
      return this;
   }

   /**
    * Returns the <code>max-idle-time</code> element
    * @return the node defined for the element <code>max-idle-time</code> 
    */
   public Integer getMaxIdleTime()
   {
      if (childNode.textValue("max-idle-time") != null && !childNode.textValue("max-idle-time").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("max-idle-time"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : max-statements
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-statements</code> element with the given value will be created.
    * Otherwise, the existing <code>max-statements</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxStatements(Integer maxStatements)
   {
      childNode.getOrCreate("max-statements").text(maxStatements);
      return this;
   }

   /**
    * Removes the <code>max-statements</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxStatements()
   {
      childNode.remove("max-statements");
      return this;
   }

   /**
    * Returns the <code>max-statements</code> element
    * @return the node defined for the element <code>max-statements</code> 
    */
   public Integer getMaxStatements()
   {
      if (childNode.textValue("max-statements") != null && !childNode.textValue("max-statements").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("max-statements"));
      }
      return null;
   }

}
