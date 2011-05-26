package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InterceptorOrderType<T> extends Child<T>
{
   public InterceptorOrderType<T> setInterceptorClazz(String interceptorClass);

   public String getInterceptorClazz();
}
