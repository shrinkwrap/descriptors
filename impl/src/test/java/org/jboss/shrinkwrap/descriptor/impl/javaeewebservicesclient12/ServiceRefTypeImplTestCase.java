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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ServiceRefTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
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
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }

   @Test
   public void testIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }

   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }

   @Test
   public void testServiceRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setServiceRefName("test");
      assertEquals(type.getServiceRefName(), "test");
      type.removeServiceRefName();
      assertNull(type.getServiceRefName());
   }

   @Test
   public void testServiceInterface() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setServiceInterface("test");
      assertEquals(type.getServiceInterface(), "test");
      type.removeServiceInterface();
      assertNull(type.getServiceInterface());
   }

   @Test
   public void testServiceRefType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setServiceRefType("test");
      assertEquals(type.getServiceRefType(), "test");
      type.removeServiceRefType();
      assertNull(type.getServiceRefType());
   }

   @Test
   public void testWsdlFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setWsdlFile("test");
      assertEquals(type.getWsdlFile(), "test");
      type.removeWsdlFile();
      assertNull(type.getWsdlFile());
   }

   @Test
   public void testJaxrpcMappingFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setJaxrpcMappingFile("test");
      assertEquals(type.getJaxrpcMappingFile(), "test");
      type.removeJaxrpcMappingFile();
      assertNull(type.getJaxrpcMappingFile());
   }

   @Test
   public void testServiceQname() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.setServiceQname("test");
      assertEquals(type.getServiceQname(), "test");
      type.removeServiceQname();
      assertNull(type.getServiceQname());
   }

   @Test
   public void testPortComponentRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.portComponentRef().up();
      type.portComponentRef().up();
      assertTrue(type.getPortComponentRefList().size() == 2);
      type.removeAllPortComponentRef();
      assertTrue(type.getPortComponentRefList().size() == 0);
   }

   @Test
   public void testHandler() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.handler().up();
      type.handler().up();
      assertTrue(type.getHandlerList().size() == 2);
      type.removeAllHandler();
      assertTrue(type.getHandlerList().size() == 0);
   }

   @Test
   public void testHandlerChains() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType",
            provider.getRootNode());
      type.handlerChains().up();
      type.removeHandlerChains();
      assertNull(provider.getRootNode().getSingle("handler-chains"));
   }
}
