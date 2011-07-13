package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationUsageType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;

public class MessageDestinationRefTypeImplTestCase
{   
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
