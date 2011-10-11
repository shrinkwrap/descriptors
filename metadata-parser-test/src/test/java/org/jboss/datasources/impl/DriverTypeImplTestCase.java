package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DriverType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class DriverTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDriverClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.driverClass("test");
      assertEquals(type.getDriverClass(), "test");
      type.removeDriverClass();
      assertNull(type.getDriverClass());
   }

   
   @Test
   public void testDatasourceClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.datasourceClass("test");
      assertEquals(type.getDatasourceClass(), "test");
      type.removeDatasourceClass();
      assertNull(type.getDatasourceClass());
   }

   
   @Test
   public void testXaDatasourceClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.xaDatasourceClass("test");
      assertEquals(type.getXaDatasourceClass(), "test");
      type.removeXaDatasourceClass();
      assertNull(type.getXaDatasourceClass());
   }

   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.name("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testModule() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.module("test");
      assertEquals(type.getModule(), "test");
      type.removeModule();
      assertNull(type.getModule());
   }

   
   @Test
   public void testMajorVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.majorVersion(8);
      assertTrue(type.getMajorVersion() == 8);
      type.removeMajorVersion();
      assertNull(type.getMajorVersion());
   }

   
   @Test
   public void testMinorVerion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DriverType<TestDescriptorImpl> type = new DriverTypeImpl<TestDescriptorImpl>(provider, "driverType", provider.getRootNode());
      type.minorVerion(8);
      assertTrue(type.getMinorVerion() == 8);
      type.removeMinorVerion();
      assertNull(type.getMinorVerion());
   }
}
