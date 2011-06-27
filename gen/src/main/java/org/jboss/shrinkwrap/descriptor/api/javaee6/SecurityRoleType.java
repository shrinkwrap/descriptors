package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 * [
 * The security-roleType contains the definition of a security
 * role. The definition consists of an optional description of
 * the security role, and the security role name.
 *
 * Example:
 *
 * <security-role>
 * <description>
 * This role includes all employees who are authorized
 * to access the employee service application.
 * </description>
 * <role-name>employee</role-name>
 * </security-role>
 *
 *
 *
 *
 */
public interface SecurityRoleType<T> extends Child<T>
{

   public SecurityRoleType<T> setDescription(String description);
   public SecurityRoleType<T> setDescriptionList(String ... values);
   public SecurityRoleType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public SecurityRoleType<T> setRoleName(String roleName);
   public SecurityRoleType<T> removeRoleName();

   public String getRoleName();

}
