package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class MethodTypeImplTestCase
{   
   @Test
   public void testMethodName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setMethodName("test");
      assertEquals(type.getMethodName(), "test");
      type.removeMethodName();
      assertNull(type.getMethodName());
   }

   
   @Test
   public void testReadOnly() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setReadOnly(true);
      assertTrue(type.isReadOnly());
   }

   
   @Test
   public void testIdempotent() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setIdempotent(true);
      assertTrue(type.isIdempotent());
   }

   
   @Test
   public void testTransactionTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setTransactionTimeout("test");
      assertEquals(type.getTransactionTimeout(), "test");
      type.removeTransactionTimeout();
      assertNull(type.getTransactionTimeout());
   }
}
