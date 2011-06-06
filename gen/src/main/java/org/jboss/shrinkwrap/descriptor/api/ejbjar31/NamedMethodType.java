package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface NamedMethodType<T> extends Child<T>
{

   public NamedMethodType<T> setMethodName(String methodName);
   public String getMethodName();


   public NamedMethodType<T> setMethodParams(MethodParamsType<NamedMethodType<T>> methodParams);
   public MethodParamsType<NamedMethodType<T>> getMethodParams();

}
