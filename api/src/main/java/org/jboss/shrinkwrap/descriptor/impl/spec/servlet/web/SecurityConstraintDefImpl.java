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

import org.jboss.shrinkwrap.descriptor.api.Node;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.HttpMethodType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.SecurityConstraintDef;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.TransportGuaranteeType;
import org.jboss.shrinkwrap.descriptor.api.spec.servlet.web.WebResourceCollectionDef;

/**
 * @author Dan Allen
 */
public class SecurityConstraintDefImpl extends WebAppDescriptorImpl implements SecurityConstraintDef
{
   protected Node securityConstraint;
   
   public SecurityConstraintDefImpl(String descriptorName, Node webApp, Node securityConstraint)
   {
      super(descriptorName, webApp);
      this.securityConstraint = securityConstraint;
   }
   
   @Override
   public WebResourceCollectionDef webResourceCollection()
   {
      return webResourceCollection(null); // TODO: hmm.. name is required. make one up?
   }
   
   @Override
   public WebResourceCollectionDef webResourceCollection(String name)
   {
      Node resource = securityConstraint.create("web-resource-collection");
      if(name != null)
      {
         resource.create("web-resource-name").text(name);
      }
      
      return new WebResourceCollectionDefImpl(getDisplayName(), getRootNode(), securityConstraint, resource);
   }
   
   // TODO maybe remove this
   @Override
   public SecurityConstraintDef webResourceCollection(String name, String urlPattern, HttpMethodType... httpMethods)
   {
      webResourceCollection(name).urlPatterns(urlPattern).httpMethods(httpMethods);
      return this;
   }
   
   // TODO maybe remove this
   @Override
   public SecurityConstraintDef webResourceCollection(String name, String[] urlPatterns, HttpMethodType... httpMethods)
   {
      webResourceCollection(name).urlPatterns(urlPatterns).httpMethods(httpMethods);
      return this;
   }
   
   @Override
   public SecurityConstraintDef authConstraint(String... roleNames)
   {
      for(String name : roleNames)
      {
         securityConstraint.getOrCreate("auth-constraint").create("role-name").text(name);   
      }
      return this;
   }
   
   @Override
   public SecurityConstraintDef userDataConstraint(TransportGuaranteeType transportGuarantee)
   {
      securityConstraint.getOrCreate("user-data-constraint").getOrCreate("transport-guarantee").text(transportGuarantee);
      return this;
   }
}
