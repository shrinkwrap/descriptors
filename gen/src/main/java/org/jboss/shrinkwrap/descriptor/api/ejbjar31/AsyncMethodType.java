package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface AsyncMethodType<T> extends Child<T>
{

   public AsyncMethodType<T> setMethodName(String methodName);
   public String getMethodName();


   public AsyncMethodType<T> setMethodParams(MethodParamsType<AsyncMethodType<T>> methodParams);
   public MethodParamsType<AsyncMethodType<T>> getMethodParams();

}
