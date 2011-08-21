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

import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestAppletDef;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestEntryDef;

/**
 * @author Davide D'Alto
 */
public class ManifestEntryDefImpl extends ManifestCommonDefImpl<ManifestEntryDef> implements ManifestEntryDef
{

   private final ManifestModel manifest;

   private final ManifestDescriptor manifestDescriptor;

   private final String entryName;
   
   public ManifestEntryDefImpl(ManifestDescriptor manifestDescriptor, ManifestModel manifest, String name)
   {
      this.manifestDescriptor = manifestDescriptor;
      this.manifest = manifest;
      this.entryName = name;
   }

   @Override
   ManifestEntryDef getDescriptor()
   {
      return this;
   }

   @Override
   public ManifestDescriptor main()
   {
      return manifestDescriptor;
   }

   @Override
   public ManifestAppletDef applet(String name)
   {
      return manifestDescriptor.applet(name);
   }

   @Override
   public ManifestEntryDef entry(String name)
   {
      return manifestDescriptor.entry(name);
   }

   @Override
   public ManifestEntryDef contentType(String contentType)
   {
      includeAttribute(Name.CONTENT_TYPE, contentType);
      return this;
   }

   @Override
   public ManifestEntryDef javaBean()
   {
      includeAttribute(JAVA_BEAN, TRUE);
      return this;
   }

   @Override
   public ManifestEntryDef notJavaBean()
   {
      includeAttribute(JAVA_BEAN, FALSE);
      return this;
   }

   @Override
   public ManifestEntryDef xDigestY(String digestAlgorithm)
   {
      includeAttribute(X_DIGEST_Y, digestAlgorithm);
      return this;
   }

   @Override
   public ManifestEntryDef magic(String magic)
   {
      includeAttribute(MAGIC, magic);
      return this;
   }

   @Override
   void includeAttribute(Name attribute, String value)
   {
      Map<String, Attributes> entries = manifest.getEntries();
      Attributes attributes = entries.containsKey(entryName)
            ? manifest.getAttributes(entryName)
            : new Attributes();
      attributes.put(attribute, value);
      entries.put(entryName, attributes);
   }

   @Override
   String findAttribute(Name name)
   {
      Map<String, Attributes> entries = manifest.getEntries();
      if (entries.containsKey(entryName))
         return manifest.getAttributes(entryName).getValue(name);

      return null;
   }

   @Override
   ManifestModel getManifestModel()
   {
      return manifest;
   }

   @Override
   public String getDescriptorName()
   {
      return manifestDescriptor.getDescriptorName();
   }

}
