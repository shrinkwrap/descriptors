/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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

import java.io.File;
import java.io.InputStream;

/**
 * A type capable of importing a {@link Descriptor} from
 * some existing source like a stream of bytes or {@link File}
 * 
 * @param <T> The type of {@link Descriptor} supported by this importer
 * @author <a href="mailto:andrew.rubinger@jboss.org">ALR</a>
 */
public interface DescriptorImporter<T extends Descriptor>
{
   //-------------------------------------------------------------------------------------||
   // Contracts --------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * Creates a new {@link Descriptor} from the given input file 
    * @param file the input file
    * @return the imported descriptor
    * @throws IllegalArgumentException If the file was not specified, does not
    *   exist, or is a directory
    * @throws DescriptorImportException If there was some error on import
    */
   T from(File file) throws IllegalArgumentException, DescriptorImportException;

   /**
    * Creates a new {@link Descriptor} from the given input stream, closing the specified
    * stream when done, if applicable for the given input stream implementation.
    *
    * @param in the <tt>InputStream</tt>
    * @return the imported descriptor
    * @throws IllegalArgumentException If the stream was not specified
    * @throws DescriptorImportException If there was some error on import
    */
   T from(InputStream in) throws IllegalArgumentException, DescriptorImportException;

   /**
    * Creates a new {@link Descriptor} from the given input
    *
    * @param in the <tt>InputStream</tt> to use
    * @param close whether to close the specified stream or not
    * @return the imported descriptor
    * @throws IllegalArgumentException If the stream was not specified
    * @throws DescriptorImportException If there was some error on import
    */
   T from(InputStream in, boolean close) throws IllegalArgumentException, DescriptorImportException;

   /**
    * Creates a new {@link Descriptor} from the given input {@link String}
    * @param string the resource URI
    * @return the imported descriptor
    * @throws IllegalArgumentException If the String was not specified
    * @throws DescriptorImportException
    */
   T from(String string) throws IllegalArgumentException, DescriptorImportException;
}
