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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class InjectionTargetTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InjectionTargetType<TestDescriptorImpl> type = new InjectionTargetTypeImpl<TestDescriptorImpl>(provider,
            "injection-targetType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testInjectionTargetClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InjectionTargetType<TestDescriptorImpl> type = new InjectionTargetTypeImpl<TestDescriptorImpl>(provider,
            "injection-targetType", provider.getRootNode());
      type.setInjectionTargetClass("test");
      assertEquals(type.getInjectionTargetClass(), "test");
      type.removeInjectionTargetClass();
      assertNull(type.getInjectionTargetClass());
   }

   @Test
   public void testInjectionTargetName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InjectionTargetType<TestDescriptorImpl> type = new InjectionTargetTypeImpl<TestDescriptorImpl>(provider,
            "injection-targetType", provider.getRootNode());
      type.setInjectionTargetName("test");
      assertEquals(type.getInjectionTargetName(), "test");
      type.removeInjectionTargetName();
      assertNull(type.getInjectionTargetName());
   }
}
