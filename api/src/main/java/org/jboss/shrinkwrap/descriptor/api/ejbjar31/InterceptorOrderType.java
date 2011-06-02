package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface InterceptorOrderType<T> extends Child<T>
{
   public InterceptorOrderType<T> setInterceptorClass(Class<?> interceptorClass);

   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass);

   @NodeInfo(xmlName = "interceptor-class")
   public String getInterceptorClass();
}
