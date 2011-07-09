package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class CookieConfigTypeImplTestCase
{   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setName("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setDomain("test");
      assertEquals(type.getDomain(), "test");
      type.removeDomain();
      assertNull(type.getDomain());
   }

   
   @Test
   public void testPath() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setPath("test");
      assertEquals(type.getPath(), "test");
      type.removePath();
      assertNull(type.getPath());
   }

   
   @Test
   public void testComment() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setComment("test");
      assertEquals(type.getComment(), "test");
      type.removeComment();
      assertNull(type.getComment());
   }

   
   @Test
   public void testHttpOnly() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setHttpOnly(true);
      assertTrue(type.isHttpOnly());
   }

   
   @Test
   public void testSecure() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setSecure(true);
      assertTrue(type.isSecure());
   }

   
   @Test
   public void testMaxAge() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setMaxAge(8);
      assertTrue(type.getMaxAge() == 8);
   }
}
