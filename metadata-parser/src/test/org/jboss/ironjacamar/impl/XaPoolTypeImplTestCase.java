package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.XaPoolType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
   public void testIsSameRmOverride() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.getOrCreateIsSameRmOverride().up();
      type.removeIsSameRmOverride();
      assertNull(provider.getRootNode().getSingle("is-same-rm-override"));
   }

   
   @Test
   public void testInterleaving() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.getOrCreateInterleaving().up();
      type.removeInterleaving();
      assertNull(provider.getRootNode().getSingle("interleaving"));
   }

   
   @Test
   public void testNoTxSeparatePools() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.getOrCreateNoTxSeparatePools().up();
      type.removeNoTxSeparatePools();
      assertNull(provider.getRootNode().getSingle("no-tx-separate-pools"));
   }

   
   @Test
   public void testPadXid() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.getOrCreatePadXid().up();
      type.removePadXid();
      assertNull(provider.getRootNode().getSingle("pad-xid"));
   }

   
   @Test
   public void testWrapXaResource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      XaPoolType<TestDescriptorImpl> type = new XaPoolTypeImpl<TestDescriptorImpl>(provider, "xa-poolType", provider.getRootNode());
      type.getOrCreateWrapXaResource().up();
      type.removeWrapXaResource();
      assertNull(provider.getRootNode().getSingle("wrap-xa-resource"));
   }
}
