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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cookie-configType", propOrder = {
      "name",
      "domain",
      "path",
      "comment",
      "httpOnly",
      "secure",
      "maxAge"
})
public class CookieConfig
{
   protected String name;
   
   protected String domain;
   
   protected String path;
   
   protected String comment;
   
   @XmlElement(name = "http-only")
   protected Boolean httpOnly;
   
   protected Boolean secure;
   
   @XmlElement(name = "max-age")
   protected Integer maxAge;
   
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public String getDomain()
   {
      return domain;
   }
   public void setDomain(String domain)
   {
      this.domain = domain;
   }
   public String getPath()
   {
      return path;
   }
   public void setPath(String path)
   {
      this.path = path;
   }
   public String getComment()
   {
      return comment;
   }
   public void setComment(String comment)
   {
      this.comment = comment;
   }
   public Boolean getHttpOnly()
   {
      return httpOnly;
   }
   public void setHttpOnly(Boolean httpOnly)
   {
      this.httpOnly = httpOnly;
   }
   public Boolean getSecure()
   {
      return secure;
   }
   public void setSecure(Boolean secure)
   {
      this.secure = secure;
   }
   public Integer getMaxAge()
   {
      return maxAge;
   }
   public void setMaxAge(Integer maxAge)
   {
      this.maxAge = maxAge;
   }
}
