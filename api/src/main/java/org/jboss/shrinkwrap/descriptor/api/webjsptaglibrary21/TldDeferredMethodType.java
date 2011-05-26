package org.jboss.shrinkwrap.descriptor.api.webjsptaglibrary21;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface TldDeferredMethodType<T> extends Child<T>
{
   public TldDeferredMethodType<T> setMethodSignature(String methodSignature);

   public String getMethodSignature();
}
