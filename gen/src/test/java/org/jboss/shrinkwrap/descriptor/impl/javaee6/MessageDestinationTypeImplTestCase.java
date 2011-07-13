package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class MessageDestinationTypeImplTestCase
{   
   @Test
   public void testMessageDestinationName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationType<TestDescriptorImpl> type = new MessageDestinationTypeImpl<TestDescriptorImpl>(provider, "message-destinationType", provider.getRootNode());
      type.setMessageDestinationName("test");
      assertEquals(type.getMessageDestinationName(), "test");
      type.removeMessageDestinationName();
      assertNull(type.getMessageDestinationName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationType<TestDescriptorImpl> type = new MessageDestinationTypeImpl<TestDescriptorImpl>(provider, "message-destinationType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testLookupName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDestinationType<TestDescriptorImpl> type = new MessageDestinationTypeImpl<TestDescriptorImpl>(provider, "message-destinationType", provider.getRootNode());
      type.setLookupName("test");
      assertEquals(type.getLookupName(), "test");
      type.removeLookupName();
      assertNull(type.getLookupName());
   }
}
