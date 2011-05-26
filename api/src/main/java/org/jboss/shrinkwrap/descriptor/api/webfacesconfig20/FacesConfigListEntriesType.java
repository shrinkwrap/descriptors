package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigListEntriesType<T> extends Child<T>
{
   public FacesConfigListEntriesType<T> setValueClazz(String valueClass);

   public String getValueClazz();
}
