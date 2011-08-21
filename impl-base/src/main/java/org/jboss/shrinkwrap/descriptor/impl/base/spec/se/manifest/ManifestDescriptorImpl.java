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

import java.util.jar.Attributes.Name;

import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestAppletDef;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestEntryDef;

/**
 * Implementation of the DSL grammar to construct/alter a MANIFEST.MF file.
 * <br>
 * Default manifest main version is 1.0
 *
 * @author Davide D'Alto
 */
public class ManifestDescriptorImpl extends ManifestCommonDefImpl<ManifestDescriptor> implements ManifestDescriptor
{

   private final String descriptorName;

   private final ManifestModel manifest;

   public ManifestDescriptorImpl(String descriptionName)
   {
      this(descriptionName, new ManifestModel());
   }

   public ManifestDescriptorImpl(String descriptorName, ManifestModel manifest)
   {
      this.descriptorName = descriptorName;
      this.manifest = manifest;

      // Export requires a manifest main version
      if (!manifest.getMainAttributes().containsValue(Name.MANIFEST_VERSION))
         manifest.getMainAttributes().put(Name.MANIFEST_VERSION, "1.0");
   }

   @Override
   ManifestDescriptor getDescriptor()
   {
      return this;
   }

   @Override
   public ManifestDescriptor main()
   {
      return this;
   }

   @Override
   public ManifestEntryDef entry(String name)
   {
      return new ManifestEntryDefImpl(this, manifest, name);
   }

   @Override
   public ManifestAppletDef applet(String name)
   {
      return new ManifestAppletDefImpl(descriptorName, manifest, name);
   }

   @Override
   public ManifestDescriptor extensionName(String name)
   {
      includeAttribute(Name.EXTENSION_NAME, name);
      return this;
   }

   @Override
   public ManifestDescriptor extensionInstallation(String installation)
   {
      includeAttribute(Name.EXTENSION_INSTALLATION, installation);
      return this;
   }

   @Override
   void includeAttribute(Name name, String value)
   {
      manifest.getMainAttributes().put(name, value);
   }

   @Override
   String findAttribute(Name name)
   {
      return manifest.getMainAttributes().getValue(name);
   }

   @Override
   public String getDescriptorName()
   {
      return descriptorName;
   }

   @Override
   ManifestModel getManifestModel()
   {
      return manifest;
   }

}
