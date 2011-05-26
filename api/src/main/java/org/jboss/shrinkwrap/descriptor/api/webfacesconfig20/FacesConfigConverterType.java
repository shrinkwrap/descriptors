package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;

public interface FacesConfigConverterType<T> extends Child<T>, DescriptionGroup<T>
{
   public FacesConfigConverterType<T> setConverterClazz(String converterClass);

   public String getConverterClazz();

   public FacesConfigConverterType<T> setAttribute(FacesConfigAttributeType<T> attribute);

   public FacesConfigAttributeType<FacesConfigConverterType<T>> getAttribute();

   public FacesConfigConverterType<T> setProperty(FacesConfigPropertyType<T> property);

   public FacesConfigPropertyType<FacesConfigConverterType<T>> getProperty();

   public FacesConfigConverterType<T> setConverterExtension(FacesConfigConverterExtensionType<T> converterExtension);

   public FacesConfigConverterExtensionType<FacesConfigConverterType<T>> getConverterExtension();
}
