package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T07:43:58.376-04:00
 *
 * Original Documentation:
 *
 *
 * The security-constraintType is used to associate
 * security constraints with one or more web resource
 * collections
 *
 * Used in: web-app
 *
 *
 *
 */
public interface SecurityConstraintType<T> extends Child<T>
{

   public SecurityConstraintType<T> setDisplayName(String displayName);

   public SecurityConstraintType<T> setDisplayNameList(String... values);

   public SecurityConstraintType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public SecurityConstraintType<T> removeAllWebResourceCollection();

   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection();

   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList();

   public SecurityConstraintType<T> removeAuthConstraint();

   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();

   public SecurityConstraintType<T> removeUserDataConstraint();

   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint();

}
