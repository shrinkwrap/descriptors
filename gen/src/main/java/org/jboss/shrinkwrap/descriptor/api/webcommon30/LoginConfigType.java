package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
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
