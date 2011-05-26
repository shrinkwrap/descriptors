package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigSystemEventListenerType<T> extends Child<T>
{
   public FacesConfigSystemEventListenerType<T> setSystemEventListenerClazz(String systemEventListenerClass);

   public String getSystemEventListenerClazz();

   public FacesConfigSystemEventListenerType<T> setSystemEventClazz(String systemEventClass);

   public String getSystemEventClazz();

   public FacesConfigSystemEventListenerType<T> setSourceClazz(String sourceClass);

   public String getSourceClazz();
}
