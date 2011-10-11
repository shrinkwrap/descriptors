package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.ironjacamar.api.SecurityType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

public class SecurityTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityType<TestDescriptorImpl> type = new SecurityTypeImpl<TestDescriptorImpl>(provider, "securityType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testApplication() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityType<TestDescriptorImpl> type = new SecurityTypeImpl<TestDescriptorImpl>(provider, "securityType", provider.getRootNode());
      type.application();
      assertTrue(type.isApplication());
      type.removeApplication();
      assertFalse(type.isApplication());
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityType<TestDescriptorImpl> type = new SecurityTypeImpl<TestDescriptorImpl>(provider, "securityType", provider.getRootNode());
      type.securityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testSecurityDomainAndApplication() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityType<TestDescriptorImpl> type = new SecurityTypeImpl<TestDescriptorImpl>(provider, "securityType", provider.getRootNode());
      type.securityDomainAndApplication("test");
      assertEquals(type.getSecurityDomainAndApplication(), "test");
      type.removeSecurityDomainAndApplication();
      assertNull(type.getSecurityDomainAndApplication());
   }
}
