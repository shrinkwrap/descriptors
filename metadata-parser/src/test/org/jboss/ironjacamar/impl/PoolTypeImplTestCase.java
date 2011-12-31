package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.PoolType;
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
   public void testPrefill() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.getOrCreatePrefill().up();
      type.removePrefill();
      assertNull(provider.getRootNode().getSingle("prefill"));
   }

   
   @Test
   public void testUseStrictMin() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolType<TestDescriptorImpl> type = new PoolTypeImpl<TestDescriptorImpl>(provider, "poolType", provider.getRootNode());
      type.getOrCreateUseStrictMin().up();
      type.removeUseStrictMin();
      assertNull(provider.getRootNode().getSingle("use-strict-min"));
   }
}
