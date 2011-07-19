/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.api.persistence20;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the persistence_2_0.xsd specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     Persistence20Descriptor descriptor = Descriptors.create(Persistence20Descriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface Persistence20Descriptor extends Descriptor, DescriptorNamespace<Persistence20Descriptor>
{

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor removeAllPersistenceUnit();

   /**
    * Returns the <code>persistence-unit</code> element
    * @return the node defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<Persistence20Descriptor> persistenceUnit();

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<Persistence20Descriptor>> getPersistenceUnitList();

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>version</code> element with the given value will be created.
    * Otherwise, the existing <code>version</code> element will be updated with the given value.
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor setVersion(String version);

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of {@link Persistence20Descriptor} 
    */
   public Persistence20Descriptor removeVersion();

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

}
