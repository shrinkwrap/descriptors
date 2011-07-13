package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingOrderingTypeImpl;

public class OrderingTypeImplTestCase
{   
   @Test
   public void testAfter() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      OrderingType<TestDescriptorImpl> type = new OrderingTypeImpl<TestDescriptorImpl>(provider, "orderingType", provider.getRootNode());
      type.after().up();
      type.removeAfter();
      assertNull(provider.getRootNode().getSingle("after"));
   }

   
   @Test
   public void testBefore() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      OrderingType<TestDescriptorImpl> type = new OrderingTypeImpl<TestDescriptorImpl>(provider, "orderingType", provider.getRootNode());
      type.before().up();
      type.removeBefore();
      assertNull(provider.getRootNode().getSingle("before"));
   }
}
