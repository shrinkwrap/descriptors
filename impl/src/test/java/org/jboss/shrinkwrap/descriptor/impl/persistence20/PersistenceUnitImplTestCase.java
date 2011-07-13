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
package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitCachingType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitValidationModeType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class PersistenceUnitImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setDescription("test");
      assertEquals(type.getDescription(), "test");
      type.removeDescription();
      assertNull(type.getDescription());
   }

   @Test
   public void testProvider() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setProvider("test");
      assertEquals(type.getProvider(), "test");
      type.removeProvider();
      assertNull(type.getProvider());
   }

   @Test
   public void testJtaDataSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setJtaDataSource("test");
      assertEquals(type.getJtaDataSource(), "test");
      type.removeJtaDataSource();
      assertNull(type.getJtaDataSource());
   }

   @Test
   public void testNonJtaDataSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setNonJtaDataSource("test");
      assertEquals(type.getNonJtaDataSource(), "test");
      type.removeNonJtaDataSource();
      assertNull(type.getNonJtaDataSource());
   }

   @Test
   public void testMappingFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setMappingFile("value1");
      type.setMappingFile("value2");
      type.setMappingFileList("value3", "value4");
      assertTrue(type.getMappingFileList().size() == 4);
      assertEquals(type.getMappingFileList().get(0), "value1");
      assertEquals(type.getMappingFileList().get(1), "value2");
      assertEquals(type.getMappingFileList().get(2), "value3");
      assertEquals(type.getMappingFileList().get(3), "value4");
      type.removeAllMappingFile();
      assertTrue(type.getMappingFileList().size() == 0);
   }

   @Test
   public void testJarFile() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setJarFile("value1");
      type.setJarFile("value2");
      type.setJarFileList("value3", "value4");
      assertTrue(type.getJarFileList().size() == 4);
      assertEquals(type.getJarFileList().get(0), "value1");
      assertEquals(type.getJarFileList().get(1), "value2");
      assertEquals(type.getJarFileList().get(2), "value3");
      assertEquals(type.getJarFileList().get(3), "value4");
      type.removeAllJarFile();
      assertTrue(type.getJarFileList().size() == 0);
   }

   @Test
   public void testClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setClazz("value1");
      type.setClazz("value2");
      type.setClazzList("value3", "value4");
      assertTrue(type.getClazzList().size() == 4);
      assertEquals(type.getClazzList().get(0), "value1");
      assertEquals(type.getClazzList().get(1), "value2");
      assertEquals(type.getClazzList().get(2), "value3");
      assertEquals(type.getClazzList().get(3), "value4");
      type.removeAllClazz();
      assertTrue(type.getClazzList().size() == 0);
   }

   @Test
   public void testExcludeUnlistedClasses() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setExcludeUnlistedClasses(true);
      assertTrue(type.isExcludeUnlistedClasses());
      type.removeExcludeUnlistedClasses();
      assertFalse(type.isExcludeUnlistedClasses());
   }

   @Test
   public void testSharedCacheMode() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      for (PersistenceUnitCachingType e : PersistenceUnitCachingType.values())
      {
         type.setSharedCacheMode(e);
         assertEquals(type.getSharedCacheMode(), e);
         type.setSharedCacheMode(e.toString());
         assertEquals(type.getSharedCacheModeAsString(), e.toString());
      }
   }

   @Test
   public void testValidationMode() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      for (PersistenceUnitValidationModeType e : PersistenceUnitValidationModeType.values())
      {
         type.setValidationMode(e);
         assertEquals(type.getValidationMode(), e);
         type.setValidationMode(e.toString());
         assertEquals(type.getValidationModeAsString(), e.toString());
      }
   }

   @Test
   public void testProperties() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.properties().up();
      type.removeProperties();
      assertNull(provider.getRootNode().getSingle("properties"));
   }

   @Test
   public void testName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      type.setName("test");
      assertEquals(type.getName(), "test");
      type.removeName();
      assertNull(type.getName());
   }

   @Test
   public void testTransactionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnit<TestDescriptorImpl> type = new PersistenceUnitImpl<TestDescriptorImpl>(provider,
            "persistence-unit", provider.getRootNode());
      for (PersistenceUnitTransactionType e : PersistenceUnitTransactionType.values())
      {
         type.setTransactionType(e);
         assertEquals(type.getTransactionType(), e);
         type.setTransactionType(e.toString());
         assertEquals(type.getTransactionTypeAsString(), e.toString());
      }
   }
}
