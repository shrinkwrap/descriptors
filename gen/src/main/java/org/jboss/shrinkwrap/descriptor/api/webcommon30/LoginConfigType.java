package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface LoginConfigType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public LoginConfigType<T> setAuthMethod(String authMethod);

   public String getAuthMethod();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public LoginConfigType<T> setRealmName(String realmName);

   public String getRealmName();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public LoginConfigType<T> setFormLoginConfig(FormLoginConfigType<LoginConfigType<T>> formLoginConfig);

   public FormLoginConfigType<LoginConfigType<T>> getFormLoginConfig();


}
