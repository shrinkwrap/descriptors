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

import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

import org.jboss.shrinkwrap.descriptor.api.spec.se.manifest.ManifestAppletDef;

/**
 * @author Davide D'Alto
 */
public class ManifestAppletDefImpl extends ManifestDescriptorImpl implements ManifestAppletDef
{

   private final String appletName;

   public ManifestAppletDefImpl(String descriptorName, ManifestModel manifest, String appletName)
   {
      super(descriptorName, manifest);
      this.appletName = appletName;
      Attributes mainAttributes = manifest.getMainAttributes();
      String extensionListValue = (
            mainAttributes.containsKey(Name.EXTENSION_LIST)
                  ? String.valueOf(mainAttributes.get(Name.EXTENSION_LIST)) + " " + appletName
                  : appletName);
      manifest.getMainAttributes().put(Name.EXTENSION_LIST, extensionListValue);
   }

   @Override
   public ManifestAppletDef appletExtensionName(String name)
   {
      includeAttributeWithPrefix(Name.EXTENSION_NAME, name);
      return this;
   }

   @Override
   public ManifestAppletDef appletSpecificationVersion(String version)
   {
      includeAttributeWithPrefix(Name.SPECIFICATION_VERSION, version);
      return this;
   }

   @Override
   public ManifestAppletDef appletImplementationVersion(String version)
   {
      includeAttributeWithPrefix(Name.IMPLEMENTATION_VERSION, version);
      return this;
   }

   @Override
   public ManifestAppletDef appletImplementationVendorId(String vendorId)
   {
      includeAttributeWithPrefix(Name.IMPLEMENTATION_VENDOR_ID, vendorId);
      return this;
   }

   @Override
   public ManifestAppletDef appletImplementationUrl(String url)
   {
      includeAttributeWithPrefix(Name.IMPLEMENTATION_URL, url);
      return this;
   }

   private void includeAttributeWithPrefix(Name name, String value)
   {
      super.attribute(addPrefix(name), value);
   }

   private String addPrefix(Name extensionName)
   {
      return appletName + "-" + extensionName.toString();
   }

}
