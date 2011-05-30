package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebFragmentType<T> extends Child<T>, WebCommonType<T>, WebCommonAttributes<T>
{
   public WebFragmentType<T> setName(String name);
   public String getName();

   public WebFragmentType<T> setOrdering(OrderingType<T> ordering);
   public OrderingType<T> getOrdering();
}
