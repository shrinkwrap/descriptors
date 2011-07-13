package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class MethodParamsTypeImplTestCase
{   
   @Test
   public void testMethodParam() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodParamsType<TestDescriptorImpl> type = new MethodParamsTypeImpl<TestDescriptorImpl>(provider, "method-paramsType", provider.getRootNode());
      type.setMethodParam("value1");
      type.setMethodParam("value2");
      type.setMethodParamList("value3", "value4");
      assertTrue(type.getMethodParamList().size() == 4);
      assertEquals(type.getMethodParamList().get(0), "value1");
      assertEquals(type.getMethodParamList().get(1), "value2");
      assertEquals(type.getMethodParamList().get(2), "value3");
      assertEquals(type.getMethodParamList().get(3), "value4");
      type.removeAllMethodParam();
      assertTrue(type.getMethodParamList().size() == 0);
   }
}
