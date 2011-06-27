package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:26:42.686-04:00
 *
 * Original Documentation:
 *
 *
 * The auth-constraintType indicates the user roles that
 * should be permitted access to this resource
 * collection. The role-name used here must either correspond
 * to the role-name of one of the security-role elements
 * defined for this web application, or be the specially
 * reserved role-name "*" that is a compact syntax for
 * indicating all roles in the web application. If both "*"
 * and rolenames appear, the container interprets this as all
 * roles. If no roles are defined, no user is allowed access
 * to the portion of the web application described by the
 * containing security-constraint. The container matches
 * role names case sensitively when determining access.
 *
 *
 *
 */
public interface AuthConstraintType<T> extends Child<T>
{

   public AuthConstraintType<T> setDescription(String description);

   public AuthConstraintType<T> setDescriptionList(String... values);

   public AuthConstraintType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public AuthConstraintType<T> setRoleName(String roleName);

   public AuthConstraintType<T> setRoleNameList(String... values);

   public AuthConstraintType<T> removeAllRoleName();

   public List<String> getRoleNameList();

}
