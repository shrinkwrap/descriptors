package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.ConnectionDefintionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConfigPropertyType;
import org.jboss.ironjacamar.impl.ConfigPropertyTypeImpl;
import org.jboss.ironjacamar.api.PoolType;
import org.jboss.ironjacamar.impl.PoolTypeImpl;
import org.jboss.ironjacamar.api.XaPoolType;
import org.jboss.ironjacamar.impl.XaPoolTypeImpl;
import org.jboss.ironjacamar.api.SecurityType;
import org.jboss.ironjacamar.impl.SecurityTypeImpl;
import org.jboss.ironjacamar.api.ValidationType;
import org.jboss.ironjacamar.impl.ValidationTypeImpl;
import org.jboss.ironjacamar.api.RecoverType;
import org.jboss.ironjacamar.impl.RecoverTypeImpl;

public class ConnectionDefintionTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }

   
   @Test
   public void testPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreatePool().up();
      type.removePool();
      assertNull(provider.getRootNode().getSingle("pool"));
   }

   
   @Test
   public void testXaPool() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateXaPool().up();
      type.removeXaPool();
      assertNull(provider.getRootNode().getSingle("xa-pool"));
   }

   
   @Test
   public void testSecurity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateSecurity().up();
      type.removeSecurity();
      assertNull(provider.getRootNode().getSingle("security"));
   }

   
   @Test
   public void testTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateTimeout().up();
      type.removeTimeout();
      assertNull(provider.getRootNode().getSingle("timeout"));
   }

   
   @Test
   public void testValidation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateValidation().up();
      type.removeValidation();
      assertNull(provider.getRootNode().getSingle("validation"));
   }

   
   @Test
   public void testRecovery() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateRecovery().up();
      type.removeRecovery();
      assertNull(provider.getRootNode().getSingle("recovery"));
   }

   
   @Test
   public void testUseCcm() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConnectionDefintionType<TestDescriptorImpl> type = new ConnectionDefintionTypeImpl<TestDescriptorImpl>(provider, "connection-defintionType", provider.getRootNode());
      type.getOrCreateUseCcm().up();
      type.removeUseCcm();
      assertNull(provider.getRootNode().getSingle("use-ccm"));
   }
}
