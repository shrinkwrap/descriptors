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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class MessageDrivenBeanTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }

   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   @Test
   public void testActivationConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.activationConfig().up();
      type.removeActivationConfig();
      assertNull(provider.getRootNode().getSingle("activation-config"));
   }

   @Test
   public void testDestinationJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setDestinationJndiName("test");
      assertEquals(type.getDestinationJndiName(), "test");
      type.removeDestinationJndiName();
      assertNull(type.getDestinationJndiName());
   }

   @Test
   public void testMdbUser() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMdbUser("test");
      assertEquals(type.getMdbUser(), "test");
      type.removeMdbUser();
      assertNull(type.getMdbUser());
   }

   @Test
   public void testMdbPasswd() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMdbPasswd("test");
      assertEquals(type.getMdbPasswd(), "test");
      type.removeMdbPasswd();
      assertNull(type.getMdbPasswd());
   }

   @Test
   public void testMdbClientId() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMdbClientId("test");
      assertEquals(type.getMdbClientId(), "test");
      type.removeMdbClientId();
      assertNull(type.getMdbClientId());
   }

   @Test
   public void testMdbSubscriptionId() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setMdbSubscriptionId("test");
      assertEquals(type.getMdbSubscriptionId(), "test");
      type.removeMdbSubscriptionId();
      assertNull(type.getMdbSubscriptionId());
   }

   @Test
   public void testResourceAdapterName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setResourceAdapterName("test");
      assertEquals(type.getResourceAdapterName(), "test");
      type.removeResourceAdapterName();
      assertNull(type.getResourceAdapterName());
   }

   @Test
   public void testEjbRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }

   @Test
   public void testServiceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.serviceRef().up();
      type.serviceRef().up();
      assertTrue(type.getServiceRefList().size() == 2);
      type.removeAllServiceRef();
      assertTrue(type.getServiceRefList().size() == 0);
   }

   @Test
   public void testResourceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }

   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   @Test
   public void testMethodAttributes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.methodAttributes().up();
      type.removeMethodAttributes();
      assertNull(provider.getRootNode().getSingle("method-attributes"));
   }

   @Test
   public void testDepends() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
   public void testEjbTimeoutIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.ejbTimeoutIdentity().up();
      type.removeEjbTimeoutIdentity();
      assertNull(provider.getRootNode().getSingle("ejb-timeout-identity"));
   }

   @Test
   public void testAnnotation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.ignoreDependency().up();
      type.removeIgnoreDependency();
      assertNull(provider.getRootNode().getSingle("ignore-dependency"));
   }

   @Test
   public void testAopDomainName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setAopDomainName("test");
      assertEquals(type.getAopDomainName(), "test");
      type.removeAopDomainName();
      assertNull(type.getAopDomainName());
   }

   @Test
   public void testPoolConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.poolConfig().up();
      type.removePoolConfig();
      assertNull(provider.getRootNode().getSingle("pool-config"));
   }

   @Test
   public void testJndiRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.jndiRef().up();
      type.jndiRef().up();
      assertTrue(type.getJndiRefList().size() == 2);
      type.removeAllJndiRef();
      assertTrue(type.getJndiRefList().size() == 0);
   }

   @Test
   public void testCreateDestination() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider,
            "message-driven-beanType", provider.getRootNode());
      type.setCreateDestination(true);
      assertTrue(type.isCreateDestination());
      type.removeCreateDestination();
      assertFalse(type.isCreateDestination());
   }
}
