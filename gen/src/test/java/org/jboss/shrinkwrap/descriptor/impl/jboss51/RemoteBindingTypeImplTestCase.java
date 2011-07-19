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

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.RemoteBindingType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class RemoteBindingTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
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
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
      type.setJndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }

   
   @Test
   public void testClientBindUrl() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
      type.setClientBindUrl("test");
      assertEquals(type.getClientBindUrl(), "test");
      type.removeClientBindUrl();
      assertNull(type.getClientBindUrl());
   }

   
   @Test
   public void testInterceptorStack() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
      type.setInterceptorStack("test");
      assertEquals(type.getInterceptorStack(), "test");
      type.removeInterceptorStack();
      assertNull(type.getInterceptorStack());
   }

   
   @Test
   public void testInvokerName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoteBindingType<TestDescriptorImpl> type = new RemoteBindingTypeImpl<TestDescriptorImpl>(provider, "remote-bindingType", provider.getRootNode());
      type.setInvokerName("test");
      assertEquals(type.getInvokerName(), "test");
      type.removeInvokerName();
      assertNull(type.getInvokerName());
   }
}
