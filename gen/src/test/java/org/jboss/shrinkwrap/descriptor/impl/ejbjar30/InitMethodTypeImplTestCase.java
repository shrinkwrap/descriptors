package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InitMethodType;
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
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.NamedMethodTypeImpl;

public class InitMethodTypeImplTestCase
{   
   @Test
   public void testCreateMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InitMethodType<TestDescriptorImpl> type = new InitMethodTypeImpl<TestDescriptorImpl>(provider, "init-methodType", provider.getRootNode());
      type.createMethod().up();
      type.removeCreateMethod();
      assertNull(provider.getRootNode().getSingle("create-method"));
   }

   
   @Test
   public void testBeanMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      InitMethodType<TestDescriptorImpl> type = new InitMethodTypeImpl<TestDescriptorImpl>(provider, "init-methodType", provider.getRootNode());
      type.beanMethod().up();
      type.removeBeanMethod();
      assertNull(provider.getRootNode().getSingle("bean-method"));
   }
}
