package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ProducerTypeImplTestCase
{   
   @Test
   public void testClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ProducerType<TestDescriptorImpl> type = new ProducerTypeImpl<TestDescriptorImpl>(provider, "producerType", provider.getRootNode());
      type.setClazz("test");
      assertEquals(type.getClazz(), "test");
      type.removeClazz();
      assertNull(type.getClazz());
   }

   
   @Test
   public void testConnectionFactory() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ProducerType<TestDescriptorImpl> type = new ProducerTypeImpl<TestDescriptorImpl>(provider, "producerType", provider.getRootNode());
      type.setConnectionFactory("test");
      assertEquals(type.getConnectionFactory(), "test");
      type.removeConnectionFactory();
      assertNull(type.getConnectionFactory());
   }
}
