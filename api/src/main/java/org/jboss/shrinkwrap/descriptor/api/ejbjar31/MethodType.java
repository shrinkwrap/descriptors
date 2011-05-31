package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface MethodType<T> extends Child<T>
{
   public MethodType<T> setDescription(String description);
   public String getDescription();

   public MethodType<T> setEjbName(String ejbName);
   public String getEjbName();

   public MethodType<T> setMethodIntf(MethodIntfType methodIntf);
   public MethodIntfType getMethodIntf();

   public MethodType<T> setMethodName(String methodName);
   public String getMethodName();

   public MethodType<T> setMethodParams(MethodParamsType<MethodType<T>> methodParams);
   public MethodParamsType<MethodType<T>> getMethodParams();
}
