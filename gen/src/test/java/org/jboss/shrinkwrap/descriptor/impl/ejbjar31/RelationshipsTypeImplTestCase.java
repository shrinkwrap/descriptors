package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbRelationType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.EjbRelationTypeImpl;

public class RelationshipsTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RelationshipsType<TestDescriptorImpl> type = new RelationshipsTypeImpl<TestDescriptorImpl>(provider, "relationshipsType", provider.getRootNode());
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
   public void testEjbRelation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      RelationshipsType<TestDescriptorImpl> type = new RelationshipsTypeImpl<TestDescriptorImpl>(provider, "relationshipsType", provider.getRootNode());
      type.ejbRelation().up();
      type.ejbRelation().up();
      assertTrue(type.getEjbRelationList().size() == 2);
      type.removeAllEjbRelation();
      assertTrue(type.getEjbRelationList().size() == 0);
   }
}
