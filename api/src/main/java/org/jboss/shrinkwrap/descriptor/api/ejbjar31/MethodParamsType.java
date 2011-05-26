package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MethodParamsType<T> extends Child<T>
{
   public MethodParamsType<T> setMethodParam(String methodParam);

   public String getMethodParam();
}
