package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The application-exceptionType declares an application
 * exception. The declaration consists of:
 *
 * - the exception class. When the container receives
 * an exception of this type, it is required to
 * forward this exception as an applcation exception
 * to the client regardless of whether it is a checked
 * or unchecked exception.
 * - an optional rollback element. If this element is
 * set to true, the container must rollback the current
 * transaction before forwarding the exception to the
 * client. If not specified, it defaults to false.
 *
 *
 *
 */
public class ApplicationExceptionTypeImpl<T> implements Child<T>, ApplicationExceptionType<T>
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

   public ApplicationExceptionTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ApplicationExceptionTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exception-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass)
   {
      childNode.getOrCreate("exception-class").text(exceptionClass);
      return this;
   }

   public ApplicationExceptionType<T> removeExceptionClass()
   {
      childNode.remove("exception-class");
      return this;
   }

   public String getExceptionClass()
   {
      return childNode.textValue("exception-class");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : rollback
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ApplicationExceptionType<T> setRollback(Boolean rollback)
   {
      childNode.getOrCreate("rollback").text(rollback);
      return this;
   }

   public ApplicationExceptionType<T> removeRollback()
   {
      childNode.remove("rollback");
      return this;
   }

   public Boolean isRollback()
   {
      return Strings.isTrue(childNode.textValue("rollback"));
   }

}
