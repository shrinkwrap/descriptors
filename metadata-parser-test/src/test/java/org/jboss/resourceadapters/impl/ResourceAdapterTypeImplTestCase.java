package org.jboss.resourceadapters.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.resourceadapters.api.ResourceAdapterType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.resourceadapters.api.BeanValidationGroupsType;
import org.jboss.resourceadapters.impl.BeanValidationGroupsTypeImpl;
import org.jboss.resourceadapters.api.ConfigPropertyType;
import org.jboss.resourceadapters.impl.ConfigPropertyTypeImpl;
import org.jboss.resourceadapters.api.TransactionSupportType;
import org.jboss.resourceadapters.api.ConnectionDefinitionsType;
import org.jboss.resourceadapters.impl.ConnectionDefinitionsTypeImpl;
import org.jboss.resourceadapters.api.AdminObjectsType;
import org.jboss.resourceadapters.impl.AdminObjectsTypeImpl;

public class ResourceAdapterTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testArchive() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      type.archive("test");
      assertEquals(type.getArchive(), "test");
      type.removeArchive();
      assertNull(type.getArchive());
   }

   
   @Test
   public void testBeanValidationGroups() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      type.getOrCreateBeanValidationGroups().up();
      type.removeBeanValidationGroups();
      assertNull(provider.getRootNode().getSingle("bean-validation-groups"));
   }

   
   @Test
   public void testBootstrapContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      type.bootstrapContext("test");
      assertEquals(type.getBootstrapContext(), "test");
      type.removeBootstrapContext();
      assertNull(type.getBootstrapContext());
   }

   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
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
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
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
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      type.getOrCreateConnectionDefinitions().up();
      type.removeConnectionDefinitions();
      assertNull(provider.getRootNode().getSingle("connection-definitions"));
   }

   
   @Test
   public void testAdminObjects() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceAdapterType<TestDescriptorImpl> type = new ResourceAdapterTypeImpl<TestDescriptorImpl>(provider, "resource-adapterType", provider.getRootNode());
      type.getOrCreateAdminObjects().up();
      type.removeAdminObjects();
      assertNull(provider.getRootNode().getSingle("admin-objects"));
   }
}
