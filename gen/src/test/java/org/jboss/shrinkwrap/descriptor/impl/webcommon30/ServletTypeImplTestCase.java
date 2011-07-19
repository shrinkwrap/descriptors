/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
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
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
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
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }
   
   @Test
   public void testIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
   
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
      type.removeLoadOnStartup();
      assertNull(type.getLoadOnStartup());
   }

   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setEnabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }

   
   @Test
   public void testAsyncSupported() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServletType<TestDescriptorImpl> type = new ServletTypeImpl<TestDescriptorImpl>(provider, "servletType", provider.getRootNode());
      type.setAsyncSupported(true);
      assertTrue(type.isAsyncSupported());
      type.removeAsyncSupported();
      assertFalse(type.isAsyncSupported());
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
