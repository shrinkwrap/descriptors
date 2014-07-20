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
package org.jboss.shrinkwrap.descriptor.test.jbossdeployment12;

import java.io.BufferedReader;
import java.io.FileReader;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.beans10.BeansDescriptor;
import org.jboss.shrinkwrap.descriptor.api.jbossdeployment12.JBossDeploymentStructureDescriptor;
import org.jboss.shrinkwrap.descriptor.test.util.XmlAssert;
import org.junit.Test;

/**
 * Test Case to verify that {@link BeansDescriptor} impl produce the correct XML Descriptor output.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */

public class JBossDeploymentStructureTestCase {

    @Test
    public void testGeneratedXml() throws Exception {
        final JBossDeploymentStructureDescriptor jbossDeployStructur = create()
            .addDefaultNamespaces()
            .earSubdeploymentsIsolated(false)
            .getOrCreateDeployment()
                .getOrCreateModuleAlias().name("name1").slot("slot1").up()
                .getOrCreateExports().createExclude().path("path1").up().up()
                .getOrCreateDependencies()
                	.getOrCreateModule().name("name3").slot("slot3").export(false).services("none").optional(false).annotations(false).metaInf("none")
                		.createExports().createInclude().path("path3").up().up().up().up()
                .getOrCreateExclusions().createModule().name("name5").slot("slot5").up().up()
                .getOrCreateResources()
                	.createResourceRoot().name("name7").path("path5").usePhysicalCodeSource(false)
                		.getOrCreateFilter().createIncludeSet().up().up().up().up()
                .getOrCreateTransformers().createTransformer().clazz("class1").up().up()
                .getOrCreateLocalLast().value(false).up()
                .getOrCreateExcludeSubsystems().createSubsystem().name("name9").up().up().up();

        final String jbossStructGenerated = jbossDeployStructur.exportAsString();
        final String jbossStructOriginal = getResourceContents("src/test/resources/test-jboss-deployment-structure.xml");
        XmlAssert.assertIdentical(jbossStructOriginal, jbossStructGenerated);
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

    private JBossDeploymentStructureDescriptor create() {
        return Descriptors.create(JBossDeploymentStructureDescriptor.class);
    }
}
