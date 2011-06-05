package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class InterceptorsTypeImpl<T> implements Child<T>, InterceptorsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private InterceptorType<InterceptorsType<T>> interceptor;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public InterceptorsTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("interceptors");   }


   public T up()
   {
      return t;
   }



   public InterceptorsType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public InterceptorsType<T> setInterceptor(InterceptorType<InterceptorsType<T>> interceptor)
   {
      this.interceptor = interceptor;
      childNode.getOrCreate("interceptor").text(interceptor);
      return this;
   }

   public InterceptorType<InterceptorsType<T>> getInterceptor()
   {
      if( interceptor == null)
      {
          interceptor = new InterceptorTypeImpl<InterceptorsType<T>>(this, "", childNode);
      }
      return interceptor;
   }


}
