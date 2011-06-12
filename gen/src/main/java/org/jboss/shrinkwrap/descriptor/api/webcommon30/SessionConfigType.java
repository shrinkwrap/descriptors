package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface SessionConfigType<T> extends Child<T>
{

   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public Integer getSessionTimeout();

   public SessionConfigType<T> removeCookieConfig();

   public CookieConfigType<SessionConfigType<T>> getCookieConfig();

   public SessionConfigType<T> setTrackingMode(String trackingMode);

   public String getTrackingMode();

}
