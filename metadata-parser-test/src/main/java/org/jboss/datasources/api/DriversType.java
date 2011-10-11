package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.datasources.api.DriverType;
/**
 * This interface defines the contract for the <code> driversType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
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
