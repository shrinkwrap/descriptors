package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T22:37:30.243+02:00
 */
public class FormLoginConfigTypeImpl<T> implements Child<T>, FormLoginConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String formLoginPage;
   private String formErrorPage;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FormLoginConfigTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("form-login-config");   }


   public T up()
   {
      return t;
   }



   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage)
   {
      this.formLoginPage = formLoginPage;
      childNode.getOrCreate("form-login-page").text(formLoginPage);
      return this;
   }

   public String getFormLoginPage()
   {
      return formLoginPage;
   }



   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage)
   {
      this.formErrorPage = formErrorPage;
      childNode.getOrCreate("form-error-page").text(formErrorPage);
      return this;
   }

   public String getFormErrorPage()
   {
      return formErrorPage;
   }

}
