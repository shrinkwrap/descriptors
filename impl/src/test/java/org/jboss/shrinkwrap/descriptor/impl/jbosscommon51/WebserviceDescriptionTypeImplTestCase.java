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
package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class WebserviceDescriptionTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(
            provider, "webservice-descriptionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testWebserviceDescriptionName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(
            provider, "webservice-descriptionType", provider.getRootNode());
      type.setWebserviceDescriptionName("test");
      assertEquals(type.getWebserviceDescriptionName(), "test");
      type.removeWebserviceDescriptionName();
      assertNull(type.getWebserviceDescriptionName());
   }

   @Test
   public void testConfigName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(
            provider, "webservice-descriptionType", provider.getRootNode());
      type.setConfigName("test");
      assertEquals(type.getConfigName(), "test");
      type.removeConfigName();
      assertNull(type.getConfigName());
   }

   @Test
   public void testConfigFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(
            provider, "webservice-descriptionType", provider.getRootNode());
      type.setConfigFile("test");
      assertEquals(type.getConfigFile(), "test");
      type.removeConfigFile();
      assertNull(type.getConfigFile());
   }

   @Test
   public void testWsdlPublishLocation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebserviceDescriptionType<TestDescriptorImpl> type = new WebserviceDescriptionTypeImpl<TestDescriptorImpl>(
            provider, "webservice-descriptionType", provider.getRootNode());
      type.setWsdlPublishLocation("test");
      assertEquals(type.getWsdlPublishLocation(), "test");
      type.removeWsdlPublishLocation();
      assertNull(type.getWsdlPublishLocation());
   }
}
