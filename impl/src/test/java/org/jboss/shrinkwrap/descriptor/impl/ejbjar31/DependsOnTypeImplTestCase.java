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
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class DependsOnTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DependsOnType<TestDescriptorImpl> type = new DependsOnTypeImpl<TestDescriptorImpl>(provider, "depends-onType",
            provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DependsOnType<TestDescriptorImpl> type = new DependsOnTypeImpl<TestDescriptorImpl>(provider, "depends-onType",
            provider.getRootNode());
      type.setEjbName("value1");
      type.setEjbName("value2");
      type.setEjbNameList("value3", "value4");
      assertTrue(type.getEjbNameList().size() == 4);
      assertEquals(type.getEjbNameList().get(0), "value1");
      assertEquals(type.getEjbNameList().get(1), "value2");
      assertEquals(type.getEjbNameList().get(2), "value3");
      assertEquals(type.getEjbNameList().get(3), "value4");
      type.removeAllEjbName();
      assertTrue(type.getEjbNameList().size() == 0);
   }
}
