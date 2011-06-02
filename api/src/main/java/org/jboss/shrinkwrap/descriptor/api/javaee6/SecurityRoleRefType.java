package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface SecurityRoleRefType<T> extends Child<T>
{
   public SecurityRoleRefType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public SecurityRoleRefType<T> setRoleName(String roleName);

   @NodeInfo(xmlName = "role-name")
   public String getRoleName();

   public SecurityRoleRefType<T> setRoleLink(String roleLink);

   @NodeInfo(xmlName = "role-link")
   public String getRoleLink();
}
