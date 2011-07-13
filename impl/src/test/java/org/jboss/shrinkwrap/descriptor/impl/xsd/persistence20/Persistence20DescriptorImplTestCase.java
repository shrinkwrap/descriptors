package org.jboss.shrinkwrap.descriptor.impl.xsd.persistence20;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Persistence20Descriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitCachingType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitValidationModeType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.spec.jpa.persistence.PersistenceDescriptorTestCase;
import org.junit.Test;

public class Persistence20DescriptorImplTestCase
{
   private final String name = PersistenceDescriptorTestCase.class.getSimpleName();

   private final String name2 = PersistenceDescriptorTestCase.class.getSimpleName() + "2";

   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("persistence.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(PersistenceDescriptor.class, "test.xml").getDescriptorName());
   }

   @Test
   public void shouldHaveDefaultVersion() throws Exception
   {
      String desc = create().setVersion("2.0").exportAsString();
      assertXPath(desc, "/persistence/@version", "2.0");
   }

   @Test
   public void shouldBeAbleToSetVersion() throws Exception
   {
      String desc = create().setVersion("1.0").exportAsString();
      assertXPath(desc, "/persistence/@version", "1.0");
   }

   @Test
   public void shouldBeAbleToAddPersistenceUnit() throws Exception
   {
      String desc = create().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name);
   }

   @Test
   public void shouldBeAbleToAddMultiplePersistenceUnits() throws Exception
   {
      String desc = create().persistenceUnit().setName(name2).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name, name2);
   }

   @Test
   public void shouldBeAbleToAddPersistenceUnitName() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setName(name2).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name2);
   }

   @Test
   public void shouldBeAbleToAddClasses() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setClazzList(PersistenceDescriptor.class.getName(),
            PersistenceDescriptor.class.getName()).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/class", PersistenceDescriptor.class.getName(),
            PersistenceDescriptor.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescription() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setDescription(name).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/description", name);
   }

   @Test
   public void shouldBeAbleToSetExcludeUnlistedClasses() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setExcludeUnlistedClasses(true).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "true");
   }

   @Test
   public void shouldBeAbleToSetIncludeUnlistedClasses() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setExcludeUnlistedClasses(false).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "false");
   }

   @Test
   public void shouldBeAbleToSetJTADataSource() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setJtaDataSource(name).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
   }

   @Test
   public void shouldBeAbleToSetJarFile() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setJarFile(name).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jar-file", name);
   }

   @Test
   public void shouldBeAbleToSetJarFiles() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setJarFileList(name, name2).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jar-file", name, name2);
   }

   @Test
   public void shouldBeAbleToSetMappingFile() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setMappingFile(name).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name);
   }

   @Test
   public void shouldBeAbleToSetMappingFiles() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setMappingFileList(name, name2).up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name, name2);
   }

   @Test
   public void shouldBeAbleToSetTransactionType() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setTransactionType(PersistenceUnitTransactionType._JTA)
            .up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@transaction-type", PersistenceUnitTransactionType._JTA
            .toString());
   }

   @Test
   public void shouldBeAbleToAddProperties() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).properties().property().setName(name).setValue(name2).up()
            .property().setName(name2).setValue(name).up().up().up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name2);
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", name2, name);
   }

   @Test
   public void shouldBeAbleToGetProperties() throws Exception
   {
      Persistence20Descriptor def = create().getPersistenceUnitList().get(0).properties().property().setName(name)
            .setValue(name2).up().property().setName(name2).setValue(name).up().up().up();

      List<org.jboss.shrinkwrap.descriptor.api.persistence20.Property<Properties<PersistenceUnit<Persistence20Descriptor>>>> props = def
            .getPersistenceUnitList().get(0).properties().getPropertyList();
      assertEquals(2, props.size());
      assertEquals(name, props.get(0).getName());
      assertEquals(name2, props.get(0).getValue());
      assertEquals(name2, props.get(1).getName());
      assertEquals(name, props.get(1).getValue());
   }

   //   @Test
   //   public void shouldBeAbleToRemovePropertyByName() throws Exception
   //   {
   //      PersistenceUnitDef def = create()
   //                        .property(name, name2)
   //                        .property(name2, name).up();
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //
   //      def.removeProperty(name);
   //      props = def.getProperties();
   //      assertEquals(1, props.size());
   //      assertEquals(name2, props.get(0).getName());
   //      assertEquals(name, props.get(0).getValue());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToRemovePropertyByReference() throws Exception
   //   {
   //      PersistenceUnitDef def = create()
   //                        .property(name, name2)
   //                        .property(name2, name);
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //
   //      def.removeProperty(props.get(1));
   //
   //      props = def.getProperties();
   //      assertEquals(1, props.size());
   //      assertEquals(name, props.get(0).getName());
   //      assertEquals(name2, props.get(0).getValue());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToClearProperties() throws Exception
   //   {
   //      PersistenceUnitDef def = create()
   //                        .property(name, name2)
   //                        .property(name2, name);
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //
   //      def.clearProperties();
   //
   //      props = def.getProperties();
   //      assertEquals(0, props.size());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToClearPropertiesAndAddNew() throws Exception
   //   {
   //      PersistenceUnitDef def = create()
   //                        .property(name, name2)
   //                        .property(name2, name);
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //
   //      def.clearProperties();
   //
   //      props = def.getProperties();
   //      assertEquals(0, props.size());
   //
   //      def.property(name2, name)
   //               .property(name, name2);
   //
   //      props = def.getProperties();
   //      assertEquals(2, props.size());
   //      assertEquals(name2, props.get(0).getName());
   //      assertEquals(name, props.get(0).getValue());
   //      assertEquals(name, props.get(1).getName());
   //      assertEquals(name2, props.get(1).getValue());
   //   }

   @Test
   public void shouldBeAbleSetSharedCacheMode() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setSharedCacheMode(PersistenceUnitCachingType._ALL).up()
            .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/shared-cache-mode", PersistenceUnitCachingType._ALL.toString());
   }

   @Test
   public void shouldBeAbleSetValidationMode() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setValidationMode(PersistenceUnitValidationModeType._AUTO)
            .up().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/validation-mode", PersistenceUnitValidationModeType._AUTO
            .toString());
   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - Hibernate ------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleSetProviderHibernate() throws Exception
   {
      String desc = create().getPersistenceUnitList().get(0).setProvider("org.hibernate.ejb.HibernatePersistence").up()
            .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/provider", "org.hibernate.ejb.HibernatePersistence");
   }

   //   @Test
   //   public void shouldBeAbleSetFormatSQLHibernate() throws Exception
   //   {
   //      String desc = create().getPersistenceUnitList().get(0)
   //                        .setProvider("org.hibernate.ejb.HibernatePersistence").up()
   ////                        .formatSql()
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.format_sql");
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleSetShowSQLHibernate() throws Exception
   //   {
   //      String desc = create()
   //                        .provider(ProviderType.HIBERNATE)
   //                        .showSql()
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.show_sql");
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   //   }

   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreate() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE, "create");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreateDrop() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE_DROP, "create-drop");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeHibernateNone() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.NONE, "none");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeHibernateUpdate() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.UPDATE, "update");
   //   }
   //
   //   // -------------------------------------------------------------------------------------||
   //   // Provider Specific - EclipseLink ----------------------------------------------------||
   //   // -------------------------------------------------------------------------------------||
   //
   //   @Test
   //   public void shouldBeAbleSetShowSQLEclipseLink() throws Exception
   //   {
   //      String desc = create()
   //                        .provider(ProviderType.ECLIPSE_LINK)
   //                        .showSql()
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "eclipselink.logging.level");
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "FINE");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreate() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE, "create-tables");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreateDrop() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE_DROP, "drop-and-create-tables");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkNone() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.NONE, "none");
   //   }
   //
   //   @Test(expected = UnsupportedOperationException.class)
   //   public void shouldNotBeAbleToSetSchemaGenerationModeEclipseLinkUpdate() throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.UPDATE,
   //               "no-value-should-be-added-mode-unsupported");
   //   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - Generic Helper -------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   //   private void shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType generationMode,
   //            String expectedValue) throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationMode(ProviderType.HIBERNATE, generationMode, "hibernate.hbm2ddl.auto",
   //               expectedValue);
   //   }
   //
   //   private void shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType generationMode,
   //            String expectedValue) throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationMode(ProviderType.ECLIPSE_LINK, generationMode, "eclipselink.ddl-generation",
   //               expectedValue);
   //   }
   //
   //   private void shouldBeAbleSetSchemaGenerationMode(ProviderType providerType, SchemaGenerationModeType generationMode,
   //            String expectedName, String expectedValue) throws Exception
   //   {
   //      String desc = create()
   //                        .provider(providerType)
   //                        .schemaGenerationMode(generationMode)
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
   //   }

   // -------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private Persistence20Descriptor create()
   {
      return Descriptors.create(Persistence20Descriptor.class).persistenceUnit().setName(name).up();
   }
}
