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
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.SessionBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MessageDrivenBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ServiceBeanType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ServiceBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ConsumerBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.GenericBeanTypeImpl;

public class EnterpriseBeansTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testSession() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.session().up();
      type.session().up();
      assertTrue(type.getSessionList().size() == 2);
      type.removeAllSession();
      assertTrue(type.getSessionList().size() == 0);
   }

   
   @Test
   public void testMessageDriven() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.messageDriven().up();
      type.messageDriven().up();
      assertTrue(type.getMessageDrivenList().size() == 2);
      type.removeAllMessageDriven();
      assertTrue(type.getMessageDrivenList().size() == 0);
   }

   
   @Test
   public void testService() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.service().up();
      type.service().up();
      assertTrue(type.getServiceList().size() == 2);
      type.removeAllService();
      assertTrue(type.getServiceList().size() == 0);
   }

   
   @Test
   public void testConsumer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.consumer().up();
      type.consumer().up();
      assertTrue(type.getConsumerList().size() == 2);
      type.removeAllConsumer();
      assertTrue(type.getConsumerList().size() == 0);
   }

   
   @Test
   public void testEjb() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider, "enterprise-beansType", provider.getRootNode());
      type.ejb().up();
      type.ejb().up();
      assertTrue(type.getEjbList().size() == 2);
      type.removeAllEjb();
      assertTrue(type.getEjbList().size() == 0);
   }
}
