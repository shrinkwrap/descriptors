package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationshipRoleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.RelationshipRoleSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.CmrFieldTypeImpl;

public class EjbRelationshipRoleTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
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
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
      type.setEjbRelationshipRoleName("test");
      assertEquals(type.getEjbRelationshipRoleName(), "test");
      type.removeEjbRelationshipRoleName();
      assertNull(type.getEjbRelationshipRoleName());
   }

   
   @Test
   public void testMultiplicity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
      for(MultiplicityType e: MultiplicityType.values())
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
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
      type.cascadeDelete();
      assertTrue(type.isCascadeDelete());
   }

   
   @Test
   public void testRelationshipRoleSource() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
      type.relationshipRoleSource().up();
      type.removeRelationshipRoleSource();
      assertNull(provider.getRootNode().getSingle("relationship-role-source"));
   }

   
   @Test
   public void testCmrField() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationshipRoleType<TestDescriptorImpl> type = new EjbRelationshipRoleTypeImpl<TestDescriptorImpl>(provider, "ejb-relationship-roleType", provider.getRootNode());
      type.cmrField().up();
      type.removeCmrField();
      assertNull(provider.getRootNode().getSingle("cmr-field"));
   }
}
