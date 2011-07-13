package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;

public class ResourceRefTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
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
   public void testResRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setResRefName("test");
      assertEquals(type.getResRefName(), "test");
      type.removeResRefName();
      assertNull(type.getResRefName());
   }

   
   @Test
   public void testResType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setResType("test");
      assertEquals(type.getResType(), "test");
      type.removeResType();
      assertNull(type.getResType());
   }

   
   @Test
   public void testResAuth() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      for(ResAuthType e: ResAuthType.values())
      {
         type.setResAuth(e);
         assertEquals(type.getResAuth(), e);
         type.setResAuth(e.toString());
         assertEquals(type.getResAuthAsString(), e.toString());
      }
   }

   
   @Test
   public void testResSharingScope() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      for(ResSharingScopeType e: ResSharingScopeType.values())
      {
         type.setResSharingScope(e);
         assertEquals(type.getResSharingScope(), e);
         type.setResSharingScope(e.toString());
         assertEquals(type.getResSharingScopeAsString(), e.toString());
      }
   }

   
   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }

   
   @Test
   public void testIgnoreDependency() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.ignoreDependency();
      assertTrue(type.isIgnoreDependency());
   }

   
   @Test
   public void testResourceName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setResourceName("test");
      assertEquals(type.getResourceName(), "test");
      type.removeResourceName();
      assertNull(type.getResourceName());
   }

   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setJndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testResUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider, "resource-refType", provider.getRootNode());
      type.setResUrl("test");
      assertEquals(type.getResUrl(), "test");
      type.removeResUrl();
      assertNull(type.getResUrl());
   }
}
