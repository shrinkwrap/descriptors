package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigPropertyType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigPropertyType<T> setPropertyName(String propertyName);

   public String getPropertyName();

   public FacesConfigPropertyType<T> setPropertyClazz(String propertyClass);

   public String getPropertyClazz();

   public FacesConfigPropertyType<T> setDefaultValue(String defaultValue);

   public String getDefaultValue();

   public FacesConfigPropertyType<T> setSuggestedValue(String suggestedValue);

   public String getSuggestedValue();

   public FacesConfigPropertyType<T> setPropertyExtension(FacesConfigPropertyExtensionType<T> propertyExtension);

   public FacesConfigPropertyExtensionType<FacesConfigPropertyType<T>> getPropertyExtension();
}
