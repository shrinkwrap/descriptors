package org.jboss.ironjacamar.impl; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.ironjacamar.api.AdminObjectsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.ironjacamar.api.AdminObjectType;
import org.jboss.ironjacamar.impl.AdminObjectTypeImpl;

/**
 * This class implements the <code> admin-objectsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2012-01-12T02:21:27.07-07:00
 */
public class AdminObjectsTypeImpl<T> implements Child<T>, AdminObjectsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AdminObjectsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AdminObjectsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminObjectsType ElementName: ironjacamar:admin-objectType ElementType : admin-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>admin-object</code> element will be created and returned.
    * Otherwise, the first existing <code>admin-object</code> element will be returned.
    * @return the instance defined for the element <code>admin-object</code> 
    */
   public AdminObjectType<AdminObjectsType<T>> getOrCreateAdminObject()
   {
      List<Node> nodeList = childNode.get("admin-object");
      if (nodeList != null &&  nodeList.size() > 1)
      {
         return new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode, nodeList.get(0));
      }
      return createAdminObject();
   }

   /**
    * Creates a new <code>admin-object</code> element 
    * @return the new created instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectType<AdminObjectsType<T>> createAdminObject()
   {
      return new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode);
   }

   /**
    * Returns all <code>admin-object</code> elements
    * @return list of <code>admin-object</code> 
    */
   public List<AdminObjectType<AdminObjectsType<T>>> getAllAdminObject()
   {
      List<AdminObjectType<AdminObjectsType<T>>> list = new ArrayList<AdminObjectType<AdminObjectsType<T>>>();
      List<Node> nodeList = childNode.get("admin-object");
      for(Node node: nodeList)
      {
         AdminObjectType<AdminObjectsType<T>>  type = new AdminObjectTypeImpl<AdminObjectsType<T>>(this, "admin-object", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>admin-object</code> elements 
    * @return the current instance of <code>AdminObjectType<AdminObjectsType<T>></code> 
    */
   public AdminObjectsType<T> removeAllAdminObject()
   {
      childNode.removeChildren("admin-object");
      return this;
   }
}
