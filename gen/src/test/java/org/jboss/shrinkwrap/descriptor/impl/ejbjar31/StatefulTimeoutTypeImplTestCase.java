package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;

public class StatefulTimeoutTypeImplTestCase
{   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatefulTimeoutType<TestDescriptorImpl> type = new StatefulTimeoutTypeImpl<TestDescriptorImpl>(provider, "stateful-timeoutType", provider.getRootNode());
      type.setTimeout(8);
      assertTrue(type.getTimeout() == 8);
   }

   
   @Test
   public void testUnit() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      StatefulTimeoutType<TestDescriptorImpl> type = new StatefulTimeoutTypeImpl<TestDescriptorImpl>(provider, "stateful-timeoutType", provider.getRootNode());
      for(TimeUnitTypeType e: TimeUnitTypeType.values())
      {
         type.setUnit(e);
         assertEquals(type.getUnit(), e);
         type.setUnit(e.toString());
         assertEquals(type.getUnitAsString(), e.toString());
      }
   }
}
