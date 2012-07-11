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
package org.jboss.shrinkwrap.descriptor.impl.common;

import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;

/**
 * Centralizes name-based assertions for {@link Descriptor} tests
 * 
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DescriptorNameTestDelegate {

    /**
     * Ensures that a newly-created {@link Descriptor} of the specified type defaults to the specified name
     * 
     * @param descriptorType
     * @param expectedDefaultName
     * @throws IllegalArgumentException
     *             If either argument is not provided
     */
    public void assertDefaultName(final Class<? extends Descriptor> descriptorType, final String expectedDefaultName)
        throws IllegalArgumentException {
        if (descriptorType == null) {
            throw new IllegalArgumentException("descriptor type must be specified");
        }
        if (expectedDefaultName == null || expectedDefaultName.length() == 0) {
            throw new IllegalArgumentException("expected default name must be specified");
        }
        final Descriptor descriptor = Descriptors.create(descriptorType);
        Assert.assertEquals("Default name was not as expected", expectedDefaultName, descriptor.getDescriptorName());
    }

    /**
     * Ensures that a newly-created {@link Descriptor} of the specified type is assigned the specified name
     * 
     * @param descriptorType
     * @param explicitName
     * @throws IllegalArgumentException
     *             If either argument is not provided
     */
    public void assertExplicitName(final Class<? extends Descriptor> descriptorType, final String explicitName)
        throws IllegalArgumentException {
        if (descriptorType == null) {
            throw new IllegalArgumentException("descriptor type must be specified");
        }
        if (explicitName == null || explicitName.length() == 0) {
            throw new IllegalArgumentException("explicit name must be specified");
        }
        final Descriptor descriptor = Descriptors.create(descriptorType, explicitName);
        Assert.assertEquals("Explicit name was not assigned as expected", explicitName, descriptor.getDescriptorName());
    }

}
