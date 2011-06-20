package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface AbsoluteOrderingType<T> extends Child<T>
{

   public AbsoluteOrderingType<T> setName(String name);

   public AbsoluteOrderingType<T> setNameList(String... values);

   public AbsoluteOrderingType<T> removeAllName();

   public List<String> getNameList();

   public AbsoluteOrderingType<T> others();

   public Boolean isOthers();
}
