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
package org.jboss.shrinkwrap.descriptor.impl.datasources10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DriverType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class DriverTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDriverClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.driverClass("test");
      assertEquals(type.getDriverClass(), "test");
      type.removeDriverClass();
      assertNull(type.getDriverClass());
   }

   
   @Test
   public void testDatasourceClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.datasourceClass("test");
      assertEquals(type.getDatasourceClass(), "test");
      type.removeDatasourceClass();
      assertNull(type.getDatasourceClass());
   }

   
   @Test
   public void testXaDatasourceClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.xaDatasourceClass("test");
      assertEquals(type.getXaDatasourceClass(), "test");
      type.removeXaDatasourceClass();
      assertNull(type.getXaDatasourceClass());
   }

   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.name("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testModule() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.module("test");
      assertEquals(type.getModule(), "test");
      type.removeModule();
      assertNull(type.getModule());
   }

   
   @Test
   public void testMajorVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.majorVersion("test");
      assertEquals(type.getMajorVersion(), "test");
      type.removeMajorVersion();
      assertNull(type.getMajorVersion());
   }

   
   @Test
   public void testMinorVerion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.minorVerion("test");
      assertEquals(type.getMinorVerion(), "test");
      type.removeMinorVerion();
      assertNull(type.getMinorVerion());
   }
}
