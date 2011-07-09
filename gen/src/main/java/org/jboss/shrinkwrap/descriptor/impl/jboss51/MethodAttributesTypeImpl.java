package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The method-attributes element can be used to specify which methods are
 * read only or idempotent. This is used to reduce the need for locks and replication.
 *
 *
 */
public class MethodAttributesTypeImpl<T> implements Child<T>, MethodAttributesType<T>
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

   public MethodAttributesTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public MethodAttributesTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : method
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public MethodAttributesType<T> removeAllMethod()
   {
      childNode.remove("method");
      return this;
   }

   public MethodType<MethodAttributesType<T>> method()
   {
      return new MethodTypeImpl<MethodAttributesType<T>>(this, "method", childNode);
   }

   public List<MethodType<MethodAttributesType<T>>> getMethodList()
   {
      List<MethodType<MethodAttributesType<T>>> list = new ArrayList<MethodType<MethodAttributesType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for (Node node : nodeList)
      {
         MethodType<MethodAttributesType<T>> type = new MethodTypeImpl<MethodAttributesType<T>>(this, "method",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
