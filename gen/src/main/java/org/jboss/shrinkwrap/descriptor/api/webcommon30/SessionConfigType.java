package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public interface SessionConfigType<T> extends Child<T>
{

   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);
   public Integer getSessionTimeout();


   public SessionConfigType<T> setCookieConfig(CookieConfigType<SessionConfigType<T>> cookieConfig);
   public CookieConfigType<SessionConfigType<T>> getCookieConfig();



   public SessionConfigType<T> setTrackingMode(String trackingMode);
   public String getTrackingMode();
}
