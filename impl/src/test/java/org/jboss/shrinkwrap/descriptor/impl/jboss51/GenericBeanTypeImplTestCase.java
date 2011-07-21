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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class GenericBeanTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }

   @Test
   public void testEnvEntry() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.persistenceUnitRef().up();
      type.persistenceUnitRef().up();
      assertTrue(type.getPersistenceUnitRefList().size() == 2);
      type.removeAllPersistenceUnitRef();
      assertTrue(type.getPersistenceUnitRefList().size() == 0);
   }

   @Test
   public void testPostConstruct() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.postConstruct().up();
      type.postConstruct().up();
      assertTrue(type.getPostConstructList().size() == 2);
      type.removeAllPostConstruct();
      assertTrue(type.getPostConstructList().size() == 0);
   }

   @Test
   public void testPreDestroy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.preDestroy().up();
      type.preDestroy().up();
      assertTrue(type.getPreDestroyList().size() == 2);
      type.removeAllPreDestroy();
      assertTrue(type.getPreDestroyList().size() == 0);
   }

   @Test
   public void testServiceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.serviceRef().up();
      type.serviceRef().up();
      assertTrue(type.getServiceRefList().size() == 2);
      type.removeAllServiceRef();
      assertTrue(type.getServiceRefList().size() == 0);
   }

   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setJndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }

   @Test
   public void testHomeJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setHomeJndiName("test");
      assertEquals(type.getHomeJndiName(), "test");
      type.removeHomeJndiName();
      assertNull(type.getHomeJndiName());
   }

   @Test
   public void testLocalJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setLocalJndiName("test");
      assertEquals(type.getLocalJndiName(), "test");
      type.removeLocalJndiName();
      assertNull(type.getLocalJndiName());
   }

   @Test
   public void testLocalHomeJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setLocalHomeJndiName("test");
      assertEquals(type.getLocalHomeJndiName(), "test");
      type.removeLocalHomeJndiName();
      assertNull(type.getLocalHomeJndiName());
   }

   @Test
   public void testJndiBindingPolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setJndiBindingPolicy("test");
      assertEquals(type.getJndiBindingPolicy(), "test");
      type.removeJndiBindingPolicy();
      assertNull(type.getJndiBindingPolicy());
   }

   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   @Test
   public void testMethodAttributes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.methodAttributes().up();
      type.removeMethodAttributes();
      assertNull(provider.getRootNode().getSingle("method-attributes"));
   }

   @Test
   public void testDepends() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setDepends("value1");
      type.setDepends("value2");
      type.setDependsList("value3", "value4");
      assertTrue(type.getDependsList().size() == 4);
      assertEquals(type.getDependsList().get(0), "value1");
      assertEquals(type.getDependsList().get(1), "value2");
      assertEquals(type.getDependsList().get(2), "value3");
      assertEquals(type.getDependsList().get(3), "value4");
      type.removeAllDepends();
      assertTrue(type.getDependsList().size() == 0);
   }

   @Test
   public void testAnnotation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.annotation().up();
      type.annotation().up();
      assertTrue(type.getAnnotationList().size() == 2);
      type.removeAllAnnotation();
      assertTrue(type.getAnnotationList().size() == 0);
   }

   @Test
   public void testIgnoreDependency() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.ignoreDependency().up();
      type.removeIgnoreDependency();
      assertNull(provider.getRootNode().getSingle("ignore-dependency"));
   }

   @Test
   public void testAopDomainName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.setAopDomainName("test");
      assertEquals(type.getAopDomainName(), "test");
      type.removeAopDomainName();
      assertNull(type.getAopDomainName());
   }

   @Test
   public void testPoolConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.poolConfig().up();
      type.removePoolConfig();
      assertNull(provider.getRootNode().getSingle("pool-config"));
   }

   @Test
   public void testJndiRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.jndiRef().up();
      type.jndiRef().up();
      assertTrue(type.getJndiRefList().size() == 2);
      type.removeAllJndiRef();
      assertTrue(type.getJndiRefList().size() == 0);
   }

   @Test
   public void testPortComponent() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider,
            "generic-beanType", provider.getRootNode());
      type.portComponent().up();
      type.removePortComponent();
      assertNull(provider.getRootNode().getSingle("port-component"));
   }
}