package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class InterceptorOrderTypeImpl<T> implements Child<T>, InterceptorOrderType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String interceptorClass;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InterceptorOrderTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("interceptor-order");   }


   public T up()
   {
      return t;
   }



   public InterceptorOrderType<T> setInterceptorClass(String interceptorClass)
   {
      this.interceptorClass = interceptorClass;
      childNode.getOrCreate("interceptor-class").text(interceptorClass);
      return this;
   }

   public String getInterceptorClass()
   {
      return interceptorClass;
   }

}
