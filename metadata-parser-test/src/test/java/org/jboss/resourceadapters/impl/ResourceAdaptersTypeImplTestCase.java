package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ResourceAdaptersType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import org.jboss.resourceadapters.impl.ResourceAdapterTypeImpl;

public class ResourceAdaptersTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdaptersType<TestDescriptorImpl> type = new ResourceAdaptersTypeImpl<TestDescriptorImpl>(provider, "resource-adaptersType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testResourceAdapter() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdaptersType<TestDescriptorImpl> type = new ResourceAdaptersTypeImpl<TestDescriptorImpl>(provider, "resource-adaptersType", provider.getRootNode());
      type.createResourceAdapter().up();
      type.createResourceAdapter().up();
      assertTrue(type.getAllResourceAdapter().size() == 2);
      type.removeAllResourceAdapter();
      assertTrue(type.getAllResourceAdapter().size() == 0);
   }
}
