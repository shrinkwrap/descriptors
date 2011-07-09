package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorBindingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.InterceptorOrderTypeImpl;

public class InterceptorBindingTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
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
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testExcludeDefaultInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.setExcludeDefaultInterceptors(true);
      assertTrue(type.isExcludeDefaultInterceptors());
   }

   
   @Test
   public void testExcludeClassInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.setExcludeClassInterceptors(true);
      assertTrue(type.isExcludeClassInterceptors());
   }

   
   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.method().up();
      type.removeMethod();
      assertNull(provider.getRootNode().getSingle("method"));
   }

   
   @Test
   public void testInterceptorClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.setInterceptorClass("value1");
      type.setInterceptorClass("value2");
      type.setInterceptorClassList("value3", "value4");
      assertTrue(type.getInterceptorClassList().size() == 4);
      assertEquals(type.getInterceptorClassList().get(0), "value1");
      assertEquals(type.getInterceptorClassList().get(1), "value2");
      assertEquals(type.getInterceptorClassList().get(2), "value3");
      assertEquals(type.getInterceptorClassList().get(3), "value4");
      type.removeAllInterceptorClass();
      assertTrue(type.getInterceptorClassList().size() == 0);
   }

   
   @Test
   public void testInterceptorOrder() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider, "interceptor-bindingType", provider.getRootNode());
      type.interceptorOrder().up();
      type.removeInterceptorOrder();
      assertNull(provider.getRootNode().getSingle("interceptor-order"));
   }
}
