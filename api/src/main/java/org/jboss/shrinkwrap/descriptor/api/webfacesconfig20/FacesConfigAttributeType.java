package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigAttributeType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigAttributeType<T> setAttributeName(String attributeName);

   public String getAttributeName();

   public FacesConfigAttributeType<T> setAttributeClazz(String attributeClass);

   public String getAttributeClazz();

   public FacesConfigAttributeType<T> setDefaultValue(String defaultValue);

   public String getDefaultValue();

   public FacesConfigAttributeType<T> setSuggestedValue(String suggestedValue);

   public String getSuggestedValue();

   public FacesConfigAttributeType<T> setAttributeExtension(FacesConfigAttributeExtensionType<T> attributeExtension);

   public FacesConfigAttributeExtensionType<FacesConfigAttributeType<T>> getAttributeExtension();
}
