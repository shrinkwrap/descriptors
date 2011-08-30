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

import static org.jboss.shrinkwrap.descriptor.test.util.AssertXPath.assertXPath;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceDescriptor;
import org.junit.Test;

/**
 * Test Case to verify that {@link PersistenceDescriptor} impl produce the correct XML Descriptor output.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
//TODO Refactor commented code to fit into new APIs, make tests pass
public class PersistenceDescriptorTestCase
{
   /**
    * Logger
    */
   private static final Logger log = Logger.getLogger(PersistenceDescriptorTestCase.class.getName());
   
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
      String desc = create().exportAsString();
      assertXPath(desc, "/persistence/@version", "2.0");
   }

   @Test
   public void shouldBeAbleToSetVersion() throws Exception
   {
      String desc = create().version("1.0").exportAsString();
      assertXPath(desc, "/persistence/@version", "1.0");
   }

   @Test
   public void shouldBeAbleToAddPersistenceUnit() throws Exception
   {
      String desc = create().exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name);
   }

   //
   //   @Test
   //   public void shouldBeAbleToAddMultiplePersistenceUnits() throws Exception
   //   {
   //      String desc = create().persistenceUnit(name2).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/@name", name, name2);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToAddPersistenceUnitName() throws Exception
   //   {
   //      String desc = create().name(name2).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/@name", name2);
   //   }
   //
   //   @Test
   //   public void shouldOnlyCreateOnPersistenceUnitWithSameName() throws Exception
   //   {
   //      // create() creates a persistenceUnit with "name".
   //      // Add a new persistence unit with "name", should return the same node. name is defined unique
   //      String desc = create().persistenceUnit(name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/@name", name);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToAddClasses() throws Exception
   //   {
   //      String desc = create().classes(PersistenceDescriptor.class, PersistenceDescriptor.class).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/class", PersistenceDescriptor.class.getName(),
   //            PersistenceDescriptor.class.getName());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToAddDescription() throws Exception
   //   {
   //      PersistenceUnitDef unit = create().description(name);
   //      String desc = unit
   //                     .exportAsString();
   //      assertXPath(desc, "/persistence/persistence-unit/description", name);
   //      assertEquals(name, unit.getDescription());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetExcludeUnlistedClasses() throws Exception
   //   {
   //      String desc = create().excludeUnlistedClasses().exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "true");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetIncludeUnlistedClasses() throws Exception
   //   {
   //      String desc = create().includeUnlistedClasses().exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "false");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetJTADataSource() throws Exception
   //   {
   //      PersistenceUnitDef unit = create().jtaDataSource(name);
   //      String desc = unit
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
   //      assertEquals(name, unit.getJtaDataSource());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToReplaceJTADataSourceWithNonJTADataSource() throws Exception
   //   {
   //      String desc = create().jtaDataSource(name).nonJtaDataSource(name2).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", new String[]
   //      {});
   //      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name2);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToReplaceNonJTADataSourceWithJTADataSource() throws Exception
   //   {
   //      String desc = create().nonJtaDataSource(name2).jtaDataSource(name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
   //      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", new String[]
   //      {});
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetNonJtaDataSource() throws Exception
   //   {
   //      PersistenceUnitDef unit = create().nonJtaDataSource(name);
   //      String desc = unit
   //                     .exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name);
   //      assertEquals(name, unit.getNonJtaDataSource());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetJarFile() throws Exception
   //   {
   //      String desc = create().jarFile(name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/jar-file", name);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetJarFiles() throws Exception
   //   {
   //      String desc = create().jarFiles(name, name2).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/jar-file", name, name2);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetMappingFile() throws Exception
   //   {
   //      String desc = create().mappingFile(name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetMappingFiles() throws Exception
   //   {
   //      String desc = create().mappingFiles(name, name2).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name, name2);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToSetTransactionType() throws Exception
   //   {
   //      String desc = create().transactionType(TransactionType.JTA).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/@transaction-type", TransactionType.JTA.name());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToAddProperties() throws Exception
   //   {
   //      String desc = create().property(name, name2).property(name2, name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name2);
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", name2, name);
   //   }
   //
   //   @Test
   //   public void addingDuplicateNamePropertyUpdatesExisting() throws Exception
   //   {
   //      String desc = create().property(name, name2).property(name, name).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name);
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", name, name);
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToGetProperties() throws Exception
   //   {
   //      PersistenceUnitDef def = create().property(name, name2).property(name2, name);
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //      assertEquals(name, props.get(0).getName());
   //      assertEquals(name2, props.get(0).getValue());
   //      assertEquals(name2, props.get(1).getName());
   //      assertEquals(name, props.get(1).getValue());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleToRemovePropertyByName() throws Exception
   //   {
   //      PersistenceUnitDef def = create().property(name, name2).property(name2, name);
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
   //      PersistenceUnitDef def = create().property(name, name2).property(name2, name);
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
   //      PersistenceUnitDef def = create().property(name, name2).property(name2, name);
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
   //      PersistenceUnitDef def = create().property(name, name2).property(name2, name);
   //
   //      List<Property> props = def.getProperties();
   //      assertEquals(2, props.size());
   //
   //      def.clearProperties();
   //
   //      props = def.getProperties();
   //      assertEquals(0, props.size());
   //
   //      def.property(name2, name).property(name, name2);
   //
   //      props = def.getProperties();
   //      assertEquals(2, props.size());
   //      assertEquals(name2, props.get(0).getName());
   //      assertEquals(name, props.get(0).getValue());
   //      assertEquals(name, props.get(1).getName());
   //      assertEquals(name2, props.get(1).getValue());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleSetSharedCacheMode() throws Exception
   //   {
   //      String desc = create().sharedCacheMode(SharedCacheModeType.ALL).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/shared-cache-mode", SharedCacheModeType.ALL.name());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleSetValidationMode() throws Exception
   //   {
   //      String desc = create().validationMode(ValidationModeType.AUTO).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/validation-mode", ValidationModeType.AUTO.name());
   //   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - Hibernate ------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   //   @Test
   //   public void shouldBeAbleSetProviderHibernate() throws Exception
   //   {
   //      String desc = create().provider(ProviderType.HIBERNATE).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/provider", ProviderType.HIBERNATE.getProviderClass());
   //   }
   //
   //   @Test
   //   public void shouldBeAbleSetFormatSQLHibernate() throws Exception
   //   {
   //      String desc = create().provider(ProviderType.HIBERNATE).formatSql().exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.format_sql");
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   //   }
   //
   //   @Test
   //   public void shouldBeAbleSetShowSQLHibernate() throws Exception
   //   {
   //      String desc = create().provider(ProviderType.HIBERNATE).showSql().exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.show_sql");
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   //   }
   //
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

   // -------------------------------------------------------------------------------------||
   // Provider Specific - EclipseLink ----------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   //   @Test
   //   public void shouldBeAbleSetShowSQLEclipseLink() throws Exception
   //   {
   //      String desc = create().provider(ProviderType.ECLIPSE_LINK).showSql().exportAsString();
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
   //            "no-value-should-be-added-mode-unsupported");
   //   }
   //
   //   // -------------------------------------------------------------------------------------||
   //   // Provider Specific - Generic Helper -------------------------------------------------||
   //   // -------------------------------------------------------------------------------------||
   //
   //   private void shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType generationMode,
   //         String expectedValue) throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationMode(ProviderType.HIBERNATE, generationMode, "hibernate.hbm2ddl.auto",
   //            expectedValue);
   //   }
   //
   //   private void shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType generationMode,
   //         String expectedValue) throws Exception
   //   {
   //      shouldBeAbleSetSchemaGenerationMode(ProviderType.ECLIPSE_LINK, generationMode, "eclipselink.ddl-generation",
   //            expectedValue);
   //   }
   //
   //   private void shouldBeAbleSetSchemaGenerationMode(ProviderType providerType, SchemaGenerationModeType generationMode,
   //         String expectedName, String expectedValue) throws Exception
   //   {
   //      String desc = create().provider(providerType).schemaGenerationMode(generationMode).exportAsString();
   //
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
   //      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
   //   }

   // -------------------------------------------------------------------------------------||
   // Complex Scenario---------------------------------------------------------------------|| 
   // -------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleToIncludeMultiplePersistenceUnit() throws Exception
   {
      final String hibernateUnit = "hibernate-unit";
      final String txTypeJta = "JTA";
      final String providerTypeHibernate = "org.hibernate.ejb.HibernatePersistence";
      final String jtaDataSource = "java:/DefaultDS";

      final PersistenceDescriptor persistence = Descriptors.create(PersistenceDescriptor.class).
            getOrCreatePersistenceUnit().name(hibernateUnit).transactionType(txTypeJta).
            provider(providerTypeHibernate).jtaDataSource(jtaDataSource).clazz(PersistenceDescriptor.class.getName()).up();
      

      
//      .schemaGenerationMode("create-drop")
//
//      .showSql()
//
//      .formatSql()
//
//      .property("hibernate.transaction.flush_before_completion", true)
//
//      .persistenceUnit("eclipselink-unit")
//
//      .transactionType(TransactionType.RESOURCE_LOCAL)
//
//      .provider(ProviderType.ECLIPSE_LINK)
//
//      .nonJtaDataSource("jdbc/__default").excludeUnlistedClasses()
//
//      .schemaGenerationMode(SchemaGenerationModeType.CREATE);

      String desc = persistence.exportAsString();
      log.info(desc);

      
      assertXPath(desc, "/persistence/persistence-unit[@name='"+hibernateUnit+"']/@transaction-type", txTypeJta);
      assertXPath(desc, "/persistence/persistence-unit[@name='"+hibernateUnit+"']/provider",
            providerTypeHibernate);
      assertXPath(desc, "/persistence/persistence-unit[@name='"+hibernateUnit+"']/jta-data-source", jtaDataSource);
      assertXPath(desc, "/persistence/persistence-unit[@name='"+hibernateUnit+"']/class",
            PersistenceDescriptor.class.getName());
      assertXPath(desc, "/persistence/persistence-unit[@name='eclipselink-unit']/@transaction-type", "RESOURCE_LOCAL");
      assertXPath(desc, "/persistence/persistence-unit[@name='eclipselink-unit']/provider",
            "org.eclipse.persistence.jpa.PersistenceProvider");
      assertXPath(desc, "/persistence/persistence-unit[@name='eclipselink-unit']/non-jta-data-source", "jdbc/__default");
      assertXPath(desc, "/persistence/persistence-unit[@name='eclipselink-unit']/exclude-unlisted-classes", "true");
   }

   // -------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private PersistenceDescriptor create()
   {
      return Descriptors.create(PersistenceDescriptor.class).getOrCreatePersistenceUnit().name(name).up();
   }
}
