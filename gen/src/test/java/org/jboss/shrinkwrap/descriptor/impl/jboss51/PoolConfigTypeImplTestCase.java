package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class PoolConfigTypeImplTestCase
{   
   @Test
   public void testPoolValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType", provider.getRootNode());
      type.setPoolValue("test");
      assertEquals(type.getPoolValue(), "test");
      type.removePoolValue();
      assertNull(type.getPoolValue());
   }

   
   @Test
   public void testPoolMaxSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType", provider.getRootNode());
      type.setPoolMaxSize(8);
      assertTrue(type.getPoolMaxSize() == 8);
   }

   
   @Test
   public void testPoolTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PoolConfigType<TestDescriptorImpl> type = new PoolConfigTypeImpl<TestDescriptorImpl>(provider, "pool-configType", provider.getRootNode());
      type.setPoolTimeout(8);
      assertTrue(type.getPoolTimeout() == 8);
   }
}
