package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class PortComponentTypeImplTestCase
{   
   @Test
   public void testPortComponentName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setPortComponentName("test");
      assertEquals(type.getPortComponentName(), "test");
      type.removePortComponentName();
      assertNull(type.getPortComponentName());
   }

   
   @Test
   public void testPortComponentUri() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setPortComponentUri("test");
      assertEquals(type.getPortComponentUri(), "test");
      type.removePortComponentUri();
      assertNull(type.getPortComponentUri());
   }

   
   @Test
   public void testAuthMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setAuthMethod("test");
      assertEquals(type.getAuthMethod(), "test");
      type.removeAuthMethod();
      assertNull(type.getAuthMethod());
   }

   
   @Test
   public void testTransportGuarantee() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setTransportGuarantee("test");
      assertEquals(type.getTransportGuarantee(), "test");
      type.removeTransportGuarantee();
      assertNull(type.getTransportGuarantee());
   }

   
   @Test
   public void testSecureWsdlAccess() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setSecureWsdlAccess(true);
      assertTrue(type.isSecureWsdlAccess());
   }
}
