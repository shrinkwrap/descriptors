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
package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class PortComponentTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testPortComponentName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setPortComponentName("test");
      assertEquals(type.getPortComponentName(), "test");
      type.removePortComponentName();
      assertNull(type.getPortComponentName());
   }

   
   @Test
   public void testPortComponentUri() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setPortComponentUri("test");
      assertEquals(type.getPortComponentUri(), "test");
      type.removePortComponentUri();
      assertNull(type.getPortComponentUri());
   }

   
   @Test
   public void testAuthMethod() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setAuthMethod("test");
      assertEquals(type.getAuthMethod(), "test");
      type.removeAuthMethod();
      assertNull(type.getAuthMethod());
   }

   
   @Test
   public void testTransportGuarantee() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setTransportGuarantee("test");
      assertEquals(type.getTransportGuarantee(), "test");
      type.removeTransportGuarantee();
      assertNull(type.getTransportGuarantee());
   }

   
   @Test
   public void testSecureWsdlAccess() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PortComponentType<TestDescriptorImpl> type = new PortComponentTypeImpl<TestDescriptorImpl>(provider, "port-componentType", provider.getRootNode());
      type.setSecureWsdlAccess(true);
      assertTrue(type.isSecureWsdlAccess());
      type.removeSecureWsdlAccess();
      assertFalse(type.isSecureWsdlAccess());
   }
}
