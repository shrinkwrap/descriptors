/*
 * JBoss, Home of Professional Open Source
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api.formatter;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * Available pre-configured {@link Formatter} instances used in constructing a human-readable form for a specified
 * {@link Archive}.
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public enum Formatters implements Formatter {

    // -------------------------------------------------------------------------------------||
    // Types -------------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * {@link Formatter} implementation to provide an "ls -l"-esque output for an {@link Archive}, listing all internal
     * contents in sorted order.
     */
    XML(XmlFormatter.INSTANCE);


    // -------------------------------------------------------------------------------------||
    // Internal Members -------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * Internal formatter type, used as a delegate to make {@link Formatters} itself a {@link Formatter}
     */
    private final Formatter formatter;

    // -------------------------------------------------------------------------------------||
    // Constructor ------------------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * Constructs a new {@link Formatters} type using the specified underlying {@link Formatter}
     */
    Formatters(final Formatter formatter) {
        this.formatter = formatter;
    }

    // -------------------------------------------------------------------------------------||
    // Required Implementations ------------------------------------------------------------||
    // -------------------------------------------------------------------------------------||

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.api.formatter.Formatter#format(org.jboss.shrinkwrap.descriptor.api.Descriptor)
     */
    @Override
    public String format(final Descriptor descriptor) throws IllegalArgumentException {
        return formatter.format(descriptor);
    }

    /**
     * {@inheritDoc}
     *
     * @see org.jboss.shrinkwrap.descriptor.api.formatter.Formatter#format(java.lang.String)
     */
    @Override
    public String format(final String xmlString) throws IllegalArgumentException {
        return formatter.format(xmlString);
    }
}
