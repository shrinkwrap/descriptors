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
package org.jboss.shrinkwrap.descriptor.impl.spec.jpa.persistence;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import static org.junit.Assert.assertEquals;

import java.util.List;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceUnitDef;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.Property;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.ProviderType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.SchemaGenerationModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.SharedCacheModeType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.TransactionType;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.ValidationModeType;
import org.junit.Test;

/**
 * Test Case to verify that {@link PersistenceDescriptor} impl produce the correct XML Descriptor output.
 * 
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * @version $Revision: $
 */
public class PersistenceDescriptorTestCase
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
      String desc = create()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name);
   }

   @Test
   public void shouldBeAbleToAddMultiplePersistenceUnits() throws Exception
   {
      String desc = create().persistenceUnit(name2)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name, name2);
   }

   @Test
   public void shouldBeAbleToAddPersistenceUnitName() throws Exception
   {
      String desc = create().name(name2)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name2);
   }

   @Test
   public void shouldOnlyCreateOnPersistenceUnitWithSameName() throws Exception
   {
      // create() creates a persistenceUnit with "name".
      // Add a new persistence unit with "name", should return the same node. name is defined unique
      String desc = create().persistenceUnit(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@name", name);
   }

   @Test
   public void shouldBeAbleToAddClasses() throws Exception
   {
      String desc = create().classes(PersistenceDescriptor.class, PersistenceDescriptor.class)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/class", PersistenceDescriptor.class.getName(),
               PersistenceDescriptor.class.getName());
   }

   @Test
   public void shouldBeAbleToAddDescription() throws Exception
   {
      String desc = create().description(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/description", name);
   }

   @Test
   public void shouldBeAbleToSetExcludeUnlistedClasses() throws Exception
   {
      String desc = create().excludeUnlistedClasses()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "true");
   }

   @Test
   public void shouldBeAbleToSetIncludeUnlistedClasses() throws Exception
   {
      String desc = create().includeUnlistedClasses()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "false");
   }

   @Test
   public void shouldBeAbleToSetJTADataSource() throws Exception
   {
      String desc = create().jtaDataSource(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", new String[] {});
   }

   @Test
   public void setJTADataSourceShouldClearNonJTADataSource() throws Exception
   {
      String desc = create().nonJtaDataSource(name).jtaDataSource(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", new String[] {});
   }

   @Test
   public void shouldBeAbleToSetNonJtaDataSource() throws Exception
   {
      String desc = create().nonJtaDataSource(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name);
   }

   @Test
   public void setNonJTADataSourceShouldClearJTADataSource() throws Exception
   {
      String desc = create().jtaDataSource(name).nonJtaDataSource(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name);
      assertXPath(desc, "/persistence/persistence-unit/jta-data-source", new String[] {});
   }

   @Test
   public void shouldBeAbleToSetJarFile() throws Exception
   {
      String desc = create().jarFile(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jar-file", name);
   }

   @Test
   public void shouldBeAbleToSetJarFiles() throws Exception
   {
      String desc = create().jarFiles(name, name2)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/jar-file", name, name2);
   }

   @Test
   public void shouldBeAbleToSetMappingFile() throws Exception
   {
      String desc = create().mappingFile(name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name);
   }

   @Test
   public void shouldBeAbleToSetMappingFiles() throws Exception
   {
      String desc = create().mappingFiles(name, name2)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/mapping-file", name, name2);
   }

   @Test
   public void shouldBeAbleToSetTransactionType() throws Exception
   {
      String desc = create().transactionType(TransactionType.JTA)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/@transaction-type", TransactionType.JTA.name());
   }

   @Test
   public void shouldBeAbleToAddProperties() throws Exception
   {
      String desc = create()
                        .property(name, name2)
                        .property(name2, name)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name2);
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", name2, name);
   }

   @Test
   public void shouldBeAbleToGetProperties() throws Exception
   {
      PersistenceUnitDef def = create()
                        .property(name, name2)
                        .property(name2, name);

      List<Property> props = def.getProperties();
      assertEquals(2, props.size());
      assertEquals(name, props.get(0).getName());
      assertEquals(name2, props.get(0).getValue());
      assertEquals(name2, props.get(1).getName());
      assertEquals(name, props.get(1).getValue());
   }

   @Test
   public void shouldBeAbleToRemovePropertyByName() throws Exception
   {
      PersistenceUnitDef def = create()
                        .property(name, name2)
                        .property(name2, name);

      List<Property> props = def.getProperties();
      assertEquals(2, props.size());

      def.removeProperty(name);
      props = def.getProperties();
      assertEquals(1, props.size());
      assertEquals(name2, props.get(0).getName());
      assertEquals(name, props.get(0).getValue());
   }

   @Test
   public void shouldBeAbleToRemovePropertyByReference() throws Exception
   {
      PersistenceUnitDef def = create()
                        .property(name, name2)
                        .property(name2, name);

      List<Property> props = def.getProperties();
      assertEquals(2, props.size());

      def.removeProperty(props.get(1));

      props = def.getProperties();
      assertEquals(1, props.size());
      assertEquals(name, props.get(0).getName());
      assertEquals(name2, props.get(0).getValue());
   }

   @Test
   public void shouldBeAbleToClearProperties() throws Exception
   {
      PersistenceUnitDef def = create()
                        .property(name, name2)
                        .property(name2, name);

      List<Property> props = def.getProperties();
      assertEquals(2, props.size());

      def.clearProperties();

      props = def.getProperties();
      assertEquals(0, props.size());
   }

   @Test
   public void shouldBeAbleToClearPropertiesAndAddNew() throws Exception
   {
      PersistenceUnitDef def = create()
                        .property(name, name2)
                        .property(name2, name);

      List<Property> props = def.getProperties();
      assertEquals(2, props.size());

      def.clearProperties();

      props = def.getProperties();
      assertEquals(0, props.size());

      def.property(name2, name)
               .property(name, name2);

      props = def.getProperties();
      assertEquals(2, props.size());
      assertEquals(name2, props.get(0).getName());
      assertEquals(name, props.get(0).getValue());
      assertEquals(name, props.get(1).getName());
      assertEquals(name2, props.get(1).getValue());
   }

   @Test
   public void shouldBeAbleSetSharedCacheMode() throws Exception
   {
      String desc = create().sharedCacheMode(SharedCacheModeType.ALL)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/shared-cache-mode", SharedCacheModeType.ALL.name());
   }

   @Test
   public void shouldBeAbleSetValidationMode() throws Exception
   {
      String desc = create().validationMode(ValidationModeType.AUTO)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/validation-mode", ValidationModeType.AUTO.name());
   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - Hibernate ------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleSetProviderHibernate() throws Exception
   {
      String desc = create().provider(ProviderType.HIBERNATE)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/provider", ProviderType.HIBERNATE.getProviderClass());
   }

   @Test
   public void shouldBeAbleSetFormatSQLHibernate() throws Exception
   {
      String desc = create()
                        .provider(ProviderType.HIBERNATE)
                        .formatSql()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.format_sql");
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   }

   @Test
   public void shouldBeAbleSetShowSQLHibernate() throws Exception
   {
      String desc = create()
                        .provider(ProviderType.HIBERNATE)
                        .showSql()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.show_sql");
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreate() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE, "create");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreateDrop() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE_DROP, "create-drop");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeHibernateNone() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.NONE, "none");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeHibernateUpdate() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.UPDATE, "update");
   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - EclipseLink ----------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   @Test
   public void shouldBeAbleSetShowSQLEclipseLink() throws Exception
   {
      String desc = create()
                        .provider(ProviderType.ECLIPSE_LINK)
                        .showSql()
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", "eclipselink.logging.level");
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", "FINE");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreate() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE, "create-tables");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreateDrop() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE_DROP, "drop-and-create-tables");
   }

   @Test
   public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkNone() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.NONE, "none");
   }

   @Test(expected = UnsupportedOperationException.class)
   public void shouldNotBeAbleToSetSchemaGenerationModeEclipseLinkUpdate() throws Exception
   {
      shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.UPDATE,
               "no-value-should-be-added-mode-unsupported");
   }

   // -------------------------------------------------------------------------------------||
   // Provider Specific - Generic Helper -------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private void shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType generationMode,
            String expectedValue) throws Exception
   {
      shouldBeAbleSetSchemaGenerationMode(ProviderType.HIBERNATE, generationMode, "hibernate.hbm2ddl.auto",
               expectedValue);
   }

   private void shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType generationMode,
            String expectedValue) throws Exception
   {
      shouldBeAbleSetSchemaGenerationMode(ProviderType.ECLIPSE_LINK, generationMode, "eclipselink.ddl-generation",
               expectedValue);
   }

   private void shouldBeAbleSetSchemaGenerationMode(ProviderType providerType, SchemaGenerationModeType generationMode,
            String expectedName, String expectedValue) throws Exception
   {
      String desc = create()
                        .provider(providerType)
                        .schemaGenerationMode(generationMode)
                     .exportAsString();

      assertXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
      assertXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
   }

   // -------------------------------------------------------------------------------------||
   // Internal Helper --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private PersistenceUnitDef create()
   {
      return Descriptors.create(PersistenceDescriptor.class)
               .persistenceUnit(name);
   }
}
