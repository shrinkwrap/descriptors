package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InterceptorsType<T> extends Child<T>
{
   public InterceptorsType<T> setDescription(String description);

   public String getDescription();

   public InterceptorsType<T> setInterceptor(InterceptorType<T> interceptor);

   public InterceptorType<InterceptorsType<T>> getInterceptor();
}
