package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ContainerTransactionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.MethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransAttributeType;

public class ContainerTransactionTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ContainerTransactionType<TestDescriptorImpl> type = new ContainerTransactionTypeImpl<TestDescriptorImpl>(provider, "container-transactionType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ContainerTransactionType<TestDescriptorImpl> type = new ContainerTransactionTypeImpl<TestDescriptorImpl>(provider, "container-transactionType", provider.getRootNode());
      type.method().up();
      type.method().up();
      assertTrue(type.getMethodList().size() == 2);
      type.removeAllMethod();
      assertTrue(type.getMethodList().size() == 0);
   }

   
   @Test
   public void testTransAttribute() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ContainerTransactionType<TestDescriptorImpl> type = new ContainerTransactionTypeImpl<TestDescriptorImpl>(provider, "container-transactionType", provider.getRootNode());
      for(TransAttributeType e: TransAttributeType.values())
      {
         type.setTransAttribute(e);
         assertEquals(type.getTransAttribute(), e);
         type.setTransAttribute(e.toString());
         assertEquals(type.getTransAttributeAsString(), e.toString());
      }
   }
}
