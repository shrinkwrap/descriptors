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
package org.jboss.shrinkwrap.descriptor.impl.ironjacamar10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConnectionDefintionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.SecurityType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.SecurityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.TimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.TimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.ValidationType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.ValidationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.RecoverType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.RecoverTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.PoolType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.PoolTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ironjacamar10.XaPoolType;
import org.jboss.shrinkwrap.descriptor.impl.ironjacamar10.XaPoolTypeImpl;

public class ConnectionDefintionTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.className("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }
   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.jndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }
   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.enabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }
   
   @Test
   public void testUseJavaContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.useJavaContext(true);
      assertTrue(type.isUseJavaContext());
      type.removeUseJavaContext();
      assertFalse(type.isUseJavaContext());
   }
   
   @Test
   public void testPoolName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.poolName("test");
      assertEquals(type.getPoolName(), "test");
      type.removePoolName();
      assertNull(type.getPoolName());
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }

   
   @Test
   public void testSecurity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateSecurity().up();
      type.removeSecurity();
      assertNull(provider.getRootNode().getSingle("security"));
   }

   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateTimeout().up();
      type.removeTimeout();
      assertNull(provider.getRootNode().getSingle("timeout"));
   }

   
   @Test
   public void testValidation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateValidation().up();
      type.removeValidation();
      assertNull(provider.getRootNode().getSingle("validation"));
   }

   
   @Test
   public void testRecovery() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateRecovery().up();
      type.removeRecovery();
      assertNull(provider.getRootNode().getSingle("recovery"));
   }

   
   @Test
   public void testPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreatePool().up();
      type.removePool();
      assertNull(provider.getRootNode().getSingle("pool"));
   }

   
   @Test
   public void testXaPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateXaPool().up();
      type.removeXaPool();
      assertNull(provider.getRootNode().getSingle("xa-pool"));
   }

   
   @Test
   public void testUseCcm() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.useCcm(true);
      assertTrue(type.isUseCcm());
      type.removeUseCcm();
      assertFalse(type.isUseCcm());
   }
}
