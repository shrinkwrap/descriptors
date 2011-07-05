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
 * The login-configType is used to configure the authentication
 * method that should be used, the realm name that should be
 * used for this application, and the attributes that are
 * needed by the form login mechanism.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface LoginConfigType<T> extends Child<T>
{

   public LoginConfigType<T> setAuthMethod(String authMethod);
   public LoginConfigType<T> removeAuthMethod();

   public String getAuthMethod();



   public LoginConfigType<T> setRealmName(String realmName);
   public LoginConfigType<T> removeRealmName();

   public String getRealmName();



   public LoginConfigType<T> removeFormLoginConfig();

   public FormLoginConfigType<LoginConfigType<T>> formLoginConfig();


}
