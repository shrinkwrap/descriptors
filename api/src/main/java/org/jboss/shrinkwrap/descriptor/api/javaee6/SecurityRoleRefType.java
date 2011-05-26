package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityRoleRefType<T> extends Child<T>
{
   public SecurityRoleRefType<T> setDescription(String description);

   public String getDescription();

   public SecurityRoleRefType<T> setRoleName(String roleName);

   public String getRoleName();

   public SecurityRoleRefType<T> setRoleLink(String roleLink);

   public String getRoleLink();
}
