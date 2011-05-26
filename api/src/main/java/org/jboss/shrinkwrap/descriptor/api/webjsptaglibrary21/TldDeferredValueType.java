package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TldDeferredValueType<T> extends Child<T>
{
   public TldDeferredValueType<T> setType(String type);

   public String getType();
}
