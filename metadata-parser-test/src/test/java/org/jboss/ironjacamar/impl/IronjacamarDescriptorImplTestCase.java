package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.IronjacamarDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.BeanValidationGroupsType;
import org.jboss.ironjacamar.impl.BeanValidationGroupsTypeImpl;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;
import org.jboss.ironjacamar.api.TransactionSupportType;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import org.jboss.ironjacamar.impl.ConnectionDefinitionsTypeImpl;
import org.jboss.ironjacamar.api.AdminObjectsType;
import org.jboss.ironjacamar.impl.AdminObjectsTypeImpl;

public class IronjacamarDescriptorImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testBeanValidationGroups() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      type.getOrCreateBeanValidationGroups().up();
      type.removeBeanValidationGroups();
      assertNull(((IronjacamarDescriptorImpl)type).getRootNode().getSingle("bean-validation-groups"));
   }
   
   @Test
   public void testBootstrapContext() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      type.bootstrapContext("test");
      assertEquals(type.getBootstrapContext(), "test");
      type.removeBootstrapContext();
      assertNull(type.getBootstrapContext());
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }
   
   @Test
   public void testTransactionSupport() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
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
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      type.getOrCreateConnectionDefinitions().up();
      type.removeConnectionDefinitions();
      assertNull(((IronjacamarDescriptorImpl)type).getRootNode().getSingle("connection-definitions"));
   }
   
   @Test
   public void testAdminObjects() throws Exception
   {
      IronjacamarDescriptor type = Descriptors.create(IronjacamarDescriptor.class);
      type.getOrCreateAdminObjects().up();
      type.removeAdminObjects();
      assertNull(((IronjacamarDescriptorImpl)type).getRootNode().getSingle("admin-objects"));
   }
}
