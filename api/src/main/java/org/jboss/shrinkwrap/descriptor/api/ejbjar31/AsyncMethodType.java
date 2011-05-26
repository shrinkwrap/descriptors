package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AsyncMethodType<T> extends Child<T>
{
   public AsyncMethodType<T> setMethodName(String methodName);

   public String getMethodName();

   public AsyncMethodType<T> setMethodParams(MethodParamsType<T> methodParams);

   public MethodParamsType<AsyncMethodType<T>> getMethodParams();
}
