package org.jboss.datasources.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.datasources.api.DriversType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.datasources.api.DriverType;
import org.jboss.datasources.impl.DriverTypeImpl;

/**
 * This class implements the <code> driversType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:29.633-07:00
 */
public class DriversTypeImpl<T> implements Child<T>, DriversType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DriversTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DriversTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DriversType ElementName: datasources:driverType ElementType : driver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>driver</code> element will be created and returned.
    * Otherwise, the first existing <code>driver</code> element will be returned.
    * @return the instance defined for the element <code>driver</code> 
    */
   public DriverType<DriversType<T>> getOrCreateDriver()
   {
      List<Node> nodeList = childNode.get("driver");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new DriverTypeImpl<DriversType<T>>(this, "driver", childNode, nodeList.get(0));
      }
      return createDriver();
   }

   /**
    * Creates a new <code>driver</code> element 
    * @return the new created instance of <code>DriverType<DriversType<T>></code> 
    */
   public DriverType<DriversType<T>> createDriver()
   {
      return new DriverTypeImpl<DriversType<T>>(this, "driver", childNode);
   }

   /**
    * Returns all <code>driver</code> elements
    * @return list of <code>driver</code> 
    */
   public List<DriverType<DriversType<T>>> getAllDriver()
   {
      List<DriverType<DriversType<T>>> list = new ArrayList<DriverType<DriversType<T>>>();
      List<Node> nodeList = childNode.get("driver");
      for(Node node: nodeList)
      {
         DriverType<DriversType<T>>  type = new DriverTypeImpl<DriversType<T>>(this, "driver", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>driver</code> elements 
    * @return the current instance of <code>DriverType<DriversType<T>></code> 
    */
   public DriversType<T> removeAllDriver()
   {
      childNode.removeChildren("driver");
      return this;
   }
}
