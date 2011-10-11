package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.AdminObjectType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;

public class AdminObjectTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.className("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }
   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.jndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }
   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.enabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }
   
   @Test
   public void testUseJavaContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.useJavaContext(true);
      assertTrue(type.isUseJavaContext());
      type.removeUseJavaContext();
      assertFalse(type.isUseJavaContext());
   }
   
   @Test
   public void testPoolName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.poolName("test");
      assertEquals(type.getPoolName(), "test");
      type.removePoolName();
      assertNull(type.getPoolName());
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }
}
