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

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * Concrete implementation of {@link FilterMutableType}
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public final class FilterTypeMutableImpl extends FilterTypeImplBase<FilterMutableType, WebAppMutableDescriptor>
    implements FilterMutableType {

    /**
     * Create a new instance with the specified parent and using the specified model
     * 
     * @param parent
     * @param model
     * @throws IllegalArgumentException
     *             If either the parent of model is not specified
     */
    public FilterTypeMutableImpl(final WebAppMutableDescriptor parent, final Node model)
        throws IllegalArgumentException {
        super(parent, model);
    }

    /**
     * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
     * element
     * 
     * @param values
     *            list of <code>description</code> objects
     * @return the current instance of <code>FilterType<T></code>
     */
    // TODO: Update documentation to the following:
    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType#description(java.lang.String[])
     */
    // TODO Add @Override
    @Override
    // TODO Accept final values
    // TODO put explicit IllegalArgumentException in throws clause (just to be clear)
    public FilterMutableType description(final String... values) throws IllegalArgumentException {
        // TODO Added precondition checks per the docs
        for (final String name : values) {
            if (name == null || name.length() == 0) {
                throw new IllegalArgumentException("no value for description may be null or blank");
            }
            this.getRootNode().createChild("description").text(name);
        }
        return this;
    }

    /**
     * Removes the <code>description</code> element
     * 
     * @return the current instance of <code>FilterType<T></code>
     */
    // TODO Update documentation to the following:
    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableTypeBase#removeAllDescription()
     */
    // TODO Add @Override
    @Override
    public FilterMutableType removeAllDescription() {
        this.getRootNode().removeChildren("description");
        return this;
    }

    // TODO This method is new, added as part of prototyping
    /**
     * {@inheritDoc}
     * 
     * @see org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableTypeBase#removeDescription(java.lang.String)
     */
    @Override
    public FilterMutableType removeDescription(final String value) throws IllegalArgumentException {
        // Precondition checks
        if (value == null || value.length() == 0) {
            throw new IllegalArgumentException("value must be specified");
        }

        // Get all "description" elements
        final List<Node> descriptions = this.getRootNode().get("description");
        if (descriptions != null) {
            // For each description
            for (final Node description : descriptions) {
                // If matches
                if (description.getText().equals(value)) {
                    // Remove
                    description.getParent().removeChild(description);
                    System.out.println(description);
                }
            }
        }

        // Return
        return this;
    }

	@Override
	public String exportAsString() {
		// TODO Auto-generated method stub
		return null;
	}

}
