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
package org.jboss.shrinkwrap.descriptor.impl.application6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.application6.WebType;
import org.jboss.shrinkwrap.descriptor.impl.application6.WebTypeImpl;

public class ModuleTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testAltDd() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setAltDd("test");
      assertEquals(type.getAltDd(), "test");
      type.removeAltDd();
      assertNull(type.getAltDd());
   }

   
   @Test
   public void testConnector() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setConnector("test");
      assertEquals(type.getConnector(), "test");
      type.removeConnector();
      assertNull(type.getConnector());
   }

   
   @Test
   public void testEjb() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setEjb("test");
      assertEquals(type.getEjb(), "test");
      type.removeEjb();
      assertNull(type.getEjb());
   }

   
   @Test
   public void testJava() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.setJava("test");
      assertEquals(type.getJava(), "test");
      type.removeJava();
      assertNull(type.getJava());
   }

   
   @Test
   public void testWeb() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ModuleType<TestDescriptorImpl> type = new ModuleTypeImpl<TestDescriptorImpl>(provider, "moduleType", provider.getRootNode());
      type.web().up();
      type.removeWeb();
      assertNull(provider.getRootNode().getSingle("web"));
   }
}
