package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String location;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer errorCode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String exceptionType;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ErrorPageTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ErrorPageType<T> setLocation(String location)   {
      this.location = location;
      childNode.getOrCreate("location").text(location);
      return this;
   }

   public String getLocation()
   {
      return childNode.textValue("location");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ErrorPageType<T> setErrorCode(Integer errorCode)   {
      this.errorCode = errorCode;
      childNode.getOrCreate("error-code").text(errorCode);
      return this;
   }

   public Integer getErrorCode()
   {
      return Integer.valueOf(childNode.textValue("error-code"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public ErrorPageType<T> setExceptionType(String exceptionType)   {
      this.exceptionType = exceptionType;
      childNode.getOrCreate("exception-type").text(exceptionType);
      return this;
   }

   public String getExceptionType()
   {
      return childNode.textValue("exception-type");
   }

}
