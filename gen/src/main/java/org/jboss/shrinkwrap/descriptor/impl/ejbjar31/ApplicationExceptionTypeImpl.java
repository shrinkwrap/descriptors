package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class ApplicationExceptionTypeImpl<T> implements Child<T>, ApplicationExceptionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String exceptionClass;
   private Boolean rollback;
   private Boolean inherited;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ApplicationExceptionTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("application-exception");   }


   public T up()
   {
      return t;
   }



   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass)
   {
      this.exceptionClass = exceptionClass;
      childNode.getOrCreate("exception-class").text(exceptionClass);
      return this;
   }

   public String getExceptionClass()
   {
      return exceptionClass;
   }



   public ApplicationExceptionType<T> setRollback(Boolean rollback)
   {
      this.rollback = rollback;
      childNode.getOrCreate("rollback").text(rollback);
      return this;
   }

   public Boolean getRollback()
   {
      return rollback;
   }



   public ApplicationExceptionType<T> setInherited(Boolean inherited)
   {
      this.inherited = inherited;
      childNode.getOrCreate("inherited").text(inherited);
      return this;
   }

   public Boolean getInherited()
   {
      return inherited;
   }

}
