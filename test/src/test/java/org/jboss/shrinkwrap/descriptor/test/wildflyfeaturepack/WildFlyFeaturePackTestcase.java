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
package org.jboss.shrinkwrap.descriptor.test.wildflyfeaturepack;


import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.wildflyfeaturepack11.WildFlyFeaturePackDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

/**
 * Test Case to verify that the {@link WildFlyFeaturePackDescriptor}
 * impl produces the correct XML Descriptor output.
 *
 * @author <a href="mailto:toby@tcrawley.org">Toby Crawley</a>
 */

public class WildFlyFeaturePackTestcase {

    @Test
    public void testNothing() throws Exception {
        WildFlyFeaturePackDescriptor featurePack = Descriptors.create(WildFlyFeaturePackDescriptor.class);

        featurePack.getOrCreateArtifactVersions()
                .createArtifact().groupId("io.undertow").artifactId("undertow-core").version("1.3.0.CR2").up()
                .createArtifact().groupId("org.codehaus.woodstox").artifactId("stax2-api").version("3.1.4").up()
                .createArtifact().groupId("org.codehaus.woodstox").artifactId("woodstox-core-api").version("4.4.1").up();

        featurePack.getOrCreateConfig()
                .createStandalone().template("configuration/standalone/template.xml").subsystems("configuration/standalone/subsystems.xml").outputFile("standalone/configuration/standalone.xml").up()
                .createDomain().template("configuration/domain/template.xml").subsystems("configuration/domain/subsystems.xml").outputFile("domain/configuration/domain.xml").up()
                .createHost().template("configuration/host/host.xml").subsystems("configuration/host/subsystems.xml").outputFile("domain/configuration/host.xml").up();

        featurePack.getOrCreateCopyArtifacts()
                .createCopyArtifact().artifact("org.jboss.modules:jboss-modules").toLocation("jboss-modules.jar").up()
                .createCopyArtifact().artifact("org.wildfly.core:wildfly-launcher").toLocation("bin/wildfly-launcher.jar").up();

        featurePack.getOrCreateFilePermissions()
                .createPermission().value("755").createFilter().pattern(".sh").include(true).up().up()
                .createPermission().value("700").createFilter().pattern("*/tmp/auth").include(true).up().up()
                .createPermission().value("600").createFilter().pattern("*-users.properties").include(true).up()
                .createFilter().pattern("*/.installation").include(true);

        String featurePackGenerated = featurePack.exportAsString();
        String featurePackExpected = getResourceContents( "src/test/resources/test-wildfly-feature-pack11.xml");

        XmlAssert.assertIdentical( featurePackExpected, featurePackGenerated );
    }

    // -------------------------------------------------------------------------------------||
    // Internal Helper ---------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private String getResourceContents(String resource) throws Exception {
        assert resource != null && resource.length() > 0 : "Resource must be specified";
        final BufferedReader reader = new BufferedReader(new FileReader(resource));
        final StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line);
            builder.append("\n");
        }
        return builder.toString();
    }

}
