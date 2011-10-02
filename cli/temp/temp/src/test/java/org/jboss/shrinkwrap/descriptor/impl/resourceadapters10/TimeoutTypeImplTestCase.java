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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.TimeoutType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class TimeoutTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testBlockingTimeoutMillis() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.blockingTimeoutMillis(8);
      assertTrue(type.getBlockingTimeoutMillis() == 8);
      type.removeBlockingTimeoutMillis();
      assertNull(type.getBlockingTimeoutMillis());
   }

   
   @Test
   public void testIdleTimeoutMinutes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.idleTimeoutMinutes(8);
      assertTrue(type.getIdleTimeoutMinutes() == 8);
      type.removeIdleTimeoutMinutes();
      assertNull(type.getIdleTimeoutMinutes());
   }

   
   @Test
   public void testAllocationRetry() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.allocationRetry(8);
      assertTrue(type.getAllocationRetry() == 8);
      type.removeAllocationRetry();
      assertNull(type.getAllocationRetry());
   }

   
   @Test
   public void testAllocationRetryWaitMillis() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.allocationRetryWaitMillis(8);
      assertTrue(type.getAllocationRetryWaitMillis() == 8);
      type.removeAllocationRetryWaitMillis();
      assertNull(type.getAllocationRetryWaitMillis());
   }

   
   @Test
   public void testXaResourceTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.xaResourceTimeout(8);
      assertTrue(type.getXaResourceTimeout() == 8);
      type.removeXaResourceTimeout();
      assertNull(type.getXaResourceTimeout());
   }
}
