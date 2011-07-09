package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;

public class EnvEntryTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnvEntryType<TestDescriptorImpl> type = new EnvEntryTypeImpl<TestDescriptorImpl>(provider, "env-entryType", provider.getRootNode());
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
   public void testEnvEntryName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnvEntryType<TestDescriptorImpl> type = new EnvEntryTypeImpl<TestDescriptorImpl>(provider, "env-entryType", provider.getRootNode());
      type.setEnvEntryName("test");
      assertEquals(type.getEnvEntryName(), "test");
      type.removeEnvEntryName();
      assertNull(type.getEnvEntryName());
   }

   
   @Test
   public void testEnvEntryType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnvEntryType<TestDescriptorImpl> type = new EnvEntryTypeImpl<TestDescriptorImpl>(provider, "env-entryType", provider.getRootNode());
      type.setEnvEntryType("test");
      assertEquals(type.getEnvEntryType(), "test");
      type.removeEnvEntryType();
      assertNull(type.getEnvEntryType());
   }

   
   @Test
   public void testEnvEntryValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnvEntryType<TestDescriptorImpl> type = new EnvEntryTypeImpl<TestDescriptorImpl>(provider, "env-entryType", provider.getRootNode());
      type.setEnvEntryValue("test");
      assertEquals(type.getEnvEntryValue(), "test");
      type.removeEnvEntryValue();
      assertNull(type.getEnvEntryValue());
   }
}
