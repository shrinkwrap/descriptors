package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class OrderingOrderingTypeImplTestCase
{   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      OrderingOrderingType<TestDescriptorImpl> type = new OrderingOrderingTypeImpl<TestDescriptorImpl>(provider, "ordering-orderingType", provider.getRootNode());
      type.setName("value1");
      type.setName("value2");
      type.setNameList("value3", "value4");
      assertTrue(type.getNameList().size() == 4);
      assertEquals(type.getNameList().get(0), "value1");
      assertEquals(type.getNameList().get(1), "value2");
      assertEquals(type.getNameList().get(2), "value3");
      assertEquals(type.getNameList().get(3), "value4");
      type.removeAllName();
      assertTrue(type.getNameList().size() == 0);
   }

   
   @Test
   public void testOthers() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      OrderingOrderingType<TestDescriptorImpl> type = new OrderingOrderingTypeImpl<TestDescriptorImpl>(provider, "ordering-orderingType", provider.getRootNode());
      type.others();
      assertTrue(type.isOthers());
   }
}
