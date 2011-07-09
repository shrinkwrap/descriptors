package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SessionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.StatefulTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.StatefulTimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.TimerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrencyManagementTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ConcurrentMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.DependsOnType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.DependsOnTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InitMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.InitMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.RemoveMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AsyncMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AsyncMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AroundInvokeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AroundTimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.SecurityIdentityTypeImpl;
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

public class SessionBeanTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setHome("test");
      assertEquals(type.getHome(), "test");
      type.removeHome();
      assertNull(type.getHome());
   }

   
   @Test
   public void testRemote() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setRemote("test");
      assertEquals(type.getRemote(), "test");
      type.removeRemote();
      assertNull(type.getRemote());
   }

   
   @Test
   public void testLocalHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setLocalHome("test");
      assertEquals(type.getLocalHome(), "test");
      type.removeLocalHome();
      assertNull(type.getLocalHome());
   }

   
   @Test
   public void testLocal() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setLocal("test");
      assertEquals(type.getLocal(), "test");
      type.removeLocal();
      assertNull(type.getLocal());
   }

   
   @Test
   public void testBusinessLocal() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setBusinessLocal("value1");
      type.setBusinessLocal("value2");
      type.setBusinessLocalList("value3", "value4");
      assertTrue(type.getBusinessLocalList().size() == 4);
      assertEquals(type.getBusinessLocalList().get(0), "value1");
      assertEquals(type.getBusinessLocalList().get(1), "value2");
      assertEquals(type.getBusinessLocalList().get(2), "value3");
      assertEquals(type.getBusinessLocalList().get(3), "value4");
      type.removeAllBusinessLocal();
      assertTrue(type.getBusinessLocalList().size() == 0);
   }

   
   @Test
   public void testBusinessRemote() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setBusinessRemote("value1");
      type.setBusinessRemote("value2");
      type.setBusinessRemoteList("value3", "value4");
      assertTrue(type.getBusinessRemoteList().size() == 4);
      assertEquals(type.getBusinessRemoteList().get(0), "value1");
      assertEquals(type.getBusinessRemoteList().get(1), "value2");
      assertEquals(type.getBusinessRemoteList().get(2), "value3");
      assertEquals(type.getBusinessRemoteList().get(3), "value4");
      type.removeAllBusinessRemote();
      assertTrue(type.getBusinessRemoteList().size() == 0);
   }

   
   @Test
   public void testLocalBean() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.localBean();
      assertTrue(type.isLocalBean());
   }

   
   @Test
   public void testServiceEndpoint() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setServiceEndpoint("test");
      assertEquals(type.getServiceEndpoint(), "test");
      type.removeServiceEndpoint();
      assertNull(type.getServiceEndpoint());
   }

   
   @Test
   public void testEjbClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setEjbClass("test");
      assertEquals(type.getEjbClass(), "test");
      type.removeEjbClass();
      assertNull(type.getEjbClass());
   }

   
   @Test
   public void testSessionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      for(SessionTypeType e: SessionTypeType.values())
      {
         type.setSessionType(e);
         assertEquals(type.getSessionType(), e);
         type.setSessionType(e.toString());
         assertEquals(type.getSessionTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testStatefulTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.statefulTimeout().up();
      type.removeStatefulTimeout();
      assertNull(provider.getRootNode().getSingle("stateful-timeout"));
   }

   
   @Test
   public void testTimeoutMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.timeoutMethod().up();
      type.removeTimeoutMethod();
      assertNull(provider.getRootNode().getSingle("timeout-method"));
   }

   
   @Test
   public void testTimer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.timer().up();
      type.timer().up();
      assertTrue(type.getTimerList().size() == 2);
      type.removeAllTimer();
      assertTrue(type.getTimerList().size() == 0);
   }

   
   @Test
   public void testInitOnStartup() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.setInitOnStartup(true);
      assertTrue(type.isInitOnStartup());
   }

   
   @Test
   public void testConcurrencyManagementType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      for(ConcurrencyManagementTypeType e: ConcurrencyManagementTypeType.values())
      {
         type.setConcurrencyManagementType(e);
         assertEquals(type.getConcurrencyManagementType(), e);
         type.setConcurrencyManagementType(e.toString());
         assertEquals(type.getConcurrencyManagementTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testConcurrentMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.concurrentMethod().up();
      type.concurrentMethod().up();
      assertTrue(type.getConcurrentMethodList().size() == 2);
      type.removeAllConcurrentMethod();
      assertTrue(type.getConcurrentMethodList().size() == 0);
   }

   
   @Test
   public void testDependsOn() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.dependsOn().up();
      type.removeDependsOn();
      assertNull(provider.getRootNode().getSingle("depends-on"));
   }

   
   @Test
   public void testInitMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.initMethod().up();
      type.initMethod().up();
      assertTrue(type.getInitMethodList().size() == 2);
      type.removeAllInitMethod();
      assertTrue(type.getInitMethodList().size() == 0);
   }

   
   @Test
   public void testRemoveMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.removeMethod().up();
      type.removeMethod().up();
      assertTrue(type.getRemoveMethodList().size() == 2);
      type.removeAllRemoveMethod();
      assertTrue(type.getRemoveMethodList().size() == 0);
   }

   
   @Test
   public void testAsyncMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.asyncMethod().up();
      type.asyncMethod().up();
      assertTrue(type.getAsyncMethodList().size() == 2);
      type.removeAllAsyncMethod();
      assertTrue(type.getAsyncMethodList().size() == 0);
   }

   
   @Test
   public void testTransactionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      for(TransactionTypeType e: TransactionTypeType.values())
      {
         type.setTransactionType(e);
         assertEquals(type.getTransactionType(), e);
         type.setTransactionType(e.toString());
         assertEquals(type.getTransactionTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testAfterBeginMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.afterBeginMethod().up();
      type.removeAfterBeginMethod();
      assertNull(provider.getRootNode().getSingle("after-begin-method"));
   }

   
   @Test
   public void testBeforeCompletionMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.beforeCompletionMethod().up();
      type.removeBeforeCompletionMethod();
      assertNull(provider.getRootNode().getSingle("before-completion-method"));
   }

   
   @Test
   public void testAfterCompletionMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.afterCompletionMethod().up();
      type.removeAfterCompletionMethod();
      assertNull(provider.getRootNode().getSingle("after-completion-method"));
   }

   
   @Test
   public void testAroundInvoke() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.aroundInvoke().up();
      type.aroundInvoke().up();
      assertTrue(type.getAroundInvokeList().size() == 2);
      type.removeAllAroundInvoke();
      assertTrue(type.getAroundInvokeList().size() == 0);
   }

   
   @Test
   public void testAroundTimeout() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.aroundTimeout().up();
      type.aroundTimeout().up();
      assertTrue(type.getAroundTimeoutList().size() == 2);
      type.removeAllAroundTimeout();
      assertTrue(type.getAroundTimeoutList().size() == 0);
   }

   
   @Test
   public void testPostActivate() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.postActivate().up();
      type.postActivate().up();
      assertTrue(type.getPostActivateList().size() == 2);
      type.removeAllPostActivate();
      assertTrue(type.getPostActivateList().size() == 0);
   }

   
   @Test
   public void testPrePassivate() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.prePassivate().up();
      type.prePassivate().up();
      assertTrue(type.getPrePassivateList().size() == 2);
      type.removeAllPrePassivate();
      assertTrue(type.getPrePassivateList().size() == 0);
   }

   
   @Test
   public void testSecurityRoleRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
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
      SessionBeanType<TestDescriptorImpl> type = new SessionBeanTypeImpl<TestDescriptorImpl>(provider, "session-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }
}
