package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DatasourcesDescriptor;
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

public class DatasourcesDescriptorImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDatasource() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.createDatasource().up();
      type.createDatasource().up();
      assertTrue(type.getAllDatasource().size() == 2);
      type.removeAllDatasource();
      assertTrue(type.getAllDatasource().size() == 0);
   }
   
   @Test
   public void testXaDatasource() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.createXaDatasource().up();
      type.createXaDatasource().up();
      assertTrue(type.getAllXaDatasource().size() == 2);
      type.removeAllXaDatasource();
      assertTrue(type.getAllXaDatasource().size() == 0);
   }
   
   @Test
   public void testDrivers() throws Exception
   {
      DatasourcesDescriptor type = Descriptors.create(DatasourcesDescriptor.class);
      type.getOrCreateDrivers().up();
      type.removeDrivers();
      assertNull(((DatasourcesDescriptorImpl)type).getRootNode().getSingle("drivers"));
   }
}
