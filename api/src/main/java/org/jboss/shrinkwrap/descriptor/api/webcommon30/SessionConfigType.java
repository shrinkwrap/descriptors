package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SessionConfigType<T> extends Child<T>
{
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public Integer getSessionTimeout();

   public SessionConfigType<T> setCookieConfig(CookieConfigType<T> cookieConfig);

   public CookieConfigType<SessionConfigType<T>> getCookieConfig();

   public SessionConfigType<T> setTrackingMode(String trackingMode);

   public String getTrackingMode();
}
