package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.BeanValidationGroupsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class BeanValidationGroupsTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      BeanValidationGroupsType<TestDescriptorImpl> type = new BeanValidationGroupsTypeImpl<TestDescriptorImpl>(provider, "bean-validation-groupsType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testBeanValidationGroup() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      BeanValidationGroupsType<TestDescriptorImpl> type = new BeanValidationGroupsTypeImpl<TestDescriptorImpl>(provider, "bean-validation-groupsType", provider.getRootNode());
      type.beanValidationGroup("value1");
      type.beanValidationGroup("value2");
      type.beanValidationGroup("value3", "value4");
      assertTrue(type.getAllBeanValidationGroup().size() == 4);
      assertEquals(type.getAllBeanValidationGroup().get(0), "value1");
      assertEquals(type.getAllBeanValidationGroup().get(1), "value2");
      assertEquals(type.getAllBeanValidationGroup().get(2), "value3");
      assertEquals(type.getAllBeanValidationGroup().get(3), "value4");
      type.removeAllBeanValidationGroup();
      assertTrue(type.getAllBeanValidationGroup().size() == 0);
   }
}
