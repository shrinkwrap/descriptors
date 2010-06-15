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

import org.jboss.shrinkwrap.descriptor.spec.web.WebResourceCollection.HttpMethodType;

/**
 * @author Dan Allen
 */
public class WebResourceCollectionDef extends SecurityConstraintDef
{
   private WebResourceCollection webResourceCollection;
   
   public WebResourceCollectionDef(WebApp webApp, SecurityConstraint securityConstraint, WebResourceCollection webResourceCollection)
   {
      super(webApp, securityConstraint);
      this.webResourceCollection = webResourceCollection;
   }
   
   public WebResourceCollectionDef urlPatterns(String... urlPatterns)
   {
      for (String p : urlPatterns)
      {
         webResourceCollection.getUrlPatterns().add(p);
      }
      return this;
   }
   
   public WebResourceCollectionDef httpMethods(HttpMethodType... httpMethods)
   {
      return httpMethods(false, httpMethods);
   }
   
   public WebResourceCollectionDef httpMethods(boolean omissions, HttpMethodType... httpMethods)
   {
      for (HttpMethodType m : httpMethods)
      {
         if (omissions)
         {
            webResourceCollection.getHttpMethodOmissions().add(m);
         }
         else
         {
            webResourceCollection.getHttpMethods().add(m);
         }
      }
      return this;
   }
}
