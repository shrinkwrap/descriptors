package org.jboss.shrinkwrap.descriptor.impl.persistence20;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Property;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:31.163+02:00
 *
 * Original Documentation:
 *
 *
 * A list of standard and vendor-specific properties
 * and hints.
 *
 *
 *
 */
public class PropertiesImpl<T> implements Child<T>, Properties<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public PropertiesImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public PropertiesImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public Properties<T> removeAllProperty()
   {
      childNode.remove("property");
      return this;
   }

   public Property<Properties<T>> property()
   {
      return new PropertyImpl<Properties<T>>(this, "property", childNode);
   }

   public List<Property<Properties<T>>> getPropertyList()
   {
      List<Property<Properties<T>>> list = new ArrayList<Property<Properties<T>>>();
      List<Node> nodeList = childNode.get("property");
      for (Node node : nodeList)
      {
         Property<Properties<T>> type = new PropertyImpl<Properties<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

}
