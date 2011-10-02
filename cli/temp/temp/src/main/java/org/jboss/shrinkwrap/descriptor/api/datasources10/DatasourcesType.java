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
import org.jboss.shrinkwrap.descriptor.api.datasources10.DriversType;
import org.jboss.shrinkwrap.descriptor.api.datasources10.DatasourceType;
import org.jboss.shrinkwrap.descriptor.api.datasources10.XaDatasourceType;
/**
 * This interface defines the contract for the <code> datasourcesType </code> xsd type 
 * @since Generation date :2011-10-02T12:23:24.492+02:00
 */
public interface DatasourcesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:driversType ElementType : drivers
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>drivers</code> element with the given value will be created.
    * Otherwise, the existing <code>drivers</code> element will be returned.
    * @return  a new or existing instance of <code>DriversType<DatasourcesType<T>></code> 
    */
   public DriversType<DatasourcesType<T>> getOrCreateDrivers();

   /**
    * Removes the <code>drivers</code> element 
    * @return the current instance of <code>DatasourcesType<T></code> 
    */
   public DatasourcesType<T> removeDrivers();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element with the given value will be created.
    * Otherwise, the existing <code>datasource</code> element will be returned.
    * @return  a new or existing instance of <code>DatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourceType<DatasourcesType<T>> getOrCreateDatasource();

   /**
    * Removes the <code>datasource</code> element 
    * @return the current instance of <code>DatasourcesType<T></code> 
    */
   public DatasourcesType<T> removeDatasource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element with the given value will be created.
    * Otherwise, the existing <code>xa-datasource</code> element will be returned.
    * @return  a new or existing instance of <code>XaDatasourceType<DatasourcesType<T>></code> 
    */
   public XaDatasourceType<DatasourcesType<T>> getOrCreateXaDatasource();

   /**
    * Removes the <code>xa-datasource</code> element 
    * @return the current instance of <code>DatasourcesType<T></code> 
    */
   public DatasourcesType<T> removeXaDatasource();
}
