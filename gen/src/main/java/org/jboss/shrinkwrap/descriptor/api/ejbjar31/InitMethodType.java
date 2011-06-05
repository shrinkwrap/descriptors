package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface InitMethodType<T> extends Child<T>
{

   public InitMethodType<T> setCreateMethod(NamedMethodType<InitMethodType<T>> createMethod);
   public NamedMethodType<InitMethodType<T>> getCreateMethod();



   public InitMethodType<T> setBeanMethod(NamedMethodType<InitMethodType<T>> beanMethod);
   public NamedMethodType<InitMethodType<T>> getBeanMethod();

}
