package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public class LoginConfigTypeImpl<T> implements Child<T>, LoginConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String authMethod;
   private String realmName;
   private FormLoginConfigType<LoginConfigType<T>> formLoginConfig;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LoginConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("login-config");   }


   public T up()
   {
      return t;
   }



   public LoginConfigType<T> setAuthMethod(String authMethod)
   {
      this.authMethod = authMethod;
      childNode.getOrCreate("auth-method").text(authMethod);
      return this;
   }

   public String getAuthMethod()
   {
      return authMethod;
   }



   public LoginConfigType<T> setRealmName(String realmName)
   {
      this.realmName = realmName;
      childNode.getOrCreate("realm-name").text(realmName);
      return this;
   }

   public String getRealmName()
   {
      return realmName;
   }



   public LoginConfigType<T> setFormLoginConfig(FormLoginConfigType<LoginConfigType<T>> formLoginConfig)
   {
      this.formLoginConfig = formLoginConfig;
      childNode.getOrCreate("form-login-config").text(formLoginConfig);
      return this;
   }

   public FormLoginConfigType<LoginConfigType<T>> getFormLoginConfig()
   {
      if( formLoginConfig == null)
      {
          formLoginConfig = new FormLoginConfigTypeImpl<LoginConfigType<T>>(this, "", childNode);
      }
      return formLoginConfig;
   }


}
