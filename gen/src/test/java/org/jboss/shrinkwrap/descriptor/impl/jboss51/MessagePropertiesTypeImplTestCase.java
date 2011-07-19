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
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodTypeImpl;

public class MessagePropertiesTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessagePropertiesType<TestDescriptorImpl> type = new MessagePropertiesTypeImpl<TestDescriptorImpl>(provider, "message-propertiesType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessagePropertiesType<TestDescriptorImpl> type = new MessagePropertiesTypeImpl<TestDescriptorImpl>(provider, "message-propertiesType", provider.getRootNode());
      type.setClazz("test");
      assertEquals(type.getClazz(), "test");
      type.removeClazz();
      assertNull(type.getClazz());
   }

   
   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessagePropertiesType<TestDescriptorImpl> type = new MessagePropertiesTypeImpl<TestDescriptorImpl>(provider, "message-propertiesType", provider.getRootNode());
      type.method().up();
      type.removeMethod();
      assertNull(provider.getRootNode().getSingle("method"));
   }

   
   @Test
   public void testDelivery() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessagePropertiesType<TestDescriptorImpl> type = new MessagePropertiesTypeImpl<TestDescriptorImpl>(provider, "message-propertiesType", provider.getRootNode());
      type.setDelivery("test");
      assertEquals(type.getDelivery(), "test");
      type.removeDelivery();
      assertNull(type.getDelivery());
   }

   
   @Test
   public void testPriority() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessagePropertiesType<TestDescriptorImpl> type = new MessagePropertiesTypeImpl<TestDescriptorImpl>(provider, "message-propertiesType", provider.getRootNode());
      type.setPriority(8);
      assertTrue(type.getPriority() == 8);
      type.removePriority();
      assertNull(type.getPriority());
   }
}
