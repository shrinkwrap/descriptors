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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class AnnotationTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
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
   public void testAnnotationClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
      type.setAnnotationClass("test");
      assertEquals(type.getAnnotationClass(), "test");
      type.removeAnnotationClass();
      assertNull(type.getAnnotationClass());
   }

   @Test
   public void testAnnotationImplementationClass() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
      type.setAnnotationImplementationClass("test");
      assertEquals(type.getAnnotationImplementationClass(), "test");
      type.removeAnnotationImplementationClass();
      assertNull(type.getAnnotationImplementationClass());
   }

   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
      type.injectionTarget().up();
      type.removeInjectionTarget();
      assertNull(provider.getRootNode().getSingle("injection-target"));
   }

   @Test
   public void testProperty() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationType<TestDescriptorImpl> type = new AnnotationTypeImpl<TestDescriptorImpl>(provider, "annotationType",
            provider.getRootNode());
      type.property().up();
      type.property().up();
      assertTrue(type.getPropertyList().size() == 2);
      type.removeAllProperty();
      assertTrue(type.getPropertyList().size() == 0);
   }
}
