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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class CacheConfigTypeImplTestCase
{   
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
   }

   
   @Test
   public void testIdleTimeoutSeconds() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setIdleTimeoutSeconds(8);
      assertTrue(type.getIdleTimeoutSeconds() == 8);
   }

   
   @Test
   public void testRemoveTimeoutSeconds() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      CacheConfigType<TestDescriptorImpl> type = new CacheConfigTypeImpl<TestDescriptorImpl>(provider, "cache-configType", provider.getRootNode());
      type.setRemoveTimeoutSeconds(8);
      assertTrue(type.getRemoveTimeoutSeconds() == 8);
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
