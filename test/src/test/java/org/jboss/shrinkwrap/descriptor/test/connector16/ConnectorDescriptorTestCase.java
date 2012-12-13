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
package org.jboss.shrinkwrap.descriptor.test.connector16;

import java.io.BufferedReader;
import java.io.FileReader;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConnectorDescriptor;
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
    public void testGenExample() throws Exception {
      ConnectorDescriptor jca16Descr = create()
         .addDefaultNamespaces()
         .version("1.6")
         .moduleName("module-name0")
         .description("description0")
         .displayName("display-name0")
         .getOrCreateIcon()
            .smallIcon("small-icon0")
            .largeIcon("large-icon0").up()
         .vendorName("vendor-name0")
         .eisType("eis-type0")
         .resourceadapterVersion("resourceadapter-version0")
         .getOrCreateLicense()
            .description("description1")
            .licenseRequired(false).up()
         .getOrCreateResourceadapter()
            .resourceadapterClass("resourceadapter-class0")
            .createConfigProperty()
               .description("description2")
               .configPropertyName("config-property-name0")
               .configPropertyType("java.lang.Boolean")
               .configPropertyValue("config-property-value0")
               .configPropertyIgnore(false)
               .configPropertySupportsDynamicUpdates(false)
               .configPropertyConfidential(false).up()
            .getOrCreateOutboundResourceadapter()
               .createConnectionDefinition()
                  .managedconnectionfactoryClass("managedconnectionfactory-class0")
                  .createConfigProperty()
                     .description("description3")
                     .configPropertyName("config-property-name1")
                     .configPropertyType("java.lang.Boolean")
                     .configPropertyValue("config-property-value1")
                     .configPropertyIgnore(false)
                     .configPropertySupportsDynamicUpdates(false)
                     .configPropertyConfidential(false).up()
                  .connectionfactoryInterface("connectionfactory-interface0")
                  .connectionfactoryImplClass("connectionfactory-impl-class0")
                  .connectionInterface("connection-interface0")
                  .connectionImplClass("connection-impl-class0").up()
               .transactionSupport("NoTransaction")
               .createAuthenticationMechanism()
                  .description("description4")
                  .authenticationMechanismType("authentication-mechanism-type0")
                  .credentialInterface("javax.resource.spi.security.PasswordCredential").up()
               .reauthenticationSupport(false).up()
            .getOrCreateInboundResourceadapter()
               .getOrCreateMessageadapter()
                  .createMessagelistener()
                     .messagelistenerType("messagelistener-type0")
                     .getOrCreateActivationspec()
                        .activationspecClass("activationspec-class0").up().up().up().up()
            .createAdminobject()
               .adminobjectInterface("adminobject-interface0")
               .adminobjectClass("adminobject-class0")
               .createConfigProperty()
                  .description("description5")
                  .configPropertyName("config-property-name2")
                  .configPropertyType("java.lang.Boolean")
                  .configPropertyValue("config-property-value2")
                  .configPropertyIgnore(false)
                  .configPropertySupportsDynamicUpdates(false)
                  .configPropertyConfidential(false).up().up()
            .createSecurityPermission()
               .description("description6")
               .securityPermissionSpec("security-permission-spec0").up().up()
        .requiredWorkContext("required-work-context0");

        String createdRaXml = jca16Descr.exportAsString();
        String generatedRaXml = getResourceContents("src/test/resources/test-gen-connector16.xml");

        XmlAssert.assertIdentical(createdRaXml, generatedRaXml);
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
