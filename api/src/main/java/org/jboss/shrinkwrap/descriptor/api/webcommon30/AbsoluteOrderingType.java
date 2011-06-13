package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface AbsoluteOrderingType<T> extends Child<T>
{

   public AbsoluteOrderingType<T> setName(String name);

   public AbsoluteOrderingType<T> setNameList(String... values);

   public AbsoluteOrderingType<T> removeAllName();

   public List<String> getNameList();

   public AbsoluteOrderingType<T> setOthers(Boolean others);

   public AbsoluteOrderingType<T> removeOthers();

   public Boolean isOthers();

}
