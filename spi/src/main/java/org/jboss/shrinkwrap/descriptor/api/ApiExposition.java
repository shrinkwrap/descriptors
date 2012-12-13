/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api;


/**
 * Indirection exposing some package-private methods in the Descriptors API to the implementation classes.
 *
 * TO BE MOVED TO THE impl-base PACKAGE ONCE IT EXISTS; the user API should NOT see this on the compilation ClassPath:
 * SHRINKDESC-42
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
// Mark as @Deprecated just to show that this will move
@Deprecated
public final class ApiExposition {
    // -------------------------------------------------------------------------------------||
    // Constructor ------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * No instances permitted
     */
    private ApiExposition() {
        throw new UnsupportedOperationException("No instances permitted");
    }

    // -------------------------------------------------------------------------------------||
    // Functional Methods -----------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * Creates a {@link Descriptor} instance from the specified implementation class name, also using the specified name
     *
     * @param implClass
     * @param descriptorName
     * @return
     * @throws IllegalArgumentException
     *             If either argument is not specified
     */
    public static Descriptor createFromImplModelType(final Class<? extends Descriptor> implClass, String descriptorName)
        throws IllegalArgumentException {
        return DescriptorInstantiator.createFromImplModelType(implClass, descriptorName);
    }
}
