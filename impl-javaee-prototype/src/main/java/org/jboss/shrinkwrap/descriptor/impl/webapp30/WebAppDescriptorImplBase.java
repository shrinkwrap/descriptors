/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.impl.webapp30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.formatter.Formatter;
import org.jboss.shrinkwrap.descriptor.api.formatter.Formatters;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptorBase;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterTypeBase;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/**
 * Base support for building implementations of {@link WebAppDescriptor} and {@link WebAppMutableDescriptor}
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
abstract class WebAppDescriptorImplBase<FILTERTYPE extends FilterTypeBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>, WEBAPPDESCRIPTORTYPE extends WebAppDescriptorBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE>>
    extends NodeDescriptorImplBase implements WebAppDescriptorBase<FILTERTYPE, WEBAPPDESCRIPTORTYPE> {

    /**
     * Backing model for this view
     */
    private Node model;

    public WebAppDescriptorImplBase(final String descriptorName) {
        this(descriptorName, new Node("web-app"));
    }

    public WebAppDescriptorImplBase(final String descriptorName, final Node model) {
        super(descriptorName);
        this.model = model;
        // Add default namespaces
        this.model
            .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance")
            .attribute("xsi:schemaLocation",
                "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd")
            .attribute("xmlns", "http://java.sun.com/xml/ns/javaee");
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptor#getRootNode()
     */
    @Override
    public Node getRootNode() {
        return this.model;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptorBase#getAllFilter()
     */
    // TODO Update doc to the above
    // TODO Add @Override
    @Override
    public List<FILTERTYPE> getAllFilter() {

        final List<FILTERTYPE> list = new ArrayList<FILTERTYPE>();
        final List<Node> nodeList = model.get("filter");
        for (final Node node : nodeList) {
            final FILTERTYPE filter = this.createNewFilterViewForModel(node);
            list.add(filter);
        }

        return list;
    }

    /**
     * Creates and returns a typesafe view of the FILTERTYPE
     * 
     * @param filterModel
     * @return
     */
    abstract FILTERTYPE createNewFilterViewForModel(final Node filterModel);
    


    @Override
    public String toString(final boolean verbose) {
        return verbose ? this.toString(Formatters.XML) : this.toString();   }

    @Override
    public String toString(final Formatter formatter) throws IllegalArgumentException {
        // Precondition check
        if (formatter == null) {
            throw new IllegalArgumentException("Formatter must be specified");
        }

        // Delegate
        return formatter.format(this);
    }
}
