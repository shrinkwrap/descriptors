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
package org.jboss.shrinkwrap.descriptor.impl.spec.cdi.beans;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.junit.Test;

/**
 * Test Case to verify that {@link BeansDescriptor} impl produce the correct 
 * XML Descriptor output.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class BeansDescriptorTestCase
{
   @Stereotype
   @Alternative
   private @interface TestAlternativeStereoType { }
   
   @Alternative
   private class TestAlternativeClass {}
   
   @Interceptor
   private class TestInterceptor {}
   
   @Decorator
   private class TestDecorator {}

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
      Assert.assertEquals("test.xml", Descriptors.create(BeansDescriptor.class, "test.xml").getDescriptorName());
   }
   
   //-------------------------------------------------------------------------------------||
   // Alternative StereoTypes ------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonAlternativeStereoType()
   {
      create().alternativeStereotype(Override.class);
   }
   
   @Test
   public void shouldBeAbleToAddAlternativeStereoType() throws Exception
   {
      String desc = create().alternativeStereotype(TestAlternativeStereoType.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName());
   }
   
   @Test
   public void shouldBeAbleToAddAlternativeStereoTypes() throws Exception
   {
      @SuppressWarnings("unchecked")
      String desc = create().alternativeStereotypes(TestAlternativeStereoType.class, TestAlternativeStereoType.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName(), TestAlternativeStereoType.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Alternative Classes ----------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonAlternativeClass()
   {
      create().alternativeClass(String.class);
   }

   @Test
   public void shouldBeAbleToAddAlternativeClass() throws Exception
   {
      String desc = create().alternativeClass(TestAlternativeClass.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName());
   }
   
   @Test
   public void shouldBeAbleToAddAlternativeClasses() throws Exception
   {
      String desc = create().alternativeClasses(TestAlternativeClass.class, TestAlternativeClass.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName(), TestAlternativeClass.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Interceptors -----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonInterceptor() throws Exception
   {
      create().interceptor(String.class);
   }

   @Test
   public void shouldBeAbleToAddInterceptor() throws Exception
   {
      String desc = create().interceptor(TestInterceptor.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName());
   }

   @Test
   public void shouldBeAbleToAddInterceptors() throws Exception
   {
      String desc = create().interceptors(TestInterceptor.class, TestInterceptor.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName(), TestInterceptor.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Decorators -------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonDecorator() throws Exception
   {
      create().decorator(String.class);
   }

   @Test
   public void shouldBeAbleToAddDescorator() throws Exception
   {
      String desc = create().decorator(TestDecorator.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescorators() throws Exception
   {
      String desc = create().decorators(TestDecorator.class, TestDecorator.class)
                     .exportAsString();
      
      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());
   }
   
   //-------------------------------------------------------------------------------------||
   // Export / Import round trip ---------------------------------------------------------||
   //-------------------------------------------------------------------------------------||
   
   @Test
   public void shouldBeAbleToReadWhatWasExported() throws Exception
   {
      String desc = create().decorators(TestDecorator.class, TestDecorator.class)
         .exportAsString();

      desc = Descriptors.importAs(BeansDescriptor.class).from(desc)
                        .exportAsString();
      
      assertXPath(desc, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());
      
   }
   
   //-------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private BeansDescriptor create()
   {
      return Descriptors.create(BeansDescriptor.class);
   }
}
