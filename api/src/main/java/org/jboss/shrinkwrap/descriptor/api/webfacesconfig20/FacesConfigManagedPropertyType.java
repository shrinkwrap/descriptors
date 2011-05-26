package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigManagedPropertyType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigManagedPropertyType<T> setPropertyName(String propertyName);

   public String getPropertyName();

   public FacesConfigManagedPropertyType<T> setPropertyClazz(String propertyClass);

   public String getPropertyClazz();
}
