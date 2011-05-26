package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AbsoluteOrderingType<T> extends Child<T>
{
   public AbsoluteOrderingType<T> setName(String name);

   public String getName();

   public AbsoluteOrderingType<T> setOthers(OrderingOthersType<T> others);

   public OrderingOthersType<AbsoluteOrderingType<T>> getOthers();
}
