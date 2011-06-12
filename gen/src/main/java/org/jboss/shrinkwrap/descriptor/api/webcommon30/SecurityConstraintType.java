package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{
   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public SecurityConstraintType<T> setDisplayName(String displayName);
   public SecurityConstraintType<T> setDisplayName(String ... values);

   public List<String> getDisplayNameList();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

// vIsComplexType=true() and contains($vMaxOccurs, 'unbounded';
   public SecurityConstraintType<T> setWebResourceCollection(WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection);

   public WebResourceCollectionType<SecurityConstraintType<T>> getWebResourceCollection();
   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList();



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SecurityConstraintType<T> setAuthConstraint(AuthConstraintType<SecurityConstraintType<T>> authConstraint);

   public AuthConstraintType<SecurityConstraintType<T>> getAuthConstraint();



   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public SecurityConstraintType<T> setUserDataConstraint(UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint);

   public UserDataConstraintType<SecurityConstraintType<T>> getUserDataConstraint();


}
