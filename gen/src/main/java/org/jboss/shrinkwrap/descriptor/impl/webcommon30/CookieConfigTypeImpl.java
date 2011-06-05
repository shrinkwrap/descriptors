package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class CookieConfigTypeImpl<T> implements Child<T>, CookieConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String name;
   private String domain;
   private String path;
   private String comment;
   private Boolean httpOnly;
   private Boolean secure;
   private Integer maxAge;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public CookieConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("cookie-config");   }


   public T up()
   {
      return t;
   }



   public CookieConfigType<T> setName(String name)
   {
      this.name = name;
      childNode.getOrCreate("name").text(name);
      return this;
   }

   public String getName()
   {
      return name;
   }



   public CookieConfigType<T> setDomain(String domain)
   {
      this.domain = domain;
      childNode.getOrCreate("domain").text(domain);
      return this;
   }

   public String getDomain()
   {
      return domain;
   }



   public CookieConfigType<T> setPath(String path)
   {
      this.path = path;
      childNode.getOrCreate("path").text(path);
      return this;
   }

   public String getPath()
   {
      return path;
   }



   public CookieConfigType<T> setComment(String comment)
   {
      this.comment = comment;
      childNode.getOrCreate("comment").text(comment);
      return this;
   }

   public String getComment()
   {
      return comment;
   }



   public CookieConfigType<T> setHttpOnly(Boolean httpOnly)
   {
      this.httpOnly = httpOnly;
      childNode.getOrCreate("http-only").text(httpOnly);
      return this;
   }

   public Boolean getHttpOnly()
   {
      return httpOnly;
   }



   public CookieConfigType<T> setSecure(Boolean secure)
   {
      this.secure = secure;
      childNode.getOrCreate("secure").text(secure);
      return this;
   }

   public Boolean getSecure()
   {
      return secure;
   }



   public CookieConfigType<T> setMaxAge(Integer maxAge)
   {
      this.maxAge = maxAge;
      childNode.getOrCreate("max-age").text(maxAge);
      return this;
   }

   public Integer getMaxAge()
   {
      return maxAge;
   }

}
