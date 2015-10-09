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

import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertAbsenceUsingXPath;
import static org.jboss.shrinkwrap.descriptor.test.util.XmlAssert.assertPresenceUsingXPath;
import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test Case to verify that {@link PersistenceDescriptor} impl produce the correct XML Descriptor output.
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class PersistenceDescriptorTestCase {
    /**
     * Logger
     */
    private static final Logger log = Logger.getLogger(PersistenceDescriptorTestCase.class.getName());

    private final String name = PersistenceDescriptorTestCase.class.getSimpleName();

    private final String name2 = PersistenceDescriptorTestCase.class.getSimpleName() + "2";

    @Test
    public void shouldCreateDefaultName() throws Exception {
        Assert.assertEquals("persistence.xml", create().getDescriptorName());
    }

    @Test
    public void shouldBeAbleToSetName() throws Exception {
        Assert
            .assertEquals("test.xml", Descriptors.create(PersistenceDescriptor.class, "test.xml").getDescriptorName());
    }

    @Test
    @Ignore("Missing in the new API")
    // There is no default generated through XSLT
    public void shouldHaveDefaultVersion() throws Exception {
        final String desc = create().exportAsString();
        log.info(desc);
        assertPresenceUsingXPath(desc, "/persistence/@version", "2.0");
    }

    @Test
    public void shouldBeAbleToSetVersion() throws Exception {
        String desc = create().version("1.0").exportAsString();
        assertPresenceUsingXPath(desc, "/persistence/@version", "1.0");
    }

    @Test
    public void shouldBeAbleToAddPersistenceUnit() throws Exception {
        String desc = create().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/@name", name);
    }

    @Test
    public void shouldBeAbleToAddMultiplePersistenceUnits() throws Exception {
        String desc = create().createPersistenceUnit().name(name2).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/@name", name, name2);
    }

    @Test
    public void shouldBeAbleToAddPersistenceUnitName() throws Exception {
        String desc = create().getAllPersistenceUnit().get(0).name(name2).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/@name", name2);
    }

    @Test
    @Ignore("Missing in the new API")
    public void shouldOnlyCreateOnePersistenceUnitWithSameName() throws Exception {
        // create() creates a persistenceUnit with "name".
        // Add a new persistence unit with "name", should return the same node. name is defined unique
        String desc = create().getOrCreatePersistenceUnit().name(name).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/@name", name);
    }

    @Test
    public void shouldBeAbleToAddClasses() throws Exception {
        String desc = create().getOrCreatePersistenceUnit()
            .clazz(PersistenceDescriptor.class.getName(), PersistenceDescriptor.class.getName()).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/class", PersistenceDescriptor.class.getName(),
            PersistenceDescriptor.class.getName());
    }

    @Test
    public void shouldBeAbleToAddDescription() throws Exception {
        PersistenceUnit<PersistenceDescriptor> unit = create().getOrCreatePersistenceUnit().description(name);
        String desc = unit.up().exportAsString();
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/description", name);
        Assert.assertEquals(name, unit.getDescription());
    }

    @Test
    public void shouldBeAbleToSetExcludeUnlistedClasses() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().excludeUnlistedClasses(true).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "true");
    }

    @Test
    public void shouldBeAbleToSetIncludeUnlistedClasses() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().excludeUnlistedClasses(false).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/exclude-unlisted-classes", "false");
    }

    @Test
    public void shouldBeAbleToSetJTADataSource() throws Exception {
        PersistenceUnit<PersistenceDescriptor> unit = create().getOrCreatePersistenceUnit().jtaDataSource(name);
        String desc = unit.up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
        assertEquals(name, unit.getJtaDataSource());
    }

    @Test
    @Ignore("Missing in the new API")
    public void shouldBeAbleToReplaceJTADataSourceWithNonJTADataSource() throws Exception {
        String desc = create().getAllPersistenceUnit().get(0).jtaDataSource(name).nonJtaDataSource(name2).up()
            .exportAsString();

        assertAbsenceUsingXPath(desc, "/persistence/persistence-unit/jta-data-source");
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name2);
    }

    @Test
    @Ignore("Missing in the new API")
    public void shouldBeAbleToReplaceNonJTADataSourceWithJTADataSource() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().nonJtaDataSource(name2).jtaDataSource(name).up()
            .exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/jta-data-source", name);
        assertAbsenceUsingXPath(desc, "/persistence/persistence-unit/non-jta-data-source");
    }

    @Test
    public void shouldBeAbleToSetNonJtaDataSource() throws Exception {
        PersistenceUnit<PersistenceDescriptor> unit = create().getOrCreatePersistenceUnit().nonJtaDataSource(name);
        String desc = unit.up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/non-jta-data-source", name);
        assertEquals(name, unit.getNonJtaDataSource());
    }

    @Test
    public void shouldBeAbleToSetJarFile() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().jarFile(name).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/jar-file", name);
    }

    @Test
    public void shouldBeAbleToSetJarFiles() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().jarFile(name, name2).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/jar-file", name, name2);
    }

    @Test
    public void shouldBeAbleToSetMappingFile() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().mappingFile(name).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/mapping-file", name);
    }

    @Test
    public void shouldBeAbleToSetMappingFiles() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().mappingFile(name, name2).up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/mapping-file", name, name2);
    }

    @Test
    public void shouldBeAbleToSetTransactionType() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().transactionType(PersistenceUnitTransactionType._JTA).up()
            .exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/@transaction-type",
            PersistenceUnitTransactionType._JTA);
    }

    @Test
    public void shouldBeAbleToAddProperties() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().getOrCreateProperties().getOrCreateProperty().name(name)
            .value(name2).up().createProperty().name(name2).value(name).up().up().up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name2);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", name2, name);
    }

    @Test
    @Ignore("Missing in the new API")
    // FIXME There is no convenient way of getting property by name currently
    // It's accessible through the list.get(i), but I guess that's
    // not the desired approach.
    public void addingDuplicateNamePropertyUpdatesExisting() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().getOrCreateProperties().createProperty().name(name)
            .value(name2).up().createProperty().name(name).value(name).up().up().up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@name", name, name);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/properties/property/@value", name, name);
    }

    @Test
    public void shouldBeAbleToGetProperties() throws Exception {
        PersistenceUnit<PersistenceDescriptor> def = create().getOrCreatePersistenceUnit().getOrCreateProperties()
            .createProperty().name(name).value(name2).up().createProperty().name(name2).value(name).up().up();

        List<Property<Properties<PersistenceUnit<PersistenceDescriptor>>>> properties = def.getOrCreateProperties()
            .getAllProperty();
        assertEquals(2, properties.size());
        assertEquals(name, properties.get(0).getName());
        assertEquals(name2, properties.get(0).getValue());
        assertEquals(name2, properties.get(1).getName());
        assertEquals(name, properties.get(1).getValue());
    }

    // FIXME Not possible with the current API

    // @Test
    // public void shouldBeAbleToRemovePropertyByName() throws Exception
    // {
    // PersistenceUnitDef def = create().property(name, name2).property(name2, name);
    //
    // List<Property> props = def.getProperties();
    // assertEquals(2, props.size());
    //
    // def.removeProperty(name);
    // props = def.getProperties();
    // assertEquals(1, props.size());
    // assertEquals(name2, props.get(0).getName());
    // assertEquals(name, props.get(0).getValue());
    // }
    //
    // @Test
    // public void shouldBeAbleToRemovePropertyByReference() throws Exception
    // {
    // PersistenceUnitDef def = create().property(name, name2).property(name2, name);
    //
    // List<Property> props = def.getProperties();
    // assertEquals(2, props.size());
    //
    // def.removeProperty(props.get(1));
    //
    // props = def.getProperties();
    // assertEquals(1, props.size());
    // assertEquals(name, props.get(0).getName());
    // assertEquals(name2, props.get(0).getValue());
    // }

    @Test
    public void shouldBeAbleToClearProperties() throws Exception {
        Properties<PersistenceUnit<PersistenceDescriptor>> def = create().getOrCreatePersistenceUnit()
            .getOrCreateProperties().createProperty().name(name).value(name2).up().createProperty().name(name2)
            .value(name).up();

        List<Property<Properties<PersistenceUnit<PersistenceDescriptor>>>> props = def.getAllProperty();
        assertEquals(2, props.size());

        def.removeAllProperty();

        props = def.getAllProperty();
        assertEquals(0, props.size());
    }

    @Test
    public void shouldBeAbleToClearPropertiesAndAddNew() throws Exception {
        Properties<PersistenceUnit<PersistenceDescriptor>> def = create().getOrCreatePersistenceUnit()
            .getOrCreateProperties().createProperty().name(name).value(name2).up().createProperty().name(name2)
            .value(name).up();

        List<Property<Properties<PersistenceUnit<PersistenceDescriptor>>>> props = def.getAllProperty();
        assertEquals(2, props.size());

        def.removeAllProperty();

        props = def.getAllProperty();
        assertEquals(0, props.size());

        def.createProperty().name(name2).value(name).up().createProperty().name(name).value(name2);

        props = def.getAllProperty();
        assertEquals(2, props.size());
        assertEquals(name2, props.get(0).getName());
        assertEquals(name, props.get(0).getValue());
        assertEquals(name, props.get(1).getName());
        assertEquals(name2, props.get(1).getValue());
    }

    @Test
    public void shouldBeAbleSetSharedCacheMode() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().sharedCacheMode("ALL").up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/shared-cache-mode", "ALL");
    }

    @Test
    public void shouldBeAbleSetValidationMode() throws Exception {
        String desc = create().getOrCreatePersistenceUnit().validationMode("AUTO").up().exportAsString();

        assertPresenceUsingXPath(desc, "/persistence/persistence-unit/validation-mode", "AUTO");
    }

    // -------------------------------------------------------------------------------------||
    // Complex Scenario---------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    @Test
    public void shouldBeAbleToIncludeMultiplePersistenceUnit() throws Exception {
        final String hibernateUnit = "hibernate-unit";
        final String txTypeJta = "JTA";
        final String providerTypeHibernate = "org.hibernate.ejb.HibernatePersistence";
        final String jtaDataSource = "java:/DefaultDS";
        final String eclipseLinkUnit = "eclipselink-unit";
        final String txTypeResourceLocal = "RESOURCE_LOCAL";
        final String eclipseLinkProvider = "org.eclipse.persistence.jpa.PersistenceProvider";
        final String nonjtaDataSource = "jdbc/__default";

        final PersistenceDescriptor persistence = Descriptors.create(PersistenceDescriptor.class)
            .createPersistenceUnit().name(hibernateUnit).transactionType(txTypeJta).provider(providerTypeHibernate)
            .jtaDataSource(jtaDataSource).clazz(PersistenceDescriptor.class.getName()).up().createPersistenceUnit()
            .name(eclipseLinkUnit).transactionType(txTypeResourceLocal).provider(eclipseLinkProvider)
            .nonJtaDataSource(nonjtaDataSource).excludeUnlistedClasses(true).up();

        final String desc = persistence.exportAsString();
        log.info(desc);

        // Assertions
        assertPresenceUsingXPath(desc,
            "/persistence/persistence-unit[@name='" + hibernateUnit + "']/@transaction-type", txTypeJta);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + hibernateUnit + "']/provider",
            providerTypeHibernate);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + hibernateUnit + "']/jta-data-source",
            jtaDataSource);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + hibernateUnit + "']/class",
            PersistenceDescriptor.class.getName());
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + eclipseLinkUnit
            + "']/@transaction-type", txTypeResourceLocal);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + eclipseLinkUnit + "']/provider",
            eclipseLinkProvider);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + eclipseLinkUnit
            + "']/non-jta-data-source", nonjtaDataSource);
        assertPresenceUsingXPath(desc, "/persistence/persistence-unit[@name='" + eclipseLinkUnit
            + "']/exclude-unlisted-classes", Boolean.TRUE.toString());
    }

    // -------------------------------------------------------------------------------------||
    // Internal Helper --------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private PersistenceDescriptor create() {
        return Descriptors.create(PersistenceDescriptor.class).getOrCreatePersistenceUnit().name(name).up();
    }
}
