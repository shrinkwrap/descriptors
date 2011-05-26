package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AroundInvokeType<T> extends Child<T>
{
   public AroundInvokeType<T> setClazz(String clzz);

   public String getClazz();

   public AroundInvokeType<T> setMethodName(String methodName);

   public String getMethodName();
}
