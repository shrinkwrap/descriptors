package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class InterceptorBindingTypeImpl<T> implements Child<T>, InterceptorBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private String ejbName;
   private Boolean excludeDefaultInterceptors;
   private Boolean excludeClassInterceptors;
   private NamedMethodType<InterceptorBindingType<T>> method;
   private String interceptorClass;
   private InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InterceptorBindingTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("interceptor-binding");   }


   public T up()
   {
      return t;
   }



   public InterceptorBindingType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public InterceptorBindingType<T> setEjbName(String ejbName)
   {
      this.ejbName = ejbName;
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   public String getEjbName()
   {
      return ejbName;
   }



   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors)
   {
      this.excludeDefaultInterceptors = excludeDefaultInterceptors;
      childNode.getOrCreate("exclude-default-interceptors").text(excludeDefaultInterceptors);
      return this;
   }

   public Boolean getExcludeDefaultInterceptors()
   {
      return excludeDefaultInterceptors;
   }



   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors)
   {
      this.excludeClassInterceptors = excludeClassInterceptors;
      childNode.getOrCreate("exclude-class-interceptors").text(excludeClassInterceptors);
      return this;
   }

   public Boolean getExcludeClassInterceptors()
   {
      return excludeClassInterceptors;
   }



   public InterceptorBindingType<T> setMethod(NamedMethodType<InterceptorBindingType<T>> method)
   {
      this.method = method;
      childNode.getOrCreate("method").text(method);
      return this;
   }

   public NamedMethodType<InterceptorBindingType<T>> getMethod()
   {
      if( method == null)
      {
          method = new NamedMethodTypeImpl<InterceptorBindingType<T>>(this, "", childNode);
      }
      return method;
   }




   public InterceptorBindingType<T> setInterceptorClass(String interceptorClass)
   {
      childNode.create("interceptor-class").text(interceptorClass);
      return this;
   }

   public String getInterceptorClass()
   {
      return interceptorClass;
   }



   public InterceptorBindingType<T> setInterceptorOrder(InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder)
   {
      this.interceptorOrder = interceptorOrder;
      childNode.getOrCreate("interceptor-order").text(interceptorOrder);
      return this;
   }

   public InterceptorOrderType<InterceptorBindingType<T>> getInterceptorOrder()
   {
      if( interceptorOrder == null)
      {
          interceptorOrder = new InterceptorOrderTypeImpl<InterceptorBindingType<T>>(this, "", childNode);
      }
      return interceptorOrder;
   }


}
