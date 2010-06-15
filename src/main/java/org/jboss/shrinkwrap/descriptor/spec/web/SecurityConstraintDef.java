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
public class SecurityConstraintDef extends WebAppDef
{
   protected SecurityConstraint securityConstraint;
   
   public SecurityConstraintDef(WebApp webApp, SecurityConstraint securityConstraint)
   {
      super(webApp);
      this.securityConstraint = securityConstraint;
   }
   
   public WebResourceCollectionDef webResourceCollection()
   {
      WebResourceCollection webResourceCollection = new WebResourceCollection();
      securityConstraint.getWebResourceCollections().add(webResourceCollection);
      return new WebResourceCollectionDef(webApp, securityConstraint, webResourceCollection);
   }
   
   public WebResourceCollectionDef webResourceCollection(String name)
   {
      WebResourceCollection webResourceCollection = new WebResourceCollection(name);
      securityConstraint.getWebResourceCollections().add(webResourceCollection);
      return new WebResourceCollectionDef(webApp, securityConstraint, webResourceCollection);
   }
   
   // TODO maybe remove this
   public SecurityConstraintDef webResourceCollection(String name, String urlPattern, String... httpMethods)
   {
      securityConstraint.getWebResourceCollections().add(new WebResourceCollection(name, new String[] { urlPattern }, httpMethods));
      return this;
   }
   
   // TODO maybe remove this
   public SecurityConstraintDef webResourceCollection(String name, String[] urlPatterns, String... httpMethods)
   {
      securityConstraint.getWebResourceCollections().add(new WebResourceCollection(name, urlPatterns, httpMethods));
      return this;
   }
   
   public SecurityConstraintDef authConstraint(String... roleNames)
   {
      securityConstraint.setAuthConstraint(new AuthConstraint(roleNames));
      return this;
   }
   
   public SecurityConstraintDef userDataConstraint(String transportGuarantee)
   {
      securityConstraint.setUserDataConstraint(new UserDataConstraint(transportGuarantee));
      return this;
   }
}
