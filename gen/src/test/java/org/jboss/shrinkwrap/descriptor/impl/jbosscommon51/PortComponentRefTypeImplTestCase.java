package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PortComponentRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.StubPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.StubPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.CallPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.CallPropertyTypeImpl;

public class PortComponentRefTypeImplTestCase
{   
   @Test
   public void testServiceEndpointInterface() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setServiceEndpointInterface("test");
      assertEquals(type.getServiceEndpointInterface(), "test");
      type.removeServiceEndpointInterface();
      assertNull(type.getServiceEndpointInterface());
   }

   
   @Test
   public void testPortQname() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setPortQname("test");
      assertEquals(type.getPortQname(), "test");
      type.removePortQname();
      assertNull(type.getPortQname());
   }

   
   @Test
   public void testConfigName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setConfigName("test");
      assertEquals(type.getConfigName(), "test");
      type.removeConfigName();
      assertNull(type.getConfigName());
   }

   
   @Test
   public void testConfigFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setConfigFile("test");
      assertEquals(type.getConfigFile(), "test");
      type.removeConfigFile();
      assertNull(type.getConfigFile());
   }

   
   @Test
   public void testStubProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.stubProperty().up();
      type.stubProperty().up();
      assertTrue(type.getStubPropertyList().size() == 2);
      type.removeAllStubProperty();
      assertTrue(type.getStubPropertyList().size() == 0);
   }

   
   @Test
   public void testCallProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.callProperty().up();
      type.callProperty().up();
      assertTrue(type.getCallPropertyList().size() == 2);
      type.removeAllCallProperty();
      assertTrue(type.getCallPropertyList().size() == 0);
   }
}
