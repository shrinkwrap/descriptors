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
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentLockTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ConcurrentMethodTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider,
            "concurrent-methodType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider,
            "concurrent-methodType", provider.getRootNode());
      type.method().up();
      type.removeMethod();
      assertNull(provider.getRootNode().getSingle("method"));
   }

   @Test
   public void testLock() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider,
            "concurrent-methodType", provider.getRootNode());
      for (ConcurrentLockTypeType e : ConcurrentLockTypeType.values())
      {
         type.setLock(e);
         assertEquals(type.getLock(), e);
         type.setLock(e.toString());
         assertEquals(type.getLockAsString(), e.toString());
      }
   }

   @Test
   public void testAccessTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConcurrentMethodType<TestDescriptorImpl> type = new ConcurrentMethodTypeImpl<TestDescriptorImpl>(provider,
            "concurrent-methodType", provider.getRootNode());
      type.accessTimeout().up();
      type.removeAccessTimeout();
      assertNull(provider.getRootNode().getSingle("access-timeout"));
   }
}