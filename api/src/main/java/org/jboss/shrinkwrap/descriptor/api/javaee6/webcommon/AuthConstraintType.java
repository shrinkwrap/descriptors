package org.jboss.shrinkwrap.descriptor.api.javaee6.webcommon;

import org.jboss.shrinkwrap.descriptor.api.javaee6.Child;

public interface AuthConstraintType<T> extends Child<T>
{
   public AuthConstraintType<T> description(String description);

   public AuthConstraintType<T> roleName(String roleName);
}
