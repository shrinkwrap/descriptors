package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface SecurityRoleRefType<T> extends Child<T>
{

   public SecurityRoleRefType<T> setDescription(String description);
   public String getDescription();


   public SecurityRoleRefType<T> setRoleName(String roleName);
   public String getRoleName();


   public SecurityRoleRefType<T> setRoleLink(String roleLink);
   public String getRoleLink();
}