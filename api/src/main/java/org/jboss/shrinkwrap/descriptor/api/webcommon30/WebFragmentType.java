package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface WebFragmentType<T> extends Child<T>
{
   public WebFragmentType<T> setName(String name);

   public String getName();

   public WebFragmentType<T> setOrdering(OrderingType<T> ordering);

   public OrderingType<WebFragmentType<T>> getOrdering();
}
