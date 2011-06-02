package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface InterceptorBindingType<T> extends Child<T>
{
   public InterceptorBindingType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public InterceptorBindingType<T> setEjbName(String ejbName);

   @NodeInfo(xmlName = "ejb-name")
   public String getEjbName();

   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors);

   @NodeInfo(xmlName = "exclude-default-interceptors")
   public Boolean getExcludeDefaultInterceptors();

   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors);

   @NodeInfo(xmlName = "exclude-class-interceptors")
   public Boolean getExcludeClassInterceptors();

   @NodeInfo(xmlName = "method")
   public NamedMethodType<InterceptorBindingType<T>> method();

   public InterceptorBindingType<T> setInterceptorClass(Class<?> interceptorClass);

   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass);

   @NodeInfo(xmlName = "interceptor-class")
   public String getInterceptorClass();

   @NodeInfo(xmlName = "interceptor-order")
   public InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder();
}
