package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigLocaleConfigType<T> extends Child<T>
{
   public FacesConfigLocaleConfigType<T> setDefaultLocale(FacesConfigLocaleType<T> defaultLocale);

   public FacesConfigLocaleType<FacesConfigLocaleConfigType<T>> getDefaultLocale();

   public FacesConfigLocaleConfigType<T> setSupportedLocale(FacesConfigLocaleType<T> supportedLocale);

   public FacesConfigLocaleType<FacesConfigLocaleConfigType<T>> getSupportedLocale();
}
