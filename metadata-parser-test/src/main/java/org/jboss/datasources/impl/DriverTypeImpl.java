package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.DriverType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> driverType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class DriverTypeImpl<T> implements Child<T>, DriverType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DriverTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DriverTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : driver-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>driver-class</code> element
    * @param driverClass the value for the element <code>driver-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> driverClass(String driverClass)
   {
      childNode.getOrCreate("driver-class").text(driverClass);
      return this;
   }

   /**
    * Returns the <code>driver-class</code> element
    * @return the node defined for the element <code>driver-class</code> 
    */
   public String getDriverClass()
   {
      return childNode.getTextValueForPatternName("driver-class");
   }

   /**
    * Removes the <code>driver-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeDriverClass()
   {
      childNode.removeChildren("driver-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>datasource-class</code> element
    * @param datasourceClass the value for the element <code>datasource-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> datasourceClass(String datasourceClass)
   {
      childNode.getOrCreate("datasource-class").text(datasourceClass);
      return this;
   }

   /**
    * Returns the <code>datasource-class</code> element
    * @return the node defined for the element <code>datasource-class</code> 
    */
   public String getDatasourceClass()
   {
      return childNode.getTextValueForPatternName("datasource-class");
   }

   /**
    * Removes the <code>datasource-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeDatasourceClass()
   {
      childNode.removeChildren("datasource-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : xa-datasource-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xa-datasource-class</code> element
    * @param xaDatasourceClass the value for the element <code>xa-datasource-class</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> xaDatasourceClass(String xaDatasourceClass)
   {
      childNode.getOrCreate("xa-datasource-class").text(xaDatasourceClass);
      return this;
   }

   /**
    * Returns the <code>xa-datasource-class</code> element
    * @return the node defined for the element <code>xa-datasource-class</code> 
    */
   public String getXaDatasourceClass()
   {
      return childNode.getTextValueForPatternName("xa-datasource-class");
   }

   /**
    * Removes the <code>xa-datasource-class</code> element 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeXaDatasourceClass()
   {
      childNode.removeChildren("xa-datasource-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:token ElementType : module
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module</code> attribute
    * @param module the value for the attribute <code>module</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> module(String module)
   {
      childNode.attribute("module", module);
      return this;
   }

   /**
    * Returns the <code>module</code> attribute
    * @return the value defined for the attribute <code>module</code> 
    */
      public String getModule()
   {
      return childNode.getAttribute("module");
   }

   /**
    * Removes the <code>module</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeModule()
   {
      childNode.removeAttribute("module");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:int ElementType : major-version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>major-version</code> attribute
    * @param majorVersion the value for the attribute <code>major-version</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> majorVersion(Integer majorVersion)
   {
      childNode.attribute("major-version", majorVersion);
      return this;
   }

   /**
    * Returns the <code>major-version</code> attribute
    * @return the value defined for the attribute <code>major-version</code> 
    */
   public Integer getMajorVersion()
   {
      if(childNode.getAttribute("major-version") != null && !childNode.getAttribute("major-version").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("major-version"));
      }
      return null;
   }

   /**
    * Removes the <code>major-version</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeMajorVersion()
   {
      childNode.removeAttribute("major-version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriverType ElementName: xsd:int ElementType : minor-verion
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>minor-verion</code> attribute
    * @param minorVerion the value for the attribute <code>minor-verion</code> 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> minorVerion(Integer minorVerion)
   {
      childNode.attribute("minor-verion", minorVerion);
      return this;
   }

   /**
    * Returns the <code>minor-verion</code> attribute
    * @return the value defined for the attribute <code>minor-verion</code> 
    */
   public Integer getMinorVerion()
   {
      if(childNode.getAttribute("minor-verion") != null && !childNode.getAttribute("minor-verion").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("minor-verion"));
      }
      return null;
   }

   /**
    * Removes the <code>minor-verion</code> attribute 
    * @return the current instance of <code>DriverType<T></code> 
    */
   public DriverType<T> removeMinorVerion()
   {
      childNode.removeAttribute("minor-verion");
      return this;
   }
}
