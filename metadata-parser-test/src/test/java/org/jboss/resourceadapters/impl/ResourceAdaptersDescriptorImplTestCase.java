package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ResourceAdaptersDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import org.jboss.resourceadapters.impl.ResourceAdapterTypeImpl;

public class ResourceAdaptersDescriptorImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      ResourceAdaptersDescriptor type = Descriptors.create(ResourceAdaptersDescriptor.class);
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testResourceAdapter() throws Exception
   {
      ResourceAdaptersDescriptor type = Descriptors.create(ResourceAdaptersDescriptor.class);
      type.createResourceAdapter().up();
      type.createResourceAdapter().up();
      assertTrue(type.getAllResourceAdapter().size() == 2);
      type.removeAllResourceAdapter();
      assertTrue(type.getAllResourceAdapter().size() == 0);
   }
}
