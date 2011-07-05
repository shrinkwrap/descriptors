package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

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
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public ErrorPageTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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