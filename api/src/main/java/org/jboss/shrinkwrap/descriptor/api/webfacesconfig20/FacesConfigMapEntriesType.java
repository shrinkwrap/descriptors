package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigMapEntriesType<T> extends Child<T>
{
   public FacesConfigMapEntriesType<T> setKeyClazz(String keyClass);

   public String getKeyClazz();

   public FacesConfigMapEntriesType<T> setValueClazz(String valueClass);

   public String getValueClazz();

   public FacesConfigMapEntriesType<T> setMapEntry(FacesConfigMapEntryType<T> mapEntry);

   public FacesConfigMapEntryType<FacesConfigMapEntriesType<T>> getMapEntry();
}
