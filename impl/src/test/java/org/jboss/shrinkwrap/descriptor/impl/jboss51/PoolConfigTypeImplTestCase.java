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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class PoolConfigTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType",
            provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testPoolValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType",
            provider.getRootNode());
      type.setPoolValue("test");
      assertEquals(type.getPoolValue(), "test");
      type.removePoolValue();
      assertNull(type.getPoolValue());
   }

   @Test
   public void testPoolMaxSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType",
            provider.getRootNode());
      type.setPoolMaxSize(8);
      assertTrue(type.getPoolMaxSize() == 8);
      type.removePoolMaxSize();
      assertNull(type.getPoolMaxSize());
   }

   @Test
   public void testPoolTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType",
            provider.getRootNode());
      type.setPoolTimeout(8);
      assertTrue(type.getPoolTimeout() == 8);
      type.removePoolTimeout();
      assertNull(type.getPoolTimeout());
   }
}
