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
package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationUsageType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;

public class MessageDestinationRefTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }
   
   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
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
   public void testMessageDestinationRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      type.setMessageDestinationRefName("test");
      assertEquals(type.getMessageDestinationRefName(), "test");
      type.removeMessageDestinationRefName();
      assertNull(type.getMessageDestinationRefName());
   }

   
   @Test
   public void testMessageDestinationType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      type.setMessageDestinationType("test");
      assertEquals(type.getMessageDestinationType(), "test");
      type.removeMessageDestinationType();
      assertNull(type.getMessageDestinationType());
   }

   
   @Test
   public void testMessageDestinationUsage() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      for(MessageDestinationUsageType e: MessageDestinationUsageType.values())
      {
         type.setMessageDestinationUsage(e);
         assertEquals(type.getMessageDestinationUsage(), e);
         type.setMessageDestinationUsage(e.toString());
         assertEquals(type.getMessageDestinationUsageAsString(), e.toString());
      }
   }

   
   @Test
   public void testMessageDestinationLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationRefType<TestDescriptorImpl> type = new MessageDestinationRefTypeImpl<TestDescriptorImpl>(provider, "message-destination-refType", provider.getRootNode());
      type.setMessageDestinationLink("test");
      assertEquals(type.getMessageDestinationLink(), "test");
      type.removeMessageDestinationLink();
      assertNull(type.getMessageDestinationLink());
   }
}
