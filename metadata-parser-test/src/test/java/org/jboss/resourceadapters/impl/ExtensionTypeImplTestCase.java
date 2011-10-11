package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ExtensionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import org.jboss.resourceadapters.impl.ConfigPropertyTypeImpl;

public class ExtensionTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ExtensionType<TestDescriptorImpl> type = new ExtensionTypeImpl<TestDescriptorImpl>(provider, "extensionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ExtensionType<TestDescriptorImpl> type = new ExtensionTypeImpl<TestDescriptorImpl>(provider, "extensionType", provider.getRootNode());
      type.getOrCreateConfigProperty().up();
      type.removeConfigProperty();
      assertNull(provider.getRootNode().getSingle("config-property"));
   }

   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ExtensionType<TestDescriptorImpl> type = new ExtensionTypeImpl<TestDescriptorImpl>(provider, "extensionType", provider.getRootNode());
      type.className("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }
}
