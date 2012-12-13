package org.jboss.shrinkwrap.descriptor.test.portedfrompoc;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceDescriptor;
import org.junit.Ignore;
import org.junit.Test;

@Ignore("Missing in the new API")
public class PersistenceDescriptorEclipseLinkTestCase {

    // -----------------------------------------------------------------------------------||
    // Provider Specific - EclipseLink ----------------------------------------------------||
    // -----------------------------------------------------------------------------------||

    @Test
    public void shouldBeAbleSetShowSQLEclipseLink() throws Exception {
        // String desc =
        // create().getOrCreatePersistenceUnit().provider(ProviderType.ECLIPSE_LINK).showSql().exportAsString();
        //
        // assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name",
        // "eclipselink.logging.level");
        // assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", "FINE");
    }

    @Test
    public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreate() throws Exception {
        // shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE, "create-tables");
    }

    @Test
    public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkCreateDrop() throws Exception {
        // shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.CREATE_DROP,
        // "drop-and-create-tables");
    }

    @Test
    public void shouldBeAbleToSetSchemaGenerationModeEclipseLinkNone() throws Exception {
        // shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.NONE, "none");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldNotBeAbleToSetSchemaGenerationModeEclipseLinkUpdate() throws Exception {
        // shouldBeAbleSetSchemaGenerationModeEclipseLink(SchemaGenerationModeType.UPDATE,
        // "no-value-should-be-added-mode-unsupported");
    }

    private void shouldBeAbleSetSchemaGenerationModeEclipseLink(String generationMode, String expectedValue)
        throws Exception {
        // shouldBeAbleSetSchemaGenerationMode(ProviderType.ECLIPSE_LINK, generationMode, "eclipselink.ddl-generation",
        // expectedValue);
    }

    private void shouldBeAbleSetSchemaGenerationMode(String providerType, String generationMode, String expectedName,
        String expectedValue) throws Exception {
        // String desc =
        // create().getOrCreatePersistenceUnit().provider(providerType).schemaGenerationMode(generationMode).exportAsString();
        //
        // assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", expectedName);
        // assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", expectedValue);
    }

    private PersistenceDescriptor create() {
        return Descriptors.create(PersistenceDescriptor.class).getOrCreatePersistenceUnit()
            .name(this.getClass().getSimpleName()).up();
    }

}
