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

import org.jboss.shrinkwrap.descriptor.api.formatter.Formatter;
import org.jboss.shrinkwrap.descriptor.api.formatter.Formatters;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * Concrete implementation of {@link WebAppDescriptor}
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public final class WebAppDescriptorImpl extends WebAppDescriptorImplBase<FilterType, WebAppDescriptor> implements
    WebAppDescriptor {

    public WebAppDescriptorImpl(final String descriptorName) {
        super(descriptorName);
    }

    /*
     * TODO: This ctor: package-private
     */
    WebAppDescriptorImpl(final String descriptorName, final Node model) {
        super(descriptorName, model);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.impl.webapp30.WebAppDescriptorImplBase#createNewFilterViewForModel(org.jboss.shrinkwrap.descriptor.spi.node.Node)
     */
    @Override
    FilterType createNewFilterViewForModel(final Node filterModel) {
        assert filterModel != null : "filter model must be specified";
        return new FilterTypeImpl(this, filterModel);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.Immutable#toMutable()
     */
    @Override
    public WebAppMutableDescriptor toMutable() {
        return new WebAppMutableDescriptorImpl(this.getDescriptorName(), this.getRootNode().deepCopy());
    }

}
