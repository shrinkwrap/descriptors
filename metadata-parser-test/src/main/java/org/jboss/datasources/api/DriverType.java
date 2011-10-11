package org.jboss.datasources.api; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> driverType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public interface DriverType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : driver-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver-class</code> element
    * @param driverClass the value for the element <code>driver-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> driverClass(String driverClass);

   /**
    * Returns the <code>driver-class</code> element
    * @return the node defined for the element <code>driver-class</code> 
    */
   public String getDriverClass();

   /**
    * Removes the <code>driver-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeDriverClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>datasource-class</code> element
    * @param datasourceClass the value for the element <code>datasource-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> datasourceClass(String datasourceClass);

   /**
    * Returns the <code>datasource-class</code> element
    * @return the node defined for the element <code>datasource-class</code> 
    */
   public String getDatasourceClass();

   /**
    * Removes the <code>datasource-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeDatasourceClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : xa-datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-datasource-class</code> element
    * @param xaDatasourceClass the value for the element <code>xa-datasource-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> xaDatasourceClass(String xaDatasourceClass);

   /**
    * Returns the <code>xa-datasource-class</code> element
    * @return the node defined for the element <code>xa-datasource-class</code> 
    */
   public String getXaDatasourceClass();

   /**
    * Removes the <code>xa-datasource-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeXaDatasourceClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : module
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module</code> attribute
    * @param module the value for the attribute <code>module</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> module(String module);

   /**
    * Returns the <code>module</code> attribute
    * @return the value defined for the attribute <code>module</code> 
    */
   public String getModule();

   /**
    * Removes the <code>module</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeModule();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:int ElementType : major-version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>major-version</code> attribute
    * @param majorVersion the value for the attribute <code>major-version</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> majorVersion(Integer majorVersion);

   /**
    * Returns the <code>major-version</code> attribute
    * @return the value defined for the attribute <code>major-version</code> 
    */
public Integer getMajorVersion();

   /**
    * Removes the <code>major-version</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeMajorVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:int ElementType : minor-verion
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>minor-verion</code> attribute
    * @param minorVerion the value for the attribute <code>minor-verion</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> minorVerion(Integer minorVerion);

   /**
    * Returns the <code>minor-verion</code> attribute
    * @return the value defined for the attribute <code>minor-verion</code> 
    */
public Integer getMinorVerion();

   /**
    * Removes the <code>minor-verion</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeMinorVerion();
}
