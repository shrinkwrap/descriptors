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
package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ServiceRefProtocolBindingListTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefProtocolBindingListType<TestDescriptorImpl> type = new ServiceRefProtocolBindingListTypeImpl<TestDescriptorImpl>(
            provider, "service-ref_protocol-bindingListType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testProtocolBindingType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefProtocolBindingListType<TestDescriptorImpl> type = new ServiceRefProtocolBindingListTypeImpl<TestDescriptorImpl>(
            provider, "service-ref_protocol-bindingListType", provider.getRootNode());
      type.setProtocolBindingType("value1");
      type.setProtocolBindingType("value2");
      type.setProtocolBindingTypeList("value3", "value4");
      assertTrue(type.getProtocolBindingTypeList().size() == 4);
      assertEquals(type.getProtocolBindingTypeList().get(0), "value1");
      assertEquals(type.getProtocolBindingTypeList().get(1), "value2");
      assertEquals(type.getProtocolBindingTypeList().get(2), "value3");
      assertEquals(type.getProtocolBindingTypeList().get(3), "value4");
      type.removeAllProtocolBindingType();
      assertTrue(type.getProtocolBindingTypeList().size() == 0);
   }
}
