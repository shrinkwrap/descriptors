package org.jboss.shrinkwrap.descriptor.impl.xsd.persistence20;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence20Descriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.junit.Test;

public class Persistence20DescriptorImportTestCase
{
   @Test
   public void testImportTutorialPersistenceXml() throws Exception
   {
      String persistence_imported = getResourceContents("src/test/resources/test-persistence.xml");

      final Persistence20Descriptor persistence = Descriptors.importAs(Persistence20Descriptor.class).from(
            persistence_imported);

      assertTrue(persistence.getPersistenceUnitList().size() == 1);
      assertEquals(persistence.getPersistenceUnitList().get(0).getName(), "LeanServiceECBComponentPU");
      assertEquals(persistence.getPersistenceUnitList().get(0).getTransactionTypeAsString(), "JTA");
      assertEquals(persistence.getPersistenceUnitList().get(0).getTransactionType(),
            PersistenceUnitTransactionType._JTA);
      assertEquals(persistence.getPersistenceUnitList().get(0).getProvider(),
            "org.eclipse.persistence.jpa.PersistenceProvider");
      assertEquals(persistence.getPersistenceUnitList().get(0).getJtaDataSource(), "jdbc/sample");
      assertEquals(persistence.getPersistenceUnitList().get(0).properties().getPropertyList().get(0).getName(),
            "eclipselink.ddl-generation");
      assertEquals(persistence.getPersistenceUnitList().get(0).properties().getPropertyList().get(0).getValue(),
            "drop-and-create-tables");

   }

   @Test
   public void testCreateTutorialPersistenceXml() throws Exception
   {
      final Persistence20Descriptor persistence = create().addDefaultNamespaces().setVersion("2.0").persistenceUnit()
            .setName("LeanServiceECBComponentPU").setTransactionType(PersistenceUnitTransactionType._JTA).setProvider(
                  "org.eclipse.persistence.jpa.PersistenceProvider").setJtaDataSource("jdbc/sample").properties()
            .property().setName("eclipselink.ddl-generation").setValue("drop-and-create-tables").up().up().up();

      String str = persistence.exportAsString();
      //      System.out.println(str);

   }

   // -------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
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
