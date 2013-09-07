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
package org.jboss.shrinkwrap.descriptor.test.job10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.JobXMLDescriptor;
import org.jboss.shrinkwrap.descriptor.test.ejbjar32.EjbJarDescriptorTestCase;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

/**
 * Test Case to verify that {@link BeansDescriptor} impl produce the correct XML Descriptor output.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */

public class JobDescriptorTestCase {

	private static final Logger log = Logger.getLogger(JobDescriptorTestCase.class.getName());
	
    @Test
    public void testGeneratedXml() throws Exception {
        final JobXMLDescriptor batchDescr = create()
            .addDefaultNamespaces()
        	.id("simple-batchlet-job") 
        	.version("1.0")
            .createStep().id("batchlet-step")
            	.getOrCreateBatchlet().ref("co.uk.planetjones.HelloWorldBatchlet").up()
            .up();
	
        String webXmlGenerated = batchDescr.exportAsString();
        String webXmlOriginal = getResourceContents("src/test/resources/test-gen-job10.xml");

        log.info(webXmlGenerated);
        log.info(webXmlOriginal);
        
        XmlAssert.assertIdentical(webXmlOriginal, webXmlGenerated);
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

    private JobXMLDescriptor create() {
        return Descriptors.create(JobXMLDescriptor.class);
    }
}
