package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T13:26:32.882+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{

   public SecurityConstraintType<T> setDisplayName(String displayName);

   public SecurityConstraintType<T> setDisplayName(String... values);

   public List<String> getDisplayNameList();

   public SecurityConstraintType<T> removeAllWebResourceCollection();

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection();

   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList();

   public SecurityConstraintType<T> removeAuthConstraint();

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint();

   public SecurityConstraintType<T> removeUserDataConstraint();

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint();

}
