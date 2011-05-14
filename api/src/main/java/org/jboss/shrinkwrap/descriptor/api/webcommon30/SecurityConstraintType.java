package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * SecurityConstraintType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface SecurityConstraintType<T> extends Child<T>
{
   public SecurityConstraintType<T> displayName(String displayName);

   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection();

   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();

   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint();
}