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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ResourceManagerTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
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
   public void testResName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
      type.setResName("test");
      assertEquals(type.getResName(), "test");
      type.removeResName();
      assertNull(type.getResName());
   }

   @Test
   public void testResJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
      type.setResJndiName("test");
      assertEquals(type.getResJndiName(), "test");
      type.removeResJndiName();
      assertNull(type.getResJndiName());
   }

   @Test
   public void testResUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
      type.setResUrl("test");
      assertEquals(type.getResUrl(), "test");
      type.removeResUrl();
      assertNull(type.getResUrl());
   }

   @Test
   public void testResClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagerType<TestDescriptorImpl> type = new ResourceManagerTypeImpl<TestDescriptorImpl>(provider,
            "resource-managerType", provider.getRootNode());
      type.setResClass("test");
      assertEquals(type.getResClass(), "test");
      type.removeResClass();
      assertNull(type.getResClass());
   }
}
