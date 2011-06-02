package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface MethodPermissionType<T> extends Child<T>
{
   public MethodPermissionType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   @NodeInfo(xmlName = "method")
   public MethodType<MethodPermissionType<T>> method();

   public MethodPermissionType<T> setRoleName(String roleName);

   @NodeInfo(xmlName = "role-name")
   public String getRoleName();

   @NodeInfo(xmlName = "unchecked")
   public MethodPermissionType<T> unchecked();
}
