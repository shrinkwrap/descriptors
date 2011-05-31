package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T07:08:31.33+02:00
 */
public interface CookieConfigType<T> extends Child<T>
{
   public CookieConfigType<T> setName(String name);
   public String getName();

   public CookieConfigType<T> setDomain(String domain);
   public String getDomain();

   public CookieConfigType<T> setPath(String path);
   public String getPath();

   public CookieConfigType<T> setComment(String comment);
   public String getComment();

   public CookieConfigType<T> setHttpOnly(Boolean httpOnly);
   public Boolean getHttpOnly();

   public CookieConfigType<T> setSecure(Boolean secure);
   public Boolean getSecure();

   public CookieConfigType<T> setMaxAge(Integer maxAge);
   public Integer getMaxAge();
}
