package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * AuthConstraintType
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @version $Revision: $
 */
public interface AuthConstraintType<T> extends Child<T>
{
   public AuthConstraintType<T> description(String description);

   public AuthConstraintType<T> roleName(String roleName);
}
