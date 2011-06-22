package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * The error-pageType contains a mapping between an error code
 * or exception type to the path of a resource in the web
 * application.
 *
 * Error-page declarations using the exception-type element in
 * the deployment descriptor must be unique up to the class name of
 * the exception-type. Similarly, error-page declarations using the
 * status-code element must be unique in the deployment descriptor
 * up to the status code.
 *
 * Used in: web-app
 *
 *
 *
 */
public class ErrorPageTypeImpl<T> implements Child<T>, ErrorPageType<T>
{
   public final static String nodeName = "error-page";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ErrorPageTypeImpl(T t, String descriptorName, Node node, Node childNode)
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
   // Element type : location
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ErrorPageType<T> setLocation(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }

   public ErrorPageType<T> removeLocation()
   {
      childNode.remove("location");
      return this;
   }

   public String getLocation()
   {
      return childNode.textValue("location");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : error-code
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ErrorPageType<T> setErrorCode(Integer errorCode)
   {
      childNode.getOrCreate("error-code").text(errorCode);
      return this;
   }

   public ErrorPageType<T> removeErrorCode()
   {
      childNode.remove("error-code");
      return this;
   }

   public Integer getErrorCode()
   {
      return Integer.valueOf(childNode.textValue("error-code"));
   }

   // -------------------------------------------------------------------------------------||
   // Element type : exception-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public ErrorPageType<T> setExceptionType(String exceptionType)
   {
      childNode.getOrCreate("exception-type").text(exceptionType);
      return this;
   }

   public ErrorPageType<T> removeExceptionType()
   {
      childNode.remove("exception-type");
      return this;
   }

   public String getExceptionType()
   {
      return childNode.textValue("exception-type");
   }

}
