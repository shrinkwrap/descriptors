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
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ProducerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ProducerType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ProducerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodAttributesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessagePropertiesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MessagePropertiesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodAttributesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.AnnotationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.IgnoreDependencyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.PoolConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.JndiRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ActivationConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

public class ConsumerBeanTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testEjbClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setEjbClass("test");
      assertEquals(type.getEjbClass(), "test");
      type.removeEjbClass();
      assertNull(type.getEjbClass());
   }

   
   @Test
   public void testMessageDestination() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setMessageDestination("test");
      assertEquals(type.getMessageDestination(), "test");
      type.removeMessageDestination();
      assertNull(type.getMessageDestination());
   }

   
   @Test
   public void testMessageDestinationType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setMessageDestinationType("test");
      assertEquals(type.getMessageDestinationType(), "test");
      type.removeMessageDestinationType();
      assertNull(type.getMessageDestinationType());
   }

   
   @Test
   public void testProducer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.producer().up();
      type.producer().up();
      assertTrue(type.getProducerList().size() == 2);
      type.removeAllProducer();
      assertTrue(type.getProducerList().size() == 0);
   }

   
   @Test
   public void testLocalProducer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.localProducer().up();
      type.localProducer().up();
      assertTrue(type.getLocalProducerList().size() == 2);
      type.removeAllLocalProducer();
      assertTrue(type.getLocalProducerList().size() == 0);
   }

   
   @Test
   public void testCurrentMessage() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.currentMessage().up();
      type.removeCurrentMessage();
      assertNull(provider.getRootNode().getSingle("current-message"));
   }

   
   @Test
   public void testMessageProperties() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.messageProperties().up();
      type.messageProperties().up();
      assertTrue(type.getMessagePropertiesList().size() == 2);
      type.removeAllMessageProperties();
      assertTrue(type.getMessagePropertiesList().size() == 0);
   }

   
   @Test
   public void testEjbRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }

   
   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   
   @Test
   public void testResourceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testMethodAttributes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.methodAttributes().up();
      type.removeMethodAttributes();
      assertNull(provider.getRootNode().getSingle("method-attributes"));
   }

   
   @Test
   public void testDepends() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
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
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.ignoreDependency().up();
      type.removeIgnoreDependency();
      assertNull(provider.getRootNode().getSingle("ignore-dependency"));
   }

   
   @Test
   public void testAopDomainName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.setAopDomainName("test");
      assertEquals(type.getAopDomainName(), "test");
      type.removeAopDomainName();
      assertNull(type.getAopDomainName());
   }

   
   @Test
   public void testPoolConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.poolConfig().up();
      type.removePoolConfig();
      assertNull(provider.getRootNode().getSingle("pool-config"));
   }

   
   @Test
   public void testJndiRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.jndiRef().up();
      type.jndiRef().up();
      assertTrue(type.getJndiRefList().size() == 2);
      type.removeAllJndiRef();
      assertTrue(type.getJndiRefList().size() == 0);
   }

   
   @Test
   public void testActivationConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ConsumerBeanType<TestDescriptorImpl> type = new ConsumerBeanTypeImpl<TestDescriptorImpl>(provider, "consumer-beanType", provider.getRootNode());
      type.activationConfig().up();
      type.removeActivationConfig();
      assertNull(provider.getRootNode().getSingle("activation-config"));
   }
}
