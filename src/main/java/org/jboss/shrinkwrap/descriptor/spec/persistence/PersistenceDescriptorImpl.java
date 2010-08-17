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

import org.jboss.shrinkwrap.descriptor.api.spec.jpa.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.PersistenceUnitDef;
import org.jboss.shrinkwrap.descriptor.impl.base.SchemaDescriptorImplBase;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class PersistenceDescriptorImpl extends SchemaDescriptorImplBase<PersistenceModel>
      implements
         PersistenceDescriptor
{
   //-------------------------------------------------------------------------------------||
   // Instance Members -------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   private PersistenceModel model;

   //-------------------------------------------------------------------------------------||
   // Constructor ------------------------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   public PersistenceDescriptorImpl()
   {
      this(new PersistenceModel());
   }

   public PersistenceDescriptorImpl(final PersistenceModel persistence)
   {
      this.model = persistence;
   }

   //-------------------------------------------------------------------------------------||
   // Required Implementations -----------------------------------------------------------||
   //-------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.api.spec.jpa.PersistenceDescriptor#persistenceUnit(java.lang.String)
    */
   @Override
   public PersistenceUnitDef persistenceUnit(final String name)
   {
      final PersistenceUnit pu = new PersistenceUnit();
      if (name != null)
      {
         pu.setName(name);
      }
      model.getPersistenceUnits().add(pu);
      return new PersistenceUnitDef(model, pu);
   }

   /**
    * {@inheritDoc}
    * @see org.jboss.shrinkwrap.descriptor.spi.SchemaDescriptorProvider#getSchemaModel()
    */
   @Override
   public PersistenceModel getSchemaModel()
   {
      return model;
   }

}
