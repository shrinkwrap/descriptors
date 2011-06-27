package org.jboss.shrinkwrap.descriptor.impl.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T07:43:58.376-04:00
 *
 * Original Documentation:
 *
 *
 * The form-login-configType specifies the login and error
 * pages that should be used in form based login. If form based
 * authentication is not used, these elements are ignored.
 *
 * Used in: login-config
 *
 *
 *
 */
public class FormLoginConfigTypeImpl<T> implements Child<T>, FormLoginConfigType<T>
{
   public final static String nodeName = "form-login-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FormLoginConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public FormLoginConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : form-login-page
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage)
   {
      childNode.getOrCreate("form-login-page").text(formLoginPage);
      return this;
   }

   public FormLoginConfigType<T> removeFormLoginPage()
   {
      childNode.remove("form-login-page");
      return this;
   }

   public String getFormLoginPage()
   {
      return childNode.textValue("form-login-page");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : form-error-page
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage)
   {
      childNode.getOrCreate("form-error-page").text(formErrorPage);
      return this;
   }

   public FormLoginConfigType<T> removeFormErrorPage()
   {
      childNode.remove("form-error-page");
      return this;
   }

   public String getFormErrorPage()
   {
      return childNode.textValue("form-error-page");
   }

}
