package org.jboss.shrinkwrap.descriptor.test.jetty7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Logger;

import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.jetty7.JettyDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Jetty7TestCase
{
   private static final Logger log = Logger.getLogger(Jetty7TestCase.class.getName());
   
   @Test
   public void testJettyConfiguration() throws Exception 
   {
      final JettyDescriptor jetty7Generated = create().clazz("class0").id("id0")
        .getOrCreateNew().clazz("class1").id("id1")
           .createArg().type("type0")
              .getOrCreateArray().type("type1").id("id2")
                 .getOrCreateItem().type("type2").id("id3")
                    .getOrCreateCall().name("name0").clazz("class2").id("id4")
                       .createRef().id("id5")
                          .createSet().name("name1").type("type3").clazz("class3")
                             .getOrCreateCall().name("name2").clazz("class4").id("id6")
                                .createProperty().name("name3")._default("default0").id("id7")
                                   .createGet().name("name4").clazz("class5").id("id8")
                                      .createSet().name("name5").type("type4").clazz("class6")
                                         .getOrCreateRef().id("id9")
                                            .createPut().name("name6").type("type5")
                                               .getOrCreateGet().name("name7").clazz("class7").id("id10")
                                                  .createArray().type("type6").id("id11").up()
                                               .up()
                                            .up()
                                         .up()
                                      .up()
                                   .up()
                                .up()
                             .up()
                          .up()
                       .up()
                    .up()
                 .up()
              .up()
           .up()
           .getOrCreateGet().name("name8").clazz("class8").id("id12")
              .createProperty().name("name9")._default("default1").id("id13")
                 .createNew().clazz("class9").id("id14")
                    .createArg().type("type7")
                       .getOrCreateGet().name("name10").clazz("class10").id("id15")
                          .createCall().name("name11").clazz("class11").id("id16")
                             .createProperty().name("name12")._default("default2").id("id17")
                                .createArray().type("type8").id("id18").up()
                             .up()
                          .up()
                       .up()
                    .up()
                    .createPut().name("name13").type("type9")
                       .getOrCreateProperty().name("name14")._default("default3").id("id19")
                          .getOrCreateGet().name("name15").clazz("class12").id("id20")
                             .createArray().type("type10").id("id21").up()
                          .up()
                       .up()
                    .up()   
                 .up()
              .up()
           .up()        
        .up();
                       
       String generatedJettyXml = jetty7Generated.exportAsString();
       String originalJettyXml = this.getResourceContents("src/test/resources/test-orig-jetty7.xml");
 
       log.fine(generatedJettyXml);
       
       // set an own entity resolver for preventing network access
       XMLUnit.setControlEntityResolver(new EntityResolver() 
       {
           @Override
           public InputSource resolveEntity(String publicId, String systemId)
                   throws SAXException, IOException {
        	   log.fine("Ignoring " + publicId + ", " + systemId);
               return new InputSource(new StringReader(""));
           }
       });
       
       XmlAssert.assertIdentical(originalJettyXml, generatedJettyXml);       
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
   
   private JettyDescriptor create()
   {
      return Descriptors.create(JettyDescriptor.class);
   }
   
}
