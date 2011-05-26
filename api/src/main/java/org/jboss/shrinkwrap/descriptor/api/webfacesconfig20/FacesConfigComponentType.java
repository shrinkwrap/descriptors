package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigComponentType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigComponentType<T> setComponentType(String componentType);

   public String getComponentType();

   public FacesConfigComponentType<T> setComponentClazz(String componentClass);

   public String getComponentClazz();

   public FacesConfigComponentType<T> setFacet(FacesConfigFacetType<T> facet);

   public FacesConfigFacetType<FacesConfigComponentType<T>> getFacet();

   public FacesConfigComponentType<T> setAttribute(FacesConfigAttributeType<T> attribute);

   public FacesConfigAttributeType<FacesConfigComponentType<T>> getAttribute();

   public FacesConfigComponentType<T> setProperty(FacesConfigPropertyType<T> property);

   public FacesConfigPropertyType<FacesConfigComponentType<T>> getProperty();

   public FacesConfigComponentType<T> setComponentExtension(FacesConfigComponentExtensionType<T> componentExtension);

   public FacesConfigComponentExtensionType<FacesConfigComponentType<T>> getComponentExtension();
}
