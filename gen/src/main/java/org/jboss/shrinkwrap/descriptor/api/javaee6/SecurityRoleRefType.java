package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface SecurityRoleRefType<T> extends Child<T>
{

   public SecurityRoleRefType<T> setDescription(String description);

   public SecurityRoleRefType<T> setDescriptionList(String... values);

   public SecurityRoleRefType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public SecurityRoleRefType<T> setRoleName(String roleName);

   public SecurityRoleRefType<T> removeRoleName();

   public String getRoleName();

   public SecurityRoleRefType<T> setRoleLink(String roleLink);

   public SecurityRoleRefType<T> removeRoleLink();

   public String getRoleLink();

}
