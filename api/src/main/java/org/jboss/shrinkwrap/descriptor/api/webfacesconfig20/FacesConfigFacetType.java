package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigFacetType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigFacetType<T> setFacetName(String facetName);

   public String getFacetName();

   public FacesConfigFacetType<T> setFacetExtension(FacesConfigFacetExtensionType<T> facetExtension);

   public FacesConfigFacetExtensionType<FacesConfigFacetType<T>> getFacetExtension();
}
