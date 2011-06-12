package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface SessionConfigType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public Integer getSessionTimeout();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SessionConfigType<T> setCookieConfig(CookieConfigType<SessionConfigType<T>> cookieConfig);

   public CookieConfigType<SessionConfigType<T>> getCookieConfig();



   // maxOccurs = -3   // isGeneric = true   // isAttribute = false

// otherwise;
   public SessionConfigType<T> setTrackingMode(String trackingMode);

   public String getTrackingMode();

}
