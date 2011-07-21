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
package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JbossType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LoaderRepositoryType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LoaderRepositoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.WebservicesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.WebservicesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.EnterpriseBeansTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.AssemblyDescriptorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ResourceManagersTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

public class JbossTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
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
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
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
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
   
   @Test
   public void testLoaderRepository() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.loaderRepository().up();
      type.removeLoaderRepository();
      assertNull(provider.getRootNode().getSingle("loader-repository"));
   }

   
   @Test
   public void testJmxName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setJmxName("test");
      assertEquals(type.getJmxName(), "test");
      type.removeJmxName();
      assertNull(type.getJmxName());
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testMissingMethodPermissionsExcludedMode() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setMissingMethodPermissionsExcludedMode(true);
      assertTrue(type.isMissingMethodPermissionsExcludedMode());
      type.removeMissingMethodPermissionsExcludedMode();
      assertFalse(type.isMissingMethodPermissionsExcludedMode());
   }

   
   @Test
   public void testUnauthenticatedPrincipal() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setUnauthenticatedPrincipal("test");
      assertEquals(type.getUnauthenticatedPrincipal(), "test");
      type.removeUnauthenticatedPrincipal();
      assertNull(type.getUnauthenticatedPrincipal());
   }

   
   @Test
   public void testJndiBindingPolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setJndiBindingPolicy("test");
      assertEquals(type.getJndiBindingPolicy(), "test");
      type.removeJndiBindingPolicy();
      assertNull(type.getJndiBindingPolicy());
   }

   
   @Test
   public void testJaccContextId() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setJaccContextId("test");
      assertEquals(type.getJaccContextId(), "test");
      type.removeJaccContextId();
      assertNull(type.getJaccContextId());
   }

   
   @Test
   public void testWebservices() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.webservices().up();
      type.removeWebservices();
      assertNull(provider.getRootNode().getSingle("webservices"));
   }

   
   @Test
   public void testEnterpriseBeans() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.enterpriseBeans().up();
      type.removeEnterpriseBeans();
      assertNull(provider.getRootNode().getSingle("enterprise-beans"));
   }

   
   @Test
   public void testAssemblyDescriptor() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.assemblyDescriptor().up();
      type.removeAssemblyDescriptor();
      assertNull(provider.getRootNode().getSingle("assembly-descriptor"));
   }

   
   @Test
   public void testResourceManagers() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.resourceManagers().up();
      type.removeResourceManagers();
      assertNull(provider.getRootNode().getSingle("resource-managers"));
   }

   
   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }

   
   @Test
   public void testMetadataComplete() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      JbossType<TestDescriptorImpl> type = new JbossTypeImpl<TestDescriptorImpl>(provider, "jbossType", provider.getRootNode());
      type.setMetadataComplete(true);
      assertTrue(type.isMetadataComplete());
      type.removeMetadataComplete();
      assertFalse(type.isMetadataComplete());
   }
}
