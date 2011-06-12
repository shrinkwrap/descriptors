package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
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
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String name;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String domain;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String path;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String comment;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean httpOnly;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Boolean secure;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer maxAge;

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


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setName(String name)   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return childNode.textValue("name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setDomain(String domain)   {
      this.domain = domain;
      childNode.getOrCreate("domain").text(domain);
      return this;
   }

   public String getDomain()
   {
      return childNode.textValue("domain");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setPath(String path)   {
      this.path = path;
      childNode.getOrCreate("path").text(path);
      return this;
   }

   public String getPath()
   {
      return childNode.textValue("path");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setComment(String comment)   {
      this.comment = comment;
      childNode.getOrCreate("comment").text(comment);
      return this;
   }

   public String getComment()
   {
      return childNode.textValue("comment");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setHttpOnly(Boolean httpOnly)   {
      this.httpOnly = httpOnly;
      childNode.getOrCreate("http-only").text(httpOnly);
      return this;
   }

   public Boolean getHttpOnly()
   {
      return Strings.isTrue(childNode.textValue("http-only"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setSecure(Boolean secure)   {
      this.secure = secure;
      childNode.getOrCreate("secure").text(secure);
      return this;
   }

   public Boolean getSecure()
   {
      return Strings.isTrue(childNode.textValue("secure"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public CookieConfigType<T> setMaxAge(Integer maxAge)   {
      this.maxAge = maxAge;
      childNode.getOrCreate("max-age").text(maxAge);
      return this;
   }

   public Integer getMaxAge()
   {
      return Integer.valueOf(childNode.textValue("max-age"));
   }

}
