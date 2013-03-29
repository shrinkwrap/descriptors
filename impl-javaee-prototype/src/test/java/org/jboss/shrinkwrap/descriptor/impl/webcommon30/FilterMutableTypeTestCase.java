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

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMutableType;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases asserting the validity of {@link FilterMutableType} operations
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FilterMutableTypeTestCase {

    /**
     * Ensures that {@link FilterMutableType#description(String...)} rejects null input
     */
    @Test(expected = IllegalArgumentException.class)
    public void descriptionRejectsNullInput() {
        Descriptors.create(WebAppMutableDescriptor.class).getOrCreateFilter().description((String) null);
    }

    /**
     * Ensures that {@link FilterMutableType#description(String...)} rejects null input even in presence of valid vararg
     * preceding it
     */
    @Test(expected = IllegalArgumentException.class)
    public void descriptionRequiresAllParamsToNotBeNull() {
        Descriptors.create(WebAppMutableDescriptor.class).getOrCreateFilter().description("valid", null);
    }

    /**
     * Ensures that {@link FilterMutableType#description(String...)} rejects blank input even in presence of valid
     * vararg preceding it
     */
    @Test(expected = IllegalArgumentException.class)
    public void descriptionRequiresAllParamsToNotBeBlank() {
        Descriptors.create(WebAppMutableDescriptor.class).getOrCreateFilter().description("valid", "");
    }

    /**
     * Ensures we can add filter/description elements
     */
    @Test
    public void addDescriptions() {
        // Delegate
        this.createAndValidateDescriptorWithFilterDescriptions();
    }

    /**
     * Ensures we can add filter/description elements
     */
    @Test
    public void removeDescriptions() {
        // Delegate for creation
        final WebAppMutableDescriptor descriptor = this.createAndValidateDescriptorWithFilterDescriptions();

        // Now remove all descriptions
        final FilterMutableType filter = descriptor.getAllFilter().get(0);
        filter.removeAllDescription();

        // Ensure all removed
        Assert.assertEquals(0, filter.getAllDescription().size());
    }

    /**
     * Ensures we can remove a single filter description
     */
    @Test
    public void removeDescription() {
        // Delegate for creation
        final WebAppMutableDescriptor descriptor = this.createAndValidateDescriptorWithFilterDescriptions();

        // Remove a single description
        final FilterMutableType filter = descriptor.getAllFilter().get(0);
        filter.removeDescription("Lee");
        final List<String> descriptions = filter.getAllDescription();

        // Ensure the other descriptions are intact
        Assert.assertEquals(2, filter.getAllDescription().size());
        Assert.assertEquals("Andrew", descriptions.get(0));
        Assert.assertEquals("Rubinger", descriptions.get(1));
    }

    /**
     * Centralized helper to create and assert upon new filter descriptions
     * 
     * @return
     */
    private WebAppMutableDescriptor createAndValidateDescriptorWithFilterDescriptions() {
        // Make a new descriptor and add filter descriptions
        final WebAppMutableDescriptor descriptor = Descriptors.create(WebAppMutableDescriptor.class)
            .getOrCreateFilter().description("Andrew", "Lee", "Rubinger").up();

        // Get the descriptions back out and ensure they're correct
        final List<String> descriptions = descriptor.getAllFilter().get(0).getAllDescription();
        Assert.assertEquals(3, descriptions.size());
        Assert.assertEquals("Andrew", descriptions.get(0));
        Assert.assertEquals("Lee", descriptions.get(1));
        Assert.assertEquals("Rubinger", descriptions.get(2));

        // Return
        return descriptor;
    }

}
