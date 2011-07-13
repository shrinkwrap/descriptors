package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;

public class EjbRefTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
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
   public void testEjbRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
      type.setEjbRefName("test");
      assertEquals(type.getEjbRefName(), "test");
      type.removeEjbRefName();
      assertNull(type.getEjbRefName());
   }

   
   @Test
   public void testEjbRefType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
      for(EjbRefTypeType e: EjbRefTypeType.values())
      {
         type.setEjbRefType(e);
         assertEquals(type.getEjbRefType(), e);
         type.setEjbRefType(e.toString());
         assertEquals(type.getEjbRefTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
      type.setHome("test");
      assertEquals(type.getHome(), "test");
      type.removeHome();
      assertNull(type.getHome());
   }

   
   @Test
   public void testRemote() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
      type.setRemote("test");
      assertEquals(type.getRemote(), "test");
      type.removeRemote();
      assertNull(type.getRemote());
   }

   
   @Test
   public void testEjbLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRefType<TestDescriptorImpl> type = new EjbRefTypeImpl<TestDescriptorImpl>(provider, "ejb-refType", provider.getRootNode());
      type.setEjbLink("test");
      assertEquals(type.getEjbLink(), "test");
      type.removeEjbLink();
      assertNull(type.getEjbLink());
   }
}
