package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * SessionConfigType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface SessionConfigType<T> extends Child<T>
{
   public SessionConfigType<T> sessionTimeout(int sessionTimeout);

   public CookieConfigType<SessionConfigType<T>> cookieConfig();

   public SessionConfigType<T> trackingMode(TrackingModeType trackingMode);
}
