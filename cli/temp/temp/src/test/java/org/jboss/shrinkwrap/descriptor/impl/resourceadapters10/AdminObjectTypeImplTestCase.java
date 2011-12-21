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
package org.jboss.shrinkwrap.descriptor.impl.resourceadapters10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.AdminObjectType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.resourceadapters10.ConfigPropertyTypeImpl;

public class AdminObjectTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testClassName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.className("test");
      assertEquals(type.getClassName(), "test");
      type.removeClassName();
      assertNull(type.getClassName());
   }
   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.jndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }
   
   @Test
   public void testEnabled() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.enabled(true);
      assertTrue(type.isEnabled());
      type.removeEnabled();
      assertFalse(type.isEnabled());
   }
   
   @Test
   public void testUseJavaContext() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.useJavaContext(true);
      assertTrue(type.isUseJavaContext());
      type.removeUseJavaContext();
      assertFalse(type.isUseJavaContext());
   }
   
   @Test
   public void testPoolName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.poolName("test");
      assertEquals(type.getPoolName(), "test");
      type.removePoolName();
      assertNull(type.getPoolName());
   }
   
   @Test
   public void testConfigProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AdminObjectType<TestDescriptorImpl> type = new AdminObjectTypeImpl<TestDescriptorImpl>(provider, "admin-objectType", provider.getRootNode());
      type.createConfigProperty().up();
      type.createConfigProperty().up();
      assertTrue(type.getAllConfigProperty().size() == 2);
      type.removeAllConfigProperty();
      assertTrue(type.getAllConfigProperty().size() == 0);
   }
}
