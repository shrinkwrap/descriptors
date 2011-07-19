/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MethodPermissionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ContainerTransactionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.InterceptorBindingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ExcludeListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ApplicationExceptionTypeImpl;

public class AssemblyDescriptorTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AssemblyDescriptorType<TestDescriptorImpl> type = new AssemblyDescriptorTypeImpl<TestDescriptorImpl>(provider, "assembly-descriptorType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
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
