package org.jboss.shrinkwrap.descriptor.impl.application5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application5.ApplicationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import org.jboss.shrinkwrap.descriptor.impl.application5.ModuleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

public class ApplicationTypeImplTestCase
{   
   @Test
   public void testModule() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.module().up();
      type.module().up();
      assertTrue(type.getModuleList().size() == 2);
      type.removeAllModule();
      assertTrue(type.getModuleList().size() == 0);
   }

   
   @Test
   public void testSecurityRole() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.securityRole().up();
      type.securityRole().up();
      assertTrue(type.getSecurityRoleList().size() == 2);
      type.removeAllSecurityRole();
      assertTrue(type.getSecurityRoleList().size() == 0);
   }

   
   @Test
   public void testLibraryDirectory() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.setLibraryDirectory("test");
      assertEquals(type.getLibraryDirectory(), "test");
      type.removeLibraryDirectory();
      assertNull(type.getLibraryDirectory());
   }

   
   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }
}
