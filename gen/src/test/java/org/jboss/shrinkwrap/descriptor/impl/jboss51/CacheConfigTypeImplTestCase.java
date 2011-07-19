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
import org.jboss.shrinkwrap.descriptor.api.jboss51.CacheConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class CacheConfigTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testCacheValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setCacheValue("test");
      assertEquals(type.getCacheValue(), "test");
      type.removeCacheValue();
      assertNull(type.getCacheValue());
   }

   
   @Test
   public void testCacheMaxSize() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setCacheMaxSize(8);
      assertTrue(type.getCacheMaxSize() == 8);
      type.removeCacheMaxSize();
      assertNull(type.getCacheMaxSize());
   }

   
   @Test
   public void testIdleTimeoutSeconds() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setIdleTimeoutSeconds(8);
      assertTrue(type.getIdleTimeoutSeconds() == 8);
      type.removeIdleTimeoutSeconds();
      assertNull(type.getIdleTimeoutSeconds());
   }

   
   @Test
   public void testRemoveTimeoutSeconds() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setRemoveTimeoutSeconds(8);
      assertTrue(type.getRemoveTimeoutSeconds() == 8);
      type.removeRemoveTimeoutSeconds();
      assertNull(type.getRemoveTimeoutSeconds());
   }

   
   @Test
   public void testCacheName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setCacheName("test");
      assertEquals(type.getCacheName(), "test");
      type.removeCacheName();
      assertNull(type.getCacheName());
   }

   
   @Test
   public void testPersistenceManager() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setPersistenceManager("test");
      assertEquals(type.getPersistenceManager(), "test");
      type.removePersistenceManager();
      assertNull(type.getPersistenceManager());
   }

   
   @Test
   public void testReplicationIsPassivation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setReplicationIsPassivation("test");
      assertEquals(type.getReplicationIsPassivation(), "test");
      type.removeReplicationIsPassivation();
      assertNull(type.getReplicationIsPassivation());
   }
}
