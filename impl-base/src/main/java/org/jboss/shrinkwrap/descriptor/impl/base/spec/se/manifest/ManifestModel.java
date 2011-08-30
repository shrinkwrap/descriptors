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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

/**
 * Model for a JAR file manifest.
 *
 * @author Davide D'Alto
 * @see java.util.jar.Manifest
 */
public class ManifestModel extends Manifest
{

   public ManifestModel()
   {
      this(new Manifest());
   }

   public ManifestModel(Manifest man)
   {
      super(man);
   }

   public ManifestModel(File file) throws FileNotFoundException, IOException
   {
      this(new FileInputStream(file));
   }

   public ManifestModel(InputStream is) throws IOException
   {
      super(is);
   }

}
