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
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class MethodTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider
            .getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testMethodName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider
            .getRootNode());
      type.setMethodName("test");
      assertEquals(type.getMethodName(), "test");
      type.removeMethodName();
      assertNull(type.getMethodName());
   }

   @Test
   public void testReadOnly() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider
            .getRootNode());
      type.setReadOnly(true);
      assertTrue(type.isReadOnly());
      type.removeReadOnly();
      assertFalse(type.isReadOnly());
   }

   @Test
   public void testIdempotent() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider
            .getRootNode());
      type.setIdempotent(true);
      assertTrue(type.isIdempotent());
      type.removeIdempotent();
      assertFalse(type.isIdempotent());
   }

   @Test
   public void testTransactionTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MethodType<TestDescriptorImpl> type = new MethodTypeImpl<TestDescriptorImpl>(provider, "methodType", provider
            .getRootNode());
      type.setTransactionTimeout("test");
      assertEquals(type.getTransactionTimeout(), "test");
      type.removeTransactionTimeout();
      assertNull(type.getTransactionTimeout());
   }
}
