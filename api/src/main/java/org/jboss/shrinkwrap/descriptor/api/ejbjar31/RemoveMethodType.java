package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RemoveMethodType<T> extends Child<T>
{
   public RemoveMethodType<T> setBeanMethod(NamedMethodType<T> beanMethod);

   public NamedMethodType<RemoveMethodType<T>> getBeanMethod();

   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException);

   public Boolean getRetainIfException();
}
