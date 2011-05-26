package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AroundTimeoutType<T> extends Child<T>
{
   public AroundTimeoutType<T> setClazz(String clzz);

   public String getClazz();

   public AroundTimeoutType<T> setMethodName(String methodName);

   public String getMethodName();
}
