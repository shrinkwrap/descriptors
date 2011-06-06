package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class SessionConfigTypeImpl<T> implements Child<T>, SessionConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private Integer sessionTimeout;
   private CookieConfigType<SessionConfigType<T>> cookieConfig;
   private String trackingMode;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SessionConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("session-config");   }


   public T up()
   {
      return t;
   }



   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout)
   {
      this.sessionTimeout = sessionTimeout;
      childNode.getOrCreate("session-timeout").text(sessionTimeout);
      return this;
   }

   public Integer getSessionTimeout()
   {
      return sessionTimeout;
   }



   public SessionConfigType<T> setCookieConfig(CookieConfigType<SessionConfigType<T>> cookieConfig)
   {
      this.cookieConfig = cookieConfig;
      childNode.getOrCreate("cookie-config").text(cookieConfig);
      return this;
   }

   public CookieConfigType<SessionConfigType<T>> getCookieConfig()
   {
      if( cookieConfig == null)
      {
          cookieConfig = new CookieConfigTypeImpl<SessionConfigType<T>>(this, "", childNode);
      }
      return cookieConfig;
   }




   public SessionConfigType<T> setTrackingMode(String trackingMode)
   {
      this.trackingMode = trackingMode;
      childNode.getOrCreate("tracking-mode").text(trackingMode);
      return this;
   }

   public String getTrackingMode()
   {
      return trackingMode;
   }

}
