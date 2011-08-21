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

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.cdi10.Beans10Descriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.cdi.beans.BeansDescriptor;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Case to verify that {@link BeansDescriptor} impl produce the correct 
 * XML Descriptor output.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */

public class Beans10DescriptorTestCase
{
  
   @Before
   public void init()
   {
      XMLUnit.setIgnoreWhitespace(true);
      XMLUnit.setIgnoreComments(true);
      XMLUnit.setNormalizeWhitespace(true);
   }
   
   @Test
   public void testGeneratedXml() throws Exception
   {
      final Beans10Descriptor beansDescr = create()
            .addDefaultNamespaces()
            .interceptors()
               .setClazz("class0")
               .setClazz("class1")
               .setClazz("class2")
               .setClazz("class3")
               .setClazz("class4").up()
            .decorators()
               .setClazz("class5")
               .setClazz("class6")
               .setClazz("class7")
               .setClazz("class8")
               .setClazz("class9").up()
            .alternatives()
               .setClazz("class10")
               .setClazz("class11")
               .setStereotype("stereotype0")
               .setStereotype("stereotype1")
               .setStereotype("stereotype2").up()
            .interceptors()
               .setClazz("class12")
               .setClazz("class13")
               .setClazz("class14")
               .setClazz("class15")
               .setClazz("class16").up()
            .alternatives()
               .setClazz("class33")
               .setStereotype("stereotype7")
               .setClazz("class34")
               .setStereotype("stereotype8")
               .setClazz("class35")
               .setStereotype("stereotype9")
               .setClazz("class36")
               .setStereotype("stereotype10")
               .setClazz("class37")
               .setStereotype("stereotype11").up()
            .alternatives()
               .setStereotype("stereotype15")
               .setClazz("class61")               
               .setClazz("class62")
               .setStereotype("stereotype18")
               .setClazz("class64").up();
     
      String webXmlGenerated = beansDescr.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-beans10.xml");
      
      Diff myDiff = new Diff(webXmlOriginal, webXmlGenerated);
      assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
      assertTrue("but are they identical? " + myDiff, myDiff.identical());   
   }
   

   //-------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private String getResourceContents(String resource) throws Exception
   {
      assert resource != null && resource.length() > 0 : "Resource must be specified";
      final BufferedReader reader = new BufferedReader(new FileReader(resource));
      final StringBuilder builder = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null)
      {
         builder.append(line);
         builder.append("\n");
      }
      return builder.toString();
   }

   private Beans10Descriptor create()
   {
      return Descriptors.create(Beans10Descriptor.class);
   }
}
