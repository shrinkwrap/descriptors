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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.jar.Attributes.Name;

import org.jboss.shrinkwrap.descriptor.api.DescriptorExportException;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestCommonDef;

/**
 * @author Davide D'Alto
 */
abstract class ManifestCommonDefImpl<T> implements ManifestCommonDef<T>
{

   abstract T getDescriptor();

   abstract ManifestModel getManifestModel();

   abstract void includeAttribute(Name name, String attribute);
   
   abstract String findAttribute(Name name);

   void includeAttribute(String name, String value)
   {
      includeAttribute(new Name(name), value);
   }

   @Override
   public T version(String version)
   {
      includeAttribute(Name.MANIFEST_VERSION, version);
      return getDescriptor();
   }

   @Override
   public T signatureVersion(String version)
   {
      includeAttribute(Name.SIGNATURE_VERSION, version);
      return getDescriptor();
   }

   @Override
   public T mainClass(String mainClass)
   {
      includeAttribute(Name.MAIN_CLASS, mainClass);
      return getDescriptor();
   }

   @Override
   public T implementationTitle(String title)
   {
      includeAttribute(Name.IMPLEMENTATION_TITLE, title);
      return getDescriptor();
   }

   @Override
   public T implementationVendor(String vendor)
   {
      includeAttribute(Name.IMPLEMENTATION_VENDOR, vendor);
      return getDescriptor();
   }

   @Override
   public T implementationVendorId(String vendorId)
   {
      includeAttribute(Name.IMPLEMENTATION_VENDOR_ID, vendorId);
      return getDescriptor();
   }

   @Override
   public T implementationUrl(String url)
   {
      includeAttribute(Name.IMPLEMENTATION_URL, url);
      return getDescriptor();
   }

   @Override
   public T specificationTitle(String title)
   {
      includeAttribute(Name.SPECIFICATION_TITLE, title);
      return getDescriptor();
   }

   @Override
   public T specificationVersion(String version)
   {
      includeAttribute(Name.SPECIFICATION_VERSION, version);
      return getDescriptor();
   }

   @Override
   public T specificationVendor(String vendor)
   {
      includeAttribute(Name.SPECIFICATION_VENDOR, vendor);
      return getDescriptor();
   }

   @Override
   public T sealed()
   {
      includeAttribute(Name.SEALED, TRUE);
      return getDescriptor();
   }

   @Override
   public T notSealed()
   {
      includeAttribute(Name.SEALED, FALSE);
      return getDescriptor();
   }

   @Override
   public T createdBy(String creator)
   {
      includeAttribute(CREATED_BY, creator);
      return getDescriptor();
   }

   @Override
   public T addToClassPath(String value)
   {
      String classpath = findAttribute(Name.CLASS_PATH);
      String newClasspath = value;
      if (classpath != null)
         newClasspath = classpath + " " + newClasspath;

      includeAttribute(Name.CLASS_PATH, newClasspath);
      return getDescriptor();
   }

   @Override
   public T attribute(String name, String value)
   {
      includeAttribute(name, value);
      return getDescriptor();
   }

   @Override
   public T implementationVersion(String vendor)
   {
      includeAttribute(Name.IMPLEMENTATION_VERSION, vendor);
      return getDescriptor();
   }

   @Override
   public final String exportAsString() throws DescriptorExportException
   {
      try
      {
         final ByteArrayOutputStream baos = new ByteArrayOutputStream();
         this.exportTo(baos);
         return baos.toString("UTF-8");
      }
      catch (final UnsupportedEncodingException e)
      {
         throw new DescriptorExportException("Inconsistent encoding used during export", e);
      }
   }

   @Override
   public void exportTo(OutputStream output) throws DescriptorExportException, IllegalArgumentException
   {
      if (output == null)
      {
         throw new IllegalArgumentException("Can not export to null stream");
      }
      try
      {
         getManifestModel().write(output);
      }
      catch (IOException e)
      {
         throw new DescriptorExportException(e.getMessage(), e);
      }
   }

}
