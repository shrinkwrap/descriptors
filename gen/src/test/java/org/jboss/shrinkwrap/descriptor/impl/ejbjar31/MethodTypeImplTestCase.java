package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodIntfType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MethodParamsTypeImpl;

public class MethodTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
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
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testMethodIntf() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      for(MethodIntfType e: MethodIntfType.values())
      {
         type.setMethodIntf(e);
         assertEquals(type.getMethodIntf(), e);
         type.setMethodIntf(e.toString());
         assertEquals(type.getMethodIntfAsString(), e.toString());
      }
   }

   
   @Test
   public void testMethodName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.setMethodName("test");
      assertEquals(type.getMethodName(), "test");
      type.removeMethodName();
      assertNull(type.getMethodName());
   }

   
   @Test
   public void testMethodParams() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider.getRootNode());
      type.methodParams().up();
      type.removeMethodParams();
      assertNull(provider.getRootNode().getSingle("method-params"));
   }
}
