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
package org.jboss.shrinkwrap.descriptor.api.datasources10; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DriverType;
/**
 * This interface defines the contract for the <code> driversType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface DriversType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriversType ElementName: datasources:driverType ElementType : driver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>driver</code> element will be created and returned.
    * Otherwise, the first existing <code>driver</code> element will be returned.
    * @return the instance defined for the element <code>driver</code> 
    */
   public DriverType<DriversType<T>> getOrCreateDriver();

   /**
    * Creates a new <code>driver</code> element 
    * @return the new created instance of <code>DriverType<DriversType<T>></code> 
    */
   public DriverType<DriversType<T>> createDriver();

   /**
    * Returns all <code>driver</code> elements
    * @return list of <code>driver</code> 
    */
   public List<DriverType<DriversType<T>>> getAllDriver();

   /**
    * Removes all <code>driver</code> elements 
    * @return the current instance of <code>DriverType<DriversType<T>></code> 
    */
   public DriversType<T> removeAllDriver();
}
