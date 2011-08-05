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
            .setVersion("2.0")
            .persistenceUnit()
               .setName("name1")
               .setDescription("description0")
               .setProvider("provider0")
               .setJtaDataSource("jta-data-source0")
               .setNonJtaDataSource("non-jta-data-source0")
               .setMappingFile("mapping-file0")
               .setMappingFile("mapping-file1")
               .setJarFile("jar-file0")
               .setJarFile("jar-file1")
               .setClazz("class0")
               .setClazz("class1")
               .setExcludeUnlistedClasses(true)
               .setSharedCacheMode("ALL")
               .setValidationMode("AUTO")
               .properties()
                  .property().setName("name3").setValue("value1").up()
                  .property().setName("name5").setValue("value3").up()
               .up().up()
            .persistenceUnit()
               .setName("name7")
               .setDescription("description1")
               .setProvider("provider1")
               .setJtaDataSource("jta-data-source1")
               .setNonJtaDataSource("non-jta-data-source1")
               .setMappingFile("mapping-file2")
               .setMappingFile("mapping-file3")
               .setJarFile("jar-file2")
               .setJarFile("jar-file3")
               .setClazz("class2")
               .setClazz("class3")
               .setExcludeUnlistedClasses(true)
               .setSharedCacheMode("ALL")
               .setValidationMode("AUTO")
               .properties()
                  .property().setName("name9").setValue("value5").up()
                  .property().setName("name11").setValue("value7").up()
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
