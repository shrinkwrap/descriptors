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

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;
import org.jboss.shrinkwrap.descriptor.impl.common.DescriptorNameTestDelegate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases asserting the validity of {@link WebAppMutableDescriptor} operations
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebAppMutableDescriptorTestCase {

    /**
     * Ensures that an explicit name may be assigned to {@link WebAppMutableDescriptor}
     */
    @Test
    public void explicitName() {
        new DescriptorNameTestDelegate().assertExplicitName(WebAppMutableDescriptor.class, "alrWeb.xml");
    }

    /**
     * Ensures that the correct default name is assigned for {@link WebAppMutableDescriptor}
     */
    @Test
    public void defaultName() {
        new DescriptorNameTestDelegate().assertDefaultName(WebAppMutableDescriptor.class, "web.xml");
    }

    /**
     * Ensures that the mutable view may be converted to a read-only view, converted back to a mutable view, and keep
     * the data model intact.
     */
    @Test
    public void immutableRoundtrip() {
        // Make a new descriptor
        final WebAppMutableDescriptor mutable = Descriptors.create(WebAppMutableDescriptor.class);

        // Add a filter with two descriptions
        Assert.assertEquals(2, mutable.getOrCreateFilter().description("one", "two").getAllDescription().size());

        // Roundtrip to mutable
        final WebAppMutableDescriptor roundtrip = mutable.toImmutable().toMutable();

        // Ensure the roundtrip still has a filter w/ two descriptions
        Assert.assertEquals(2, roundtrip.getAllFilter().get(0).getAllDescription().size());
    }

    /**
     * Ensures that {@link WebAppMutableDescriptor#getOrCreateFilter()}, when invoked, creates a
     * {@link FilterMutableType} first if no filters exist, and returns a {@link FilterMutableType} for the
     * previously-created model if it's already been created.
     */
    @Test
    public void getOrCreateFilter() {
        // Make a new descriptor
        final WebAppMutableDescriptor descriptor = Descriptors.create(WebAppMutableDescriptor.class);

        // Ensure no filters
        Assert.assertEquals(0, descriptor.getAllFilter().size());

        // Create a filter with some descriptions
        descriptor.getOrCreateFilter().description("one", "two", "three");

        // Get a new filter view
        final FilterMutableType secondFilterView = descriptor.getOrCreateFilter();

        // Ensure the new view returns the same model that's been created before
        Assert.assertEquals(1, descriptor.getAllFilter().size());
        Assert.assertEquals(3, secondFilterView.getAllDescription().size());
    }

    /**
     * Ensures that a call to {@link WebAppMutableDescriptor#removeAllFilter()} removes all current filter elements
     */
    @Test
    public void removeAllFilter() {
        // Make a new descriptor with 3 filters
        final WebAppMutableDescriptor descriptor = Descriptors.create(WebAppMutableDescriptor.class).createFilter()
            .up().createFilter().up().createFilter().up();

        // Ensure 3 filters
        Assert.assertEquals(3, descriptor.getAllFilter().size());

        // Remove all filters
        descriptor.removeAllFilter();

        // Ensure no filters
        Assert.assertEquals(0, descriptor.getAllFilter().size());
    }

}
