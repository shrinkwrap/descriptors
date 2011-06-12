package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class SessionConfigTypeImpl<T> implements Child<T>, SessionConfigType<T>
{
   public final static String nodeName = "session-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private Integer sessionTimeout;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private CookieConfigType<SessionConfigType<T>> cookieConfig;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String trackingMode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SessionConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public SessionConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout)   {
      this.sessionTimeout = sessionTimeout;
      childNode.getOrCreate("session-timeout").text(sessionTimeout);
      return this;
   }

   public Integer getSessionTimeout()
   {
      return Integer.valueOf(childNode.textValue("session-timeout"));
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public SessionConfigType<T> setCookieConfig(CookieConfigType<SessionConfigType<T>> cookieConfig)   {
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



   // maxOccurs = -3   // isGeneric = true   // isAttribute = false

   public SessionConfigType<T> setTrackingMode(String trackingMode)   {
      this.trackingMode = trackingMode;
      childNode.getOrCreate("tracking-mode").text(trackingMode);
      return this;
   }

   public String getTrackingMode()
   {
      return childNode.textValue("tracking-mode");
   }

}
