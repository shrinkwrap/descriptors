package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

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
   public void testEnableMtom() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setEnableMtom(true);
      assertTrue(type.isEnableMtom());
   }

   
   @Test
   public void testPortComponentLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentRefType<TestDescriptorImpl> type = new PortComponentRefTypeImpl<TestDescriptorImpl>(provider, "port-component-refType", provider.getRootNode());
      type.setPortComponentLink("test");
      assertEquals(type.getPortComponentLink(), "test");
      type.removePortComponentLink();
      assertNull(type.getPortComponentLink());
   }
}
