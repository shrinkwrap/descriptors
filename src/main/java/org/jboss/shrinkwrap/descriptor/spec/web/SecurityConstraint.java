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
import javax.xml.bind.annotation.XmlType;

/**
 * @author Dan Allen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "security-constraintType", propOrder = {
      "displayNames",
      "webResourceCollections",
      "authConstraint",
      "userDataConstraint"
})
public class SecurityConstraint
{
   @XmlElement(name = "display-name")
   protected List<LocalizedText> displayNames;
   
   @XmlElement(name = "web-resource-collection", required = true)
   protected List<WebResourceCollection> webResourceCollections;
   
   @XmlElement(name = "auth-constraint")
   protected AuthConstraint authConstraint;
   
   @XmlElement(name = "user-data-constraint")
   protected UserDataConstraint userDataConstraint;

   public SecurityConstraint() {}
   
   public List<LocalizedText> getDisplayNames()
   {
      if (displayNames == null)
      {
         displayNames = new ArrayList<LocalizedText>();
      }
      return displayNames;
   }
   
   public List<WebResourceCollection> getWebResourceCollections()
   {
      if (webResourceCollections == null)
      {
         webResourceCollections = new ArrayList<WebResourceCollection>();
      }
      return webResourceCollections;
   }
   
   public AuthConstraint getAuthConstraint()
   {
      return authConstraint;
   }

   public void setAuthConstraint(AuthConstraint authConstraint)
   {
      this.authConstraint = authConstraint;
   }

   public UserDataConstraint getUserDataConstraint()
   {
      return userDataConstraint;
   }

   public void setUserDataConstraint(UserDataConstraint userDataConstraint)
   {
      this.userDataConstraint = userDataConstraint;
   }
}
