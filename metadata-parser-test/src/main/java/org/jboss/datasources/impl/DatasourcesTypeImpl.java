package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.DatasourcesType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.DatasourceType;
import org.jboss.datasources.impl.DatasourceTypeImpl;
import org.jboss.datasources.api.XaDatasourceType;
import org.jboss.datasources.impl.XaDatasourceTypeImpl;
import org.jboss.datasources.api.DriversType;
import org.jboss.datasources.impl.DriversTypeImpl;

/**
 * This class implements the <code> datasourcesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class DatasourcesTypeImpl<T> implements Child<T>, DatasourcesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DatasourcesTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DatasourcesTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:datasourceType ElementType : datasource
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>datasource</code> element will be returned.
    * @return the instance defined for the element <code>datasource</code> 
    */
   public DatasourceType<DatasourcesType<T>> getOrCreateDatasource()
   {
      List<Node> nodeList = childNode.get("datasource");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new DatasourceTypeImpl<DatasourcesType<T>>(this, "datasource", childNode, nodeList.get(0));
      }
      return createDatasource();
   }

   /**
    * Creates a new <code>datasource</code> element 
    * @return the new created instance of <code>DatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourceType<DatasourcesType<T>> createDatasource()
   {
      return new DatasourceTypeImpl<DatasourcesType<T>>(this, "datasource", childNode);
   }

   /**
    * Returns all <code>datasource</code> elements
    * @return list of <code>datasource</code> 
    */
   public List<DatasourceType<DatasourcesType<T>>> getAllDatasource()
   {
      List<DatasourceType<DatasourcesType<T>>> list = new ArrayList<DatasourceType<DatasourcesType<T>>>();
      List<Node> nodeList = childNode.get("datasource");
      for(Node node: nodeList)
      {
         DatasourceType<DatasourcesType<T>>  type = new DatasourceTypeImpl<DatasourcesType<T>>(this, "datasource", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>datasource</code> elements 
    * @return the current instance of <code>DatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourcesType<T> removeAllDatasource()
   {
      childNode.removeChildren("datasource");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:xa-datasourceType ElementType : xa-datasource
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>xa-datasource</code> element will be created and returned.
    * Otherwise, the first existing <code>xa-datasource</code> element will be returned.
    * @return the instance defined for the element <code>xa-datasource</code> 
    */
   public XaDatasourceType<DatasourcesType<T>> getOrCreateXaDatasource()
   {
      List<Node> nodeList = childNode.get("xa-datasource");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new XaDatasourceTypeImpl<DatasourcesType<T>>(this, "xa-datasource", childNode, nodeList.get(0));
      }
      return createXaDatasource();
   }

   /**
    * Creates a new <code>xa-datasource</code> element 
    * @return the new created instance of <code>XaDatasourceType<DatasourcesType<T>></code> 
    */
   public XaDatasourceType<DatasourcesType<T>> createXaDatasource()
   {
      return new XaDatasourceTypeImpl<DatasourcesType<T>>(this, "xa-datasource", childNode);
   }

   /**
    * Returns all <code>xa-datasource</code> elements
    * @return list of <code>xa-datasource</code> 
    */
   public List<XaDatasourceType<DatasourcesType<T>>> getAllXaDatasource()
   {
      List<XaDatasourceType<DatasourcesType<T>>> list = new ArrayList<XaDatasourceType<DatasourcesType<T>>>();
      List<Node> nodeList = childNode.get("xa-datasource");
      for(Node node: nodeList)
      {
         XaDatasourceType<DatasourcesType<T>>  type = new XaDatasourceTypeImpl<DatasourcesType<T>>(this, "xa-datasource", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>xa-datasource</code> elements 
    * @return the current instance of <code>XaDatasourceType<DatasourcesType<T>></code> 
    */
   public DatasourcesType<T> removeAllXaDatasource()
   {
      childNode.removeChildren("xa-datasource");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DatasourcesType ElementName: datasources:driversType ElementType : drivers
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>drivers</code> element with the given value will be created.
    * Otherwise, the existing <code>drivers</code> element will be returned.
    * @return  a new or existing instance of <code>DriversType<DatasourcesType<T>></code> 
    */
   public DriversType<DatasourcesType<T>> getOrCreateDrivers()
   {
      Node node = childNode.getOrCreate("drivers");
      DriversType<DatasourcesType<T>> drivers = new DriversTypeImpl<DatasourcesType<T>>(this, "drivers", childNode, node);
      return drivers;
   }

   /**
    * Removes the <code>drivers</code> element 
    * @return the current instance of <code>DatasourcesType<T></code> 
    */
   public DatasourcesType<T> removeDrivers()
   {
      childNode.removeChildren("drivers");
      return this;
   }
}
