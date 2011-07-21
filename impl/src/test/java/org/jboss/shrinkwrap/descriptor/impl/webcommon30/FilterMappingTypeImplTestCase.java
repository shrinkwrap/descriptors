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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.DispatcherType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class FilterMappingTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider,
            "filter-mappingType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testFilterName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider,
            "filter-mappingType", provider.getRootNode());
      type.setFilterName("test");
      assertEquals(type.getFilterName(), "test");
      type.removeFilterName();
      assertNull(type.getFilterName());
   }

   @Test
   public void testDispatcher() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider,
            "filter-mappingType", provider.getRootNode());
      for (DispatcherType e : DispatcherType.values())
      {
         type.setDispatcher(e);
         assertEquals(type.getDispatcher(), e);
         type.setDispatcher(e.toString());
         assertEquals(type.getDispatcherAsString(), e.toString());
      }
   }

   @Test
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider,
            "filter-mappingType", provider.getRootNode());
      type.setUrlPattern("test");
      assertEquals(type.getUrlPattern(), "test");
      type.removeUrlPattern();
      assertNull(type.getUrlPattern());
   }

   @Test
   public void testServletName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      FilterMappingType<TestDescriptorImpl> type = new FilterMappingTypeImpl<TestDescriptorImpl>(provider,
            "filter-mappingType", provider.getRootNode());
      type.setServletName("test");
      assertEquals(type.getServletName(), "test");
      type.removeServletName();
      assertNull(type.getServletName());
   }
}
