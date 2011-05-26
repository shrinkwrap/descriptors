package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityRoleType<T> extends Child<T>
{
   public SecurityRoleType<T> setDescription(String description);

   public String getDescription();

   public SecurityRoleType<T> setRoleName(String roleName);

   public String getRoleName();
}
