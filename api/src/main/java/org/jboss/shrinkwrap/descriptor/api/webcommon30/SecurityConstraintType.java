package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> setDisplayName(String displayName);

   public String getDisplayName();

   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<T> webResourceCollection);

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection();

   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<T> authConstraint);

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint();

   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<T> userDataConstraint);

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint();
}
