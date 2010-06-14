package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
