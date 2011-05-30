package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
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

   public MethodType<T> setMethodParams(MethodParamsType<T> methodParams);
   public MethodParamsType<T> getMethodParams();
}
