package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface RunAsType<T> extends Child<T>
{
   public RunAsType<T> description(String description);

   public RunAsType<T> roleName(String roleName);
}
