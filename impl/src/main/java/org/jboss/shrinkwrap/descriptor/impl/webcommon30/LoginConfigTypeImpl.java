package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-15T01:04:55.579+02:00
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



   // -------------------------------------------------------------------------------------||
   // Element type : auth-method
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LoginConfigType<T> setAuthMethod(String authMethod)   {
      childNode.getOrCreate("auth-method").text(authMethod);
      return this;
   }

   public LoginConfigType<T> removeAuthMethod()
   {
      childNode.remove("auth-method");
      return this;
   }

   public String getAuthMethod()
   {
      return childNode.textValue("auth-method");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : realm-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LoginConfigType<T> setRealmName(String realmName)   {
      childNode.getOrCreate("realm-name").text(realmName);
      return this;
   }

   public LoginConfigType<T> removeRealmName()
   {
      childNode.remove("realm-name");
      return this;
   }

   public String getRealmName()
   {
      return childNode.textValue("realm-name");
   }



   // -------------------------------------------------------------------------------------||
   // Element type : form-login-config
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public LoginConfigType<T> removeFormLoginConfig()
   {
      childNode.remove("form-login-config");
      return this;
   }

   public FormLoginConfigType<LoginConfigType<T>> formLoginConfig()
   {
      Node node = childNode.getOrCreate(FormLoginConfigTypeImpl.nodeName);
      FormLoginConfigType<LoginConfigType<T>> formLoginConfig = new FormLoginConfigTypeImpl<LoginConfigType<T>>(this, "", childNode, node);
      return formLoginConfig;
   }


}
