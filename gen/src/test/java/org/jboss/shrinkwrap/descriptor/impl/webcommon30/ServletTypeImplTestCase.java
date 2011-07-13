package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.RunAsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MultipartConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MultipartConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class ServletTypeImplTestCase
{   
   @Test
   public void testServletName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setServletName("test");
      assertEquals(type.getServletName(), "test");
      type.removeServletName();
      assertNull(type.getServletName());
   }

   
   @Test
   public void testInitParam() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.initParam().up();
      type.initParam().up();
      assertTrue(type.getInitParamList().size() == 2);
      type.removeAllInitParam();
      assertTrue(type.getInitParamList().size() == 0);
   }

   
   @Test
   public void testLoadOnStartup() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setLoadOnStartup(8);
      assertTrue(type.getLoadOnStartup() == 8);
   }

   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setEnabled(true);
      assertTrue(type.isEnabled());
   }

   
   @Test
   public void testAsyncSupported() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setAsyncSupported(true);
      assertTrue(type.isAsyncSupported());
   }

   
   @Test
   public void testRunAs() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.runAs().up();
      type.removeRunAs();
      assertNull(provider.getRootNode().getSingle("run-as"));
   }

   
   @Test
   public void testSecurityRoleRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.securityRoleRef().up();
      type.securityRoleRef().up();
      assertTrue(type.getSecurityRoleRefList().size() == 2);
      type.removeAllSecurityRoleRef();
      assertTrue(type.getSecurityRoleRefList().size() == 0);
   }

   
   @Test
   public void testMultipartConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.multipartConfig().up();
      type.removeMultipartConfig();
      assertNull(provider.getRootNode().getSingle("multipart-config"));
   }

   
   @Test
   public void testServletClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setServletClass("test");
      assertEquals(type.getServletClass(), "test");
      type.removeServletClass();
      assertNull(type.getServletClass());
   }

   
   @Test
   public void testJspFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setJspFile("test");
      assertEquals(type.getJspFile(), "test");
      type.removeJspFile();
      assertNull(type.getJspFile());
   }
}
