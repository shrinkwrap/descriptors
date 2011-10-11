package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.datasources.api.DsSecurityType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.ExtensionType;
import org.jboss.datasources.impl.ExtensionTypeImpl;

public class DsSecurityTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DsSecurityType<TestDescriptorImpl> type = new DsSecurityTypeImpl<TestDescriptorImpl>(provider, "dsSecurityType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testUserName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DsSecurityType<TestDescriptorImpl> type = new DsSecurityTypeImpl<TestDescriptorImpl>(provider, "dsSecurityType", provider.getRootNode());
      type.userName("test");
      assertEquals(type.getUserName(), "test");
      type.removeUserName();
      assertNull(type.getUserName());
   }

   
   @Test
   public void testPassword() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DsSecurityType<TestDescriptorImpl> type = new DsSecurityTypeImpl<TestDescriptorImpl>(provider, "dsSecurityType", provider.getRootNode());
      type.password("test");
      assertEquals(type.getPassword(), "test");
      type.removePassword();
      assertNull(type.getPassword());
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DsSecurityType<TestDescriptorImpl> type = new DsSecurityTypeImpl<TestDescriptorImpl>(provider, "dsSecurityType", provider.getRootNode());
      type.securityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testReauthPlugin() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      DsSecurityType<TestDescriptorImpl> type = new DsSecurityTypeImpl<TestDescriptorImpl>(provider, "dsSecurityType", provider.getRootNode());
      type.getOrCreateReauthPlugin().up();
      type.removeReauthPlugin();
      assertNull(provider.getRootNode().getSingle("reauth-plugin"));
   }
}
