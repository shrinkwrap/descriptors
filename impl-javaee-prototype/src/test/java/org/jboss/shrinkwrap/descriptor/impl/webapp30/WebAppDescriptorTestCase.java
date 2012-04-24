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

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.common.DescriptorNameTestDelegate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases asserting the validity of {@link WebAppDescriptor} operations
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebAppDescriptorTestCase {

    /**
     * Ensures that adding a {@link FilterType} to the {@link List} returned from the read-only view of
     * {@link WebAppDescriptor} does not affect the descriptor's model.
     */
    @Test
    public void addFilterToCopiedListDoesNotAffectDescriptor() {
        // Make a new descriptor
        final WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class);

        // Get the filters and ensure empty to start
        final List<FilterType> filters = descriptor.getAllFilter();
        Assert.assertTrue("filters should be empty to start", filters.size() == 0);

        // Add manually to the returned list
        filters.add(new FilterType() {
            @Override
            public WebAppDescriptor up() {
                return null;
            }

            @Override
            public List<String> getAllDescription() {
                return null;
            }
        });

        // Ensure that the filters in the descriptor are still empty even
        // though we added to the reference returned from the descriptor
        Assert.assertTrue("filters in the descriptor should be empty", descriptor.getAllFilter().size() == 0);
    }

    /**
     * Ensures that an explicit name may be assigned to {@link WebAppDescriptor}
     */
    @Test
    public void explicitName() {
        new DescriptorNameTestDelegate().assertExplicitName(WebAppDescriptor.class, "alrWeb.xml");
    }

    /**
     * Ensures that the correct default name is assigned for {@link WebAppDescriptor}
     */
    @Test
    public void defaultName() {
        new DescriptorNameTestDelegate().assertDefaultName(WebAppDescriptor.class, "web.xml");
    }

    /**
     * Ensures that the read-only view may be converted to a mutable view, support adding data, conversion back to a
     * read-only view, and keep the data model intact.
     */
    @Test
    public void mutableViewToImmutableRetainsDataModel() {
        // Make a new descriptor
        final WebAppDescriptor readonly = Descriptors.create(WebAppDescriptor.class);

        // Get a mutable view
        final WebAppMutableDescriptor mutable = readonly.toMutable();

        // Add a filter with two descriptions
        Assert.assertEquals(2, mutable.getOrCreateFilter().description("one", "two").getAllDescription().size());

        // Roundtrip to immutable
        final WebAppDescriptor roundtrip = mutable.toImmutable();

        // Ensure the roundtrip still has a filter w/ two descriptions
        Assert.assertEquals(2, roundtrip.getAllFilter().get(0).getAllDescription().size());
    }
    
    /**
     * Ensures that changes made to the model of a mutable view 
     * obtained via an immutable view do not affect the original 
     * immutable view
     */
    @Test
    public void immutableViewToMutableReturnsCopy() {
        // Make a new descriptor
        final WebAppDescriptor readonly = Descriptors.create(WebAppDescriptor.class);

        // Ensure the original immutable view still has no filters
        Assert.assertEquals(0, readonly.getAllFilter().size());
        
        // Get a mutable view
        final WebAppMutableDescriptor mutable = readonly.toMutable();

        // Add a filter with two descriptions
        Assert.assertEquals(2, mutable.getOrCreateFilter().description("one", "two").getAllDescription().size());

        // Ensure the original immutable view still has no filters
        Assert.assertEquals(
            "Changes to a mutable view obtained from an immutable view should not affect the original immutable view",
            0, readonly.getAllFilter().size());
    }
    
    /**
     * Ensures we cannot simply cast from an immutable view to a mutable one (ensuring we cannot write to the impl
     * without invoking on the copy operation {@link WebAppDescriptor#toMutable()}).
     */
    @Test(expected = ClassCastException.class)
    public void cannotCastFromImmutableToMutable() {
        // Make a new descriptor
        final WebAppDescriptor readonly = Descriptors.create(WebAppDescriptor.class);
        WebAppMutableDescriptor.class.cast(readonly);
    }

}
