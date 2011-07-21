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
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class WebResourceCollectionTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testWebResourceName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
      type.setWebResourceName("test");
      assertEquals(type.getWebResourceName(), "test");
      type.removeWebResourceName();
      assertNull(type.getWebResourceName());
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
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
   public void testUrlPattern() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
      type.setUrlPattern("value1");
      type.setUrlPattern("value2");
      type.setUrlPatternList("value3", "value4");
      assertTrue(type.getUrlPatternList().size() == 4);
      assertEquals(type.getUrlPatternList().get(0), "value1");
      assertEquals(type.getUrlPatternList().get(1), "value2");
      assertEquals(type.getUrlPatternList().get(2), "value3");
      assertEquals(type.getUrlPatternList().get(3), "value4");
      type.removeAllUrlPattern();
      assertTrue(type.getUrlPatternList().size() == 0);
   }

   @Test
   public void testHttpMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
      type.setHttpMethod("value1");
      type.setHttpMethod("value2");
      type.setHttpMethodList("value3", "value4");
      assertTrue(type.getHttpMethodList().size() == 4);
      assertEquals(type.getHttpMethodList().get(0), "value1");
      assertEquals(type.getHttpMethodList().get(1), "value2");
      assertEquals(type.getHttpMethodList().get(2), "value3");
      assertEquals(type.getHttpMethodList().get(3), "value4");
      type.removeAllHttpMethod();
      assertTrue(type.getHttpMethodList().size() == 0);
   }

   @Test
   public void testHttpMethodOmission() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      WebResourceCollectionType<TestDescriptorImpl> type = new WebResourceCollectionTypeImpl<TestDescriptorImpl>(
            provider, "web-resource-collectionType", provider.getRootNode());
      type.setHttpMethodOmission("value1");
      type.setHttpMethodOmission("value2");
      type.setHttpMethodOmissionList("value3", "value4");
      assertTrue(type.getHttpMethodOmissionList().size() == 4);
      assertEquals(type.getHttpMethodOmissionList().get(0), "value1");
      assertEquals(type.getHttpMethodOmissionList().get(1), "value2");
      assertEquals(type.getHttpMethodOmissionList().get(2), "value3");
      assertEquals(type.getHttpMethodOmissionList().get(3), "value4");
      type.removeAllHttpMethodOmission();
      assertTrue(type.getHttpMethodOmissionList().size() == 0);
   }
}
