package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface InitMethodType<T> extends Child<T>
{
   public InitMethodType<T> setCreateMethod(NamedMethodType<T> createMethod);
   public NamedMethodType<T> getCreateMethod();

   public InitMethodType<T> setBeanMethod(NamedMethodType<T> beanMethod);
   public NamedMethodType<T> getBeanMethod();
}
