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
package org.jboss.shrinkwrap.descriptor.test.jsptaglibrary21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.WebJsptaglibraryDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebJspTagLibraryDescriptorTestCase
{
   final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD hh:mm:ss");
   
   @Before
   public void init()
   {
      sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
   }
   
   @Test
   public void testGeneratedWebJspTagLibrary21Xml() throws Exception
   {  
	   WebJsptaglibraryDescriptor ejbJarGenerated = create()
            .addDefaultNamespaces()
            .version("2.1")
            .description("description0")
            .description("description1")
            .displayName("display-name0")
            .displayName("display-name1")
            .createIcon().smallIcon("small-icon0").largeIcon("large-icon0").up()
            .createIcon().smallIcon("small-icon1").largeIcon("large-icon1").up()
            .tlibVersion("0")
            .shortName("short-name0")
            .uri("http://www.oxygenxml.com/")
            .getOrCreateValidator()
            	.description("description2")
            	.description("description3")
            	.validatorClass("validator-class0")
            	.getOrCreateInitParam()
            		.description("description4")
                    .description("description5")
                    .paramName("param-name0").paramValue("param-value0").up()
                .getOrCreateInitParam()
            		.description("description6")
                    .description("description7")
                    .paramName("param-name1").paramValue("param-value1").up().up()
           .createListener()
           		.description("description8")
	            .description("description9")
	            .displayName("display-name2")
	            .displayName("display-name3")
	            .createIcon().smallIcon("small-icon2").largeIcon("large-icon2").up()
	            .createIcon().smallIcon("small-icon3").largeIcon("large-icon3").up()
	            .listenerClass("listener-class0").up()
	       .createListener()
	       		.description("description10")
	            .description("description11")
	            .displayName("display-name4")
	            .displayName("display-name5")
	            .createIcon().smallIcon("small-icon4").largeIcon("large-icon4").up()
	            .createIcon().smallIcon("small-icon5").largeIcon("large-icon5").up()
	            .listenerClass("listener-class1").up()
	       .createTag()
	       		.description("description12")
	            .description("description13")
	            .displayName("display-name6")
	            .displayName("display-name7")
	            .createIcon().smallIcon("small-icon6").largeIcon("large-icon6").up()
	            .createIcon().smallIcon("small-icon7").largeIcon("large-icon7").up()
	            .name("name0")
	            .tagClass("tag-class0")
	            .teiClass("tei-class0")
	            .bodyContent("tagdependent")
	            .createVariable()
	            	.description("description14")
	            	.description("description15")
	            	.nameGiven("$")
	            	.variableClass("variable-class0")
	            	.declare("true")
	            	.scope("NESTED").up()
	            .createVariable()
	            	.description("description16")
	            	.description("description17")
	            	.nameFromAttribute("$")
	            	.variableClass("variable-class1")
	            	.declare("true")
	            	.scope("NESTED").up()
	            .createAttribute()
	            	.description("description18")
	            	.description("description19")
	            	.name("name1")
	            	.required("true")
	            	.rtexprvalue("true")
	            	.type("type0")
	            	.getOrCreateDeferredValue().type("type1").up().up()
	            .createAttribute()
	            	.description("description20")
	            	.description("description21")
	            	.name("name2")
	            	.required("true")
	            	.fragment("true").up()
	            .dynamicAttributes("true")
	            .example("example0").up()
	       .createTag()
	       		.description("description22")
	            .description("description23")
	            .displayName("display-name8")
	            .displayName("display-name9")
	            .createIcon().smallIcon("small-icon8").largeIcon("large-icon8").up()
	            .createIcon().smallIcon("small-icon9").largeIcon("large-icon9").up()
	            .name("name3")
	            .tagClass("tag-class1")
	            .teiClass("tei-class1")
	            .bodyContent("tagdependent")
	            .createVariable()
	            	.description("description24")
	            	.description("description25")
	            	.nameGiven("$")
	            	.variableClass("variable-class2")
	            	.declare("true")
	            	.scope("NESTED").up()
	            .createVariable()
	            	.description("description26")
	            	.description("description27")
	            	.nameFromAttribute("$")
	            	.variableClass("variable-class3")
	            	.declare("true")
	            	.scope("NESTED").up()
	            .createAttribute()
	            	.description("description28")
	            	.description("description29")
	            	.name("name4")
	            	.required("true")
	            	.fragment("true").up()
	            .createAttribute()
	            	.description("description30")
	            	.description("description31")
	            	.name("name5")
	            	.required("true")
	            	.fragment("true").up()
	            .dynamicAttributes("true")
	            .example("example1").up()
	       .createTagFile()
	       		.description("description32")
	            .description("description33")
	            .displayName("display-name10")
	            .displayName("display-name11")
	            .createIcon().smallIcon("small-icon10").largeIcon("large-icon10").up()
	            .createIcon().smallIcon("small-icon11").largeIcon("large-icon11").up()
	            .name("name6")
	            .path("path0")
	            .example("example2").up()
	       .createTagFile()
	       		.description("description34")
	            .description("description35")
	            .displayName("display-name12")
	            .displayName("display-name13")
	            .createIcon().smallIcon("small-icon12").largeIcon("large-icon12").up()
	            .createIcon().smallIcon("small-icon13").largeIcon("large-icon13").up()
	            .name("name7")
	            .path("path1")
	            .example("example3").up()
	       .createFunction()
	       		.description("description36")
	            .description("description37")
	            .displayName("display-name14")
	            .displayName("display-name15")
	            .createIcon().smallIcon("small-icon14").largeIcon("large-icon14").up()
	            .createIcon().smallIcon("small-icon15").largeIcon("large-icon15").up()
	            .name("name8")
	            .functionClass("function-class0")
	            .functionSignature("function-signature0")
	            .example("example4").up()
	       .createFunction()
	       		.description("description38")
	            .description("description39")
	            .displayName("display-name16")
	            .displayName("display-name17")
	            .createIcon().smallIcon("small-icon16").largeIcon("large-icon16").up()
	            .createIcon().smallIcon("small-icon17").largeIcon("large-icon17").up()
	            .name("name9")
	            .functionClass("function-class1")
	            .functionSignature("function-signature1")
	            .example("example5").up()
           ;                     
      
      String webXmlGenerated = ejbJarGenerated.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-webjsptaglibrary21.xml");
           
      XmlAssert.assertIdentical(webXmlOriginal, webXmlGenerated);   
   }
   
   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
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
   
   private WebJsptaglibraryDescriptor create()
   {
      return Descriptors.create(WebJsptaglibraryDescriptor.class);
   }
   
}
