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
package org.jboss.shrinkwrap.descriptor.api.resourceadapters10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.resourceadapters10.ConnectionDefintionType;
/**
 * This interface defines the contract for the <code> connection-definitionsType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface ConnectionDefinitionsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionsType ElementName: resourceadapters:connection-defintionType ElementType : connection-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-definition</code> element will be returned.
    * @return the instance defined for the element <code>connection-definition</code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> getOrCreateConnectionDefinition();

   /**
    * Creates a new <code>connection-definition</code> element 
    * @return the new created instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> createConnectionDefinition();

   /**
    * Returns all <code>connection-definition</code> elements
    * @return list of <code>connection-definition</code> 
    */
   public List<ConnectionDefintionType<ConnectionDefinitionsType<T>>> getAllConnectionDefinition();

   /**
    * Removes all <code>connection-definition</code> elements 
    * @return the current instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefinitionsType<T> removeAllConnectionDefinition();
}
