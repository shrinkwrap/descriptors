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
package org.jboss.shrinkwrap.descriptor.test.portedfrompoc;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertSchemaLocation;

import java.util.logging.Logger;

import javax.decorator.Decorator;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Stereotype;
import javax.interceptor.Interceptor;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.beans10.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.beans10.MutableBeansDescriptor;
import org.junit.Ignore;
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
   /**
    * Logger
    */
   private static final Logger log = Logger.getLogger(BeansDescriptorTestCase.class.getName());
   
   @Stereotype
   @Alternative
   private @interface TestAlternativeStereoType {
   }

   @Alternative
   private class TestAlternativeClass
   {
   }

   @Interceptor
   private class TestInterceptor {}
   
   @Interceptor
   private class TestAnotherInterceptor {}
   
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
      Assert.assertEquals("test.xml", Descriptors.create(MutableBeansDescriptor.class, "test.xml").getDescriptorName());
   }
   
   @Test
   public void shouldHaveCorrectSchemaLocation()
   {
      // given
      final String expectedSchemaLocation = "http://java.sun.com/xml/ns/javaee " +
      		"http://java.sun.com/xml/ns/javaee/beans_1_0.xsd";
      
      // when
      final String descriptorXml = create().getRoot().getOrCreateAlternatives()
                                           .stereotype(TestAlternativeStereoType.class.getName())
                                           .up().up()
                                           .exportAsString();
      
      // then
      assertSchemaLocation(descriptorXml, "http://www.w3.org/2001/XMLSchema-instance", expectedSchemaLocation);
   }
   
   //-------------------------------------------------------------------------------------||
   // Alternative StereoTypes ------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   //TODO We don't do validation on metadata.  Should we open a JIRA to do some validation
   // extension (which would need ClassLoading)?
   @Ignore
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonAlternativeStereoType()
   {
      create().getRoot().getOrCreateAlternatives().clazz(Override.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeStereoType() throws Exception
   {
      final String desc = create().getRoot().getOrCreateAlternatives().stereotype(TestAlternativeStereoType.class.getName()).up().up()
            .exportAsString();
      log.info(desc);      
      
      assertPresenceUsingXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeStereoTypes() throws Exception
   {
      final String desc = create().getRoot().getOrCreateAlternatives()
            .stereotype(TestAlternativeStereoType.class.getName(), TestAlternativeStereoType.class.getName()).up().up()
            .exportAsString();
      log.info(desc);
      assertPresenceUsingXPath(desc, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName(), TestAlternativeStereoType.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Alternative Classes ----------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   //TODO We don't do validation on metadata.  Should we open a JIRA to do some validation
   // extension (which would need ClassLoading)?
   @Ignore
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonAlternativeClass()
   {
      create().getRoot().getOrCreateAlternatives()
      .clazz(String.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeClass() throws Exception
   {
      final String desc = create().getRoot().getOrCreateAlternatives().clazz(TestAlternativeClass.class.getName()).up().up()
            .exportAsString();
      
      assertPresenceUsingXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName());
   }

   @Test
   public void shouldBeAbleToAddAlternativeClasses() throws Exception
   {
      final String desc = create().getRoot().getOrCreateAlternatives()
            .clazz(TestAlternativeClass.class.getName(), TestAlternativeClass.class.getName()).up().up().exportAsString(); 
      assertPresenceUsingXPath(desc, "/beans/alternatives/class", TestAlternativeClass.class.getName(), TestAlternativeClass.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Interceptors -----------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   //TODO We don't do validation on metadata.  Should we open a JIRA to do some validation
   // extension (which would need ClassLoading)?
   @Ignore
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonInterceptor() throws Exception
   {
      create().getRoot().getOrCreateInterceptors().clazz(String.class.getName());
   }

   @Test
   public void shouldBeAbleToAddInterceptor() throws Exception
   {
      final String desc = create().getRoot().getOrCreateInterceptors().clazz(TestInterceptor.class.getName()).up().up()
            .exportAsString();
      
      assertPresenceUsingXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName());
   }

   @Test
   public void shouldBeAbleToAddInterceptors() throws Exception
   {
      final String desc = create().getRoot().getOrCreateInterceptors()
            .clazz(TestInterceptor.class.getName(), TestInterceptor.class.getName()).up().up().exportAsString(); 
      assertPresenceUsingXPath(desc, "/beans/interceptors/class", TestInterceptor.class.getName(), TestInterceptor.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Decorators -------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   //TODO We don't do validation on metadata.  Should we open a JIRA to do some validation
   // extension (which would need ClassLoading)?
   @Ignore
   @Test(expected = IllegalArgumentException.class)
   public void shouldNotBeAbleToAddNonDecorator() throws Exception
   {
      create().getRoot().getOrCreateDecorators().clazz(String.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescorator() throws Exception
   {
      String desc = create().getRoot().getOrCreateDecorators().clazz(TestDecorator.class.getName()).up().up().exportAsString();   
      assertPresenceUsingXPath(desc, "/beans/decorators/class", TestDecorator.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescorators() throws Exception
   {
      final String desc = create().getRoot().getOrCreateDecorators()
            .clazz(TestDecorator.class.getName(), TestDecorator.class.getName()).up().up().exportAsString();
      assertPresenceUsingXPath(desc, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Export / Import round trip ---------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleToReadWhatWasExported() throws Exception
   {
      final String desc = create().getRoot().getOrCreateDecorators()
            .clazz(TestDecorator.class.getName(), TestDecorator.class.getName()).up().up().exportAsString();

      final String roundtrip = Descriptors.importAs(MutableBeansDescriptor.class).fromString(desc).exportAsString();
      
      assertPresenceUsingXPath(roundtrip, "/beans/decorators/class", TestDecorator.class.getName(), TestDecorator.class.getName());
      
   }

   //-------------------------------------------------------------------------------------||
   // Complex Scenario -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleToGenerateComplexDescriptor() throws Exception
   {
      final MutableBeansDescriptor beans = Descriptors.create(MutableBeansDescriptor.class).getRoot().getOrCreateInterceptors()
            .clazz(TestInterceptor.class.getName(), TestAnotherInterceptor.class.getName()).up()
            .getOrCreateDecorators().clazz(TestDecorator.class.getName()).up().getOrCreateAlternatives()
            .stereotype(TestAlternativeStereoType.class.getName()).up().up();
      String xml = beans.exportAsString();

      assertPresenceUsingXPath(xml, "/beans/interceptors/class", TestInterceptor.class.getName(), TestAnotherInterceptor.class.getName());
      assertPresenceUsingXPath(xml, "/beans/decorators/class", TestDecorator.class.getName());
      assertPresenceUsingXPath(xml, "/beans/alternatives/stereotype", TestAlternativeStereoType.class.getName());
   }

   //-------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private MutableBeansDescriptor create()
   {
      return Descriptors.create(MutableBeansDescriptor.class);
   }
}
