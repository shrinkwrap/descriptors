package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface InitMethodType<T> extends Child<T>
{
   public InitMethodType<T> setCreateMethod(NamedMethodType<T> createMethod);

   public NamedMethodType<InitMethodType<T>> getCreateMethod();

   public InitMethodType<T> setBeanMethod(NamedMethodType<T> beanMethod);

   public NamedMethodType<InitMethodType<T>> getBeanMethod();
}
