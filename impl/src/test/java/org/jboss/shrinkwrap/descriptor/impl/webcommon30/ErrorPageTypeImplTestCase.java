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

import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ErrorPageTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType",
            provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType",
            provider.getRootNode());
      type.setLocation("test");
      assertEquals(type.getLocation(), "test");
      type.removeLocation();
      assertNull(type.getLocation());
   }

   @Test
   public void testErrorCode() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType",
            provider.getRootNode());
      type.setErrorCode(8);
      assertTrue(type.getErrorCode() == 8);
      type.removeErrorCode();
      assertNull(type.getErrorCode());
   }

   @Test
   public void testExceptionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ErrorPageType<TestDescriptorImpl> type = new ErrorPageTypeImpl<TestDescriptorImpl>(provider, "error-pageType",
            provider.getRootNode());
      type.setExceptionType("test");
      assertEquals(type.getExceptionType(), "test");
      type.removeExceptionType();
      assertNull(type.getExceptionType());
   }
}
