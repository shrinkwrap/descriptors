package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class PropertyImplTestCase
{   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      Property<TestDescriptorImpl> type = new PropertyImpl<TestDescriptorImpl>(provider, "property", provider.getRootNode());
      type.setName("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      Property<TestDescriptorImpl> type = new PropertyImpl<TestDescriptorImpl>(provider, "property", provider.getRootNode());
      type.setValue("test");
      assertEquals(type.getValue(), "test");
      type.removeValue();
      assertNull(type.getValue());
   }
}
