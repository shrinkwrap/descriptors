package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class OrderingTypeImpl<T> implements Child<T>, OrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private OrderingOrderingType<OrderingType<T>> after;
   private OrderingOrderingType<OrderingType<T>> before;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public OrderingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("ordering");   }


   public T up()
   {
      return t;
   }



   public OrderingType<T> setAfter(OrderingOrderingType<OrderingType<T>> after)
   {
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




   public OrderingType<T> setBefore(OrderingOrderingType<OrderingType<T>> before)
   {
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
