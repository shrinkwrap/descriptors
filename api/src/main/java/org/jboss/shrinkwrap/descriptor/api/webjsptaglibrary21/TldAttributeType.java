package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TldAttributeType<T> extends Child<T>
{
   public TldAttributeType<T> setDescription(String description);

   public String getDescription();

   public TldAttributeType<T> setName(String name);

   public String getName();

   public TldAttributeType<T> setRequired(String required);

   public String getRequired();
}
