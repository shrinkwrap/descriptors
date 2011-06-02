package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface CookieConfigType<T> extends Child<T>
{
   public CookieConfigType<T> setName(String name);

   @NodeInfo(xmlName = "name")
   public String getName();

   public CookieConfigType<T> setDomain(String domain);

   @NodeInfo(xmlName = "domain")
   public String getDomain();

   public CookieConfigType<T> setPath(String path);

   @NodeInfo(xmlName = "path")
   public String getPath();

   public CookieConfigType<T> setComment(String comment);

   @NodeInfo(xmlName = "comment")
   public String getComment();

   public CookieConfigType<T> setHttpOnly(Boolean httpOnly);

   @NodeInfo(xmlName = "http-only")
   public Boolean getHttpOnly();

   public CookieConfigType<T> setSecure(Boolean secure);

   @NodeInfo(xmlName = "secure")
   public Boolean getSecure();

   public CookieConfigType<T> setMaxAge(Integer maxAge);

   @NodeInfo(xmlName = "max-age")
   public Integer getMaxAge();
}
