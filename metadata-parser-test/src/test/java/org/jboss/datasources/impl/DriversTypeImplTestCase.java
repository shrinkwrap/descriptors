package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DriversType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.DriverType;
import org.jboss.datasources.impl.DriverTypeImpl;

public class DriversTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriversType<TestDescriptorImpl> type = new DriversTypeImpl<TestDescriptorImpl>(provider, "driversType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDriver() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriversType<TestDescriptorImpl> type = new DriversTypeImpl<TestDescriptorImpl>(provider, "driversType", provider.getRootNode());
      type.createDriver().up();
      type.createDriver().up();
      assertTrue(type.getAllDriver().size() == 2);
      type.removeAllDriver();
      assertTrue(type.getAllDriver().size() == 0);
   }
}
