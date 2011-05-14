package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * CookieConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface CookieConfigType<T> extends Child<T>
{
   public CookieConfigType<T> name(String name);

   public CookieConfigType<T> domain(String domain);

   public CookieConfigType<T> path(String path);

   public CookieConfigType<T> comment(String comment);

   public CookieConfigType<T> httpOnly(boolean httpOnly);

   public CookieConfigType<T> secure(boolean secure);

   public CookieConfigType<T> maxAge(int maxAge);
}
