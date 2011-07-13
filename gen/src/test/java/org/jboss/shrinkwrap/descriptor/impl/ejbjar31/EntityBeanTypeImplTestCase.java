package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EntityBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.PersistenceTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpVersionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.CmpFieldTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.QueryType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.QueryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;

public class EntityBeanTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setHome("test");
      assertEquals(type.getHome(), "test");
      type.removeHome();
      assertNull(type.getHome());
   }

   
   @Test
   public void testRemote() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setRemote("test");
      assertEquals(type.getRemote(), "test");
      type.removeRemote();
      assertNull(type.getRemote());
   }

   
   @Test
   public void testLocalHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setLocalHome("test");
      assertEquals(type.getLocalHome(), "test");
      type.removeLocalHome();
      assertNull(type.getLocalHome());
   }

   
   @Test
   public void testLocal() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setLocal("test");
      assertEquals(type.getLocal(), "test");
      type.removeLocal();
      assertNull(type.getLocal());
   }

   
   @Test
   public void testEjbClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setEjbClass("test");
      assertEquals(type.getEjbClass(), "test");
      type.removeEjbClass();
      assertNull(type.getEjbClass());
   }

   
   @Test
   public void testPersistenceType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      for(PersistenceTypeType e: PersistenceTypeType.values())
      {
         type.setPersistenceType(e);
         assertEquals(type.getPersistenceType(), e);
         type.setPersistenceType(e.toString());
         assertEquals(type.getPersistenceTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testPrimKeyClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setPrimKeyClass("test");
      assertEquals(type.getPrimKeyClass(), "test");
      type.removePrimKeyClass();
      assertNull(type.getPrimKeyClass());
   }

   
   @Test
   public void testReentrant() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setReentrant(true);
      assertTrue(type.isReentrant());
   }

   
   @Test
   public void testCmpVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      for(CmpVersionType e: CmpVersionType.values())
      {
         type.setCmpVersion(e);
         assertEquals(type.getCmpVersion(), e);
         type.setCmpVersion(e.toString());
         assertEquals(type.getCmpVersionAsString(), e.toString());
      }
   }

   
   @Test
   public void testAbstractSchemaName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setAbstractSchemaName("test");
      assertEquals(type.getAbstractSchemaName(), "test");
      type.removeAbstractSchemaName();
      assertNull(type.getAbstractSchemaName());
   }

   
   @Test
   public void testCmpField() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.cmpField().up();
      type.cmpField().up();
      assertTrue(type.getCmpFieldList().size() == 2);
      type.removeAllCmpField();
      assertTrue(type.getCmpFieldList().size() == 0);
   }

   
   @Test
   public void testPrimkeyField() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.setPrimkeyField("test");
      assertEquals(type.getPrimkeyField(), "test");
      type.removePrimkeyField();
      assertNull(type.getPrimkeyField());
   }

   
   @Test
   public void testSecurityRoleRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.securityRoleRef().up();
      type.securityRoleRef().up();
      assertTrue(type.getSecurityRoleRefList().size() == 2);
      type.removeAllSecurityRoleRef();
      assertTrue(type.getSecurityRoleRefList().size() == 0);
   }

   
   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   
   @Test
   public void testQuery() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EntityBeanType<TestDescriptorImpl> type = new EntityBeanTypeImpl<TestDescriptorImpl>(provider, "entity-beanType", provider.getRootNode());
      type.query().up();
      type.query().up();
      assertTrue(type.getQueryList().size() == 2);
      type.removeAllQuery();
      assertTrue(type.getQueryList().size() == 0);
   }
}
