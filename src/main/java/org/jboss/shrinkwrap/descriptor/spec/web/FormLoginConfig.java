package org.jboss.shrinkwrap.descriptor.spec.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "form-login-configType", propOrder = {
      "loginPage",
      "errorPage"
})
public class FormLoginConfig
{
   @XmlElement(name = "form-login-page", required = true)
   protected String loginPage;
   
   @XmlElement(name = "form-error-page", required = true)
   protected String errorPage;

   public FormLoginConfig() {}
   
   public FormLoginConfig(String loginPage, String errorPage)
   {
      this.loginPage = loginPage;
      this.errorPage = errorPage;
   }

   public String getLoginPage()
   {
      return loginPage;
   }

   public void setLoginPage(String loginPage)
   {
      this.loginPage = loginPage;
   }

   public String getErrorPage()
   {
      return errorPage;
   }

   public void setErrorPage(String errorPage)
   {
      this.errorPage = errorPage;
   }
}
