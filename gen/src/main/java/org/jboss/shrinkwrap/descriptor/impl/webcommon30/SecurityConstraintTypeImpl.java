package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class SecurityConstraintTypeImpl<T> implements Child<T>, SecurityConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String displayName;
   private WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection;
   private AuthConstraintType<SecurityConstraintType<T>> authConstraint;
   private UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public SecurityConstraintTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("security-constraint");   }


   public T up()
   {
      return t;
   }



   public SecurityConstraintType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }



   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection)
   {
      childNode.create("web-resource-collection").text(webResourceCollection);
      return this;
   }

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection()
   {
      if( webResourceCollection == null)
      {
          webResourceCollection = new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
      }
      return webResourceCollection;
   }




   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<SecurityConstraintType<T>> authConstraint)
   {
      this.authConstraint = authConstraint;
      childNode.getOrCreate("auth-constraint").text(authConstraint);
      return this;
   }

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint()
   {
      if( authConstraint == null)
      {
          authConstraint = new AuthConstraintTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
      }
      return authConstraint;
   }




   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint)
   {
      this.userDataConstraint = userDataConstraint;
      childNode.getOrCreate("user-data-constraint").text(userDataConstraint);
      return this;
   }

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint()
   {
      if( userDataConstraint == null)
      {
          userDataConstraint = new UserDataConstraintTypeImpl<SecurityConstraintType<T>>(this, "", childNode);
      }
      return userDataConstraint;
   }


}
