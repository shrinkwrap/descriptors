package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface ConcurrentMethodType<T> extends Child<T>
{

   public ConcurrentMethodType<T> setMethod(NamedMethodType<ConcurrentMethodType<T>> method);
   public NamedMethodType<ConcurrentMethodType<T>> getMethod();



   public ConcurrentMethodType<T> setLock(String lock);
   public String getLock();


   public ConcurrentMethodType<T> setAccessTimeout(AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout);
   public AccessTimeoutType<ConcurrentMethodType<T>> getAccessTimeout();

}
