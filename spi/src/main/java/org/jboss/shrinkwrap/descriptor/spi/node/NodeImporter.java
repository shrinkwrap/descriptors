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
package org.jboss.shrinkwrap.descriptor.spi.node;

import java.io.InputStream;

/**
 * Imports a {@link InputStream} into a hierarchal {@link Node} structure
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NodeImporter {

    /**
     * Imports the specified {@link InputStream} into a {@link Node} structure, returning the root {@link Node}.
     *
     * @param stream
     *            The stream to be read
     * @param close
     *            Whether or not the specified stream should be closed as a convenience to the caller
     * @return
     * @throws IllegalArgumentException
     *             If the stream is not specified
     */
    Node importAsNode(InputStream stream, boolean close) throws IllegalArgumentException;

}
