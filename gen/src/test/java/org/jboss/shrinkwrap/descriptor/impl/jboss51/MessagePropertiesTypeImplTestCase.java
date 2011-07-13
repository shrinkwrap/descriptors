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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodTypeImpl;

public class MessagePropertiesTypeImplTestCase
{   
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
   }
}
