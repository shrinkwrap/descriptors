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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.WebResourceCollectionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.AuthConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.UserDataConstraintTypeImpl;

public class SecurityConstraintTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityConstraintType<TestDescriptorImpl> type = new SecurityConstraintTypeImpl<TestDescriptorImpl>(provider, "security-constraintType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityConstraintType<TestDescriptorImpl> type = new SecurityConstraintTypeImpl<TestDescriptorImpl>(provider, "security-constraintType", provider.getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }

   
   @Test
   public void testWebResourceCollection() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityConstraintType<TestDescriptorImpl> type = new SecurityConstraintTypeImpl<TestDescriptorImpl>(provider, "security-constraintType", provider.getRootNode());
      type.webResourceCollection().up();
      type.webResourceCollection().up();
      assertTrue(type.getWebResourceCollectionList().size() == 2);
      type.removeAllWebResourceCollection();
      assertTrue(type.getWebResourceCollectionList().size() == 0);
   }

   
   @Test
   public void testAuthConstraint() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityConstraintType<TestDescriptorImpl> type = new SecurityConstraintTypeImpl<TestDescriptorImpl>(provider, "security-constraintType", provider.getRootNode());
      type.authConstraint().up();
      type.removeAuthConstraint();
      assertNull(provider.getRootNode().getSingle("auth-constraint"));
   }

   
   @Test
   public void testUserDataConstraint() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      SecurityConstraintType<TestDescriptorImpl> type = new SecurityConstraintTypeImpl<TestDescriptorImpl>(provider, "security-constraintType", provider.getRootNode());
      type.userDataConstraint().up();
      type.removeUserDataConstraint();
      assertNull(provider.getRootNode().getSingle("user-data-constraint"));
   }
}
