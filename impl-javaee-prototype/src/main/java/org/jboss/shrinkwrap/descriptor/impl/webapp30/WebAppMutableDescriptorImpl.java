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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeMutableImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * Concrete implementation of {@link WebAppMutableDescriptor}
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public final class WebAppMutableDescriptorImpl extends
    WebAppDescriptorImplBase<FilterMutableType, WebAppMutableDescriptor> implements WebAppMutableDescriptor {

    public WebAppMutableDescriptorImpl(final String descriptorName) {
        super(descriptorName);
    }

    /*
     * TODO: This ctor: package-private
     */
    WebAppMutableDescriptorImpl(final String descriptorName, final Node model) {
        super(descriptorName, model);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.impl.webapp30.WebAppDescriptorImplBase#createNewFilterViewForModel(org.jboss.shrinkwrap.descriptor.spi.node.Node)
     */
    @Override
    FilterMutableType createNewFilterViewForModel(final Node filterModel) {
        assert filterModel != null : "filter model must be specified";
        return new FilterTypeMutableImpl(this, filterModel);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptorBase#getOrCreateFilter()
     */
    // TODO Update doc to the above
    // TODO Add @Override
    @Override
    public FilterMutableType getOrCreateFilter() {
        final List<Node> nodeList = this.getRootNode().get("filter");
        if (nodeList.size() > 0) {
            return createNewFilterViewForModel(nodeList.get(0));
        }
        return createFilter();
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptorBase#createFilter()
     */
    // TODO Update doc to the above
    // TODO Add @Override
    @Override
    public FilterMutableType createFilter() {
        final Node filter = this.getRootNode().createChild("filter");
        return this.createNewFilterViewForModel(filter);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptorBase#removeAllFilter()
     */
    // TODO Update doc to the above
    // TODO Add @Override
    @Override
    public WebAppMutableDescriptor removeAllFilter() {
        this.getRootNode().removeChildren("filter");
        return this;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.Mutable#toImmutable()
     */
    @Override
    public WebAppDescriptor toImmutable() {
        return new WebAppDescriptorImpl(this.getDescriptorName(), this.getRootNode());
    }

}
