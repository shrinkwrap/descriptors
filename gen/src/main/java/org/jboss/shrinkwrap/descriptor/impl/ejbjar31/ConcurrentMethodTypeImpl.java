package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
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
public class ConcurrentMethodTypeImpl<T> implements Child<T>, ConcurrentMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ConcurrentMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ConcurrentMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : method
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ConcurrentMethodType<T> removeMethod()
   {
      childNode.remove("method");
      return this;
   }

   public NamedMethodType<ConcurrentMethodType<T>> method()
   {
      Node node = childNode.getOrCreate("method");
      NamedMethodType<ConcurrentMethodType<T>> method = new NamedMethodTypeImpl<ConcurrentMethodType<T>>(this, "method", childNode, node);
      return method;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : lock
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ConcurrentMethodType<T> setLock(ConcurrentLockTypeType lock)
   {
      childNode.getOrCreate("lock").text(lock);
      return this;
   }
   public ConcurrentMethodType<T> setLock(String lock)
   {
      childNode.getOrCreate("lock").text(lock);
      return this;
   }

   public ConcurrentLockTypeType getLock()
   {
      return ConcurrentLockTypeType.getFromStringValue(childNode.textValue("lock"));
   }

   public String  getLockAsString()
   {
      return childNode.textValue("lock");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : access-timeout
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ConcurrentMethodType<T> removeAccessTimeout()
   {
      childNode.remove("access-timeout");
      return this;
   }

   public AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout()
   {
      Node node = childNode.getOrCreate("access-timeout");
      AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout = new AccessTimeoutTypeImpl<ConcurrentMethodType<T>>(this, "access-timeout", childNode, node);
      return accessTimeout;
   }


}
