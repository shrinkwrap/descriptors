package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RemoveMethodType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.NamedMethodTypeImpl;

public class RemoveMethodTypeImplTestCase
{   
   @Test
   public void testBeanMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoveMethodType<TestDescriptorImpl> type = new RemoveMethodTypeImpl<TestDescriptorImpl>(provider, "remove-methodType", provider.getRootNode());
      type.beanMethod().up();
      type.removeBeanMethod();
      assertNull(provider.getRootNode().getSingle("bean-method"));
   }

   
   @Test
   public void testRetainIfException() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RemoveMethodType<TestDescriptorImpl> type = new RemoveMethodTypeImpl<TestDescriptorImpl>(provider, "remove-methodType", provider.getRootNode());
      type.setRetainIfException(true);
      assertTrue(type.isRetainIfException());
   }
}
