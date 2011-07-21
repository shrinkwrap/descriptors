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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ApplicationExceptionTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(
            provider, "application-exceptionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testExceptionClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(
            provider, "application-exceptionType", provider.getRootNode());
      type.setExceptionClass("test");
      assertEquals(type.getExceptionClass(), "test");
      type.removeExceptionClass();
      assertNull(type.getExceptionClass());
   }

   @Test
   public void testRollback() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(
            provider, "application-exceptionType", provider.getRootNode());
      type.setRollback(true);
      assertTrue(type.isRollback());
      type.removeRollback();
      assertFalse(type.isRollback());
   }

   @Test
   public void testInherited() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationExceptionType<TestDescriptorImpl> type = new ApplicationExceptionTypeImpl<TestDescriptorImpl>(
            provider, "application-exceptionType", provider.getRootNode());
      type.setInherited(true);
      assertTrue(type.isInherited());
      type.removeInherited();
      assertFalse(type.isInherited());
   }
}
