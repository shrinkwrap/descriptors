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
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextTypeType;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class PersistenceContextRefTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.setJndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }

   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }

   @Test
   public void testIgnoreDependency() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.ignoreDependency();
      assertTrue(type.isIgnoreDependency());
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
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
   public void testPersistenceContextRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.setPersistenceContextRefName("test");
      assertEquals(type.getPersistenceContextRefName(), "test");
      type.removePersistenceContextRefName();
      assertNull(type.getPersistenceContextRefName());
   }

   @Test
   public void testPersistenceUnitName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.setPersistenceUnitName("test");
      assertEquals(type.getPersistenceUnitName(), "test");
      type.removePersistenceUnitName();
      assertNull(type.getPersistenceUnitName());
   }

   @Test
   public void testPersistenceContextType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      for (PersistenceContextTypeType e : PersistenceContextTypeType.values())
      {
         type.setPersistenceContextType(e);
         assertEquals(type.getPersistenceContextType(), e);
         type.setPersistenceContextType(e.toString());
         assertEquals(type.getPersistenceContextTypeAsString(), e.toString());
      }
   }

   @Test
   public void testPersistenceProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(
            provider, "persistence-context-refType", provider.getRootNode());
      type.persistenceProperty().up();
      type.persistenceProperty().up();
      assertTrue(type.getPersistencePropertyList().size() == 2);
      type.removeAllPersistenceProperty();
      assertTrue(type.getPersistencePropertyList().size() == 0);
   }
}
