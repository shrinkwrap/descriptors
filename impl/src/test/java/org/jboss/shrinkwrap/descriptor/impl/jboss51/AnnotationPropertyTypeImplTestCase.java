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

import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class AnnotationPropertyTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider,
            "annotation-propertyType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider,
            "annotation-propertyType", provider.getRootNode());
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
   public void testPropertyName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider,
            "annotation-propertyType", provider.getRootNode());
      type.setPropertyName("test");
      assertEquals(type.getPropertyName(), "test");
      type.removePropertyName();
      assertNull(type.getPropertyName());
   }

   @Test
   public void testPropertyValue() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      AnnotationPropertyType<TestDescriptorImpl> type = new AnnotationPropertyTypeImpl<TestDescriptorImpl>(provider,
            "annotation-propertyType", provider.getRootNode());
      type.setPropertyValue("test");
      assertEquals(type.getPropertyValue(), "test");
      type.removePropertyValue();
      assertNull(type.getPropertyValue());
   }
}
