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
package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.javaee5.ResAuthType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResSharingScopeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class ResourceRefTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
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
   public void testResRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      type.setResRefName("test");
      assertEquals(type.getResRefName(), "test");
      type.removeResRefName();
      assertNull(type.getResRefName());
   }

   @Test
   public void testResType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      type.setResType("test");
      assertEquals(type.getResType(), "test");
      type.removeResType();
      assertNull(type.getResType());
   }

   @Test
   public void testResAuth() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      for (ResAuthType e : ResAuthType.values())
      {
         type.setResAuth(e);
         assertEquals(type.getResAuth(), e);
         type.setResAuth(e.toString());
         assertEquals(type.getResAuthAsString(), e.toString());
      }
   }

   @Test
   public void testResSharingScope() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceRefType<TestDescriptorImpl> type = new ResourceRefTypeImpl<TestDescriptorImpl>(provider,
            "resource-refType", provider.getRootNode());
      for (ResSharingScopeType e : ResSharingScopeType.values())
      {
         type.setResSharingScope(e);
         assertEquals(type.getResSharingScope(), e);
         type.setResSharingScope(e.toString());
         assertEquals(type.getResSharingScopeAsString(), e.toString());
      }
   }
}
