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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class SecurityIdentityTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider,
            "security-identityType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider,
            "security-identityType", provider.getRootNode());
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
   public void testUseCallerIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider,
            "security-identityType", provider.getRootNode());
      type.useCallerIdentity();
      assertTrue(type.isUseCallerIdentity());
   }

   @Test
   public void testRunAs() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityIdentityType<TestDescriptorImpl> type = new SecurityIdentityTypeImpl<TestDescriptorImpl>(provider,
            "security-identityType", provider.getRootNode());
      type.runAs().up();
      type.removeRunAs();
      assertNull(provider.getRootNode().getSingle("run-as"));
   }
}
