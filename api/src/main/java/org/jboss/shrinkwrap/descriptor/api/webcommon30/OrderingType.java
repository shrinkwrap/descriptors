package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface OrderingType<T> extends Child<T>
{

   public OrderingType<T> removeAfter();

   public OrderingOrderingType<OrderingType<T>> after();

   public OrderingType<T> removeBefore();

   public OrderingOrderingType<OrderingType<T>> before();

}
