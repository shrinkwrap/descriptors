package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface MethodPermissionType<T> extends Child<T>
{
   public MethodPermissionType<T> setDescription(String description);

   public String getDescription();

   public MethodPermissionType<T> setMethod(MethodType<T> method);

   public MethodType<MethodPermissionType<T>> getMethod();
}
