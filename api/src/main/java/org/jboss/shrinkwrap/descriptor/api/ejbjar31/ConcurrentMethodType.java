package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface ConcurrentMethodType<T> extends Child<T>
{
   public ConcurrentMethodType<T> setMethod(NamedMethodType<T> method);

   public NamedMethodType<ConcurrentMethodType<T>> getMethod();

   public ConcurrentMethodType<T> setLock(String lock);

   public String getLock();

   public ConcurrentMethodType<T> setAccessTimeout(AccessTimeoutType<T> accessTimeout);

   public AccessTimeoutType<ConcurrentMethodType<T>> getAccessTimeout();
}
