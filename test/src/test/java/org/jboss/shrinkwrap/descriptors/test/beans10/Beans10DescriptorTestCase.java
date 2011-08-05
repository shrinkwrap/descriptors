/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptors.test.beans10;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.cdi10.Beans10Descriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test Case to verify that {@link BeansDescriptor} impl produce the correct 
 * XML Descriptor output.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */

public class Beans10DescriptorTestCase
{
   @Stereotype
   @Alternative
   private @interface TestAlternativeStereoType {
   }

   @Alternative
   private class TestAlternativeClass
   {
   }

   @Interceptor
   private class TestInterceptor
   {
   }

   @Decorator
   private class TestDecorator
   {
   }

   //-------------------------------------------------------------------------------------||
   // Basic API --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("beans.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(Beans10Descriptor.class, "test.xml").getDescriptorName());
   }

   //-------------------------------------------------------------------------------------||
   // Alternative StereoTypes ------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

//   @Test(expected = IllegalArgumentException.class)
//   public void shouldNotBeAbleToAddNonAlternativeStereoType()
//   {
//      create().alternatives().setStereotype(Override.class.getName());
//   }

   @Test
   public void shouldBeAbleToAddAlternativeStereoType() throws Exception
   {
      String desc = create().alternatives().setStereotype(TestAlternativeStereoType.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeStereoTypes() throws Exception
   {
      @SuppressWarnings("unchecked")
      String desc = create().alternatives().setStereotypeList(TestAlternativeStereoType.class.getName(), TestAlternativeStereoType.class.getName()).up()
            .exportAsString();

      assertXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName(),
            TestAlternativeStereoType.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Alternative Classes ----------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

//   @Test(expected = IllegalArgumentException.class)
//   public void shouldNotBeAbleToAddNonAlternativeClass()
//   {
//      create().alternatives().setClazz(String.class.getName());
//   }

   @Test
   public void shouldBeAbleToAddAlternativeClass() throws Exception
   {
      String desc = create().alternatives().setClazz(TestAlternativeClass.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeClasses() throws Exception
   {
      String desc = create().alternatives().setClazzList(TestAlternativeClass.class.getName(), TestAlternativeClass.class.getName()).up()
            .exportAsString();

      assertXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName(), TestAlternativeClass.class
            .getName());
   }

   //-------------------------------------------------------------------------------------||
   // Interceptors -----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

//   @Test(expected = IllegalArgumentException.class)
//   public void shouldNotBeAbleToAddNonInterceptor() throws Exception
//   {
//      create().interceptors().setClazz(String.class.getName());
//   }

   @Test
   public void shouldBeAbleToAddInterceptor() throws Exception
   {
      String desc = create().interceptors().setClazz(TestInterceptor.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName());
   }

   @Test
   public void shouldBeAbleToAddInterceptors() throws Exception
   {
      String desc = create().interceptors().setClazzList(TestInterceptor.class.getName(), TestInterceptor.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName(), TestInterceptor.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Decorators -------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

//   @Test(expected = IllegalArgumentException.class)
//   public void shouldNotBeAbleToAddNonDecorator() throws Exception
//   {
//      create().decorators().setClazz(String.class.getName());
//   }

   @Test
   public void shouldBeAbleToAddDescorator() throws Exception
   {
      String desc = create().decorators().setClazz(TestDecorator.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescorators() throws Exception
   {
      String desc = create().decorators().setClazzList(TestDecorator.class.getName(), TestDecorator.class.getName()).up().exportAsString();

      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Export / Import round trip ---------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleToReadWhatWasExported() throws Exception
   {
      String desc = create().decorators().setClazzList(TestDecorator.class.getName(), TestDecorator.class.getName()).up().exportAsString();

      desc = Descriptors.importAs(Beans10Descriptor.class).from(desc).exportAsString();

      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());

   }

   //-------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Beans10Descriptor create()
   {
      return Descriptors.create(Beans10Descriptor.class);
   }
}
