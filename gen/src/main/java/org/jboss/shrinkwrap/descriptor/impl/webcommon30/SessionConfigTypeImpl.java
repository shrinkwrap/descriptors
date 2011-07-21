/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.TrackingModeType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> session-configType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The session-configType defines the session parameters <br> 
 * for this web application. <br> 
 *<br>
 * Used in: web-app <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public class SessionConfigTypeImpl<T> implements Child<T>, SessionConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SessionConfigTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public SessionConfigTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
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

   /**
    * If not already created, a new <code>session-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>session-timeout</code> element will be updated with the given value.
    * @return the current instance of {@link SessionConfigType<T>} 
    */
   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout)
   {
      childNode.getOrCreate("session-timeout").text(sessionTimeout);
      return this;
   }

   /**
    * Removes the <code>session-timeout</code> element 
    * @return the current instance of {@link SessionConfigType<T>} 
    */
   public SessionConfigType<T> removeSessionTimeout()
   {
      childNode.remove("session-timeout");
      return this;
   }

   /**
    * Returns the <code>session-timeout</code> element
    * @return the node defined for the element <code>session-timeout</code> 
    */
   public Integer getSessionTimeout()
   {
      if (childNode.textValue("session-timeout") != null && !childNode.textValue("session-timeout").equals("null"))
      {
         return Integer.valueOf(childNode.textValue("session-timeout"));
      }
      return null;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : cookie-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes the <code>cookie-config</code> element 
    * @return the current instance of {@link SessionConfigType<T>} 
    */
   public SessionConfigType<T> removeCookieConfig()
   {
      childNode.remove("cookie-config");
      return this;
   }

   /**
    * If not already created, a new <code>cookie-config</code> element will be created and returned.
    * Otherwise, the existing <code>cookie-config</code> element will be returned.
    * @return the node defined for the element <code>cookie-config</code> 
    */
   public CookieConfigType<SessionConfigType<T>> cookieConfig()
   {
      Node node = childNode.getOrCreate("cookie-config");
      CookieConfigType<SessionConfigType<T>> cookieConfig = new CookieConfigTypeImpl<SessionConfigType<T>>(this,
            "cookie-config", childNode, node);
      return cookieConfig;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : tracking-mode
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tracking-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>tracking-mode</code> element will be updated with the given value.
    * @return the current instance of {@link SessionConfigType<T>} 
    */
   public SessionConfigType<T> setTrackingMode(TrackingModeType trackingMode)
   {
      childNode.getOrCreate("tracking-mode").text(trackingMode);
      return this;
   }

   /**
    * If not already created, a new <code>tracking-mode</code> element with the given value will be created.
    * Otherwise, the existing <code>tracking-mode</code> element will be updated with the given value.
    * @return the current instance of {@link SessionConfigType<T>} 
    */
   public SessionConfigType<T> setTrackingMode(String trackingMode)
   {
      childNode.getOrCreate("tracking-mode").text(trackingMode);
      return this;
   }

   /**
    * Returns the <code>tracking-mode</code> element
    * @return the node defined for the element <code>tracking-mode</code> 
    */
   public TrackingModeType getTrackingMode()
   {
      return TrackingModeType.getFromStringValue(childNode.textValue("tracking-mode"));
   }

   /**
    * Returns the <code>tracking-mode</code> element
    * @return the node defined for the element <code>tracking-mode</code> 
    */
   public String getTrackingModeAsString()
   {
      return childNode.textValue("tracking-mode");
   }

}
