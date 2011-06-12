package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class LoginConfigTypeImpl<T> implements Child<T>, LoginConfigType<T>
{
   public final static String nodeName = "login-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String authMethod;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String realmName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private FormLoginConfigType<LoginConfigType<T>> formLoginConfig;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LoginConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LoginConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public LoginConfigType<T> setAuthMethod(String authMethod)   {
      this.authMethod = authMethod;
      childNode.getOrCreate("auth-method").text(authMethod);
      return this;
   }

   public String getAuthMethod()
   {
      return childNode.textValue("auth-method");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public LoginConfigType<T> setRealmName(String realmName)   {
      this.realmName = realmName;
      childNode.getOrCreate("realm-name").text(realmName);
      return this;
   }

   public String getRealmName()
   {
      return childNode.textValue("realm-name");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public LoginConfigType<T> setFormLoginConfig(FormLoginConfigType<LoginConfigType<T>> formLoginConfig)   {
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
