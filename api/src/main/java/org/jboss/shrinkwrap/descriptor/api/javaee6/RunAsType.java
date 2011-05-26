package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RunAsType<T> extends Child<T>
{
   public RunAsType<T> setDescription(String description);

   public String getDescription();

   public RunAsType<T> setRoleName(String roleName);

   public String getRoleName();
}
