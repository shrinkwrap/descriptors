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
package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application6.ApplicationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.impl.application6.ModuleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class ApplicationTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
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
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
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
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }
   
   @Test
   public void testApplicationName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.setApplicationName("test");
      assertEquals(type.getApplicationName(), "test");
      type.removeApplicationName();
      assertNull(type.getApplicationName());
   }

   
   @Test
   public void testInitializeInOrder() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      for(GenericBooleanType e: GenericBooleanType.values())
      {
         type.setInitializeInOrder(e);
         assertEquals(type.getInitializeInOrder(), e);
         type.setInitializeInOrder(e.toString());
         assertEquals(type.getInitializeInOrderAsString(), e.toString());
      }
   }

   
   @Test
   public void testModule() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.module().up();
      type.module().up();
      assertTrue(type.getModuleList().size() == 2);
      type.removeAllModule();
      assertTrue(type.getModuleList().size() == 0);
   }

   
   @Test
   public void testSecurityRole() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.securityRole().up();
      type.securityRole().up();
      assertTrue(type.getSecurityRoleList().size() == 2);
      type.removeAllSecurityRole();
      assertTrue(type.getSecurityRoleList().size() == 0);
   }

   
   @Test
   public void testLibraryDirectory() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.setLibraryDirectory("test");
      assertEquals(type.getLibraryDirectory(), "test");
      type.removeLibraryDirectory();
      assertNull(type.getLibraryDirectory());
   }

   
   @Test
   public void testEnvEntry() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.envEntry().up();
      type.envEntry().up();
      assertTrue(type.getEnvEntryList().size() == 2);
      type.removeAllEnvEntry();
      assertTrue(type.getEnvEntryList().size() == 0);
   }

   
   @Test
   public void testEjbRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.ejbRef().up();
      type.ejbRef().up();
      assertTrue(type.getEjbRefList().size() == 2);
      type.removeAllEjbRef();
      assertTrue(type.getEjbRefList().size() == 0);
   }

   
   @Test
   public void testEjbLocalRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }

   
   @Test
   public void testResourceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.resourceRef().up();
      type.resourceRef().up();
      assertTrue(type.getResourceRefList().size() == 2);
      type.removeAllResourceRef();
      assertTrue(type.getResourceRefList().size() == 0);
   }

   
   @Test
   public void testResourceEnvRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.resourceEnvRef().up();
      type.resourceEnvRef().up();
      assertTrue(type.getResourceEnvRefList().size() == 2);
      type.removeAllResourceEnvRef();
      assertTrue(type.getResourceEnvRefList().size() == 0);
   }

   
   @Test
   public void testMessageDestinationRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }

   
   @Test
   public void testPersistenceContextRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.persistenceContextRef().up();
      type.persistenceContextRef().up();
      assertTrue(type.getPersistenceContextRefList().size() == 2);
      type.removeAllPersistenceContextRef();
      assertTrue(type.getPersistenceContextRefList().size() == 0);
   }

   
   @Test
   public void testPersistenceUnitRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.persistenceUnitRef().up();
      type.persistenceUnitRef().up();
      assertTrue(type.getPersistenceUnitRefList().size() == 2);
      type.removeAllPersistenceUnitRef();
      assertTrue(type.getPersistenceUnitRefList().size() == 0);
   }

   
   @Test
   public void testMessageDestination() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.messageDestination().up();
      type.messageDestination().up();
      assertTrue(type.getMessageDestinationList().size() == 2);
      type.removeAllMessageDestination();
      assertTrue(type.getMessageDestinationList().size() == 0);
   }

   
   @Test
   public void testDataSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.dataSource().up();
      type.dataSource().up();
      assertTrue(type.getDataSourceList().size() == 2);
      type.removeAllDataSource();
      assertTrue(type.getDataSourceList().size() == 0);
   }

   
   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ApplicationType<TestDescriptorImpl> type = new ApplicationTypeImpl<TestDescriptorImpl>(provider, "applicationType", provider.getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }
}
