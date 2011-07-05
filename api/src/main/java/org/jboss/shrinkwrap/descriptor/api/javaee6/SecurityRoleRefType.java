package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 *
 * Original Documentation:
 *
 *
 * The security-role-refType contains the declaration of a
 * security role reference in a component's or a
 * Deployment Component's code. The declaration consists of an
 * optional description, the security role name used in the
 * code, and an optional link to a security role. If the
 * security role is not specified, the Deployer must choose an
 * appropriate security role.
 *
 *
 *
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
