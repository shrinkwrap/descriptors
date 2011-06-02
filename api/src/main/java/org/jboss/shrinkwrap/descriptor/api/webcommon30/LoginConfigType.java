package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface LoginConfigType<T> extends Child<T>
{
   public LoginConfigType<T> setAuthMethod(String authMethod);

   @NodeInfo(xmlName = "auth-method")
   public String getAuthMethod();

   public LoginConfigType<T> setRealmName(String realmName);

   @NodeInfo(xmlName = "realm-name")
   public String getRealmName();

   @NodeInfo(xmlName = "form-login-config")
   public FormLoginConfigType<LoginConfigType<T>> formLoginConfig();
}
