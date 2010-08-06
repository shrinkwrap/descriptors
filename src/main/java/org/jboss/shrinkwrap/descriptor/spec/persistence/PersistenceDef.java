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
package org.jboss.shrinkwrap.descriptor.spec.persistence;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import org.jboss.shrinkwrap.api.asset.Asset;
import org.jboss.shrinkwrap.descriptor.api.DescriptorDef;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class PersistenceDef implements DescriptorDef<Persistence>, Asset
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private Persistence persistence;
   
   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public PersistenceDef()
   {
      this(new Persistence());
   }
   
   public PersistenceDef(Persistence persistence)
   {
      this.persistence = persistence;
   }
   
   //-------------------------------------------------------------------------------------||
   // API --------------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   // QUESTION should we even offer this method?
   public PersistenceUnitDef persistenceUnit()
   {
      return persistenceUnit(null);
   }
   
   public PersistenceUnitDef persistenceUnit(String name)
   {
      PersistenceUnit pu = new PersistenceUnit();
      if (name != null)
      {
         pu.setName(name);
      }
      persistence.getPersistenceUnits().add(pu);
      return new PersistenceUnitDef(persistence, pu);
   }
   
   //-------------------------------------------------------------------------------------||
   // Required Implementations - DescriptorDef -------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public Persistence descriptor()
   {
      return persistence;
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations - Asset ---------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   @Override
   public InputStream openStream()
   {
      ByteArrayOutputStream out = new ByteArrayOutputStream();
      DescriptorExporter.to(descriptor(), out);
      return new ByteArrayInputStream(out.toByteArray());
   }
}
