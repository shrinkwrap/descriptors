package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

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

   public InterceptorBindingType<T> setMethod(NamedMethodType<T> method);

   public NamedMethodType<InterceptorBindingType<T>> getMethod();
}
