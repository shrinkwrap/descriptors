package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface WebFragmentType<T> extends Child<T>, WebCommonType<T>

{
   public WebFragmentType<T> setName(String name);

   public String getName();

   public OrderingType<WebFragmentType<T>> setOrdering(OrderingType<T> ordering);

   public OrderingType<WebFragmentType<T>> getOrdering();
}
