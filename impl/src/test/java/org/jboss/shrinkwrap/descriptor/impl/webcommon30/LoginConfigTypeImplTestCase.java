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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class LoginConfigTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider,
            "login-configType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testAuthMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider,
            "login-configType", provider.getRootNode());
      type.setAuthMethod("test");
      assertEquals(type.getAuthMethod(), "test");
      type.removeAuthMethod();
      assertNull(type.getAuthMethod());
   }

   @Test
   public void testRealmName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider,
            "login-configType", provider.getRootNode());
      type.setRealmName("test");
      assertEquals(type.getRealmName(), "test");
      type.removeRealmName();
      assertNull(type.getRealmName());
   }

   @Test
   public void testFormLoginConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      LoginConfigType<TestDescriptorImpl> type = new LoginConfigTypeImpl<TestDescriptorImpl>(provider,
            "login-configType", provider.getRootNode());
      type.formLoginConfig().up();
      type.removeFormLoginConfig();
      assertNull(provider.getRootNode().getSingle("form-login-config"));
   }
}
