package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
 */
public class CookieConfigTypeImpl<T> implements Child<T>, CookieConfigType<T>
{
   public final static String nodeName = "cookie-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public CookieConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public CookieConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }



   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setName(String name)   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public CookieConfigType<T> removeName()
   {
      childNode.remove("name");
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : domain
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setDomain(String domain)   {
      childNode.getOrCreate("domain").text(domain);
      return this;
   }

   public CookieConfigType<T> removeDomain()
   {
      childNode.remove("domain");
      return this;
   }

   public String getDomain()
   {
      return childNode.textValue("domain");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : path
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setPath(String path)   {
      childNode.getOrCreate("path").text(path);
      return this;
   }

   public CookieConfigType<T> removePath()
   {
      childNode.remove("path");
      return this;
   }

   public String getPath()
   {
      return childNode.textValue("path");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : comment
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setComment(String comment)   {
      childNode.getOrCreate("comment").text(comment);
      return this;
   }

   public CookieConfigType<T> removeComment()
   {
      childNode.remove("comment");
      return this;
   }

   public String getComment()
   {
      return childNode.textValue("comment");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : http-only
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setHttpOnly(Boolean httpOnly)   {
      childNode.getOrCreate("http-only").text(httpOnly);
      return this;
   }

   public CookieConfigType<T> removeHttpOnly()
   {
      childNode.remove("http-only");
      return this;
   }

   public Boolean isHttpOnly()
   {
      return Strings.isTrue(childNode.textValue("http-only"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : secure
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setSecure(Boolean secure)   {
      childNode.getOrCreate("secure").text(secure);
      return this;
   }

   public CookieConfigType<T> removeSecure()
   {
      childNode.remove("secure");
      return this;
   }

   public Boolean isSecure()
   {
      return Strings.isTrue(childNode.textValue("secure"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : max-age
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public CookieConfigType<T> setMaxAge(Integer maxAge)   {
      childNode.getOrCreate("max-age").text(maxAge);
      return this;
   }

   public CookieConfigType<T> removeMaxAge()
   {
      childNode.remove("max-age");
      return this;
   }

   public Integer getMaxAge()
   {
      return Integer.valueOf(childNode.textValue("max-age"));
   }

}
