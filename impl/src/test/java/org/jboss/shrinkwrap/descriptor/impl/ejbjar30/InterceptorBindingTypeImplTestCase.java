/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class InterceptorBindingTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
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
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   @Test
   public void testExcludeDefaultInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      type.setExcludeDefaultInterceptors(true);
      assertTrue(type.isExcludeDefaultInterceptors());
      type.removeExcludeDefaultInterceptors();
      assertFalse(type.isExcludeDefaultInterceptors());
   }

   @Test
   public void testExcludeClassInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      type.setExcludeClassInterceptors(true);
      assertTrue(type.isExcludeClassInterceptors());
      type.removeExcludeClassInterceptors();
      assertFalse(type.isExcludeClassInterceptors());
   }

   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      type.method().up();
      type.removeMethod();
      assertNull(provider.getRootNode().getSingle("method"));
   }

   @Test
   public void testInterceptorClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
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
      InterceptorBindingType<TestDescriptorImpl> type = new InterceptorBindingTypeImpl<TestDescriptorImpl>(provider,
            "interceptor-bindingType", provider.getRootNode());
      type.interceptorOrder().up();
      type.removeInterceptorOrder();
      assertNull(provider.getRootNode().getSingle("interceptor-order"));
   }
}
