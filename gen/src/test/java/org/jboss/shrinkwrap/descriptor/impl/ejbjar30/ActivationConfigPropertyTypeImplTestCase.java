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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;

public class ActivationConfigPropertyTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigPropertyType<TestDescriptorImpl> type = new ActivationConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "activation-config-propertyType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testActivationConfigPropertyName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigPropertyType<TestDescriptorImpl> type = new ActivationConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "activation-config-propertyType", provider.getRootNode());
      type.setActivationConfigPropertyName("test");
      assertEquals(type.getActivationConfigPropertyName(), "test");
      type.removeActivationConfigPropertyName();
      assertNull(type.getActivationConfigPropertyName());
   }

   
   @Test
   public void testActivationConfigPropertyValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ActivationConfigPropertyType<TestDescriptorImpl> type = new ActivationConfigPropertyTypeImpl<TestDescriptorImpl>(provider, "activation-config-propertyType", provider.getRootNode());
      type.setActivationConfigPropertyValue("test");
      assertEquals(type.getActivationConfigPropertyValue(), "test");
      type.removeActivationConfigPropertyValue();
      assertNull(type.getActivationConfigPropertyValue());
   }
}
