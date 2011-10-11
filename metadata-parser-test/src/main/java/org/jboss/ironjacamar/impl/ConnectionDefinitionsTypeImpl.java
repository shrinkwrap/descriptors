package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.ConnectionDefinitionsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.ConnectionDefintionType;
import org.jboss.ironjacamar.impl.ConnectionDefintionTypeImpl;

/**
 * This class implements the <code> connection-definitionsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class ConnectionDefinitionsTypeImpl<T> implements Child<T>, ConnectionDefinitionsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectionDefinitionsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectionDefinitionsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionsType ElementName: ironjacamar:connection-defintionType ElementType : connection-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-definition</code> element will be returned.
    * @return the instance defined for the element <code>connection-definition</code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> getOrCreateConnectionDefinition()
   {
      List<Node> nodeList = childNode.get("connection-definition");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new ConnectionDefintionTypeImpl<ConnectionDefinitionsType<T>>(this, "connection-definition", childNode, nodeList.get(0));
      }
      return createConnectionDefinition();
   }

   /**
    * Creates a new <code>connection-definition</code> element 
    * @return the new created instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefintionType<ConnectionDefinitionsType<T>> createConnectionDefinition()
   {
      return new ConnectionDefintionTypeImpl<ConnectionDefinitionsType<T>>(this, "connection-definition", childNode);
   }

   /**
    * Returns all <code>connection-definition</code> elements
    * @return list of <code>connection-definition</code> 
    */
   public List<ConnectionDefintionType<ConnectionDefinitionsType<T>>> getAllConnectionDefinition()
   {
      List<ConnectionDefintionType<ConnectionDefinitionsType<T>>> list = new ArrayList<ConnectionDefintionType<ConnectionDefinitionsType<T>>>();
      List<Node> nodeList = childNode.get("connection-definition");
      for(Node node: nodeList)
      {
         ConnectionDefintionType<ConnectionDefinitionsType<T>>  type = new ConnectionDefintionTypeImpl<ConnectionDefinitionsType<T>>(this, "connection-definition", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-definition</code> elements 
    * @return the current instance of <code>ConnectionDefintionType<ConnectionDefinitionsType<T>></code> 
    */
   public ConnectionDefinitionsType<T> removeAllConnectionDefinition()
   {
      childNode.removeChildren("connection-definition");
      return this;
   }
}
