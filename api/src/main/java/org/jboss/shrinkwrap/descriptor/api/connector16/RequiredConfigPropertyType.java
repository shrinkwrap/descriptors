package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RequiredConfigPropertyType<T> extends Child<T>
{
   public RequiredConfigPropertyType<T> setDescription(String description);

   public String getDescription();

   public RequiredConfigPropertyType<T> setConfigPropertyName(String configPropertyName);

   public String getConfigPropertyName();
}
