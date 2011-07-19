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
package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> data-sourceType </code> xsd type 
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
public interface DataSourceType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>description</code> element with the given value will be created.
    * Otherwise, the existing <code>description</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setDescription(String description);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeDescription();

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>name</code> element with the given value will be created.
    * Otherwise, the existing <code>name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setName(String name);

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeName();

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   // -------------------------------------------------------------------------------------||
   // Element type : class-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class-name</code> element with the given value will be created.
    * Otherwise, the existing <code>class-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setClassName(String className);

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeClassName();

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName();

   // -------------------------------------------------------------------------------------||
   // Element type : server-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>server-name</code> element with the given value will be created.
    * Otherwise, the existing <code>server-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setServerName(String serverName);

   /**
    * Removes the <code>server-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeServerName();

   /**
    * Returns the <code>server-name</code> element
    * @return the node defined for the element <code>server-name</code> 
    */
   public String getServerName();

   // -------------------------------------------------------------------------------------||
   // Element type : port-number
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-number</code> element with the given value will be created.
    * Otherwise, the existing <code>port-number</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setPortNumber(Integer portNumber);

   /**
    * Removes the <code>port-number</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removePortNumber();

   /**
    * Returns the <code>port-number</code> element
    * @return the node defined for the element <code>port-number</code> 
    */
   public Integer getPortNumber();

   // -------------------------------------------------------------------------------------||
   // Element type : database-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>database-name</code> element with the given value will be created.
    * Otherwise, the existing <code>database-name</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setDatabaseName(String databaseName);

   /**
    * Removes the <code>database-name</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeDatabaseName();

   /**
    * Returns the <code>database-name</code> element
    * @return the node defined for the element <code>database-name</code> 
    */
   public String getDatabaseName();

   // -------------------------------------------------------------------------------------||
   // Element type : url
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>url</code> element with the given value will be created.
    * Otherwise, the existing <code>url</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setUrl(String url);

   /**
    * Removes the <code>url</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeUrl();

   /**
    * Returns the <code>url</code> element
    * @return the node defined for the element <code>url</code> 
    */
   public String getUrl();

   // -------------------------------------------------------------------------------------||
   // Element type : user
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user</code> element with the given value will be created.
    * Otherwise, the existing <code>user</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setUser(String user);

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeUser();

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser();

   // -------------------------------------------------------------------------------------||
   // Element type : password
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>password</code> element with the given value will be created.
    * Otherwise, the existing <code>password</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setPassword(String password);

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removePassword();

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeAllProperty();

   /**
    * Returns the <code>property</code> element
    * @return the node defined for the element <code>property</code> 
    */
   public PropertyType<DataSourceType<T>> property();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<DataSourceType<T>>> getPropertyList();

   // -------------------------------------------------------------------------------------||
   // Element type : login-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>login-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setLoginTimeout(Integer loginTimeout);

   /**
    * Removes the <code>login-timeout</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeLoginTimeout();

   /**
    * Returns the <code>login-timeout</code> element
    * @return the node defined for the element <code>login-timeout</code> 
    */
   public Integer getLoginTimeout();

   // -------------------------------------------------------------------------------------||
   // Element type : transactional
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transactional</code> element with the given value will be created.
    * Otherwise, the existing <code>transactional</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setTransactional(Boolean transactional);

   /**
    * Removes the <code>transactional</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeTransactional();

   /**
    * Returns the <code>transactional</code> element
    * @return the node defined for the element <code>transactional</code> 
    */
   public Boolean isTransactional();

   // -------------------------------------------------------------------------------------||
   // Element type : isolation-level
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>isolation-level</code> element with the given value will be created.
    * Otherwise, the existing <code>isolation-level</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setIsolationLevel(IsolationLevelType isolationLevel);

   /**
    * If not already created, a new <code>isolation-level</code> element with the given value will be created.
    * Otherwise, the existing <code>isolation-level</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setIsolationLevel(String isolationLevel);

   /**
    * Returns the <code>isolation-level</code> element
    * @return the node defined for the element <code>isolation-level</code> 
    */
   public IsolationLevelType getIsolationLevel();

   /**
    * Returns the <code>isolation-level</code> element
    * @return the node defined for the element <code>isolation-level</code> 
    */
   public String getIsolationLevelAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : initial-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>initial-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>initial-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setInitialPoolSize(Integer initialPoolSize);

   /**
    * Removes the <code>initial-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeInitialPoolSize();

   /**
    * Returns the <code>initial-pool-size</code> element
    * @return the node defined for the element <code>initial-pool-size</code> 
    */
   public Integer getInitialPoolSize();

   // -------------------------------------------------------------------------------------||
   // Element type : max-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>max-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxPoolSize(Integer maxPoolSize);

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxPoolSize();

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize();

   // -------------------------------------------------------------------------------------||
   // Element type : min-pool-size
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>min-pool-size</code> element with the given value will be created.
    * Otherwise, the existing <code>min-pool-size</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMinPoolSize(Integer minPoolSize);

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMinPoolSize();

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize();

   // -------------------------------------------------------------------------------------||
   // Element type : max-idle-time
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-idle-time</code> element with the given value will be created.
    * Otherwise, the existing <code>max-idle-time</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxIdleTime(Integer maxIdleTime);

   /**
    * Removes the <code>max-idle-time</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxIdleTime();

   /**
    * Returns the <code>max-idle-time</code> element
    * @return the node defined for the element <code>max-idle-time</code> 
    */
   public Integer getMaxIdleTime();

   // -------------------------------------------------------------------------------------||
   // Element type : max-statements
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>max-statements</code> element with the given value will be created.
    * Otherwise, the existing <code>max-statements</code> element will be updated with the given value.
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> setMaxStatements(Integer maxStatements);

   /**
    * Removes the <code>max-statements</code> element 
    * @return the current instance of {@link DataSourceType<T>} 
    */
   public DataSourceType<T> removeMaxStatements();

   /**
    * Returns the <code>max-statements</code> element
    * @return the node defined for the element <code>max-statements</code> 
    */
   public Integer getMaxStatements();

}
