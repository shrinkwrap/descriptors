package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
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
