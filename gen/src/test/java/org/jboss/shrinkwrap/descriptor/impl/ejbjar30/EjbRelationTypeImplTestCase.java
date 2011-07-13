package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.EjbRelationshipRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbRelationshipRoleType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.EjbRelationshipRoleTypeImpl;

public class EjbRelationTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationType<TestDescriptorImpl> type = new EjbRelationTypeImpl<TestDescriptorImpl>(provider, "ejb-relationType", provider.getRootNode());
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
   public void testEjbRelationName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationType<TestDescriptorImpl> type = new EjbRelationTypeImpl<TestDescriptorImpl>(provider, "ejb-relationType", provider.getRootNode());
      type.setEjbRelationName("test");
      assertEquals(type.getEjbRelationName(), "test");
      type.removeEjbRelationName();
      assertNull(type.getEjbRelationName());
   }

   
   @Test
   public void testEjbRelationshipRole() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbRelationType<TestDescriptorImpl> type = new EjbRelationTypeImpl<TestDescriptorImpl>(provider, "ejb-relationType", provider.getRootNode());
      type.ejbRelationshipRole().up();
      type.removeEjbRelationshipRole();
      assertNull(provider.getRootNode().getSingle("ejb-relationship-role"));
   }

}
