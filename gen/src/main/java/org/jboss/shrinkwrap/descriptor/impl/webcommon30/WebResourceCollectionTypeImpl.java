package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class WebResourceCollectionTypeImpl<T> implements Child<T>, WebResourceCollectionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String webResourceName;
   private String description;
   private String urlPattern;
   private String httpMethod;
   private String httpMethodOmission;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebResourceCollectionTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("web-resource-collection");   }


   public T up()
   {
      return t;
   }



   public WebResourceCollectionType<T> setWebResourceName(String webResourceName)
   {
      this.webResourceName = webResourceName;
      childNode.getOrCreate("web-resource-name").text(webResourceName);
      return this;
   }

   public String getWebResourceName()
   {
      return webResourceName;
   }



   public WebResourceCollectionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public WebResourceCollectionType<T> setUrlPattern(String urlPattern)
   {
      childNode.create("url-pattern").text(urlPattern);
      return this;
   }

   public String getUrlPattern()
   {
      return urlPattern;
   }



   public WebResourceCollectionType<T> setHttpMethod(String httpMethod)
   {
      childNode.create("http-method").text(httpMethod);
      return this;
   }

   public String getHttpMethod()
   {
      return httpMethod;
   }



   public WebResourceCollectionType<T> setHttpMethodOmission(String httpMethodOmission)
   {
      childNode.create("http-method-omission").text(httpMethodOmission);
      return this;
   }

   public String getHttpMethodOmission()
   {
      return httpMethodOmission;
   }

}