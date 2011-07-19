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
package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.InjectionTargetTypeImpl;

public class EjbLocalRefTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testLookupName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setLookupName("test");
      assertEquals(type.getLookupName(), "test");
      type.removeLookupName();
      assertNull(type.getLookupName());
   }
   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }
   
   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testEjbRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setEjbRefName("test");
      assertEquals(type.getEjbRefName(), "test");
      type.removeEjbRefName();
      assertNull(type.getEjbRefName());
   }

   
   @Test
   public void testEjbRefType() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      for(EjbRefTypeType e: EjbRefTypeType.values())
      {
         type.setEjbRefType(e);
         assertEquals(type.getEjbRefType(), e);
         type.setEjbRefType(e.toString());
         assertEquals(type.getEjbRefTypeAsString(), e.toString());
      }
   }

   
   @Test
   public void testLocalHome() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setLocalHome("test");
      assertEquals(type.getLocalHome(), "test");
      type.removeLocalHome();
      assertNull(type.getLocalHome());
   }

   
   @Test
   public void testLocal() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setLocal("test");
      assertEquals(type.getLocal(), "test");
      type.removeLocal();
      assertNull(type.getLocal());
   }

   
   @Test
   public void testEjbLink() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbLocalRefType<TestDescriptorImpl> type = new EjbLocalRefTypeImpl<TestDescriptorImpl>(provider, "ejb-local-refType", provider.getRootNode());
      type.setEjbLink("test");
      assertEquals(type.getEjbLink(), "test");
      type.removeEjbLink();
      assertNull(type.getEjbLink());
   }
}
