package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 */
public interface RemoveMethodType<T> extends Child<T>
{

   public RemoveMethodType<T> removeBeanMethod();

   public NamedMethodType<RemoveMethodType<T>> beanMethod();

   public RemoveMethodType<T> setRetainIfException(Boolean retainIfException);

   public RemoveMethodType<T> removeRetainIfException();

   public Boolean isRetainIfException();

}