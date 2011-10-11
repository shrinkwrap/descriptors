package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class ConfigPropertyTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConfigPropertyType<TestDescriptorImpl> type = new ConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "config-propertyType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConfigPropertyType<TestDescriptorImpl> type = new ConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "config-propertyType", provider.getRootNode());
      type.name("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }
}
