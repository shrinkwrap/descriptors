package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentLockTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AccessTimeoutTypeImpl;

public class ConcurrentMethodTypeImplTestCase
{   
   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider, "concurrent-methodType", provider.getRootNode());
      type.method().up();
      type.removeMethod();
      assertNull(provider.getRootNode().getSingle("method"));
   }

   
   @Test
   public void testLock() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider, "concurrent-methodType", provider.getRootNode());
      for(ConcurrentLockTypeType e: ConcurrentLockTypeType.values())
      {
         type.setLock(e);
         assertEquals(type.getLock(), e);
         type.setLock(e.toString());
         assertEquals(type.getLockAsString(), e.toString());
      }
   }

   
   @Test
   public void testAccessTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider, "concurrent-methodType", provider.getRootNode());
      type.accessTimeout().up();
      type.removeAccessTimeout();
      assertNull(provider.getRootNode().getSingle("access-timeout"));
   }
}
