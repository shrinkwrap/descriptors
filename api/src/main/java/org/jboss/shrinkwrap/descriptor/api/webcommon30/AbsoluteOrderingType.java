package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * Please see section 8.2.2 of the specification for details.
 *
 *
 *
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
