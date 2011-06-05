package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class ErrorPageTypeImpl<T> implements Child<T>, ErrorPageType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String location;
   private Integer errorCode;
   private String exceptionType;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("error-page");   }


   public T up()
   {
      return t;
   }



   public ErrorPageType<T> setLocation(String location)
   {
      this.location = location;
      childNode.getOrCreate("location").text(location);
      return this;
   }

   public String getLocation()
   {
      return location;
   }



   public ErrorPageType<T> setErrorCode(Integer errorCode)
   {
      this.errorCode = errorCode;
      childNode.getOrCreate("error-code").text(errorCode);
      return this;
   }

   public Integer getErrorCode()
   {
      return errorCode;
   }



   public ErrorPageType<T> setExceptionType(String exceptionType)
   {
      this.exceptionType = exceptionType;
      childNode.getOrCreate("exception-type").text(exceptionType);
      return this;
   }

   public String getExceptionType()
   {
      return exceptionType;
   }

}
