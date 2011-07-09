package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.PortComponentRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerChainsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;

public class ServiceRefTypeImplTestCase
{   
   @Test
   public void testServiceRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setServiceRefName("test");
      assertEquals(type.getServiceRefName(), "test");
      type.removeServiceRefName();
      assertNull(type.getServiceRefName());
   }

   
   @Test
   public void testServiceInterface() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setServiceInterface("test");
      assertEquals(type.getServiceInterface(), "test");
      type.removeServiceInterface();
      assertNull(type.getServiceInterface());
   }

   
   @Test
   public void testServiceRefType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setServiceRefType("test");
      assertEquals(type.getServiceRefType(), "test");
      type.removeServiceRefType();
      assertNull(type.getServiceRefType());
   }

   
   @Test
   public void testWsdlFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setWsdlFile("test");
      assertEquals(type.getWsdlFile(), "test");
      type.removeWsdlFile();
      assertNull(type.getWsdlFile());
   }

   
   @Test
   public void testJaxrpcMappingFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setJaxrpcMappingFile("test");
      assertEquals(type.getJaxrpcMappingFile(), "test");
      type.removeJaxrpcMappingFile();
      assertNull(type.getJaxrpcMappingFile());
   }

   
   @Test
   public void testServiceQname() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.setServiceQname("test");
      assertEquals(type.getServiceQname(), "test");
      type.removeServiceQname();
      assertNull(type.getServiceQname());
   }

   
   @Test
   public void testPortComponentRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.portComponentRef().up();
      type.portComponentRef().up();
      assertTrue(type.getPortComponentRefList().size() == 2);
      type.removeAllPortComponentRef();
      assertTrue(type.getPortComponentRefList().size() == 0);
   }

   
   @Test
   public void testHandler() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.handler().up();
      type.handler().up();
      assertTrue(type.getHandlerList().size() == 2);
      type.removeAllHandler();
      assertTrue(type.getHandlerList().size() == 0);
   }

   
   @Test
   public void testHandlerChains() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefType<TestDescriptorImpl> type = new ServiceRefTypeImpl<TestDescriptorImpl>(provider, "service-refType", provider.getRootNode());
      type.handlerChains().up();
      type.removeHandlerChains();
      assertNull(provider.getRootNode().getSingle("handler-chains"));
   }
}
