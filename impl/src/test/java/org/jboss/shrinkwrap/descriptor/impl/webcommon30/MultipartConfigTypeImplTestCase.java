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
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class MultipartConfigTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider,
            "multipart-configType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider,
            "multipart-configType", provider.getRootNode());
      type.setLocation("test");
      assertEquals(type.getLocation(), "test");
      type.removeLocation();
      assertNull(type.getLocation());
   }

   @Test
   public void testMaxFileSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider,
            "multipart-configType", provider.getRootNode());
      type.setMaxFileSize(8L);
      assertTrue(type.getMaxFileSize() == 8L);
      type.removeMaxFileSize();
      assertNull(type.getMaxFileSize());
   }

   @Test
   public void testMaxRequestSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider,
            "multipart-configType", provider.getRootNode());
      type.setMaxRequestSize(8L);
      assertTrue(type.getMaxRequestSize() == 8L);
      type.removeMaxRequestSize();
      assertNull(type.getMaxRequestSize());
   }

   @Test
   public void testFileSizeThreshold() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MultipartConfigType<TestDescriptorImpl> type = new MultipartConfigTypeImpl<TestDescriptorImpl>(provider,
            "multipart-configType", provider.getRootNode());
      type.setFileSizeThreshold(8);
      assertTrue(type.getFileSizeThreshold() == 8);
      type.removeFileSizeThreshold();
      assertNull(type.getFileSizeThreshold());
   }
}
