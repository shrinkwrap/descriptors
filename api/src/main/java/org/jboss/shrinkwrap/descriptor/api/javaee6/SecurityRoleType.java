package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityRoleType<T> extends Child<T>
{
   public SecurityRoleType<T> description(String description);
   public SecurityRoleType<T> roleName(String roleName);
}
