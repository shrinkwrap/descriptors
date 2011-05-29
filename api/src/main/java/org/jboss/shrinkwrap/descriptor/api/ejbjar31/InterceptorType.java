package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface InterceptorType<T> extends Child<T>, JndiEnvironmentRefsGroup<T>

{
   public InterceptorType<T> setDescription(String description);

   public String getDescription();

   public InterceptorType<T> setInterceptorClass(String interceptorClass);

   public String getInterceptorClass();

   public AroundInvokeType<InterceptorType<T>> setAroundInvoke(AroundInvokeType<T> aroundInvoke);

   public AroundInvokeType<InterceptorType<T>> getAroundInvoke();

   public AroundTimeoutType<InterceptorType<T>> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);

   public AroundTimeoutType<InterceptorType<T>> getAroundTimeout();

   public LifecycleCallbackType<InterceptorType<T>> setPostActivate(LifecycleCallbackType<T> postActivate);

   public LifecycleCallbackType<InterceptorType<T>> getPostActivate();

   public LifecycleCallbackType<InterceptorType<T>> setPrePassivate(LifecycleCallbackType<T> prePassivate);

   public LifecycleCallbackType<InterceptorType<T>> getPrePassivate();
}
