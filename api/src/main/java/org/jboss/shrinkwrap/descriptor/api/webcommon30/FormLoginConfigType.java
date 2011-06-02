package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface FormLoginConfigType<T> extends Child<T>
{
   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage);

   @NodeInfo(xmlName = "form-login-page")
   public String getFormLoginPage();

   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage);

   @NodeInfo(xmlName = "form-error-page")
   public String getFormErrorPage();
}
