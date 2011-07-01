package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
/**
 * This class is a generated class.
 * Generation date :2011-07-01T17:26:07.336-04:00
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
   public SecurityConstraintType<T> setDisplayNameList(String ... values);
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
