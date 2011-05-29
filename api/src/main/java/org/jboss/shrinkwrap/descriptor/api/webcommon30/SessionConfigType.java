package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface SessionConfigType<T> extends Child<T>
{
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public Integer getSessionTimeout();

   public CookieConfigType<SessionConfigType<T>> setCookieConfig(CookieConfigType<T> cookieConfig);

   public CookieConfigType<SessionConfigType<T>> getCookieConfig();

   public SessionConfigType<T> setTrackingMode(TrackingModeType trackingMode);

   public TrackingModeType getTrackingMode();
}
