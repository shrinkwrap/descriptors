package org.jboss.shrinkwrap.descriptor.impl.jbosscommon51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.InjectionTargetTypeImpl;

public class PersistenceContextRefTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(provider, "persistence-context-refType", provider.getRootNode());
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
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(provider, "persistence-context-refType", provider.getRootNode());
      type.setPersistenceContextRefName("test");
      assertEquals(type.getPersistenceContextRefName(), "test");
      type.removePersistenceContextRefName();
      assertNull(type.getPersistenceContextRefName());
   }

   
   @Test
   public void testPersistenceUnitName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(provider, "persistence-context-refType", provider.getRootNode());
      type.setPersistenceUnitName("test");
      assertEquals(type.getPersistenceUnitName(), "test");
      type.removePersistenceUnitName();
      assertNull(type.getPersistenceUnitName());
   }

   
   @Test
   public void testPersistenceContextType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(provider, "persistence-context-refType", provider.getRootNode());
      for(PersistenceContextTypeType e: PersistenceContextTypeType.values())
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
      PersistenceContextRefType<TestDescriptorImpl> type = new PersistenceContextRefTypeImpl<TestDescriptorImpl>(provider, "persistence-context-refType", provider.getRootNode());
      type.persistenceProperty().up();
      type.persistenceProperty().up();
      assertTrue(type.getPersistencePropertyList().size() == 2);
      type.removeAllPersistenceProperty();
      assertTrue(type.getPersistencePropertyList().size() == 0);
   }
}
