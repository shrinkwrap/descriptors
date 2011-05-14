package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * OrderingType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface OrderingType<T> extends Child<T>
{
   public OrderingOrderingType<OrderingType<T>> after();

   public OrderingOrderingType<OrderingType<T>> before();
}
