package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 *
 * The form-login-configType specifies the login and error
 * pages that should be used in form based login. If form based
 * authentication is not used, these elements are ignored.
 *
 * Used in: login-config
 *
 *
 *
 */
public interface FormLoginConfigType<T> extends Child<T>
{

   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage);

   public FormLoginConfigType<T> removeFormLoginPage();

   public String getFormLoginPage();

   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage);

   public FormLoginConfigType<T> removeFormErrorPage();

   public String getFormErrorPage();

}
