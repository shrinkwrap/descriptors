package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class DependsOnTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DependsOnType<TestDescriptorImpl> type = new DependsOnTypeImpl<TestDescriptorImpl>(provider, "depends-onType", provider.getRootNode());
      type.setEjbName("value1");
      type.setEjbName("value2");
      type.setEjbNameList("value3", "value4");
      assertTrue(type.getEjbNameList().size() == 4);
      assertEquals(type.getEjbNameList().get(0), "value1");
      assertEquals(type.getEjbNameList().get(1), "value2");
      assertEquals(type.getEjbNameList().get(2), "value3");
      assertEquals(type.getEjbNameList().get(3), "value4");
      type.removeAllEjbName();
      assertTrue(type.getEjbNameList().size() == 0);
   }
}
