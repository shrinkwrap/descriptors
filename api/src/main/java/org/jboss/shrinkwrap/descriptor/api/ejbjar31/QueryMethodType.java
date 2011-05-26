package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface QueryMethodType<T> extends Child<T>
{
   public QueryMethodType<T> setMethodName(String methodName);

   public String getMethodName();

   public QueryMethodType<T> setMethodParams(MethodParamsType<T> methodParams);

   public MethodParamsType<QueryMethodType<T>> getMethodParams();
}
