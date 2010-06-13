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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.jboss.shrinkwrap.api.Asset;

/**
 * @author Dan Allen
 */
public class PersistenceDef implements Asset
{
   private Persistence persistence;
   
   public PersistenceDef()
   {
      this(new Persistence());
   }
   
   public PersistenceDef(Persistence persistence)
   {
      this.persistence = persistence;
   }
   
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
   
   public Persistence descriptor()
   {
      return persistence;
   }

   @Override
   public InputStream openStream()
   {
      try
      {
         JAXBContext context = JAXBContext.newInstance(Persistence.class);
         Marshaller m = context.createMarshaller();
         m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, persistence.getSchemaLocation());
         m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
         m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         ByteArrayOutputStream os = new ByteArrayOutputStream();
         m.marshal(persistence, os);
         return new ByteArrayInputStream(os.toByteArray());
      }
      catch (Exception e)
      {
         throw new RuntimeException(e);
      }
   }
}
