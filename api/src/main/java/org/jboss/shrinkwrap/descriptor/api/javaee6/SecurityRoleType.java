package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface SecurityRoleType<T> extends Child<T>
{
   public SecurityRoleType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public SecurityRoleType<T> setRoleName(String roleName);

   @NodeInfo(xmlName = "role-name")
   public String getRoleName();
}
