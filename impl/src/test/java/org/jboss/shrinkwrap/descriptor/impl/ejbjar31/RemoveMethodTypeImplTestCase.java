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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class RemoveMethodTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoveMethodType<TestDescriptorImpl> type = new RemoveMethodTypeImpl<TestDescriptorImpl>(provider,
            "remove-methodType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testBeanMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoveMethodType<TestDescriptorImpl> type = new RemoveMethodTypeImpl<TestDescriptorImpl>(provider,
            "remove-methodType", provider.getRootNode());
      type.beanMethod().up();
      type.removeBeanMethod();
      assertNull(provider.getRootNode().getSingle("bean-method"));
   }

   @Test
   public void testRetainIfException() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoveMethodType<TestDescriptorImpl> type = new RemoveMethodTypeImpl<TestDescriptorImpl>(provider,
            "remove-methodType", provider.getRootNode());
      type.setRetainIfException(true);
      assertTrue(type.isRetainIfException());
      type.removeRetainIfException();
      assertFalse(type.isRetainIfException());
   }
}
