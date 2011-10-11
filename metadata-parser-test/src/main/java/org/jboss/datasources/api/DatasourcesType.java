package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.DatasourceType;
import org.jboss.datasources.api.XaDatasourceType;
import org.jboss.datasources.api.DriversType;
/**
 * This interface defines the contract for the <code> datasourcesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface DatasourcesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>datasource</code> element will be returned.
    * @return the instance defined for the element <code>datasource</code> 
    */
   public DatasourceType<DatasourcesType<T>> getOrCreateDatasource();

   /**
    * Creates a new <code>datasource</code> element 
    * @return the new created instance of <code>DatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourceType<DatasourcesType<T>> createDatasource();

   /**
    * Returns all <code>datasource</code> elements
    * @return list of <code>datasource</code> 
    */
   public List<DatasourceType<DatasourcesType<T>>> getAllDatasource();

   /**
    * Removes all <code>datasource</code> elements 
    * @return the current instance of <code>DatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourcesType<T> removeAllDatasource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource</code> 
    */
   public XaDatasourceType<DatasourcesType<T>> getOrCreateXaDatasource();

   /**
    * Creates a new <code>xa-datasource</code> element 
    * @return the new created instance of <code>XaDatasourceType<DatasourcesType<T>></code> 
    */
   public XaDatasourceType<DatasourcesType<T>> createXaDatasource();

   /**
    * Returns all <code>xa-datasource</code> elements
    * @return list of <code>xa-datasource</code> 
    */
   public List<XaDatasourceType<DatasourcesType<T>>> getAllXaDatasource();

   /**
    * Removes all <code>xa-datasource</code> elements 
    * @return the current instance of <code>XaDatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourcesType<T> removeAllXaDatasource();

 
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
}
