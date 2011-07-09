package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.EnterpriseBeansTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.InterceptorsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.RelationshipsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AssemblyDescriptorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;

public class EjbJarTypeImplTestCase
{   
   @Test
   public void testModuleName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.setModuleName("test");
      assertEquals(type.getModuleName(), "test");
      type.removeModuleName();
      assertNull(type.getModuleName());
   }

   
   @Test
   public void testEnterpriseBeans() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.enterpriseBeans().up();
      type.removeEnterpriseBeans();
      assertNull(provider.getRootNode().getSingle("enterprise-beans"));
   }

   
   @Test
   public void testInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.interceptors().up();
      type.removeInterceptors();
      assertNull(provider.getRootNode().getSingle("interceptors"));
   }

   
   @Test
   public void testRelationships() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.relationships().up();
      type.removeRelationships();
      assertNull(provider.getRootNode().getSingle("relationships"));
   }

   
   @Test
   public void testAssemblyDescriptor() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.assemblyDescriptor().up();
      type.removeAssemblyDescriptor();
      assertNull(provider.getRootNode().getSingle("assembly-descriptor"));
   }

   
   @Test
   public void testEjbClientJar() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.setEjbClientJar("test");
      assertEquals(type.getEjbClientJar(), "test");
      type.removeEjbClientJar();
      assertNull(type.getEjbClientJar());
   }

   
   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }

   
   @Test
   public void testMetadataComplete() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider.getRootNode());
      type.setMetadataComplete(true);
      assertTrue(type.isMetadataComplete());
   }
}
