package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MessageDrivenBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.ActivationConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.AroundInvokeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefTypeImpl;

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
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }
}
