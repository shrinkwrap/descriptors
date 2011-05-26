package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.JndiEnvironmentRefsGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;

public interface InterceptorType<T> extends Child<T>, JndiEnvironmentRefsGroup<T>
{
   public InterceptorType<T> setDescription(String description);

   public String getDescription();

   public InterceptorType<T> setInterceptorClazz(String interceptorClass);

   public String getInterceptorClazz();

   public InterceptorType<T> setAroundInvoke(AroundInvokeType<T> aroundInvoke);

   public AroundInvokeType<InterceptorType<T>> getAroundInvoke();

   public InterceptorType<T> setAroundTimeout(AroundTimeoutType<T> aroundTimeout);

   public AroundTimeoutType<InterceptorType<T>> getAroundTimeout();

   public InterceptorType<T> setPostActivate(LifecycleCallbackType<T> postActivate);

   public LifecycleCallbackType<InterceptorType<T>> getPostActivate();

   public InterceptorType<T> setPrePassivate(LifecycleCallbackType<T> prePassivate);

   public LifecycleCallbackType<InterceptorType<T>> getPrePassivate();
}
