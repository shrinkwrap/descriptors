package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.TimeoutType;
import java.util.ArrayList;
import java.util.List;
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
   public void testSetTxQueryTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.setTxQueryTimeout();
      assertTrue(type.isSetTxQueryTimeout());
      type.removeSetTxQueryTimeout();
      assertFalse(type.isSetTxQueryTimeout());
   }

   
   @Test
   public void testQueryTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.queryTimeout(8);
      assertTrue(type.getQueryTimeout() == 8);
      type.removeQueryTimeout();
      assertNull(type.getQueryTimeout());
   }

   
   @Test
   public void testUseTryLock() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      TimeoutType<TestDescriptorImpl> type = new TimeoutTypeImpl<TestDescriptorImpl>(provider, "timeoutType", provider.getRootNode());
      type.useTryLock(8);
      assertTrue(type.getUseTryLock() == 8);
      type.removeUseTryLock();
      assertNull(type.getUseTryLock());
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
      type.xaResourceTimeout("test");
      assertEquals(type.getXaResourceTimeout(), "test");
      type.removeXaResourceTimeout();
      assertNull(type.getXaResourceTimeout());
   }
}
