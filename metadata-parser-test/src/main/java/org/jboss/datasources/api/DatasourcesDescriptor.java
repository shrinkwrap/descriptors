package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.DatasourceType;
import org.jboss.datasources.api.XaDatasourceType;
import org.jboss.datasources.api.DriversType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     DatasourcesDescriptor descriptor = Descriptors.create(DatasourcesDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface DatasourcesDescriptor extends Descriptor, DescriptorNamespace<DatasourcesDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>datasource</code> element will be returned.
    * @return the instance defined for the element <code>datasource</code> 
    */
   public DatasourceType<DatasourcesDescriptor> getOrCreateDatasource();

   /**
    * Creates a new <code>datasource</code> element 
    * @return the new created instance of <code>DatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourceType<DatasourcesDescriptor> createDatasource();

   /**
    * Returns all <code>datasource</code> elements
    * @return list of <code>datasource</code> 
    */
   public List<DatasourceType<DatasourcesDescriptor>> getAllDatasource();

   /**
    * Removes all <code>datasource</code> elements 
    * @return the current instance of <code>DatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourcesDescriptor removeAllDatasource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource</code> 
    */
   public XaDatasourceType<DatasourcesDescriptor> getOrCreateXaDatasource();

   /**
    * Creates a new <code>xa-datasource</code> element 
    * @return the new created instance of <code>XaDatasourceType<DatasourcesDescriptor></code> 
    */
   public XaDatasourceType<DatasourcesDescriptor> createXaDatasource();

   /**
    * Returns all <code>xa-datasource</code> elements
    * @return list of <code>xa-datasource</code> 
    */
   public List<XaDatasourceType<DatasourcesDescriptor>> getAllXaDatasource();

   /**
    * Removes all <code>xa-datasource</code> elements 
    * @return the current instance of <code>XaDatasourceType<DatasourcesDescriptor></code> 
    */
   public DatasourcesDescriptor removeAllXaDatasource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesDescriptor ElementName: datasources:driversType ElementType : drivers
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>drivers</code> element with the given value will be created.
    * Otherwise, the existing <code>drivers</code> element will be returned.
    * @return  a new or existing instance of <code>DriversType<DatasourcesDescriptor></code> 
    */
   public DriversType<DatasourcesDescriptor> getOrCreateDrivers();

   /**
    * Removes the <code>drivers</code> element 
    * @return the current instance of <code>DatasourcesDescriptor</code> 
    */
   public DatasourcesDescriptor removeDrivers();
}
