package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface OrderingOrderingType<T> extends Child<T>
{

   public OrderingOrderingType<T> setName(String name);

   public OrderingOrderingType<T> setNameList(String... values);

   public OrderingOrderingType<T> removeAllName();

   public List<String> getNameList();

   public OrderingOrderingType<T> setOthers(Boolean others);

   public OrderingOrderingType<T> removeOthers();

   public Boolean isOthers();

}
