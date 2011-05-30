package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<T> webResourceCollection);
   public WebResourceCollectionType<T> getWebResourceCollection();

   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<T> authConstraint);
   public AuthConstraintType<T> getAuthConstraint();

   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<T> userDataConstraint);
   public UserDataConstraintType<T> getUserDataConstraint();
}
