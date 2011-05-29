package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> setDisplayName(String displayName);

   public String getDisplayName();

   public WebResourceCollectionType<SecurityConstraintType<T>> setWebResourceCollection(
         WebResourceCollectionType<T> webResourceCollection);

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection();

   public AuthConstraintType<SecurityConstraintType<T>> setAuthConstraint(AuthConstraintType<T> authConstraint);

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint();

   public UserDataConstraintType<SecurityConstraintType<T>> setUserDataConstraint(
         UserDataConstraintType<T> userDataConstraint);

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint();
}
