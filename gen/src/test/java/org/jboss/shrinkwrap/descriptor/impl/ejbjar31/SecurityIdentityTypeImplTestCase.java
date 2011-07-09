package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;

public class SecurityIdentityTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider, "security-identityType", provider.getRootNode());
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
   public void testUseCallerIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider, "security-identityType", provider.getRootNode());
      type.useCallerIdentity();
      assertTrue(type.isUseCallerIdentity());
   }

   
   @Test
   public void testRunAs() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider, "security-identityType", provider.getRootNode());
      type.runAs().up();
      type.removeRunAs();
      assertNull(provider.getRootNode().getSingle("run-as"));
   }
}
