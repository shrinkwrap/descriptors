package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
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



   // -------------------------------------------------------------------------------------||
   // Element type : session-timeout
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout)   {
      childNode.getOrCreate("session-timeout").text(sessionTimeout);
      return this;
   }

   public SessionConfigType<T> removeSessionTimeout()
   {
      childNode.remove("session-timeout");
      return this;
   }

   public Integer getSessionTimeout()
   {
      return Integer.valueOf(childNode.textValue("session-timeout"));
   }



   // -------------------------------------------------------------------------------------||
   // Element type : cookie-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionConfigType<T> removeCookieConfig()
   {
      childNode.remove("cookie-config");
      return this;
   }

   public CookieConfigType<SessionConfigType<T>> cookieConfig()
   {
      Node node = childNode.getOrCreate(CookieConfigTypeImpl.nodeName);
      CookieConfigType<SessionConfigType<T>> cookieConfig = new CookieConfigTypeImpl<SessionConfigType<T>>(this, "", childNode, node);
      return cookieConfig;
   }




   // -------------------------------------------------------------------------------------||
   // Element type : tracking-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public SessionConfigType<T> setTrackingMode(String trackingMode)   {
      childNode.getOrCreate("tracking-mode").text(trackingMode);
      return this;
   }

   public SessionConfigType<T> removeTrackingMode()
   {
      childNode.remove("tracking-mode");
      return this;
   }

   public String getTrackingMode()
   {
      return childNode.textValue("tracking-mode");
   }

}
