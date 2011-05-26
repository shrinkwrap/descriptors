package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface LoginConfigType<T> extends Child<T>
{
   public LoginConfigType<T> setAuthMethod(String authMethod);

   public String getAuthMethod();

   public LoginConfigType<T> setRealmName(String realmName);

   public String getRealmName();

   public LoginConfigType<T> setFormLoginConfig(FormLoginConfigType<T> formLoginConfig);

   public FormLoginConfigType<LoginConfigType<T>> getFormLoginConfig();
}
