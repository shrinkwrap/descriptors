/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat Middleware LLC, and individual contributors
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
package org.jboss.shrinkwrap.descriptor.spec.web;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "session-configType", propOrder = {
      "timeout",
      "cookieConfig",
      "trackingModes"
})
public class SessionConfig
{
   @XmlEnum
   public enum TrackingModeType {
      COOKIE, URL, SSL;
      
      public String value()
      {
         return name();
      }

      public static TrackingModeType fromValue(String v)
      {
         return valueOf(v);
      }
   }
   
   @XmlElement(name = "session-timeout")
   protected Integer timeout;
   
   @XmlElement(name = "cookie-config")
   protected CookieConfig cookieConfig;
   
   @XmlElement(name = "tracking-mode")
   protected List<TrackingModeType> trackingModes;

   public Integer getTimeout()
   {
      return timeout;
   }

   public void setTimeout(Integer timeout)
   {
      this.timeout = timeout;
   }

   public CookieConfig getCookieConfig()
   {
      if (cookieConfig == null) {
         cookieConfig = new CookieConfig();
      }
      return cookieConfig;
   }

   public void setCookieConfig(CookieConfig cookieConfig)
   {
      this.cookieConfig = cookieConfig;
   }

   public List<TrackingModeType> getTrackingModes()
   {
      if (trackingModes == null) {
         trackingModes = new ArrayList<TrackingModeType>();
      }
      return trackingModes;
   }
}
