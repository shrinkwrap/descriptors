package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface LifecycleCallbackType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public LifecycleCallbackType<T> setLifecycleCallbackClass(String lifecycleCallbackClass);

   public String getLifecycleCallbackClass();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public LifecycleCallbackType<T> setLifecycleCallbackMethod(String lifecycleCallbackMethod);

   public String getLifecycleCallbackMethod();

}
