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
package org.jboss.shrinkwrap.descriptor.impl.base.spec.se.manifest;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.jboss.shrinkwrap.descriptor.api.DescriptorImportException;
import org.jboss.shrinkwrap.descriptor.api.DescriptorImporter;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestDescriptor;

/**
 * Imports a {@link ManifestDescriptor} from a resource.
 *
 * @author Davide D'Alto
 */
public class ManifestDescriptorImporter implements DescriptorImporter<ManifestDescriptor>
{

   private final String descriptorName;

   public ManifestDescriptorImporter(String descriptorName)
   {
      this.descriptorName = descriptorName;
   }

   /*
    * (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.io.File)
    */
   @Override
   public ManifestDescriptor from(File file) throws IllegalArgumentException, DescriptorImportException
   {
      if (file == null)
         throw new IllegalArgumentException("File cannot be null");
      
      try
      {
         return new ManifestDescriptorImpl(descriptorName, new ManifestModel(file));
      }
      catch (Exception e)
      {
         throw new DescriptorImportException(e.getMessage(), e);
      }
   }

   /*
    * (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.io.InputStream)
    */
   @Override
   public ManifestDescriptor from(InputStream in) throws IllegalArgumentException, DescriptorImportException
   {
      return from(in, true);
   }

   /* (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.io.InputStream, boolean)
    */
   @Override
   public ManifestDescriptor from(InputStream in, boolean close) throws IllegalArgumentException, DescriptorImportException
   {
      if (in == null)
         throw new IllegalArgumentException("Stream cannot be null");

      try
      {
         return new ManifestDescriptorImpl(descriptorName, new ManifestModel(in));
      }
      catch (Exception e)
      {
         throw new DescriptorImportException(e.getMessage(), e);
      }
      finally {
         if (close) {
            try
            {
               in.close();
            }
            catch (IOException e)
            {
               throw new DescriptorImportException("Input stream not closed", e);
            }
         }
      }
   }

   /*
    * (non-Javadoc)
    * @see org.jboss.shrinkwrap.descriptor.api.DescriptorImporter#from(java.lang.String)
    */
   @Override
   public ManifestDescriptor from(String manifest) throws IllegalArgumentException, DescriptorImportException
   {
      if (manifest == null)
         throw new IllegalArgumentException("Manifest cannot be null");
      
      InputStream inputStream = new ByteArrayInputStream(manifest.getBytes());
      try
      {
         return new ManifestDescriptorImpl(descriptorName, new ManifestModel(inputStream));
      }
      catch (IOException e)
      {
         throw new DescriptorImportException(e.getMessage(), e);
      }
   }

}
