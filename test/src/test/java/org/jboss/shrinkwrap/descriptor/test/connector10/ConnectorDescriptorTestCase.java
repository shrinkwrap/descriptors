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
package org.jboss.shrinkwrap.descriptor.test.connector10;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConnectorDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

public class ConnectorDescriptorTestCase {

    // -------------------------------------------------------------------------------------||
    // Basic API --------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    @Test
    public void testDefaultName() throws Exception {
        Assert.assertEquals("ra.xml", create().getDescriptorName());
    }

    @Test
    public void testSetName() throws Exception {
        Assert.assertEquals("test.xml", Descriptors.create(ConnectorDescriptor.class, "test.xml").getDescriptorName());
    }

    @Test
    public void testHornetQExample() throws Exception {
        ConnectorDescriptor jca10Generated = create()
            .displayName("Sample Adapter")
            .description("It is a sample resource adapter")
            .vendorName("JBoss")
            .specVersion("1.0")
            .eisType("Sample")
            .version("1.0")
            .getOrCreateLicense()
                .description("description0")
                .licenseRequired("true")
                .up()
            .getOrCreateResourceadapter()
                .managedconnectionfactoryClass("org.jboss.messaging.adapters.jcasample.SampleManagedConnectionFactory")
                .connectionfactoryInterface("javax.resource.cci.ConnectionFactory")
                .connectionfactoryImplClass("org.jboss.messaging.adapters.jcasample.SampleConnectionFactory")
                .connectionInterface("javax.resource.cci.Connection")
                .connectionImplClass("org.jboss.messaging.adapters.jcasample.SampleConnection")
                .transactionSupport("NoTransaction")
                .createConfigProperty()
                    .configPropertyName("Input")
                    .configPropertyType("java.lang.String")
                    .configPropertyValue("test messages").up()
                .createAuthenticationMechanism()
                    .authenticationMechanismType("BasicPassword")
                    .credentialInterface("javax.resource.security.PasswordCredential").up()
                .reauthenticationSupport("false")
            .up();

        String generatedRaXml = jca10Generated.exportAsString();
        String originalRaXml = this.getResourceContents("src/test/resources/test-orig-connector10.xml");

        // System.out.println(generatedRaXml);

        XmlAssert.assertIdentical(originalRaXml, generatedRaXml);
    }

    // -------------------------------------------------------------------------------------||
    // Internal Helper --------------------------------------------------------------------||
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

    private ConnectorDescriptor create() {
        return Descriptors.create(ConnectorDescriptor.class);
    }

}
