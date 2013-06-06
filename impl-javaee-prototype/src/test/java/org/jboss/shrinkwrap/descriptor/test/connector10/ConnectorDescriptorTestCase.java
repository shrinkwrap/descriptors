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

import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConnectorDescriptor;
import org.jboss.shrinkwrap.descriptor.api.connector10.Factory;
import org.junit.Test;

public class ConnectorDescriptorTestCase {

    @Test
    public void testHornetQExample() throws Exception {
    	final ConnectorDescriptor jca10Generated = create();
    	final Factory factory = jca10Generated.getFactory();
    			
    	jca10Generated
    		.description("It is a sample resource adapter")
            .setResourceadapter(factory.Resourceadapter()
                .addConfigProperty(factory.ConfigProperty()
                    .configPropertyName("Input")
                    .configPropertyType("java.lang.String")
                    .configPropertyValue("test messages")));

        String generatedRaXml = jca10Generated.exportAsString();
//        String originalRaXml = this.getResourceContents("src/test/resources/test-orig-connector10.xml");

         System.out.println(generatedRaXml);

//        XmlAssert.assertIdentical(originalRaXml, generatedRaXml);
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
