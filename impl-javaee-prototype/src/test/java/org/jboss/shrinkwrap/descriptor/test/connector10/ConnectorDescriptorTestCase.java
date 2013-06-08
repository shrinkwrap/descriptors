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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConnectorDescriptor;
import org.jboss.shrinkwrap.descriptor.api.connector10.Factory;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.impl.connector10.ChildNodeInitializer;
import org.jboss.shrinkwrap.descriptor.impl.connector10.ResourceadapterImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.junit.Test;

public class ConnectorDescriptorTestCase {

    @Test
    public void testFactory() throws Exception {
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
        System.out.println(generatedRaXml);
    }

    @Test
    public void testDetachedMode() throws Exception {
    	final ConnectorDescriptor jca10Generated = create();
    	final Factory factory = jca10Generated.getFactory();
    			
    	final Resourceadapter resourceAdapter = factory.Resourceadapter();
    	
    	final ConfigProperty property = factory.ConfigProperty()
                .configPropertyName("Input")
                .configPropertyType("java.lang.String")
                .configPropertyValue("test messages");
    	
    	jca10Generated
    		.description("It is a sample resource adapter")
            .setResourceadapter(resourceAdapter.addConfigProperty(property));

        String generatedRaXml = jca10Generated.exportAsString();
        System.out.println(generatedRaXml);
    }
    

    @Test
    public void testConvenientResourceAdapter() throws Exception {
    	final ConnectorDescriptor jca10Generated = create();
    	final Factory factory = jca10Generated.getFactory();
    			
    	final ConvenientResourceAdapter resourceAdapter = new ConvenientResourceAdapter();
    	
    	final ConfigProperty property = factory.ConfigProperty()
                .configPropertyName("Input")
                .configPropertyType("java.lang.String")
                .configPropertyValue("test messages");
    	
    	jca10Generated
    		.description("It is a sample resource adapter")
            .setResourceadapter(resourceAdapter.addConfigProperty(property));

        String generatedRaXml = jca10Generated.exportAsString();
        System.out.println(generatedRaXml);
    }
    
    // -------------------------------------------------------------------------------------||
    // Internal Helper --------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    private ConnectorDescriptor create() {
        return Descriptors.create(ConnectorDescriptor.class);
    }

    private class ConvenientResourceAdapter implements Resourceadapter, ChildNodeInitializer {
    	final ResourceadapterImpl resourceAdapter = new ResourceadapterImpl();
    	
		@Override
		public void initialize(String nodeName, Node node) {
			node.attribute("attr", "val");
			final Node myNode = node.createChild("my-node");
			myNode.attribute("my-attribute", "great");
			myNode.text("my-text");
			resourceAdapter.initialize(nodeName, node);
		}

		@Override
		public void assign(String nodeName, Node node) {
			resourceAdapter.assign(nodeName, node);
		}

		@Override
		public Resourceadapter addConfigProperty(ConfigProperty configProperty) {
			resourceAdapter.addConfigProperty(configProperty);
			return this;
		}

		@Override
		public List<ConfigProperty> getAllConfigProperty() {
			return resourceAdapter.getAllConfigProperty();
		}

		@Override
		public Resourceadapter removeAllConfigProperty() {
			resourceAdapter.removeAllConfigProperty();
			return this;
		}
    	
    }
}
