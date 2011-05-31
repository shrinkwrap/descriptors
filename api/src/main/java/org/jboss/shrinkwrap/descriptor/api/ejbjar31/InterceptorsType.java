package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface InterceptorsType<T> extends Child<T>
{
   public InterceptorsType<T> setDescription(String description);
   public String getDescription();

   public InterceptorsType<T> setInterceptor(InterceptorType<InterceptorsType<T>> interceptor);
   public InterceptorType<InterceptorsType<T>> getInterceptor();
}
