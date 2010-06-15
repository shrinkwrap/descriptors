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

/**
 * @author Dan Allen
 */
public class CookieConfigDef extends WebAppDef
{
   protected CookieConfig cookieConfig;

   public CookieConfigDef(WebApp webApp)
   {
      super(webApp);
      this.cookieConfig = webApp.getSessionConfig().getCookieConfig();
   }

   public CookieConfigDef name(String name)
   {
      cookieConfig.setName(name);
      return this;
   }

   public CookieConfigDef domain(String domain)
   {
      cookieConfig.setDomain(domain);
      return this;
   }

   public CookieConfigDef path(String path)
   {
      cookieConfig.setPath(path);
      return this;
   }

   public CookieConfigDef comment(String comment)
   {
      cookieConfig.setComment(comment);
      return this;
   }

   public CookieConfigDef httpOnly()
   {
      cookieConfig.setHttpOnly(true);
      return this;
   }

   public CookieConfigDef secure()
   {
      cookieConfig.setSecure(true);
      return this;
   }

   public CookieConfigDef maxAge(int maxAge)
   {
      cookieConfig.setMaxAge(maxAge);
      return this;
   }
}
