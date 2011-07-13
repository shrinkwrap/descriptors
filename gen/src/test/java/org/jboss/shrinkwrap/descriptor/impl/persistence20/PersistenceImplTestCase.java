package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.PersistenceUnitImpl;

public class PersistenceImplTestCase
{   
   @Test
   public void testPersistenceUnit() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      Persistence<TestDescriptorImpl> type = new PersistenceImpl<TestDescriptorImpl>(provider, "persistence", provider.getRootNode());
      type.persistenceUnit().up();
      type.persistenceUnit().up();
      assertTrue(type.getPersistenceUnitList().size() == 2);
      type.removeAllPersistenceUnit();
      assertTrue(type.getPersistenceUnitList().size() == 0);
   }

   
   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      Persistence<TestDescriptorImpl> type = new PersistenceImpl<TestDescriptorImpl>(provider, "persistence", provider.getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }
}
