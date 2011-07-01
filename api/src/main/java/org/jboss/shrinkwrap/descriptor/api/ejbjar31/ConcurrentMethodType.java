package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:21:34.75-04:00
 *
 * Original Documentation:
 *
 *
 * The concurrent-methodType specifies information about a method
 * of a bean with container managed concurrency.
 *
 * The optional lock element specifies the kind of concurrency
 * lock asssociated with the method.
 *
 * The optional access-timeout element specifies the amount of
 * time (in a given time unit) the container should wait for a
 * concurrency lock before throwing an exception to the client.
 *
 *
 *
 */
public interface ConcurrentMethodType<T> extends Child<T>
{

   public ConcurrentMethodType<T> removeMethod();

   public NamedMethodType<ConcurrentMethodType<T>> method();

   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock);

   public ConcurrentMethodType<T> setLock(String lock);

   public ConcurrentLockTypeType getLock();

   public String getLockAsString();

   public ConcurrentMethodType<T> removeAccessTimeout();

   public AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout();

}
