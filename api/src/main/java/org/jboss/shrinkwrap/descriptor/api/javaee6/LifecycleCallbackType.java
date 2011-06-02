package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface LifecycleCallbackType<T> extends Child<T>
{
   public LifecycleCallbackType<T> setLifecycleCallbackClass(Class<?> lifecycleCallbackClass);

   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass);

   @NodeInfo(xmlName = "lifecycle-callback-class")
   public String getLifecycleCallbackClass();

   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);

   @NodeInfo(xmlName = "lifecycle-callback-method")
   public String getLifecycleCallbackMethod();
}
