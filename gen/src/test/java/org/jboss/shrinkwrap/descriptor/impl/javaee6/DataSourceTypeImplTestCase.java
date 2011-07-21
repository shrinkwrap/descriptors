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

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IsolationLevelType;

public class DataSourceTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setDescription("test");
      assertEquals(type.getDescription(), "test");
      type.removeDescription();
      assertNull(type.getDescription());
   }

   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setName("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setClassName("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }

   
   @Test
   public void testServerName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setServerName("test");
      assertEquals(type.getServerName(), "test");
      type.removeServerName();
      assertNull(type.getServerName());
   }

   
   @Test
   public void testPortNumber() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setPortNumber(8);
      assertTrue(type.getPortNumber() == 8);
      type.removePortNumber();
      assertNull(type.getPortNumber());
   }

   
   @Test
   public void testDatabaseName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setDatabaseName("test");
      assertEquals(type.getDatabaseName(), "test");
      type.removeDatabaseName();
      assertNull(type.getDatabaseName());
   }

   
   @Test
   public void testUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setUrl("test");
      assertEquals(type.getUrl(), "test");
      type.removeUrl();
      assertNull(type.getUrl());
   }

   
   @Test
   public void testUser() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setUser("test");
      assertEquals(type.getUser(), "test");
      type.removeUser();
      assertNull(type.getUser());
   }

   
   @Test
   public void testPassword() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setPassword("test");
      assertEquals(type.getPassword(), "test");
      type.removePassword();
      assertNull(type.getPassword());
   }

   
   @Test
   public void testProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.property().up();
      type.property().up();
      assertTrue(type.getPropertyList().size() == 2);
      type.removeAllProperty();
      assertTrue(type.getPropertyList().size() == 0);
   }

   
   @Test
   public void testLoginTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setLoginTimeout(8);
      assertTrue(type.getLoginTimeout() == 8);
      type.removeLoginTimeout();
      assertNull(type.getLoginTimeout());
   }

   
   @Test
   public void testTransactional() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setTransactional(true);
      assertTrue(type.isTransactional());
      type.removeTransactional();
      assertFalse(type.isTransactional());
   }

   
   @Test
   public void testIsolationLevel() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      for(IsolationLevelType e: IsolationLevelType.values())
      {
         type.setIsolationLevel(e);
         assertEquals(type.getIsolationLevel(), e);
         type.setIsolationLevel(e.toString());
         assertEquals(type.getIsolationLevelAsString(), e.toString());
      }
   }

   
   @Test
   public void testInitialPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setInitialPoolSize(8);
      assertTrue(type.getInitialPoolSize() == 8);
      type.removeInitialPoolSize();
      assertNull(type.getInitialPoolSize());
   }

   
   @Test
   public void testMaxPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setMaxPoolSize(8);
      assertTrue(type.getMaxPoolSize() == 8);
      type.removeMaxPoolSize();
      assertNull(type.getMaxPoolSize());
   }

   
   @Test
   public void testMinPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setMinPoolSize(8);
      assertTrue(type.getMinPoolSize() == 8);
      type.removeMinPoolSize();
      assertNull(type.getMinPoolSize());
   }

   
   @Test
   public void testMaxIdleTime() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setMaxIdleTime(8);
      assertTrue(type.getMaxIdleTime() == 8);
      type.removeMaxIdleTime();
      assertNull(type.getMaxIdleTime());
   }

   
   @Test
   public void testMaxStatements() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DataSourceType<TestDescriptorImpl> type = new DataSourceTypeImpl<TestDescriptorImpl>(provider, "data-sourceType", provider.getRootNode());
      type.setMaxStatements(8);
      assertTrue(type.getMaxStatements() == 8);
      type.removeMaxStatements();
      assertNull(type.getMaxStatements());
   }
}
