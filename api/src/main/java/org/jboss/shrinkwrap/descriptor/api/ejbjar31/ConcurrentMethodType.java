package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface ConcurrentMethodType<T> extends Child<T>
{
   public ConcurrentMethodType<T> setMethod(NamedMethodType<T> method);
   public NamedMethodType<T> getMethod();

   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock);
   public ConcurrentLockTypeType getLock();

   public ConcurrentMethodType<T> setAccessTimeout(AccessTimeoutType<T> accessTimeout);
   public AccessTimeoutType<T> getAccessTimeout();
}
