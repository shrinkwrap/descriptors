package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class AuthConstraintTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AuthConstraintType<TestDescriptorImpl> type = new AuthConstraintTypeImpl<TestDescriptorImpl>(provider, "auth-constraintType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testRoleName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AuthConstraintType<TestDescriptorImpl> type = new AuthConstraintTypeImpl<TestDescriptorImpl>(provider, "auth-constraintType", provider.getRootNode());
      type.setRoleName("value1");
      type.setRoleName("value2");
      type.setRoleNameList("value3", "value4");
      assertTrue(type.getRoleNameList().size() == 4);
      assertEquals(type.getRoleNameList().get(0), "value1");
      assertEquals(type.getRoleNameList().get(1), "value2");
      assertEquals(type.getRoleNameList().get(2), "value3");
      assertEquals(type.getRoleNameList().get(3), "value4");
      type.removeAllRoleName();
      assertTrue(type.getRoleNameList().size() == 0);
   }
}
