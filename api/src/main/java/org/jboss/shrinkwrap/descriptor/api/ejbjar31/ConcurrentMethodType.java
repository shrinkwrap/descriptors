package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface ConcurrentMethodType<T> extends Child<T>
{
   public NamedMethodType<ConcurrentMethodType<T>> setMethod(NamedMethodType<T> method);

   public NamedMethodType<ConcurrentMethodType<T>> getMethod();

   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock);

   public ConcurrentLockTypeType getLock();

   public AccessTimeoutType<ConcurrentMethodType<T>> setAccessTimeout(AccessTimeoutType<T> accessTimeout);

   public AccessTimeoutType<ConcurrentMethodType<T>> getAccessTimeout();
}
