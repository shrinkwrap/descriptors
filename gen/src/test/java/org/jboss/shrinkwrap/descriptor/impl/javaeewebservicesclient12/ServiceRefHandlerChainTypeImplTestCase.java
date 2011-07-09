package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefProtocolBindingListType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefProtocolBindingListTypeImpl;

public class ServiceRefHandlerChainTypeImplTestCase
{   
   @Test
   public void testHandler() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainType<TestDescriptorImpl> type = new ServiceRefHandlerChainTypeImpl<TestDescriptorImpl>(provider, "service-ref_handler-chainType", provider.getRootNode());
      type.handler().up();
      type.handler().up();
      assertTrue(type.getHandlerList().size() == 2);
      type.removeAllHandler();
      assertTrue(type.getHandlerList().size() == 0);
   }

   
   @Test
   public void testServiceNamePattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainType<TestDescriptorImpl> type = new ServiceRefHandlerChainTypeImpl<TestDescriptorImpl>(provider, "service-ref_handler-chainType", provider.getRootNode());
      type.setServiceNamePattern("test");
      assertEquals(type.getServiceNamePattern(), "test");
      type.removeServiceNamePattern();
      assertNull(type.getServiceNamePattern());
   }

   
   @Test
   public void testPortNamePattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainType<TestDescriptorImpl> type = new ServiceRefHandlerChainTypeImpl<TestDescriptorImpl>(provider, "service-ref_handler-chainType", provider.getRootNode());
      type.setPortNamePattern("test");
      assertEquals(type.getPortNamePattern(), "test");
      type.removePortNamePattern();
      assertNull(type.getPortNamePattern());
   }

   
   @Test
   public void testProtocolBindings() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainType<TestDescriptorImpl> type = new ServiceRefHandlerChainTypeImpl<TestDescriptorImpl>(provider, "service-ref_handler-chainType", provider.getRootNode());
      type.protocolBindings().up();
      type.removeProtocolBindings();
      assertNull(provider.getRootNode().getSingle("protocol-bindings"));
   }
}
