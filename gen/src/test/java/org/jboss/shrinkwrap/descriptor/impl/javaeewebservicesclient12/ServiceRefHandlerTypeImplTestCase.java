package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

public class ServiceRefHandlerTypeImplTestCase
{   
   @Test
   public void testHandlerName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.setHandlerName("test");
      assertEquals(type.getHandlerName(), "test");
      type.removeHandlerName();
      assertNull(type.getHandlerName());
   }

   
   @Test
   public void testHandlerClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.setHandlerClass("test");
      assertEquals(type.getHandlerClass(), "test");
      type.removeHandlerClass();
      assertNull(type.getHandlerClass());
   }

   
   @Test
   public void testInitParam() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.initParam().up();
      type.initParam().up();
      assertTrue(type.getInitParamList().size() == 2);
      type.removeAllInitParam();
      assertTrue(type.getInitParamList().size() == 0);
   }

   
   @Test
   public void testSoapHeader() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.setSoapHeader("value1");
      type.setSoapHeader("value2");
      type.setSoapHeaderList("value3", "value4");
      assertTrue(type.getSoapHeaderList().size() == 4);
      assertEquals(type.getSoapHeaderList().get(0), "value1");
      assertEquals(type.getSoapHeaderList().get(1), "value2");
      assertEquals(type.getSoapHeaderList().get(2), "value3");
      assertEquals(type.getSoapHeaderList().get(3), "value4");
      type.removeAllSoapHeader();
      assertTrue(type.getSoapHeaderList().size() == 0);
   }

   
   @Test
   public void testSoapRole() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.setSoapRole("value1");
      type.setSoapRole("value2");
      type.setSoapRoleList("value3", "value4");
      assertTrue(type.getSoapRoleList().size() == 4);
      assertEquals(type.getSoapRoleList().get(0), "value1");
      assertEquals(type.getSoapRoleList().get(1), "value2");
      assertEquals(type.getSoapRoleList().get(2), "value3");
      assertEquals(type.getSoapRoleList().get(3), "value4");
      type.removeAllSoapRole();
      assertTrue(type.getSoapRoleList().size() == 0);
   }

   
   @Test
   public void testPortName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerType<TestDescriptorImpl> type = new ServiceRefHandlerTypeImpl<TestDescriptorImpl>(provider, "service-ref_handlerType", provider.getRootNode());
      type.setPortName("value1");
      type.setPortName("value2");
      type.setPortNameList("value3", "value4");
      assertTrue(type.getPortNameList().size() == 4);
      assertEquals(type.getPortNameList().get(0), "value1");
      assertEquals(type.getPortNameList().get(1), "value2");
      assertEquals(type.getPortNameList().get(2), "value3");
      assertEquals(type.getPortNameList().get(3), "value4");
      type.removeAllPortName();
      assertTrue(type.getPortNameList().size() == 0);
   }
}
