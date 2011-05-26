package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface OrderingOrderingType<T> extends Child<T>
{
   public OrderingOrderingType<T> setName(String name);

   public String getName();

   public OrderingOrderingType<T> setOthers(OrderingOthersType<T> others);

   public OrderingOthersType<OrderingOrderingType<T>> getOthers();
}
