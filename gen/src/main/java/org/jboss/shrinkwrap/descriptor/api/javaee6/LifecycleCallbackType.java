package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface LifecycleCallbackType<T> extends Child<T>
{

   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass);
   public String getLifecycleCallbackClass();


   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);
   public String getLifecycleCallbackMethod();
}