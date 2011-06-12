package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class OrderingTypeImpl<T> implements Child<T>, OrderingType<T>
{
   public final static String nodeName = "ordering";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private OrderingOrderingType<OrderingType<T>> after;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private OrderingOrderingType<OrderingType<T>> before;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public OrderingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public OrderingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public OrderingType<T> setAfter(OrderingOrderingType<OrderingType<T>> after)   {
      this.after = after;
      childNode.getOrCreate("after").text(after);
      return this;
   }

   public OrderingOrderingType<OrderingType<T>> getAfter()
   {
      if( after == null)
      {
          after = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "", childNode);
      }
      return after;
   }



   // maxOccurs = -1   // isGeneric = true   // isAttribute = false

   public OrderingType<T> setBefore(OrderingOrderingType<OrderingType<T>> before)   {
      this.before = before;
      childNode.getOrCreate("before").text(before);
      return this;
   }

   public OrderingOrderingType<OrderingType<T>> getBefore()
   {
      if( before == null)
      {
          before = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "", childNode);
      }
      return before;
   }


}
