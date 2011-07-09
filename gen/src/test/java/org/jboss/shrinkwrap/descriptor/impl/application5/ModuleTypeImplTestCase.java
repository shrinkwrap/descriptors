package org.jboss.shrinkwrap.descriptor.impl.application5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application5.ModuleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.application5.WebType;
import org.jboss.shrinkwrap.descriptor.impl.application5.WebTypeImpl;

public class ModuleTypeImplTestCase
{   
   @Test
   public void testAltDd() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setAltDd("test");
      assertEquals(type.getAltDd(), "test");
      type.removeAltDd();
      assertNull(type.getAltDd());
   }

   
   @Test
   public void testConnector() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setConnector("test");
      assertEquals(type.getConnector(), "test");
      type.removeConnector();
      assertNull(type.getConnector());
   }

   
   @Test
   public void testEjb() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setEjb("test");
      assertEquals(type.getEjb(), "test");
      type.removeEjb();
      assertNull(type.getEjb());
   }

   
   @Test
   public void testJava() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setJava("test");
      assertEquals(type.getJava(), "test");
      type.removeJava();
      assertNull(type.getJava());
   }

   
   @Test
   public void testWeb() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.web().up();
      type.removeWeb();
      assertNull(provider.getRootNode().getSingle("web"));
   }
}
