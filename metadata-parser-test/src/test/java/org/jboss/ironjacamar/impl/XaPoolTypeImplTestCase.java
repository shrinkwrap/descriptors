package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class XaPoolTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testMinPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.minPoolSize(8);
      assertTrue(type.getMinPoolSize() == 8);
      type.removeMinPoolSize();
      assertNull(type.getMinPoolSize());
   }

   
   @Test
   public void testMaxPoolSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.maxPoolSize(8);
      assertTrue(type.getMaxPoolSize() == 8);
      type.removeMaxPoolSize();
      assertNull(type.getMaxPoolSize());
   }

   
   @Test
   public void testPrefill() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.prefill(true);
      assertTrue(type.isPrefill());
      type.removePrefill();
      assertFalse(type.isPrefill());
   }

   
   @Test
   public void testUseStrictMin() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.useStrictMin(true);
      assertTrue(type.isUseStrictMin());
      type.removeUseStrictMin();
      assertFalse(type.isUseStrictMin());
   }

   
   @Test
   public void testFlushStrategy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.flushStrategy("test");
      assertEquals(type.getFlushStrategy(), "test");
      type.removeFlushStrategy();
      assertNull(type.getFlushStrategy());
   }

   
   @Test
   public void testIsSameRmOverride() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.isSameRmOverride(true);
      assertTrue(type.isIsSameRmOverride());
      type.removeIsSameRmOverride();
      assertFalse(type.isIsSameRmOverride());
   }

   
   @Test
   public void testInterleaving() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.interleaving();
      assertTrue(type.isInterleaving());
      type.removeInterleaving();
      assertFalse(type.isInterleaving());
   }

   
   @Test
   public void testNoTxSeparatePools() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.noTxSeparatePools();
      assertTrue(type.isNoTxSeparatePools());
      type.removeNoTxSeparatePools();
      assertFalse(type.isNoTxSeparatePools());
   }

   
   @Test
   public void testPadXid() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.padXid(true);
      assertTrue(type.isPadXid());
      type.removePadXid();
      assertFalse(type.isPadXid());
   }

   
   @Test
   public void testWrapXaResource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.wrapXaResource(true);
      assertTrue(type.isWrapXaResource());
      type.removeWrapXaResource();
      assertFalse(type.isWrapXaResource());
   }
}
