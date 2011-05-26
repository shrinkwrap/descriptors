package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LifecycleCallbackType<T> extends Child<T>
{
   public LifecycleCallbackType<T> setLifecycleCallbackClazz(String lifecycleCallbackClass);

   public String getLifecycleCallbackClazz();

   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);

   public String getLifecycleCallbackMethod();
}
