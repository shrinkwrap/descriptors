package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigRendererType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigRendererType<T> setComponentFamily(String componentFamily);

   public String getComponentFamily();

   public FacesConfigRendererType<T> setRendererType(String rendererType);

   public String getRendererType();

   public FacesConfigRendererType<T> setRendererClazz(String rendererClass);

   public String getRendererClazz();

   public FacesConfigRendererType<T> setFacet(FacesConfigFacetType<T> facet);

   public FacesConfigFacetType<FacesConfigRendererType<T>> getFacet();

   public FacesConfigRendererType<T> setAttribute(FacesConfigAttributeType<T> attribute);

   public FacesConfigAttributeType<FacesConfigRendererType<T>> getAttribute();

   public FacesConfigRendererType<T> setRendererExtension(FacesConfigRendererExtensionType<T> rendererExtension);

   public FacesConfigRendererExtensionType<FacesConfigRendererType<T>> getRendererExtension();
}
