package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface OrderingType<T> extends Child<T>
{
   public OrderingType<T> setAfter(OrderingOrderingType<T> after);

   public OrderingOrderingType<OrderingType<T>> getAfter();

   public OrderingType<T> setBefore(OrderingOrderingType<T> before);

   public OrderingOrderingType<OrderingType<T>> getBefore();
}
