package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorOrderType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class InterceptorOrderTypeImplTestCase
{   
   @Test
   public void testInterceptorClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorOrderType<TestDescriptorImpl> type = new InterceptorOrderTypeImpl<TestDescriptorImpl>(provider, "interceptor-orderType", provider.getRootNode());
      type.setInterceptorClass("value1");
      type.setInterceptorClass("value2");
      type.setInterceptorClassList("value3", "value4");
      assertTrue(type.getInterceptorClassList().size() == 4);
      assertEquals(type.getInterceptorClassList().get(0), "value1");
      assertEquals(type.getInterceptorClassList().get(1), "value2");
      assertEquals(type.getInterceptorClassList().get(2), "value3");
      assertEquals(type.getInterceptorClassList().get(3), "value4");
      type.removeAllInterceptorClass();
      assertTrue(type.getInterceptorClassList().size() == 0);
   }
}
