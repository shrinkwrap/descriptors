package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DatasourcesType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.DatasourceType;
import org.jboss.datasources.impl.DatasourceTypeImpl;
import org.jboss.datasources.api.XaDatasourceType;
import org.jboss.datasources.impl.XaDatasourceTypeImpl;
import org.jboss.datasources.api.DriversType;
import org.jboss.datasources.impl.DriversTypeImpl;

public class DatasourcesTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourcesType<TestDescriptorImpl> type = new DatasourcesTypeImpl<TestDescriptorImpl>(provider, "datasourcesType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDatasource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourcesType<TestDescriptorImpl> type = new DatasourcesTypeImpl<TestDescriptorImpl>(provider, "datasourcesType", provider.getRootNode());
      type.createDatasource().up();
      type.createDatasource().up();
      assertTrue(type.getAllDatasource().size() == 2);
      type.removeAllDatasource();
      assertTrue(type.getAllDatasource().size() == 0);
   }

   
   @Test
   public void testXaDatasource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourcesType<TestDescriptorImpl> type = new DatasourcesTypeImpl<TestDescriptorImpl>(provider, "datasourcesType", provider.getRootNode());
      type.createXaDatasource().up();
      type.createXaDatasource().up();
      assertTrue(type.getAllXaDatasource().size() == 2);
      type.removeAllXaDatasource();
      assertTrue(type.getAllXaDatasource().size() == 0);
   }

   
   @Test
   public void testDrivers() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DatasourcesType<TestDescriptorImpl> type = new DatasourcesTypeImpl<TestDescriptorImpl>(provider, "datasourcesType", provider.getRootNode());
      type.getOrCreateDrivers().up();
      type.removeDrivers();
      assertNull(provider.getRootNode().getSingle("drivers"));
   }
}
