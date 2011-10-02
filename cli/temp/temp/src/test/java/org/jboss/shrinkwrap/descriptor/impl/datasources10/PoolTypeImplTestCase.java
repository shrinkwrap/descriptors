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
import org.jboss.shrinkwrap.descriptor.api.datasources10.PoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class PoolTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testMinPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.minPoolSize(8);
      assertTrue(type.getMinPoolSize() == 8);
      type.removeMinPoolSize();
      assertNull(type.getMinPoolSize());
   }

   
   @Test
   public void testMaxPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.maxPoolSize(8);
      assertTrue(type.getMaxPoolSize() == 8);
      type.removeMaxPoolSize();
      assertNull(type.getMaxPoolSize());
   }

   
   @Test
   public void testPrefill() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.prefill(true);
      assertTrue(type.isPrefill());
      type.removePrefill();
      assertFalse(type.isPrefill());
   }

   
   @Test
   public void testUseStrictMin() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.useStrictMin(true);
      assertTrue(type.isUseStrictMin());
      type.removeUseStrictMin();
      assertFalse(type.isUseStrictMin());
   }

   
   @Test
   public void testFlushStrategy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.flushStrategy("test");
      assertEquals(type.getFlushStrategy(), "test");
      type.removeFlushStrategy();
      assertNull(type.getFlushStrategy());
   }
}
