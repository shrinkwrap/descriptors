package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MethodParamsTypeImpl;

public class NamedMethodTypeImplTestCase
{   
   @Test
   public void testMethodName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      NamedMethodType<TestDescriptorImpl> type = new NamedMethodTypeImpl<TestDescriptorImpl>(provider, "named-methodType", provider.getRootNode());
      type.setMethodName("test");
      assertEquals(type.getMethodName(), "test");
      type.removeMethodName();
      assertNull(type.getMethodName());
   }

   
   @Test
   public void testMethodParams() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      NamedMethodType<TestDescriptorImpl> type = new NamedMethodTypeImpl<TestDescriptorImpl>(provider, "named-methodType", provider.getRootNode());
      type.methodParams().up();
      type.removeMethodParams();
      assertNull(provider.getRootNode().getSingle("method-params"));
   }
}
