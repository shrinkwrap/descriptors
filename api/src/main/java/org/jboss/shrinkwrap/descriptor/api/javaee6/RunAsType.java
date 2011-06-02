package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.NodeInfo;

/**
 * This class is a generated class.
 * Generation date :2011-06-02T12:29:43.14+02:00
 */

public interface RunAsType<T> extends Child<T>
{
   public RunAsType<T> setDescription(String description);

   @NodeInfo(xmlName = "description")
   public String getDescription();

   public RunAsType<T> setRoleName(String roleName);

   @NodeInfo(xmlName = "role-name")
   public String getRoleName();
}
