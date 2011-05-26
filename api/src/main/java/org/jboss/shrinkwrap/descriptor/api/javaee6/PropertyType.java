package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface PropertyType<T> extends Child<T>
{
   public PropertyType<T> setName(String name);

   public String getName();

   public PropertyType<T> setValue(String value);

   public String getValue();
}
