package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class. Generation date
 * :2011-07-13T23:06:02.86+02:00
 * 
 * Original Documentation:
 * 
 * 
 * Please see section 8.2.2 of the specification for details.
 * 
 * 
 * 
 */
public interface OrderingType<T> extends Child<T> {

	public OrderingType<T> removeAfter();

	public OrderingOrderingType<OrderingType<T>> after();

	public OrderingType<T> removeBefore();

	public OrderingOrderingType<OrderingType<T>> before();

}
