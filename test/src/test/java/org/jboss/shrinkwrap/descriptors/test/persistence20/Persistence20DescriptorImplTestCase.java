package org.jboss.shrinkwrap.descriptors.test.persistence20;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.custommonkey.xmlunit.Diff;
import org.custommonkey.xmlunit.XMLUnit;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence20Descriptor;
import org.junit.Before;
import org.junit.Test;

public class Persistence20DescriptorImplTestCase
{
   @Before
   public void init()
   {
      XMLUnit.setIgnoreWhitespace(true);
      XMLUnit.setIgnoreComments(true);
      XMLUnit.setNormalizeWhitespace(true);
   }
   
   @Test
   public void testGeneratedPersistenceXml() throws Exception
   {
      final Persistence20Descriptor persistence = create()
            .addDefaultNamespaces()
            .version("2.0")
            .createPersistenceUnit()
               .name("name1")
               .description("description0")
               .provider("provider0")
               .jtaDataSource("jta-data-source0")
               .nonJtaDataSource("non-jta-data-source0")
               .mappingFile("mapping-file0")
               .mappingFile("mapping-file1")
               .jarFile("jar-file0")
               .jarFile("jar-file1")
               .clazz("class0")
               .clazz("class1")
               .excludeUnlistedClasses(true)
               .sharedCacheMode("ALL")
               .validationMode("AUTO")
               .getOrCreateProperties()
                  .createProperty().name("name3").value("value1").up()
                  .createProperty().name("name5").value("value3").up()
               .up().up()
            .createPersistenceUnit()
               .name("name7")
               .description("description1")
               .provider("provider1")
               .jtaDataSource("jta-data-source1")
               .nonJtaDataSource("non-jta-data-source1")
               .mappingFile("mapping-file2")
               .mappingFile("mapping-file3")
               .jarFile("jar-file2")
               .jarFile("jar-file3")
               .clazz("class2")
               .clazz("class3")
               .excludeUnlistedClasses(true)
               .sharedCacheMode("ALL")
               .validationMode("AUTO")
               .getOrCreateProperties()
                  .createProperty().name("name9").value("value5").up()
                  .createProperty().name("name11").value("value7").up()
               .up().up();            
     
      String webXmlGenerated = persistence.exportAsString();
      String webXmlOriginal = getResourceContents("src/test/resources/test-gen-persistence20.xml");
      
      Diff myDiff = new Diff(webXmlOriginal, webXmlGenerated);
      assertTrue("pieces of XML are similar " + myDiff, myDiff.similar());
      assertTrue("but are they identical? " + myDiff, myDiff.identical());   
   }
   
   
   // -------------------------------------------------------------------------------------||
   // Internal Helper ---------------------------------------------------------------------||
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

   private Persistence20Descriptor create()
   {
      return Descriptors.create(Persistence20Descriptor.class);
   }
}
