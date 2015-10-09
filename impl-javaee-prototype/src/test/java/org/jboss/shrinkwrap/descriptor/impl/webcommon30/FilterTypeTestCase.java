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

import org.junit.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp30.WebAppMutableDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.junit.Test;

/**
 * Test cases asserting the validity of {@link FilterType} operations
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FilterTypeTestCase {

    /**
     * Ensures that {@link FilterType#getAllDescription()} is working as contracted
     */
    @Test
    public void getAllDescription() {
        // Make a descriptor and populate with description elements
        final WebAppDescriptor descriptor = Descriptors.create(WebAppMutableDescriptor.class).getOrCreateFilter()
            .description("one", "two", "three").up().toImmutable();

        // Ensure the three descriptions are as specified via the immutable view
        final List<FilterType> filters = descriptor.getAllFilter();
        Assert.assertEquals(1, filters.size());
        final FilterType filter = filters.get(0);
        final List<String> descriptions = filter.getAllDescription();
        Assert.assertEquals("one", descriptions.get(0));
        Assert.assertEquals("two", descriptions.get(1));
        Assert.assertEquals("three", descriptions.get(2));
    }

}
