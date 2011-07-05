package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

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
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 *
 * The cookie-configType defines the configuration for the
 * session tracking cookies of this web application.
 *
 * Used in: session-config
 *
 *
 *
 */
public interface CookieConfigType<T> extends Child<T>
{

   public CookieConfigType<T> setName(String name);
   public CookieConfigType<T> removeName();

   public String getName();



   public CookieConfigType<T> setDomain(String domain);
   public CookieConfigType<T> removeDomain();

   public String getDomain();



   public CookieConfigType<T> setPath(String path);
   public CookieConfigType<T> removePath();

   public String getPath();



   public CookieConfigType<T> setComment(String comment);
   public CookieConfigType<T> removeComment();

   public String getComment();



   public CookieConfigType<T> setHttpOnly(Boolean httpOnly);
   public CookieConfigType<T> removeHttpOnly();

   public Boolean isHttpOnly();



   public CookieConfigType<T> setSecure(Boolean secure);
   public CookieConfigType<T> removeSecure();

   public Boolean isSecure();



   public CookieConfigType<T> setMaxAge(Integer maxAge);
   public CookieConfigType<T> removeMaxAge();

   public Integer getMaxAge();

}
