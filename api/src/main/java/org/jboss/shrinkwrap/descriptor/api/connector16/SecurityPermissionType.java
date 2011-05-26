package org.jboss.shrinkwrap.descriptor.api.connector16;

import org.jboss.shrinkwrap.descriptor.api.Child;

public interface SecurityPermissionType<T> extends Child<T>
{
   public SecurityPermissionType<T> setDescription(String description);

   public String getDescription();

   public SecurityPermissionType<T> setSecurityPermissionSpec(String securityPermissionSpec);

   public String getSecurityPermissionSpec();
}
