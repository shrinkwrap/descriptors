package org.jboss.shrinkwrap.descriptor.api.webfacesconfig20;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface FacesConfigMapEntryType<T> extends Child<T>
{
   public FacesConfigMapEntryType<T> setKey(String key);

   public String getKey();
}
