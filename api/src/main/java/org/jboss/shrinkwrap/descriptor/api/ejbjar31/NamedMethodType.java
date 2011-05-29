package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface NamedMethodType<T> extends Child<T>
{
   public NamedMethodType<T> setMethodName(String methodName);

   public String getMethodName();

   public MethodParamsType<NamedMethodType<T>> setMethodParams(MethodParamsType<T> methodParams);

   public MethodParamsType<NamedMethodType<T>> getMethodParams();
}
