package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ServiceRefProtocolBindingListTypeImplTestCase
{   
   @Test
   public void testProtocolBindingType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefProtocolBindingListType<TestDescriptorImpl> type = new ServiceRefProtocolBindingListTypeImpl<TestDescriptorImpl>(provider, "service-ref_protocol-bindingListType", provider.getRootNode());
      type.setProtocolBindingType("value1");
      type.setProtocolBindingType("value2");
      type.setProtocolBindingTypeList("value3", "value4");
      assertTrue(type.getProtocolBindingTypeList().size() == 4);
      assertEquals(type.getProtocolBindingTypeList().get(0), "value1");
      assertEquals(type.getProtocolBindingTypeList().get(1), "value2");
      assertEquals(type.getProtocolBindingTypeList().get(2), "value3");
      assertEquals(type.getProtocolBindingTypeList().get(3), "value4");
      type.removeAllProtocolBindingType();
      assertTrue(type.getProtocolBindingTypeList().size() == 0);
   }
}
