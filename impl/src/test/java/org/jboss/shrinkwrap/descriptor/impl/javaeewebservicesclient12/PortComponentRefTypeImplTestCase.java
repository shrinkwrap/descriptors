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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class PortComponentRefTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider,
            "port-component-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testServiceEndpointInterface() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider,
            "port-component-refType", provider.getRootNode());
      type.setServiceEndpointInterface("test");
      assertEquals(type.getServiceEndpointInterface(), "test");
      type.removeServiceEndpointInterface();
      assertNull(type.getServiceEndpointInterface());
   }

   @Test
   public void testEnableMtom() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider,
            "port-component-refType", provider.getRootNode());
      type.setEnableMtom(true);
      assertTrue(type.isEnableMtom());
      type.removeEnableMtom();
      assertFalse(type.isEnableMtom());
   }

   @Test
   public void testPortComponentLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider,
            "port-component-refType", provider.getRootNode());
      type.setPortComponentLink("test");
      assertEquals(type.getPortComponentLink(), "test");
      type.removePortComponentLink();
      assertNull(type.getPortComponentLink());
   }
}
