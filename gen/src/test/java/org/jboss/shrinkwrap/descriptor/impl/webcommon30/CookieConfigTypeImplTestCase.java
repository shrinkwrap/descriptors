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

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class CookieConfigTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setName("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   
   @Test
   public void testDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setDomain("test");
      assertEquals(type.getDomain(), "test");
      type.removeDomain();
      assertNull(type.getDomain());
   }

   
   @Test
   public void testPath() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setPath("test");
      assertEquals(type.getPath(), "test");
      type.removePath();
      assertNull(type.getPath());
   }

   
   @Test
   public void testComment() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setComment("test");
      assertEquals(type.getComment(), "test");
      type.removeComment();
      assertNull(type.getComment());
   }

   
   @Test
   public void testHttpOnly() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setHttpOnly(true);
      assertTrue(type.isHttpOnly());
      type.removeHttpOnly();
      assertFalse(type.isHttpOnly());
   }

   
   @Test
   public void testSecure() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setSecure(true);
      assertTrue(type.isSecure());
      type.removeSecure();
      assertFalse(type.isSecure());
   }

   
   @Test
   public void testMaxAge() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CookieConfigType<TestDescriptorImpl> type = new CookieConfigTypeImpl<TestDescriptorImpl>(provider, "cookie-configType", provider.getRootNode());
      type.setMaxAge(8);
      assertTrue(type.getMaxAge() == 8);
      type.removeMaxAge();
      assertNull(type.getMaxAge());
   }
}
