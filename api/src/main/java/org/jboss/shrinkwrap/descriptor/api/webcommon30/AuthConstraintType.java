package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface AuthConstraintType<T> extends Child<T>
{
   public AuthConstraintType<T> setDescription(String description);

   public String getDescription();

   public AuthConstraintType<T> setRoleName(String roleName);

   public String getRoleName();
}
