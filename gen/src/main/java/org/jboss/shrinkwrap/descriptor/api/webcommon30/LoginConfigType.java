package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface LoginConfigType<T> extends Child<T>
{

   public LoginConfigType<T> setAuthMethod(String authMethod);
   public String getAuthMethod();


   public LoginConfigType<T> setRealmName(String realmName);
   public String getRealmName();


   public LoginConfigType<T> setFormLoginConfig(FormLoginConfigType<LoginConfigType<T>> formLoginConfig);
   public FormLoginConfigType<LoginConfigType<T>> getFormLoginConfig();

}
