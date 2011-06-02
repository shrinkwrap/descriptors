package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface ConcurrentMethodType<T> extends Child<T>
{
   @NodeInfo(xmlName = "method")
   public NamedMethodType<ConcurrentMethodType<T>> method();

   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock);

   public ConcurrentMethodType<T> setLock(String lock);

   @NodeInfo(xmlName = "lock")
   public String getLock();

   @NodeInfo(xmlName = "access-timeout")
   public AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout();
}
