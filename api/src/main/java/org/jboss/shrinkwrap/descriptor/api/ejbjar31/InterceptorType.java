package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface InterceptorType<T> extends Child<T>, JndiEnvironmentRefsGroup<T>
{
   public InterceptorType<T> setDescription(String description);
   public String getDescription();

   public InterceptorType<T> setInterceptorClass(String interceptorClass);
   public String getInterceptorClass();

   public InterceptorType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);
   public AroundInvokeType<T> getAroundInvoke();

   public InterceptorType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);
   public AroundTimeoutType<T> getAroundTimeout();

   public InterceptorType<T> setPostActivate(LifecycleCallbackType<T> postActivate);
   public LifecycleCallbackType<T> getPostActivate();

   public InterceptorType<T> setPrePassivate(LifecycleCallbackType<T> prePassivate);
   public LifecycleCallbackType<T> getPrePassivate();
}
