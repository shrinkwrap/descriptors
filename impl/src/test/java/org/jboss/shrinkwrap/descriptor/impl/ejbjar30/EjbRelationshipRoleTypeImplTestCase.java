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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class EjbRelationshipRoleTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
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
   public void testEjbRelationshipRoleName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      type.setEjbRelationshipRoleName("test");
      assertEquals(type.getEjbRelationshipRoleName(), "test");
      type.removeEjbRelationshipRoleName();
      assertNull(type.getEjbRelationshipRoleName());
   }

   @Test
   public void testMultiplicity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      for (MultiplicityType e : MultiplicityType.values())
      {
         type.setMultiplicity(e);
         assertEquals(type.getMultiplicity(), e);
         type.setMultiplicity(e.toString());
         assertEquals(type.getMultiplicityAsString(), e.toString());
      }
   }

   @Test
   public void testCascadeDelete() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      type.cascadeDelete();
      assertTrue(type.isCascadeDelete());
   }

   @Test
   public void testRelationshipRoleSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      type.relationshipRoleSource().up();
      type.removeRelationshipRoleSource();
      assertNull(provider.getRootNode().getSingle("relationship-role-source"));
   }

   @Test
   public void testCmrField() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider,
            "ejb-relationship-roleType", provider.getRootNode());
      type.cmrField().up();
      type.removeCmrField();
      assertNull(provider.getRootNode().getSingle("cmr-field"));
   }
}
