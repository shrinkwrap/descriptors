package org.jboss.shrinkwrap.descriptor.impl.application5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application5.Application5Descriptor;
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

public class Application5DescriptorImplTestCase
{   
   @Test
   public void testModule() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.module().up();
      type.module().up();
      assertTrue(type.getModuleList().size() == 2);
      type.removeAllModule();
      assertTrue(type.getModuleList().size() == 0);
   }
   
   @Test
   public void testSecurityRole() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.securityRole().up();
      type.securityRole().up();
      assertTrue(type.getSecurityRoleList().size() == 2);
      type.removeAllSecurityRole();
      assertTrue(type.getSecurityRoleList().size() == 0);
   }
   
   @Test
   public void testLibraryDirectory() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.setLibraryDirectory("test");
      assertEquals(type.getLibraryDirectory(), "test");
      type.removeLibraryDirectory();
      assertNull(type.getLibraryDirectory());
   }
   
   @Test
   public void testVersion() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }
   
   @Test
   public void testDescription() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
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
   public void testDisplayName() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      Application5Descriptor type = Descriptors.create(Application5Descriptor.class);
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
}
