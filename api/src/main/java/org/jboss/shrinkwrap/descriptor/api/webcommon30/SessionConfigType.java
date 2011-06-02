package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface SessionConfigType<T> extends Child<T>
{
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   @NodeInfo(xmlName = "session-timeout")
   public Integer getSessionTimeout();

   @NodeInfo(xmlName = "cookie-config")
   public CookieConfigType<SessionConfigType<T>> cookieConfig();

   public SessionConfigType<T> setTrackingMode(TrackingModeType trackingMode);

   public SessionConfigType<T> setTrackingMode(String trackingMode);

   @NodeInfo(xmlName = "tracking-mode")
   public String getTrackingMode();
}
