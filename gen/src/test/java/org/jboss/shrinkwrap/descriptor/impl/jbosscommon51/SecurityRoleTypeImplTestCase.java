package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.SecurityRoleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class SecurityRoleTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityRoleType<TestDescriptorImpl> type = new SecurityRoleTypeImpl<TestDescriptorImpl>(provider, "security-roleType", provider.getRootNode());
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
      SecurityRoleType<TestDescriptorImpl> type = new SecurityRoleTypeImpl<TestDescriptorImpl>(provider, "security-roleType", provider.getRootNode());
      type.setRoleName("test");
      assertEquals(type.getRoleName(), "test");
      type.removeRoleName();
      assertNull(type.getRoleName());
   }

   
   @Test
   public void testPrincipalName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityRoleType<TestDescriptorImpl> type = new SecurityRoleTypeImpl<TestDescriptorImpl>(provider, "security-roleType", provider.getRootNode());
      type.setPrincipalName("value1");
      type.setPrincipalName("value2");
      type.setPrincipalNameList("value3", "value4");
      assertTrue(type.getPrincipalNameList().size() == 4);
      assertEquals(type.getPrincipalNameList().get(0), "value1");
      assertEquals(type.getPrincipalNameList().get(1), "value2");
      assertEquals(type.getPrincipalNameList().get(2), "value3");
      assertEquals(type.getPrincipalNameList().get(3), "value4");
      type.removeAllPrincipalName();
      assertTrue(type.getPrincipalNameList().size() == 0);
   }
}
