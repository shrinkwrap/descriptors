package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T19:50:22.163-04:00
 *
 * Original Documentation:
 *
 *
 * Please see section 8.2.2 of the specification for details.
 *
 *
 *
 */
public class OrderingTypeImpl<T> implements Child<T>, OrderingType<T>
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

   public OrderingTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public OrderingTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : after
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public OrderingType<T> removeAfter()
   {
      childNode.remove("after");
      return this;
   }

   public OrderingOrderingType<OrderingType<T>> after()
   {
      Node node = childNode.getOrCreate("after");
      OrderingOrderingType<OrderingType<T>> after = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "after",
            childNode, node);
      return after;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : before
   // isComplexType: true   maxOccurs: -1   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public OrderingType<T> removeBefore()
   {
      childNode.remove("before");
      return this;
   }

   public OrderingOrderingType<OrderingType<T>> before()
   {
      Node node = childNode.getOrCreate("before");
      OrderingOrderingType<OrderingType<T>> before = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "before",
            childNode, node);
      return before;
   }

}
