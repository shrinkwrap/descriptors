package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface SessionConfigType<T> extends Child<T>
{

   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public SessionConfigType<T> removeSessionTimeout();

   public Integer getSessionTimeout();

   public SessionConfigType<T> removeCookieConfig();

   public CookieConfigType<SessionConfigType<T>> cookieConfig();

   public SessionConfigType<T> setTrackingMode(String trackingMode);

   public SessionConfigType<T> removeTrackingMode();

   public String getTrackingMode();

}
