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
package org.jboss.shrinkwrap.descriptor.impl.spec.jpa.persistence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor;
import org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceUnitDef;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/**
 * @author Dan Allen
 * @author <a href="mailto:aslak@redhat.com">Aslak Knutsen</a>
 */
public class PersistenceDescriptorImpl extends NodeDescriptorImplBase implements PersistenceDescriptor
{

   // -------------------------------------------------------------------------------------||
   // Class Members -----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private static final String SCHEMA_LOCATION = "http://java.sun.com/xml/ns/persistence " +
   		"http://java.sun.com/xml/ns/persistence/persistence_%s.xsd";
   
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private final Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PersistenceDescriptorImpl(String descriptorName)
   {
      this(descriptorName, new Node("persistence")
               .attribute("xmlns", "http://java.sun.com/xml/ns/persistence")
               .attribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance"));

      version("2.0");
   }

   public PersistenceDescriptorImpl(String descriptorName, final Node model)
   {
      super(descriptorName);
      this.model = model;
   }

   // -------------------------------------------------------------------------------------||
   // Required Implementations -----------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   /**
    * {@inheritDoc}
    * 
    * @see org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor#persistenceUnit(java.lang.String)
    */
   @Override
   public PersistenceUnitDef persistenceUnit(final String name)
   {
      // Expression<Node> exp = Expressions.getOrCreate("persistence-unit").attribute("name", name);
      return new PersistenceUnitDefImpl(
               getDescriptorName(),
               model,
               model.getOrCreate("persistence-unit@name=" + name)).name(name);
   }

   @Override
   public List<PersistenceUnitDef> listUnits()
   {
      List<PersistenceUnitDef> result = new ArrayList<PersistenceUnitDef>();
      List<Node> list = model.get("persistence-unit");
      for (Node node : list)
      {
         result.add(new PersistenceUnitDefImpl(getDescriptorName(), model, node));
      }
      return Collections.unmodifiableList(result);
   }

   /**
    * {@inheritDoc}
    * 
    * @see org.jboss.shrinkwrap.descriptor.api.spec.jpa.persistence.PersistenceDescriptor#version(java.lang.String)
    */
   @Override
   public PersistenceDescriptor version(String version)
   {
      if (version == null || version.length() == 0)
      {
         throw new IllegalArgumentException("Version must be specified");
      }
      
      model.attribute("xsi:schemaLocation", String.format(SCHEMA_LOCATION, version.replace(".", "_")));
      model.attribute("version", version);
      
      return this;
   }

   /*
    * (non-Javadoc)
    * 
    * @see org.jboss.shrinkwrap.descriptor.spi.NodeProvider#getRootNode()
    */
   @Override
   public Node getRootNode()
   {
      return model;
   }
}
