package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MethodType<T> extends Child<T>
{
   public MethodType<T> setDescription(String description);

   public String getDescription();

   public MethodType<T> setEjbName(String ejbName);

   public String getEjbName();

   public MethodType<T> setMethodIntf(String methodIntf);

   public String getMethodIntf();

   public MethodType<T> setMethodName(String methodName);

   public String getMethodName();

   public MethodType<T> setMethodParams(MethodParamsType<T> methodParams);

   public MethodParamsType<MethodType<T>> getMethodParams();
}
