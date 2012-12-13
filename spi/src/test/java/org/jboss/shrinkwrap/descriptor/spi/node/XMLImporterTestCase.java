/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.spi.node;

import java.io.ByteArrayInputStream;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.spi.node.dom.XmlDomNodeImporter;
import org.junit.Test;

/**
 * XMLImporterTestCase
 *
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 * @version $Revision: $
 */
public class XMLImporterTestCase
{
   private static final String SOURCE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
   		"<arquillian \n" +
   		"    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" \n" +
   		"    xsi:schemaLocation=\"http://jboss.org/schema/arquillian http://jboss.org/schema/arquillian/arquillian_1_0.xsd\">\n" +
   		"    \n" +
   		"       <container qualifier=\"standby\">\n" +
   		"           <configuration>\n" +
   		"               <property name=\"tomcatHome\">target/tomcat-embedded-6</property>\n" +
   		"           </configuration>\n" +
   		"       </container>\n" +
   		"</arquillian>";
   
    @Test
    public void shouldBeAbleToImportNamespace() throws Exception {
        Node root = load();

        Assert.assertEquals("Verify namespace defintion", "http://www.w3.org/2001/XMLSchema-instance",
            root.getAttribute("xmlns:xsi"));

        Assert.assertEquals("Verify schemalocation",
            "http://jboss.org/schema/arquillian http://jboss.org/schema/arquillian/arquillian_1_0.xsd",
            root.getAttribute("xsi:schemaLocation"));
    }

    @Test
    public void shouldBeAbleToImportNodes() throws Exception {
        Node root = load();

        Assert.assertNotNull("Verify node exists",
            AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/arquillian")));
        Assert.assertNotNull("Verify node exists",
            AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/arquillian/container")));
        Assert.assertNotNull("Verify node exists",
            AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/arquillian/container/configuration")));
        Assert.assertNotNull("Verify node exists", AbsoluteGetSingleQuery.INSTANCE.execute(root,
            Patterns.from("/arquillian/container/configuration/property")));
    }

    @Test
    public void shouldBeAbleToImportAttributes() throws Exception {
        Node root = load();
        System.out.println(root.toString(true));
        Node n = AbsoluteGetSingleQuery.INSTANCE.execute(root, Patterns.from("/arquillian/container"));
        System.out.println(n);
        Assert.assertEquals("Verify attributes on node with children", "standby", n.getAttribute("qualifier"));

        Assert.assertEquals("Verify attributes on node with only text children", "tomcatHome",
            AbsoluteGetSingleQuery.INSTANCE
                .execute(root, Patterns.from("/arquillian/container/configuration/property")).getAttribute("name"));
    }

    private Node load() {
        return XmlDomNodeImporter.INSTANCE.importAsNode(new ByteArrayInputStream(SOURCE.getBytes()), true);
    }
}
