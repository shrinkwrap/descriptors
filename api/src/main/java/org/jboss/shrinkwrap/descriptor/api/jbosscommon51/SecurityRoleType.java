package org.jboss.shrinkwrap.descriptor.api.jbosscommon51;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The security-role element contains the definition of a security role.
 * The definition consists of an the security role name and principal name element(s).
 *
 */
public interface SecurityRoleType<T> extends Child<T>
{

   public SecurityRoleType<T> setDescription(String description);

   public SecurityRoleType<T> setDescriptionList(String... values);

   public SecurityRoleType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public SecurityRoleType<T> setRoleName(String roleName);

   public SecurityRoleType<T> removeRoleName();

   public String getRoleName();

   public SecurityRoleType<T> setPrincipalName(String principalName);

   public SecurityRoleType<T> setPrincipalNameList(String... values);

   public SecurityRoleType<T> removeAllPrincipalName();

   public List<String> getPrincipalNameList();

}
