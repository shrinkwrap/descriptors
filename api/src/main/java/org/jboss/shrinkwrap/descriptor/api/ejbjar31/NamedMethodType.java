package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface NamedMethodType<T> extends Child<T>
{
   public NamedMethodType<T> setMethodName(String methodName);
   public String getMethodName();

   public NamedMethodType<T> setMethodParams(MethodParamsType<T> methodParams);
   public MethodParamsType<T> getMethodParams();
}
