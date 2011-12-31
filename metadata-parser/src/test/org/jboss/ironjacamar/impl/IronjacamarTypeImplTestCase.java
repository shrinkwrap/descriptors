package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.IronjacamarType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;
import org.jboss.ironjacamar.api.TransactionSupportType;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import org.jboss.ironjacamar.impl.ConnectionDefinitionsTypeImpl;
import org.jboss.ironjacamar.api.AdminObjectsType;
import org.jboss.ironjacamar.impl.AdminObjectsTypeImpl;

public class IronjacamarTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testBeanValidationGroups() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      type.getOrCreateBeanValidationGroups().up();
      type.removeBeanValidationGroups();
      assertNull(provider.getRootNode().getSingle("bean-validation-groups"));
   }

   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }

   
   @Test
   public void testTransactionSupport() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      for(TransactionSupportType e: TransactionSupportType.values())
      {
         type.transactionSupport(e);
         assertEquals(type.getTransactionSupport(), e);
         type.transactionSupport(e.toString());
         assertEquals(type.getTransactionSupportAsString(), e.toString());
      }
   }

   
   @Test
   public void testConnectionDefinitions() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      type.getOrCreateConnectionDefinitions().up();
      type.removeConnectionDefinitions();
      assertNull(provider.getRootNode().getSingle("connection-definitions"));
   }

   
   @Test
   public void testAdminObjects() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      IronjacamarType<TestDescriptorImpl> type = new IronjacamarTypeImpl<TestDescriptorImpl>(provider, "ironjacamarType", provider.getRootNode());
      type.getOrCreateAdminObjects().up();
      type.removeAdminObjects();
      assertNull(provider.getRootNode().getSingle("admin-objects"));
   }
}
