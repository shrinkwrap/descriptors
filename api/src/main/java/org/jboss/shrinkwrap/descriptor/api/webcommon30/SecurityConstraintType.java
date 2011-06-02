package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> setDisplayName(String displayName);

   @NodeInfo(xmlName = "display-name")
   public String getDisplayName();

   @NodeInfo(xmlName = "web-resource-collection")
   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection();

   @NodeInfo(xmlName = "auth-constraint")
   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();

   @NodeInfo(xmlName = "user-data-constraint")
   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint();
}
