package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface RemoveMethodType<T> extends Child<T>
{
   public NamedMethodType<RemoveMethodType<T>> setBeanMethod(NamedMethodType<T> beanMethod);

   public NamedMethodType<RemoveMethodType<T>> getBeanMethod();

   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException);

   public Boolean getRetainIfException();
}
