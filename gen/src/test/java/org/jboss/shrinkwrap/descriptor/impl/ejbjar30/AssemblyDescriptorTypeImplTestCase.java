package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.MethodPermissionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.ContainerTransactionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.InterceptorBindingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.ExcludeListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.ApplicationExceptionTypeImpl;

public class AssemblyDescriptorTypeImplTestCase
{   
   @Test
   public void testSecurityRole() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.securityRole().up();
      type.securityRole().up();
      assertTrue(type.getSecurityRoleList().size() == 2);
      type.removeAllSecurityRole();
      assertTrue(type.getSecurityRoleList().size() == 0);
   }

   
   @Test
   public void testMethodPermission() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.methodPermission().up();
      type.methodPermission().up();
      assertTrue(type.getMethodPermissionList().size() == 2);
      type.removeAllMethodPermission();
      assertTrue(type.getMethodPermissionList().size() == 0);
   }

   
   @Test
   public void testContainerTransaction() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.containerTransaction().up();
      type.containerTransaction().up();
      assertTrue(type.getContainerTransactionList().size() == 2);
      type.removeAllContainerTransaction();
      assertTrue(type.getContainerTransactionList().size() == 0);
   }

   
   @Test
   public void testInterceptorBinding() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.interceptorBinding().up();
      type.interceptorBinding().up();
      assertTrue(type.getInterceptorBindingList().size() == 2);
      type.removeAllInterceptorBinding();
      assertTrue(type.getInterceptorBindingList().size() == 0);
   }

   
   @Test
   public void testMessageDestination() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.messageDestination().up();
      type.messageDestination().up();
      assertTrue(type.getMessageDestinationList().size() == 2);
      type.removeAllMessageDestination();
      assertTrue(type.getMessageDestinationList().size() == 0);
   }

   
   @Test
   public void testExcludeList() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.excludeList().up();
      type.removeExcludeList();
      assertNull(provider.getRootNode().getSingle("exclude-list"));
   }

   
   @Test
   public void testApplicationException() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      type.applicationException().up();
      type.applicationException().up();
      assertTrue(type.getApplicationExceptionList().size() == 2);
      type.removeAllApplicationException();
      assertTrue(type.getApplicationExceptionList().size() == 0);
   }
}
