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
@XmlType(name = "login-configType", propOrder = {
      "authMethod",
      "realmName",
      "formLoginConfig"
})
public class LoginConfig
{
   // FIXME make this an enum: FORM, BASIC, DIGEST, CLIENT-CERT
   @XmlElement(name = "auth-method")
   protected String authMethod;
   
   @XmlElement(name = "realm-name")
   protected String realmName;
   
   @XmlElement(name = "form-login-config")
   protected FormLoginConfig formLoginConfig;

   public LoginConfig() {}
   
   public LoginConfig(String authMethod, String realmName)
   {
      this.authMethod = authMethod;
      this.realmName = realmName;
   }
   
   public LoginConfig(String authMethod, FormLoginConfig formLoginConfig)
   {
      this.authMethod = authMethod;
      this.formLoginConfig = formLoginConfig;
   }
   
   public String getAuthMethod()
   {
      return authMethod;
   }

   public void setAuthMethod(String authMethod)
   {
      this.authMethod = authMethod;
   }

   public String getRealmName()
   {
      return realmName;
   }

   public void setRealmName(String realmName)
   {
      this.realmName = realmName;
   }

   public FormLoginConfig getFormLoginConfig()
   {
      return formLoginConfig;
   }

   public void setFormLoginConfig(FormLoginConfig formLoginConfig)
   {
      this.formLoginConfig = formLoginConfig;
   }
}
