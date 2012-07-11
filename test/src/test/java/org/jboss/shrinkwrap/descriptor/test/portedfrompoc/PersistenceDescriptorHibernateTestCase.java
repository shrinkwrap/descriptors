package org.jboss.shrinkwrap.descriptor.test.portedfrompoc;

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.MutablePersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceDescriptor;
import org.junit.Ignore;
import org.junit.Test;

public class PersistenceDescriptorHibernateTestCase
{

   // ------------------------------------------------------------------------------------||
   // Provider Specific - Hibernate ------------------------------------------------------||
   // ------------------------------------------------------------------------------------||
   
   @Test
   public void shouldBeAbleSetProviderHibernate() throws Exception
   {
      String desc = create().getOrCreatePersistenceUnit().provider("HIBERNATE").up().exportAsString();

      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/provider", "HIBERNATE");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleSetFormatSQLHibernate() throws Exception
   {
//      String desc = create().provider(ProviderType.HIBERNATE).formatSql().exportAsString();
//   
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.format_sql");
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleSetShowSQLHibernate() throws Exception
   {
//      String desc = create().provider(ProviderType.HIBERNATE).showSql().exportAsString();
//   
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", "hibernate.show_sql");
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", "true");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreate() throws Exception
   {
//      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE, "create");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleToSetSchemaGenerationModeHibernateCreateDrop() throws Exception
   {
//      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.CREATE_DROP, "create-drop");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleToSetSchemaGenerationModeHibernateNone() throws Exception
   {
//      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.NONE, "none");
   }
   
   @Test
   @Ignore("Missing in the new API")
   public void shouldBeAbleToSetSchemaGenerationModeHibernateUpdate() throws Exception
   {
//      shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType.UPDATE, "update");
   }
   
//   private void shouldBeAbleSetSchemaGenerationModeHibernate(SchemaGenerationModeType generationMode,
//         String expectedValue) throws Exception
//   {
//      shouldBeAbleSetSchemaGenerationMode(ProviderType.HIBERNATE, generationMode, "hibernate.hbm2ddl.auto",
//            expectedValue);
//   }
//   
//   private void shouldBeAbleSetSchemaGenerationMode(ProviderType providerType, SchemaGenerationModeType generationMode,
//         String expectedName, String expectedValue) throws Exception
//   {
//      String desc = create().provider(providerType).schemaGenerationMode(generationMode).exportAsString();
//   
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
//   }
//   
//   private void shouldBeAbleSetSchemaGenerationMode(ProviderType providerType, SchemaGenerationModeType generationMode,
//         String expectedName, String expectedValue) throws Exception
//   {
//      String desc = create().provider(providerType).schemaGenerationMode(generationMode).exportAsString();
//   
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
//      assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
//   }
//   
   private MutablePersistenceDescriptor create()
   {
      return Descriptors.create(MutablePersistenceDescriptor.class).getOrCreatePersistenceUnit().name(this.getClass().getSimpleName()).up();
   }
}
