package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface InterceptorBindingType<T> extends Child<T>
{

   public InterceptorBindingType<T> setDescription(String description);
   public String getDescription();


   public InterceptorBindingType<T> setEjbName(String ejbName);
   public String getEjbName();


   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors);
   public Boolean getExcludeDefaultInterceptors();


   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors);
   public Boolean getExcludeClassInterceptors();


   public InterceptorBindingType<T> setMethod(NamedMethodType<InterceptorBindingType<T>> method);
   public NamedMethodType<InterceptorBindingType<T>> getMethod();



   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass);
   public String getInterceptorClass();


   public InterceptorBindingType<T> setInterceptorOrder(InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder);
   public InterceptorOrderType<InterceptorBindingType<T>> getInterceptorOrder();

}
