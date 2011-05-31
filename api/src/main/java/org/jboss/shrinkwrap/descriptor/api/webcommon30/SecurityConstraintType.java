package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection);
   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection();

   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<SecurityConstraintType<T>> authConstraint);
   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint();

   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint);
   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint();
}
