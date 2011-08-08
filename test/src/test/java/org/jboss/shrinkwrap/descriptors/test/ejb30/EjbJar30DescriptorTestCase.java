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
package org.jboss.shrinkwrap.descriptors.test.ejb30;

import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbJar30Descriptor;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test Cases to ensure the {@link EjbJar30Descriptor} is working as contracted
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
@Ignore
public class EjbJar30DescriptorTestCase
{

   /**
    * Logger
    */
   private static final Logger log = Logger.getLogger(EjbJar30DescriptorTestCase.class.getName());

   /**
    * Name of the fully-populated XML
    */
   private static final String NAME_EJB_JAR = "xml/ejb30/EjbJar3xEverything_testEverything.xml";

   /**
    * Descriptor under test
    */
   private EjbJar30Descriptor fullyPopulatedDescriptor;

   /**
    * Creates the fully-populated descriptor
    */
   @Before
   public void createDescriptor()
   {
      fullyPopulatedDescriptor = Descriptors.importAs(EjbJar30Descriptor.class).from(
            Thread.currentThread().getContextClassLoader().getResourceAsStream(NAME_EJB_JAR));
      log.info(fullyPopulatedDescriptor.exportAsString());
   }

   @Test
   public void test()
   {
      //TODO Placeholder for porting tests // SHRINKDESC-61
      @SuppressWarnings("unused")
      final EjbJar30Descriptor d = Descriptors.create(EjbJar30Descriptor.class);
      log.info(fullyPopulatedDescriptor.exportAsString());
   }

}
