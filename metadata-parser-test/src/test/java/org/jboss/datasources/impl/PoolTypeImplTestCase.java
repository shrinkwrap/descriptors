package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.PoolType;
import java.util.ArrayList;
import java.util.List;
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
