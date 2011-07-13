package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ResourceManagerTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider, "resource-managerType", provider.getRootNode());
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
   public void testResName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider, "resource-managerType", provider.getRootNode());
      type.setResName("test");
      assertEquals(type.getResName(), "test");
      type.removeResName();
      assertNull(type.getResName());
   }

   
   @Test
   public void testResJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider, "resource-managerType", provider.getRootNode());
      type.setResJndiName("test");
      assertEquals(type.getResJndiName(), "test");
      type.removeResJndiName();
      assertNull(type.getResJndiName());
   }

   
   @Test
   public void testResUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider, "resource-managerType", provider.getRootNode());
      type.setResUrl("test");
      assertEquals(type.getResUrl(), "test");
      type.removeResUrl();
      assertNull(type.getResUrl());
   }

   
   @Test
   public void testResClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider, "resource-managerType", provider.getRootNode());
      type.setResClass("test");
      assertEquals(type.getResClass(), "test");
      type.removeResClass();
      assertNull(type.getResClass());
   }
}
