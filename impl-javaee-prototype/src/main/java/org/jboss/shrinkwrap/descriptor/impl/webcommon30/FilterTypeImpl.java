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
package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * Concrete implementation of {@link FilterType}
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public final class FilterTypeImpl extends FilterTypeImplBase<FilterType, WebAppDescriptor> implements FilterType {

    /**
     * Create a new instance with the specified parent and using the specified model
     * 
     * @param parent
     * @param model
     * @throws IllegalArgumentException
     *             If either the parent of model is not specified
     */
    public FilterTypeImpl(final WebAppDescriptor parent, final Node model) throws IllegalArgumentException {
        super(parent, model);
    }
}
