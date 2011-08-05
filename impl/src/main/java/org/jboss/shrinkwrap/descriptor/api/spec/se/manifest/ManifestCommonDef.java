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
package org.jboss.shrinkwrap.descriptor.api.spec.se.manifest;

import java.util.jar.Attributes.Name;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * DSL Grammar to construct / alter the common attributes inside different sections of a MANIFEST.MF file.
 *
 * @author Davide D'Alto
 */
public interface ManifestCommonDef<T> extends Descriptor
{
   final Name JAVA_BEAN = new Name("Java-Bean");

   final Name X_DIGEST_Y = new Name("x-Digest-y");

   final Name MAGIC = new Name("Magic");

   final Name CREATED_BY = new Name("Created-By");

   final Name EXTENSION_LIST = new Name("Extension-List");

   final String TRUE = String.valueOf(true);

   final String FALSE = String.valueOf(false);

   ManifestDescriptor main();

   ManifestEntryDef entry(String name);

   ManifestAppletDef applet(String name);

   T version(String version);

   T createdBy(String creator);

   T signatureVersion(String version);

   T addToClassPath(String value);

   T mainClass(String mainClass);

   T implementationTitle(String title);

   T implementationVersion(String version);

   T implementationVendor(String vendor);

   T implementationVendorId(String vendorId);

   T implementationUrl(String url);

   T specificationTitle(String title);

   T specificationVersion(String version);

   T specificationVendor(String vendor);

   T sealed();

   T notSealed();

   T attribute(String name, String value);
}
