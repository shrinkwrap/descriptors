package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
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
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.*;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.*;
import org.jboss.shrinkwrap.descriptor.impl.application6.*;
import org.jboss.shrinkwrap.descriptor.impl.webapp30.*;
import org.jboss.shrinkwrap.descriptor.impl.persistence20.*;
import org.jboss.shrinkwrap.descriptor.impl.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.*;

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
public class LoginConfigTypeImpl<T> implements Child<T>, LoginConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public LoginConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public LoginConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
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
   public LoginConfigType<T> setAuthMethod(String authMethod)
   {
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
   public LoginConfigType<T> setRealmName(String realmName)
   {
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
      Node node = childNode.getOrCreate("form-login-config");
      FormLoginConfigType<LoginConfigType<T>> formLoginConfig = new FormLoginConfigTypeImpl<LoginConfigType<T>>(this, "form-login-config", childNode, node);
      return formLoginConfig;
   }


}
