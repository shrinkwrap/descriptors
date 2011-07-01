package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
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
   public String  getLockAsString();



   public ConcurrentMethodType<T> removeAccessTimeout();

   public AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout();


}
