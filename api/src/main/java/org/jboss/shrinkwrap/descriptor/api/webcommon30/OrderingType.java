package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface OrderingType<T> extends Child<T>
{
   @NodeInfo(xmlName = "after")
   public OrderingOrderingType<OrderingType<T>> after();

   @NodeInfo(xmlName = "before")
   public OrderingOrderingType<OrderingType<T>> before();
}
