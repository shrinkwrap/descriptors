package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LifecycleCallbackType<T> extends Child<T>
{
   public LifecycleCallbackType<T> lifecycleCallbackClass(String lifecycleCallbackClass);

   public LifecycleCallbackType<T> lifecycleCallbackMethod(String lifecycleCallbackMethod);
}
