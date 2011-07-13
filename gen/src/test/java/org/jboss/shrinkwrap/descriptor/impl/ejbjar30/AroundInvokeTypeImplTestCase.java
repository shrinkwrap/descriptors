package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AroundInvokeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class AroundInvokeTypeImplTestCase
{   
   @Test
   public void testClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AroundInvokeType<TestDescriptorImpl> type = new AroundInvokeTypeImpl<TestDescriptorImpl>(provider, "around-invokeType", provider.getRootNode());
      type.setClazz("test");
      assertEquals(type.getClazz(), "test");
      type.removeClazz();
      assertNull(type.getClazz());
   }

   
   @Test
   public void testMethodName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AroundInvokeType<TestDescriptorImpl> type = new AroundInvokeTypeImpl<TestDescriptorImpl>(provider, "around-invokeType", provider.getRootNode());
      type.setMethodName("test");
      assertEquals(type.getMethodName(), "test");
      type.removeMethodName();
      assertNull(type.getMethodName());
   }
}
