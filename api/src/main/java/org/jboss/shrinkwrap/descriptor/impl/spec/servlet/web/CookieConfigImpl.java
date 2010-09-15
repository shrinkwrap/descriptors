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
package org.jboss.shrinkwrap.descriptor.impl.spec.servlet.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.CookieConfig;

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
public class CookieConfigImpl implements CookieConfig
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
   
   @Override
   public String getName()
   {
      return name;
   }
   @Override
   public void setName(String name)
   {
      this.name = name;
   }
   @Override
   public String getDomain()
   {
      return domain;
   }
   @Override
   public void setDomain(String domain)
   {
      this.domain = domain;
   }
   @Override
   public String getPath()
   {
      return path;
   }
   @Override
   public void setPath(String path)
   {
      this.path = path;
   }
   @Override
   public String getComment()
   {
      return comment;
   }
   @Override
   public void setComment(String comment)
   {
      this.comment = comment;
   }
   @Override
   public Boolean getHttpOnly()
   {
      return httpOnly;
   }
   @Override
   public void setHttpOnly(Boolean httpOnly)
   {
      this.httpOnly = httpOnly;
   }
   @Override
   public Boolean getSecure()
   {
      return secure;
   }
   @Override
   public void setSecure(Boolean secure)
   {
      this.secure = secure;
   }
   @Override
   public Integer getMaxAge()
   {
      return maxAge;
   }
   @Override
   public void setMaxAge(Integer maxAge)
   {
      this.maxAge = maxAge;
   }
}
