package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ConcurrentMethodTypeImpl<T> implements Child<T>, ConcurrentMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private NamedMethodType<ConcurrentMethodType<T>> method;
   private String lock;
   private AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ConcurrentMethodTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("concurrent-method");   }


   public T up()
   {
      return t;
   }



   public ConcurrentMethodType<T> setMethod(NamedMethodType<ConcurrentMethodType<T>> method)
   {
      this.method = method;
      childNode.getOrCreate("method").text(method);
      return this;
   }

   public NamedMethodType<ConcurrentMethodType<T>> getMethod()
   {
      if( method == null)
      {
          method = new NamedMethodTypeImpl<ConcurrentMethodType<T>>(this, "", childNode);
      }
      return method;
   }




   public ConcurrentMethodType<T> setLock(String lock)
   {
      this.lock = lock;
      childNode.getOrCreate("lock").text(lock);
      return this;
   }

   public String getLock()
   {
      return lock;
   }



   public ConcurrentMethodType<T> setAccessTimeout(AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout)
   {
      this.accessTimeout = accessTimeout;
      childNode.getOrCreate("access-timeout").text(accessTimeout);
      return this;
   }

   public AccessTimeoutType<ConcurrentMethodType<T>> getAccessTimeout()
   {
      if( accessTimeout == null)
      {
          accessTimeout = new AccessTimeoutTypeImpl<ConcurrentMethodType<T>>(this, "", childNode);
      }
      return accessTimeout;
   }


}
