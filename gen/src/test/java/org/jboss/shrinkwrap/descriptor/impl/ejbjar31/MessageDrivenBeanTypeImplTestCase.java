package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.TimerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ActivationConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AroundInvokeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.AroundTimeoutTypeImpl;
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

public class MessageDrivenBeanTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testEjbClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setEjbClass("test");
      assertEquals(type.getEjbClass(), "test");
      type.removeEjbClass();
      assertNull(type.getEjbClass());
   }

   
   @Test
   public void testMessagingType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMessagingType("test");
      assertEquals(type.getMessagingType(), "test");
      type.removeMessagingType();
      assertNull(type.getMessagingType());
   }

   
   @Test
   public void testTimeoutMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.timeoutMethod().up();
      type.removeTimeoutMethod();
      assertNull(provider.getRootNode().getSingle("timeout-method"));
   }

   
   @Test
   public void testTimer() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.timer().up();
      type.timer().up();
      assertTrue(type.getTimerList().size() == 2);
      type.removeAllTimer();
      assertTrue(type.getTimerList().size() == 0);
   }

   
   @Test
   public void testTransactionType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      for(TransactionTypeType e: TransactionTypeType.values())
      {
         type.setTransactionType(e);
         assertEquals(type.getTransactionType(), e);
         type.setTransactionType(e.toString());
         assertEquals(type.getTransactionTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testMessageDestinationType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMessageDestinationType("test");
      assertEquals(type.getMessageDestinationType(), "test");
      type.removeMessageDestinationType();
      assertNull(type.getMessageDestinationType());
   }

   
   @Test
   public void testMessageDestinationLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMessageDestinationLink("test");
      assertEquals(type.getMessageDestinationLink(), "test");
      type.removeMessageDestinationLink();
      assertNull(type.getMessageDestinationLink());
   }

   
   @Test
   public void testActivationConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.activationConfig().up();
      type.removeActivationConfig();
      assertNull(provider.getRootNode().getSingle("activation-config"));
   }

   
   @Test
   public void testAroundInvoke() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.aroundTimeout().up();
      type.aroundTimeout().up();
      assertTrue(type.getAroundTimeoutList().size() == 2);
      type.removeAllAroundTimeout();
      assertTrue(type.getAroundTimeoutList().size() == 0);
   }

   
   @Test
   public void testSecurityRoleRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
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
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }
}
