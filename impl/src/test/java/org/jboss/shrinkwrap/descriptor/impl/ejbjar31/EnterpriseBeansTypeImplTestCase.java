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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class EnterpriseBeansTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider,
            "enterprise-beansType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testSession() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider,
            "enterprise-beansType", provider.getRootNode());
      type.session().up();
      type.session().up();
      assertTrue(type.getSessionList().size() == 2);
      type.removeAllSession();
      assertTrue(type.getSessionList().size() == 0);
   }

   @Test
   public void testEntity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider,
            "enterprise-beansType", provider.getRootNode());
      type.entity().up();
      type.entity().up();
      assertTrue(type.getEntityList().size() == 2);
      type.removeAllEntity();
      assertTrue(type.getEntityList().size() == 0);
   }

   @Test
   public void testMessageDriven() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EnterpriseBeansType<TestDescriptorImpl> type = new EnterpriseBeansTypeImpl<TestDescriptorImpl>(provider,
            "enterprise-beansType", provider.getRootNode());
      type.messageDriven().up();
      type.messageDriven().up();
      assertTrue(type.getMessageDrivenList().size() == 2);
      type.removeAllMessageDriven();
      assertTrue(type.getMessageDrivenList().size() == 0);
   }
}
